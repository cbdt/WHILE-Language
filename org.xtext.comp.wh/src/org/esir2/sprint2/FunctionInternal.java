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
	private int counterTemp = 0;

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
	
	public Map<String, String> getVars() {
		return this.vars;
	}

	public List<Code3Addr> getCode() {
		return this.codes;
	}

	public void addCode(Code3Addr code) {
		this.codes.add(code);
	}

	public String addVar(String var) {
		if (!this.vars.containsKey(var)) {
			this.counter++;
			String varRename = "Var" + counter;
			this.vars.put(var, varRename);
			return varRename;
		}else {
			return this.vars.get(var);
		}
	}
	
	public String getTempVar() {
		return "TempVar" + this.counterTemp++;
	}

	public boolean containsVar(String var) {
		return this.vars.containsKey(var);
	}

}
