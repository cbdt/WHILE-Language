package org.esir2.sprint2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.esir2.sprint2.operations.AFF;
import org.esir2.sprint2.operations.AND;
import org.esir2.sprint2.operations.CALL;
import org.esir2.sprint2.operations.CONS;
import org.esir2.sprint2.operations.EQ;
import org.esir2.sprint2.operations.FOR;
import org.esir2.sprint2.operations.FOREACH;
import org.esir2.sprint2.operations.HD;
import org.esir2.sprint2.operations.IF;
import org.esir2.sprint2.operations.NOP;
import org.esir2.sprint2.operations.NOT;
import org.esir2.sprint2.operations.OR;
import org.esir2.sprint2.operations.READ;
import org.esir2.sprint2.operations.TL;
import org.esir2.sprint2.operations.WHILE;
import org.esir2.sprint2.operations.WRITE;
import org.xtext.comp.wh.wh.Assign;
import org.xtext.comp.wh.wh.Command;
import org.xtext.comp.wh.wh.Commands;
import org.xtext.comp.wh.wh.Definition;
import org.xtext.comp.wh.wh.Expr;
import org.xtext.comp.wh.wh.ExprEq;
import org.xtext.comp.wh.wh.ExprNot;
import org.xtext.comp.wh.wh.ExprOr;
import org.xtext.comp.wh.wh.ExprSimple;
import org.xtext.comp.wh.wh.For;
import org.xtext.comp.wh.wh.Foreach;
import org.xtext.comp.wh.wh.Function;
import org.xtext.comp.wh.wh.If;
import org.xtext.comp.wh.wh.Input;
import org.xtext.comp.wh.wh.Output;
import org.xtext.comp.wh.wh.Program;
import org.xtext.comp.wh.wh.While;

public class GenerateSymbolTable {
	
	public static final String ANSI_RED = "\033[0;31m";
	public static final String ANSI_RESET = "\u001B[0m";


	private TreeIterator<EObject> AST;
	private SymbolTable symTable;
	
	public GenerateSymbolTable(TreeIterator<EObject> AST) {
		this.AST = AST;
		try {
			this.symTable = new SymbolTable();
		} catch (CompilaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean execute() {
		while(this.AST.hasNext()) {
			EObject obj = this.AST.next(); 
			if(obj instanceof Program) {
				try {
					discoverFunctions((Program) obj);
					runThrough((Program) obj);
				} catch (CompilaxException e) {
					System.out.println(ANSI_RED + "ERREUR : " + ANSI_RESET + e.getMessage());
					return true;
				}
			}
		}
		
		return false;
	}

	/**
	 * On parcours l'ensemble des fonctions pour les enregistrer dans la table des symboles
	 * @param program
	 * @throws CompilaxException 
	 */
	private void discoverFunctions(Program program) throws CompilaxException {
		for(Function f : program.getFunctions()) {
			int nbInputs = f.getDefinition().getInputs().getParams().size();
			int nbOutputs = f.getDefinition().getOutputs().getR_values().size();
			// On ajoute la fonction dans la table des symboles
			if(symTable.hasFunction(f.getFname())) {
				throw new CompilaxException("La fonction " + f.getFname() + " est redéfini");
			}
			symTable.addFunction(f.getFname(), nbInputs, nbOutputs);
		}
	}
	
	private void runThrough(Program program) throws CompilaxException {
		for(Function f : program.getFunctions()) {
			runThrough(f, this.symTable.getFunctionInternal(f.getFname()));
		}
	}

	private void runThrough(Function f, FunctionInternal functionInternal) throws CompilaxException {
		runThrough(f.getDefinition(), functionInternal);
	}
	
	private void runThrough(Definition f, FunctionInternal functionInternal) throws CompilaxException{
		runThrough(f.getInputs(), functionInternal);
		ReturnData ret = runThrough(f.getCommands(), functionInternal);
		functionInternal.addCodes(ret.getCodes());
		runThrough(f.getOutputs(), functionInternal);
	}
	
	private void runThrough(Input input, FunctionInternal functionInternal) throws CompilaxException {
		for(String param : input.getParams()) {
			functionInternal.addCode(new READ(new Code3Addr(functionInternal.addVar(param))));
		}
	}
	
	private void runThrough(Output output, FunctionInternal functionInternal) throws CompilaxException {
		for(String var : output.getR_values()) {
			functionInternal.addCode(new WRITE(new Code3Addr(functionInternal.addVar(var))));
		}
	}
	
	private ReturnData runThrough(Commands commands, FunctionInternal functionInternal) throws CompilaxException {
		ReturnData ret = new ReturnData();
		for(Command command : commands.getCommand()) {
			ReturnData retData = runThrough(command, functionInternal);
			ret.getCodes().addAll(retData.getCodes());
		}
		return ret;
	}
	
	private ReturnData runThrough(Command command, FunctionInternal functionInternal) throws CompilaxException {
		EObject cmd = command.getCommand();
		
		if(cmd instanceof Assign) {
			return runThrough((Assign) cmd, functionInternal);
		} else if (cmd instanceof While) {
			return runThrough((While) cmd, functionInternal);
		} else if (cmd instanceof If) {
			return runThrough((If) cmd, functionInternal);
		} else if (cmd instanceof Foreach) {
			return runThrough((Foreach) cmd, functionInternal);
		} else if (cmd instanceof For) {
			return runThrough((For) cmd, functionInternal);
		} else {
			ReturnData ret = new ReturnData();
			ret.addCode(new NOP(new Code3Addr()));
			return ret;
		}
		
				
	}
	
	private ReturnData runThrough(While whileCmd, FunctionInternal functionInternal) throws CompilaxException {
		
		ReturnData retCond = runThrough(whileCmd.getCond(), functionInternal);
		ReturnData retBody = runThrough(whileCmd.getCommands(), functionInternal);
		
		WHILE opWhile = new WHILE(new Code3Addr("_", retCond.getLastVar()));
		opWhile.setCond(retCond.getCodes());
		opWhile.setBody(retBody.getCodes());
		
		ReturnData data = new ReturnData();
		data.addCode(opWhile);
		return data;
	}
	
	private ReturnData runThrough(If ifCmd, FunctionInternal functionInternal) throws CompilaxException {
		ReturnData dataCond = runThrough(ifCmd.getCond(), functionInternal);
		ReturnData dataBody = runThrough(ifCmd.getIf_commands(), functionInternal);
		
		ReturnData data = new ReturnData();
		
		IF opIf = new IF(new Code3Addr("_", dataCond.getLastVar()));
		opIf.setCondCodes(dataCond.getCodes());
		opIf.setBodyCodes(dataBody.getCodes());
		if(ifCmd.getElse_commands() != null) {
			ReturnData dataElse = runThrough(ifCmd.getElse_commands(), functionInternal);
			opIf.setElseCodes(dataElse.getCodes());
		}
		
		data.addCode(opIf);
		
		return data;
	}
	
	private ReturnData runThrough(Foreach foreachCmd, FunctionInternal functionInternal) throws CompilaxException {
		
		ReturnData dataCond = runThrough(foreachCmd.getCond(), functionInternal);
		ReturnData dataEns = runThrough(foreachCmd.getEns(), functionInternal);
		ReturnData dataCommmands = runThrough(foreachCmd.getCommands(), functionInternal);
		
		ReturnData data = new ReturnData();
		FOREACH opForEach = new FOREACH(new Code3Addr("_", dataCond.getLastVar(), dataEns.getLastVar()));
		
		opForEach.setEnsCodes(dataEns.getCodes());
		opForEach.setCondCodes(dataCond.getCodes());
		opForEach.setBodyCodes(dataCommmands.getCodes());
		
		data.addCode(opForEach);
		
		return data;
	}
	
	private ReturnData runThrough(For forCmd, FunctionInternal functionInternal) throws CompilaxException {
		ReturnData dataCond = runThrough(forCmd.getCond(), functionInternal);
		ReturnData dataBody = runThrough(forCmd.getCommands(), functionInternal);
		
		ReturnData data = new ReturnData();
		FOR opFor = new FOR(new Code3Addr("_", dataCond.getLastVar()), functionInternal);
		opFor.setCondCodes(dataCond.getCodes());
		opFor.setBodyCodes(dataBody.getCodes());
		data.addCode(opFor);
		
		return data;
		
	}

	private ReturnData runThrough(Assign assign, FunctionInternal functionInternal) throws CompilaxException {
		EList<String> vars = assign.getVars().getVariables();
		EList<Expr> exprs = assign.getExprs().getExpr();
		
		int nb_vars = vars.size();
		
		Map<String, String> oldVars = new HashMap<>(); 
		
		/*if(nb_vars != nb_exprs) {
			throw new CompilaxException("Il faut le même nombre de variables que d'expressions");
		}*/
		
		ReturnData retAssign = new ReturnData();
		
		// On regarde s'il y a des variables identiques à gauche et à droite : A := A
		for(Expr expr : exprs) {
			String var = getVar(expr);
			boolean isVar = !var.equals("");
			if(isVar && vars.contains(var) && !oldVars.containsKey(functionInternal.getVar(var))) {
				String tempVar = functionInternal.getTempVar();
				oldVars.put(functionInternal.getVar(var), tempVar);
				retAssign.addCode(new AFF(new Code3Addr(tempVar, functionInternal.addVar(var))));
			}
		}
/*
		for(int i = 0; i < nb_vars; i++) {
			ReturnData ret = runThrough(exprs.get(i), functionInternal);
			String fromVar;
			if(oldVars.containsKey(ret.getLastVar())) {
				fromVar = oldVars.get(ret.getLastVar());
			} else {
				fromVar = ret.getLastVar();
			}
			if(!functionInternal.containsVar(vars.get(i))) {
				functionInternal.addVar(vars.get(i));
			}
			retAssign.getCodes().addAll(ret.getCodes());
			retAssign.getVars().addAll(ret.getVars());
			retAssign.addCode(new AFF(new Code3Addr(functionInternal.getVar(vars.get(i)), fromVar)));
		}*/
		
		for(Expr expr: exprs) {
			ReturnData ret = runThrough(expr, functionInternal);

			retAssign.getCodes().addAll(ret.getCodes());
			for(int i = 0; i < ret.getVars().size(); i++) {
				if(i >= vars.size()) {
					throw new CompilaxException("Il faut le même nombre de variables que d'expressions");
				}
				String fromVar;
				if(oldVars.containsKey(ret.getLastVar())) {
					fromVar = oldVars.get(ret.getVars().get(i));
				} else {
					fromVar = ret.getVars().get(i);
				}
				if(!functionInternal.containsVar(vars.get(i))) {
					functionInternal.addVar(vars.get(i));
				}
				retAssign.addCode(new AFF(new Code3Addr(functionInternal.getVar(vars.get(i)), fromVar)));
			}

			retAssign.getVars().addAll(ret.getVars());
		}
		
		
		if(nb_vars != retAssign.getVars().size()) {
			throw new CompilaxException("Il faut le même nombre de variables que d'expressions");
		}
		
		return retAssign;
		
	}	
	private ReturnData runThrough(Expr expr, FunctionInternal functionInternal) throws CompilaxException {
		EList<ExprOr> exprs = expr.getExpr_and().getExpr_or();
	
		ReturnData ret = new ReturnData();
		
		if(exprs.size() <= 0  && exprs.size() > 2) {
			throw new CompilaxException("Il y a trop d'opérandes dans le AND");
		}
		
		if(exprs.size() == 1) {
			ReturnData reat = runThrough(exprs.get(0), functionInternal);
			return reat;
		} 
		ReturnData ret_left = runThrough(exprs.get(0), functionInternal);
		ReturnData ret_right = runThrough(exprs.get(1), functionInternal);
		String tempVar = functionInternal.getTempVar();
		
		ret.getCodes().addAll(ret_left.getCodes());
		ret.getCodes().addAll(ret_right.getCodes());
		ret.addCode(new AND(new Code3Addr(tempVar, ret_left.getLastVar(), ret_right.getLastVar())));
		
		
		ret.addVar(tempVar);
		return ret;
	}


	private ReturnData runThrough(ExprOr exprOr, FunctionInternal functionInternal) throws CompilaxException {
		EList<ExprNot> exprs = exprOr.getExpr_not();
		ReturnData ret = new ReturnData();
		
		if(exprs.size() <= 0  && exprs.size() > 2) {
			throw new CompilaxException("Il y a trop d'opérandes dans le OR");
		}
		
		if(exprs.size() == 1) {
			return runThrough(exprs.get(0), functionInternal);
		} 
		ReturnData ret_left = runThrough(exprs.get(0), functionInternal);
		ReturnData ret_right = runThrough(exprs.get(1), functionInternal);
		String tempVar = functionInternal.getTempVar();
		
		ret.getCodes().addAll(ret_left.getCodes());
		ret.getCodes().addAll(ret_right.getCodes());
		ret.addCode(new OR(new Code3Addr(tempVar, ret_left.getLastVar(), ret_right.getLastVar())));
		ret.addVar(tempVar);
		return ret;
		
	}

	private ReturnData runThrough(ExprNot exprNot, FunctionInternal functionInternal) throws CompilaxException {		
		if(exprNot.getHasNot() != null) {
			ReturnData ret = new ReturnData();
			String tempVar = functionInternal.getTempVar();
			ReturnData ret_expr = runThrough(exprNot.getExpr_eq(), functionInternal);
			ret.getCodes().addAll(ret_expr.getCodes());
			ret.addCode(new NOT(new Code3Addr(tempVar, ret_expr.getLastVar())));
			ret.addVar(tempVar);
			return ret;
		}
		return runThrough(exprNot.getExpr_eq(), functionInternal);
		
	}

	private ReturnData runThrough(ExprEq expr_eq, FunctionInternal functionInternal) throws CompilaxException {
		if(expr_eq.getExpr_left() != null) {
			ReturnData ret_left = runThrough(expr_eq.getExpr_left(), functionInternal);
			
			if(expr_eq.getExpr_right() != null) {
				ReturnData ret = new ReturnData();
				ReturnData ret_right = runThrough(expr_eq.getExpr_right(), functionInternal);
				String tempVar  = functionInternal.getTempVar();
				ret.getCodes().addAll(ret_left.getCodes());
				ret.getCodes().addAll(ret_right.getCodes());
				ret.addCode(new EQ(new Code3Addr(tempVar, ret_left.getLastVar(), ret_right.getLastVar())));
				
				ret.addVar(tempVar);
				return ret;
				
			} else {
				ReturnData ret = new ReturnData();
				ret.getCodes().addAll(ret_left.getCodes());
				ret.addVar(ret_left.getLastVar());
				return ret;
			}
		} else if(expr_eq.getExpr() != null) {
			return runThrough(expr_eq.getExpr(), functionInternal);
		} else if(expr_eq.getSym() != null) {
			// TODO: Appel de fonction
			String name = expr_eq.getSym(); 
			
			if(symTable.hasFunction(name)) {

				ReturnData data = new ReturnData();
				FunctionInternal fn = symTable.getFunctionInternal(name);
				CALL opCall = new CALL(new Code3Addr("_", fn.getName()), functionInternal);
				// Vérifier le nombre d'argument en entrée
				int nbInput = fn.getInput();
				int nbRealInput = expr_eq.getLexpr().getExpr().size();
				if(nbInput != nbRealInput) {
					throw new CompilaxException("Nombre d'argument incorrect ("+nbRealInput+" au lieu de "+ nbInput +")");
				}
				
				for(Expr e: expr_eq.getLexpr().getExpr()) {
					ReturnData res = runThrough(e, functionInternal);
					data.getCodes().addAll(res.getCodes());
					opCall.getCallableVars().addAll(res.getVars());
				}
				
				for(int i = 0; i < fn.getOutput(); i++) {
					String tmp = functionInternal.getTempVar();
					opCall.getReturnVars().add(tmp);
				}
				
				data.getVars().addAll(opCall.getReturnVars());
				data.addCode(opCall);
				return data;
			} else {
				// On créé une liste quand la fonction n'existe pas

 				ReturnData retList = new ReturnData();

 				EList<Expr> exprs = expr_eq.getLexpr().getExpr();
				Deque<String> tempVars = new ArrayDeque<>();

 				// On calcul toutes les expressions et on stocke les variable intermediaires qu'elles retournent
				for(Expr e : exprs) {
					ReturnData ret = runThrough(e, functionInternal);
					retList.getCodes().addAll(ret.getCodes());
					tempVars.push(ret.getLastVar());
				}
				// On créé les cons
				boolean isFirst = true;
				String tempVar = functionInternal.getTempVar();
				while(tempVars.size() > 0) {
					if(isFirst) {
						retList.addCode(new CONS(new Code3Addr(tempVar, tempVars.poll(), symTable.getSymbol("nil"))));
						isFirst = false;
					} else {
						retList.addCode(new CONS(new Code3Addr(tempVar, tempVars.poll(), tempVar)));
					}
				}
				symTable.addSymbol(name);
				retList.addCode(new CONS(new Code3Addr(tempVar, symTable.getSymbol(name), tempVar)));
				retList.addVar(tempVar);
				return retList;
			}
		}
		throw new CompilaxException("Erreur lors de la compilation EXPR_EQ");
	}

	private ReturnData runThrough(ExprSimple expr, FunctionInternal functionInternal) throws CompilaxException {
		if(expr.getNil() != null) {
			ReturnData ret = new ReturnData();
			if(!symTable.hasSymbol("nil")) {
				symTable.addSymbol("nil");
			}
			ret.addVar(symTable.getSymbol("nil"));	
			return ret;
		} else if(expr.getSym() != null) {
			if(!symTable.hasSymbol(expr.getSym())) {
				symTable.addSymbol(expr.getSym());
			}
			ReturnData ret = new ReturnData();
			ret.addVar(symTable.getSymbol(expr.getSym()));
			return ret;
		} else if(expr.getVariable()!= null) {
			if(!functionInternal.containsVar(expr.getVariable())) {
				functionInternal.addVar(expr.getVariable());
			} 
			ReturnData ret = new ReturnData();
			ret.addVar(functionInternal.getVar(expr.getVariable()));
			return ret;
		} else if(expr.getCons_exp() != null) {
			ReturnData retCons = new ReturnData();
			
			EList<Expr> exprs = expr.getCons_exp().getExpr();
			Deque<String> tempVars = new ArrayDeque<>();
			
			if(exprs.size() == 1) {
				ReturnData ret = new ReturnData();
				String tempVar = functionInternal.getTempVar();
				ReturnData retExpr = runThrough(exprs.get(0), functionInternal);
				ret.getCodes().addAll(retExpr.getCodes());
				ret.addCode(new AFF(new Code3Addr(tempVar, retExpr.getLastVar())));
				ret.addVar(tempVar);
				return ret;
			}
			
			// On calcul toutes les expressions et on stocke les variable intermediaires qu'elles retournent
			for(Expr e : exprs) {
				ReturnData ret = runThrough(e, functionInternal);
				retCons.getCodes().addAll(ret.getCodes());
				tempVars.push(ret.getLastVar());
			}
			
			// On créé les cons
			boolean isFirst = true;
			String tempVar = functionInternal.getTempVar();
			while(tempVars.size() > 0) {
				if(isFirst) {
					String second = tempVars.poll();
					String first = tempVars.poll();
					retCons.addCode(new CONS(new Code3Addr(tempVar, first, second)));
					isFirst = false;
				} else {
					retCons.addCode(new CONS(new Code3Addr(tempVar, tempVars.poll(), tempVar)));
				}
			}
			retCons.addVar(tempVar);
			return retCons;
			
		} else if(expr.getHd_expr() != null) {
			ReturnData ret = new ReturnData();
			ReturnData retExpr = runThrough(expr.getHd_expr(), functionInternal);
			String tempVar = functionInternal.getTempVar();
			ret.getCodes().addAll(retExpr.getCodes());
			ret.addCode(new HD(new Code3Addr(tempVar, retExpr.getLastVar())));
			ret.addVar(tempVar);
			return ret;
		} else if(expr.getTl_expr() != null) {
			ReturnData ret = new ReturnData();
			ReturnData retExpr = runThrough(expr.getTl_expr(), functionInternal);
			String tempVar = functionInternal.getTempVar();
			ret.getCodes().addAll(retExpr.getCodes());
			ret.addCode(new TL(new Code3Addr(tempVar, retExpr.getLastVar())));
			ret.addVar(tempVar);
			return ret;
		} else if(expr.getList_exp() != null) {
			ReturnData retList = new ReturnData();
			
			EList<Expr> exprs = expr.getList_exp().getExpr();
			Deque<String> tempVars = new ArrayDeque<>();
			
			if(exprs.size() == 0) {
				throw new CompilaxException("Erreur du nombre d'argument du list");
			}
			
			// On calcul toutes les expressions et on stocke les variable intermediaires qu'elles retournent
			for(Expr e : exprs) {
				ReturnData ret = runThrough(e, functionInternal);
				retList.getCodes().addAll(ret.getCodes());
				tempVars.push(ret.getLastVar());
			}
			// On créé les cons
			boolean isFirst = true;
			String tempVar = functionInternal.getTempVar();
			while(tempVars.size() > 0) {
				if(isFirst) {
					retList.addCode(new CONS(new Code3Addr(tempVar, tempVars.poll(), symTable.getSymbol("nil"))));
					isFirst = false;
				} else {
					retList.addCode(new CONS(new Code3Addr(tempVar, tempVars.poll(), tempVar)));
				}
			}
			retList.addVar(tempVar);
			return retList;
		}
		
		return null;
	}
	
	

	public String toString() {
		return this.symTable.toString();
	}
	
	public String toTSCode() {
		return this.symTable.toTSCode();
	}
	
	private String getVar(Expr expr) {
		try {
			String var = expr.getExpr_and().getExpr_or().get(0).getExpr_not().get(0).getExpr_eq().getExpr_left().getVariable();
			return var != null ? var : "";
		} catch (Exception e) {
			return "";
		}
	}
	
}
