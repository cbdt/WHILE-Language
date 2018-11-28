package org.esir2.sprint2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionInternal {

	private Map<String, String> vars;
	private List<Code3Addr> codes;
	private int input;
	private int output;
	private int counter = 0;

	public FunctionInternal(String name, int input, int output) {
		this.codes = new ArrayList<Code3Addr>();
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

	public String getVar(String key) {
		return this.vars.get(key);
	}

	public void setVar(String key, String value) {
		this.vars.put(key, value);
	}
	
	public Map<String, String> getVars() {
		return this.vars;
	}

	public List<Code3Addr> getCode() {
		return this.codes;
	}

	public void addCode(Code3Addr code) {
		this.codes.add(code);
	}

	public void addVar(String var) {
		if (!this.vars.containsKey(var)) {
			this.counter++;
			this.vars.put(var, "Var" + counter);
		}
	}

}
