package org.esir2.sprint2;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
	
	private Map<String, FunctionInternal> functions;
	
	public SymbolTable() {
		functions = new HashMap<>();
	}
	
	public void addFunction(String name, FunctionInternal internal) {
		// TODO
		throw new UnsupportedOperationException("addFunction not implemented");
	}
	
	public FunctionInternal getFunctionInternal(String name) {
		// TODO
		throw new UnsupportedOperationException("getFunctionInternal not implemented");
	}
	
	public boolean hasFunction(String name) {
		return functions.containsKey(name);
	}

}
