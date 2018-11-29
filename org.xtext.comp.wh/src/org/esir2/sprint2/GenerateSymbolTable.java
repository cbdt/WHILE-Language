package org.esir2.sprint2;

import java.awt.event.FocusAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.xtext.comp.wh.wh.Assign;
import org.xtext.comp.wh.wh.Command;
import org.xtext.comp.wh.wh.Commands;
import org.xtext.comp.wh.wh.Definition;
import org.xtext.comp.wh.wh.Expr;
import org.xtext.comp.wh.wh.ExprAnd;
import org.xtext.comp.wh.wh.ExprEq;
import org.xtext.comp.wh.wh.ExprNot;
import org.xtext.comp.wh.wh.ExprOr;
import org.xtext.comp.wh.wh.ExprSimple;
import org.xtext.comp.wh.wh.For;
import org.xtext.comp.wh.wh.Foreach;
import org.xtext.comp.wh.wh.Function;
import org.xtext.comp.wh.wh.If;
import org.xtext.comp.wh.wh.Input;
import org.xtext.comp.wh.wh.Nop;
import org.xtext.comp.wh.wh.Output;
import org.xtext.comp.wh.wh.Program;
import org.xtext.comp.wh.wh.While;


public class GenerateSymbolTable {
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
					System.out.println("Erreur : " + e.getMessage());
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
		runThrough(f.getCommands(), functionInternal);
		runThrough(f.getOutputs(), functionInternal);
	}
	
	private void runThrough(Input input, FunctionInternal functionInternal) throws CompilaxException {
		for(String param : input.getParams()) {
			functionInternal.addCode(new Code3Addr(Operator.READ, functionInternal.addVar(param)));
		}
	}
	
	private void runThrough(Output output, FunctionInternal functionInternal) throws CompilaxException {
		for(String var : output.getR_values()) {
			functionInternal.addCode(new Code3Addr(Operator.WRITE, functionInternal.addVar(var)));
		}
	}
	
	private void runThrough(Commands commands, FunctionInternal functionInternal) throws CompilaxException {
		for(Command command : commands.getCommand()) {
			runThrough(command, functionInternal);
		}
	}
	
	private void runThrough(Command command, FunctionInternal functionInternal) throws CompilaxException {
		EObject cmd = command.getCommand();
		
		if(cmd instanceof Assign) {
			runThrough((Assign) cmd, functionInternal);
		} else if (cmd instanceof While) {
			runThrough((While) cmd, functionInternal);
		} else if (cmd instanceof If) {
			runThrough((If) cmd, functionInternal);
		} else if (cmd instanceof Foreach) {
			runThrough((Foreach) cmd, functionInternal);
		} else if (cmd instanceof For) {
			runThrough((For) cmd, functionInternal);
		} else if (cmd instanceof Nop) {
			functionInternal.addCode(new Code3Addr(Operator.NOP));
		}
				
	}
	
	private void runThrough(While cmd, FunctionInternal functionInternal) {
		// 
	}
	
	private void runThrough(If cmd, FunctionInternal functionInternal) {
		// TODO Auto-generated method stub
		
	}
	
	private void runThrough(Foreach cmd, FunctionInternal functionInternal) {
		// TODO Auto-generated method stub
		
	}
	
	private void runThrough(For cmd, FunctionInternal functionInternal) {
		// TODO Auto-generated method stub
		
	}

	private void runThrough(Assign assign, FunctionInternal functionInternal) throws CompilaxException {
		EList<String> vars = assign.getVars().getVariables();
		EList<Expr> exprs = assign.getExprs().getExpr();
		
		int nb_vars = vars.size();
		int nb_exprs = exprs.size();
		
		Map<String, String> oldVars = new HashMap<>(); 
		
		if(nb_vars != nb_exprs) {
			throw new CompilaxException("Il faut le même nombre de variable que d'expressions");
		}
		
		// On regarde s'il y a des variables identiques à gauche et à droite : A := A
		for(Expr expr : exprs) {
			String var = getVar(expr);
			boolean isVar = !var.equals("");
			if(isVar && vars.contains(var) && !oldVars.containsKey(functionInternal.getVar(var))) {
				String tempVar = functionInternal.getTempVar();
				oldVars.put(functionInternal.getVar(var), tempVar);
				functionInternal.addCode(new Code3Addr(Operator.AFF, tempVar, functionInternal.addVar(var)));
			}
		}

		
		for(int i = 0; i < nb_vars; i++) {
			ReturnData ret = runThrough(exprs.get(i), functionInternal);
			String fromVar;
			if(oldVars.containsKey(ret.getLastVar())) {
				fromVar = oldVars.get(ret.getLastVar());
			} else {
				fromVar = ret.getLastVar();
			}
			functionInternal.addCode(new Code3Addr(Operator.AFF, functionInternal.getVar(vars.get(i)), fromVar));
		}
		
	}	
	private ReturnData runThrough(Expr expr, FunctionInternal functionInternal) throws CompilaxException {
		EList<ExprOr> exprs = expr.getExpr_and().getExpr_or();
	
		if(exprs.size() <= 0  && exprs.size() > 2) {
			throw new CompilaxException("Il y a trop d'opérandes dans le AND");
		}
		
		if(exprs.size() == 1) {
			return runThrough(exprs.get(0), functionInternal);
		} 
		ReturnData ret_left = runThrough(exprs.get(0), functionInternal);
		ReturnData ret_right = runThrough(exprs.get(1), functionInternal);
		String tempVar = functionInternal.getTempVar();
		functionInternal.addCode(new Code3Addr(Operator.AND, tempVar, ret_left.getLastVar(), ret_right.getLastVar()));
		
		ReturnData ret = new ReturnData();
		ret.addVar(tempVar);
		return ret;
	}


	private ReturnData runThrough(ExprOr exprOr, FunctionInternal functionInternal) throws CompilaxException {
		EList<ExprNot> exprs = exprOr.getExpr_not();
		
		if(exprs.size() <= 0  && exprs.size() > 2) {
			throw new CompilaxException("Il y a trop d'opérandes dans le OR");
		}
		
		if(exprs.size() == 1) {
			return runThrough(exprs.get(0), functionInternal);
		} 
		ReturnData ret_left = runThrough(exprs.get(0), functionInternal);
		ReturnData ret_right = runThrough(exprs.get(1), functionInternal);
		String tempVar = functionInternal.getTempVar();
		functionInternal.addCode(new Code3Addr(Operator.OR, tempVar, ret_left.getLastVar(), ret_right.getLastVar()));
		
		ReturnData ret = new ReturnData();
		ret.addVar(tempVar);
		return ret;
		
	}

	private ReturnData runThrough(ExprNot exprNot, FunctionInternal functionInternal) throws CompilaxException {
		if(exprNot.getHasNot() != null) {
			
			String tempVar = functionInternal.getTempVar();
			ReturnData ret_expr = runThrough(exprNot.getExpr_eq(), functionInternal);
			functionInternal.addCode(new Code3Addr(Operator.NOT, tempVar, ret_expr.getLastVar()));
			ReturnData ret = new ReturnData();
			ret.addVar(tempVar);
			return ret;
		}
		return runThrough(exprNot.getExpr_eq(), functionInternal);
		
	}

	private ReturnData runThrough(ExprEq expr_eq, FunctionInternal functionInternal) throws CompilaxException {
		if(expr_eq.getExpr_left() != null) {
			ReturnData ret_left = runThrough(expr_eq.getExpr_left(), functionInternal);
			
			if(expr_eq.getExpr_right() != null) {
				
				ReturnData ret_right = runThrough(expr_eq.getExpr_right(), functionInternal);
				String tempVar  = functionInternal.getTempVar();
				functionInternal.addCode(new Code3Addr(Operator.EQ, tempVar, ret_left.getLastVar(), ret_right.getLastVar()));
				ReturnData ret = new ReturnData();
				ret.addVar(tempVar);
				return ret;
				
			} else {
				ReturnData ret = new ReturnData();
				ret.addVar(ret_left.getLastVar());
				return ret;
			}
		} else if(expr_eq.getExpr() != null) {
			ReturnData ret = runThrough(expr_eq.getExpr(), functionInternal);
			return ret;
		} else if(expr_eq.getExpr() != null) {
			return runThrough(expr_eq.getExpr(), functionInternal);
		} else if(expr_eq.getSym() != null) {
			// Appel de fonction
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
			
		} else if(expr.getHd_expr() != null) {
			
		} else if(expr.getTl_expr() != null) {
			
		} else if(expr.getList_exp() != null) {
			
		}
		
		return null;
	}
	
	

	public String toString() {
		return this.symTable.toString();
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
