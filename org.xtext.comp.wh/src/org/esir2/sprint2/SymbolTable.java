package org.esir2.sprint2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SymbolTable {
	
	private Map<String, FunctionInternal> functions;
	private static int functionCounter = 0;
	
	private Map<String, String> symbols;
	private static int symbolCounter = 0;
	
	public SymbolTable() throws CompilaxException {
		functions = new HashMap<>();
		symbols = new HashMap<>();
		addSymbol("nil");
	}
	
	public void addFunction(String name, int nbInput, int nbOutput) throws CompilaxException {
		if(!hasFunction(name)) {
			functions.put(name, new FunctionInternal("f" + functionCounter, nbInput, nbOutput));
			functionCounter++;
		}
		else {
			throw new CompilaxException("addFunction : La fonction " + name + " est déjà définie");
		}
	}
	
	public FunctionInternal getFunctionInternal(String name) throws CompilaxException {
		if(!hasFunction(name)) {
			throw new CompilaxException("getFunctionInternal : La fonction " + name + " n'est pas définie");
		}
		return functions.get(name);
	}
	
	public boolean hasFunction(String name) {
		return functions.containsKey(name);
	}
	
	public void addSymbol(String name) throws CompilaxException {
		if(!hasSymbol(name)) {
			symbols.put(name, "s" + symbolCounter);
			symbolCounter++;
			
		}
		else {
			throw new CompilaxException("addSymbol : Le symbol " + name + " est déjà défini");
		}
	}
	
	public boolean hasSymbol(String name) {
		return symbols.containsKey(name);
	}
	
	public String getSymbol(String name) {
		return symbols.get(name);
	}
	
	@Override
	public String toString() {
		StringBuilder codeBuilder = new StringBuilder();
		
		// Affichage table des symboles
		codeBuilder.append("Table des symboles :\n");
		for(Entry<String, String> e : symbols.entrySet()) {
			codeBuilder.append(e.getKey() + " : " + e.getValue()).append("\n");
		}
		
		for(Entry<String, FunctionInternal> e : functions.entrySet()) {
			FunctionInternal functionInfos = e.getValue();
					
			// Affichage table des variables
			codeBuilder.append("Table des variables :\n");
			for(Entry<String, String> varEntry : functionInfos.getVars().entrySet()) {
				codeBuilder.append(varEntry.getKey() + " : " + varEntry.getValue()).append("\n");
			}
			
			// affichage code3@ fonction 
			codeBuilder.append("function " + e.getKey() + ":").append(" (input=" + functionInfos.getInput() + ", output=" + functionInfos.getOutput() + ")").append("\n");
			for(Operation op : functionInfos.getOperations()) {
				codeBuilder.append(op.toString() + "\n");
			}
			codeBuilder.append("\n");
		}
		
		return codeBuilder.toString();
	}
	
	public String indent(int nb) {
		String res = "";
		for(int i = 0; i < nb; i++) {
			res += " ";
		}
		return res;
	}
	
	public String toTSCode() {
		Map.Entry<String,FunctionInternal> entry = functions.entrySet().iterator().next();
		FunctionInternal functionInternalMain = entry.getValue();
		
		StringBuilder str = new StringBuilder();
		str.append("import BinTree from './BinTree'\n");
		
		for(Entry<String, String> symb: symbols.entrySet()) {
			str.append("var " + symb.getValue()+" = new BinTree(\""+ symb.getKey() +"\", null, null);\n");
		}
		
		//str.append("function isNumber(value: any[]): boolean\n{\n return !isNaN(Number(value.toString()));\n}\n");
		str.append("function main(args: string[]) {\n");
		
		
		str.append("\n"+indent(4) +"let nb_input: number = " + functionInternalMain.getInput() + ";");
		str.append("\n"+indent(4) + "if(args.length != nb_input) {\n"+indent(8)+"console.error(`Le nombre d'argument n'est pas correct (${args.length} au lieu de ${nb_input})`); return;\n"+indent(4)+"}\n");
		

		str.append("// TODO: Check if arg type is number or string\n");
		for(int counterRead = 0; counterRead < functionInternalMain.getInput(); counterRead++) {
			str.append(indent(4)+"let i"+ counterRead + ": number = Number(args[" + counterRead + "]);\n");
		}
		
		for(int counterRead = 0; counterRead < functionInternalMain.getInput(); counterRead++) {
			str.append("\n"+indent(4)+"let input"+ counterRead + ": BinTree;");
			str.append("\n"+indent(4)+"if(isNaN(i"+ + counterRead +")) {\n");
			str.append(indent(8)+"input"+ counterRead + " = BinTree.stringToBinTree(args[" + counterRead + "]);\n");
			str.append(indent(4)+"} else {\n");
			str.append(indent(8)+"input"+ counterRead + " = BinTree.numberToBinTree(i" + counterRead+ ");\n");
			str.append(indent(4)+"}\n");
		}
		str.append("\n");
		
		str.append(indent(4)+"let outputs: BinTree[] = " + functionInternalMain.getName() + "(");
		for(int counterInput = 0; counterInput < functionInternalMain.getInput(); counterInput++) {
			str.append("input"+counterInput);
			if(counterInput != functionInternalMain.getInput()-1) {
				 str.append(", ");
			}
		}
		str.append(");\n");
		
		str.append(indent(4)+"console.log(BinTree.binTreesToNumbers(outputs));\n");
		
		str.append("}\n\n");
		
		for(Entry<String, FunctionInternal> function: functions.entrySet()) {
			str.append(function.getValue().toTSCode());
		}
		
		str.append("\n\nmain(process.argv.slice(2));");
		// afficher toute les fonctions sauf la première;
		
		return str.toString();
	}

}
