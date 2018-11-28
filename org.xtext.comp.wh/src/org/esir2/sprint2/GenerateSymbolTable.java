package org.esir2.sprint2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.xtext.comp.wh.wh.Assign;
import org.xtext.comp.wh.wh.Command;
import org.xtext.comp.wh.wh.Commands;
import org.xtext.comp.wh.wh.Definition;
import org.xtext.comp.wh.wh.Expr;
import org.xtext.comp.wh.wh.Function;
import org.xtext.comp.wh.wh.Input;
import org.xtext.comp.wh.wh.Output;
import org.xtext.comp.wh.wh.Program;

public class GenerateSymbolTable {
	private TreeIterator<EObject> AST;
	private SymbolTable symTable;
	
	public GenerateSymbolTable(TreeIterator<EObject> AST) {
		this.AST = AST;
		this.symTable = new SymbolTable();
	}
	
	public void execute() {
		while(this.AST.hasNext()) {
			EObject obj = this.AST.next(); 
			if(obj instanceof Program) {
				try {
					discoverFunctions((Program) obj);
					runThrough((Program) obj);
				} catch (CompilaxException e) {
					e.printStackTrace();
				}
			}
		}
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
			functionInternal.addCode(new Code3Addr(Operator.READ, param));
		}
	}
	
	private void runThrough(Output output, FunctionInternal functionInternal) throws CompilaxException {
		for(String var : output.getR_values()) {
			functionInternal.addCode(new Code3Addr(Operator.WRITE, var));
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
		}
				
	}
	
	private void runThrough(Assign assign, FunctionInternal functionInternal) throws CompilaxException {
		EList<String> vars = assign.getVars().getVariables();
		EList<Expr> exprs = assign.getExprs().getExpr();
		int nb_vars = vars.size();
		int nb_exprs = exprs.size();
		
		if(nb_vars != nb_exprs) {
			throw new CompilaxException("Il faut le même nombre de variable que d'expressions");
		}
		
		for(int i = 0; i < nb_vars; i++) {
			functionInternal.addCode(new Code3Addr(Operator.AFF, vars.get(i), evaluate(exprs.get(i))));
		}
	}
	
	private String evaluate(Expr expr) {
		return "Not implemented yet";
	}
	
	public String toString() {
		return this.symTable.toString();
	}
	
	
	
	
}
