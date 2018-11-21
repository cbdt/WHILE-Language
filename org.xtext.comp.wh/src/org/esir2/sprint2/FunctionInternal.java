package org.esir2.sprint2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FunctionInternal {

	private HashMap<String, String> vars;
	private HashMap<String, String> symbol;
	private List<Code3Addr> code;
	private int input;
	private int output;

	public FunctionInternal(String name, int input, int output) {
		this.code = new ArrayList<Code3Addr>();
		this.symbol = new HashMap<String, String>();
		this.vars = new HashMap<String, String>();
		this.input = input;
		this.output = output;
	}

	public int getInput() {
		return this.input;
	}

	public int getOutput() {
		return this.output;
	}

	public String getVars(String key) {
		return this.vars.get(key);
	}
	
	public void setVars(String key, String value) {
		this.vars.put(key, value);
	}

	public String getSymbol(String key) {
		return this.symbol.get(key);
	}
	
	public void setSymbol(String key, String value) {
		this.symbol.put(key, value);
	}

	public List<Code3Addr> getCode() {
		return this.code;
	}
	
	public void addCode(Code3Addr code) {
		this.code.add(code);
	}
	
	public void addVar(String var) {
		if(!this.vars.containsKey(var)) {
			this.vars.put(var, "nil");
		}
	}
	
	public void addSymbol(String symbol) {
		if(!this.symbol.containsKey(symbol)) {
			this.symbol.put(symbol, "");
		}
	}

}
