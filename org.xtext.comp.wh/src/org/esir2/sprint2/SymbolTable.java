package org.esir2.sprint2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SymbolTable {
	
	private Map<String, FunctionInternal> functions;
	private static int functionCounter = 0;
	
	private Map<String, String> symbols;
	private static int symbolCounter = 0;
	
	public SymbolTable() {
		functions = new HashMap<>();
		symbols = new HashMap<>();
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
			throw new CompilaxException("addSymbol : Le symbol " + name + " est déjà définie");
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
		
		for(Entry<String, String> e : symbols.entrySet()) {
			codeBuilder.append(e.getKey() + " : " + e.getValue()).append("\n");
		}
		
		for(Entry<String, FunctionInternal> e : functions.entrySet()) {
			codeBuilder.append("function " + e.getKey() + ":").append("\n");
			for(Code3Addr c : e.getValue().getCode()) {
				codeBuilder.append(c.toString() + "\n");
			}
			codeBuilder.append("\n");
		}
		
		return codeBuilder.toString();
	}

}
