package org.esir2.sprint2;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
	
	private Map<String, FunctionInternal> functions;
	
	private static int functionCounter = 0;
	
	public SymbolTable() {
		functions = new HashMap<>();
	}
	
	public void addFunction(String name, int nbInput, int nbOutput) throws Exception {
		// TODO
		if(!hasFunction(name)) {
			functions.put(name, new FunctionInternal("f" + functionCounter, nbInput, nbOutput));
			functionCounter++;
		}
		else {
			throw new Exception("addFunction : La fonction " + name + " est déjà définie");
		}
	}
	
	public FunctionInternal getFunctionInternal(String name) throws Exception {
		if(!hasFunction(name)) {
			throw new Exception("getFunctionInternal : La fonction " + name + " n'est pas définie");
		}
		return functions.get(name);
	}
	
	public boolean hasFunction(String name) {
		return functions.containsKey(name);
	}

}
