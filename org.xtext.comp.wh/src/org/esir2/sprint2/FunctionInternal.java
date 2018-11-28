package org.esir2.sprint2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FunctionInternal {

	private HashMap<String, String> vars;
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

	public String getVars(String key) {
		return this.vars.get(key);
	}

	public void setVars(String key, String value) {
		this.vars.put(key, value);
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
			this.vars.put(var, "R" + counter);
		}
	}

}
