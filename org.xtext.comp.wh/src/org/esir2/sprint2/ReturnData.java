package org.esir2.sprint2;

import java.util.ArrayList;
import java.util.List;

public class ReturnData {
	
	private List<String> lastVars;
	private List<Operation> codes;
	
	public ReturnData() {
		this.lastVars = new ArrayList<>();
		this.codes = new ArrayList<>();
	}
	
	public String getLastVar() {
		return this.lastVars.get(0);
	}
	
	public List<String> getVars() {
		return this.lastVars;
	}

	public List<Operation> getCodes() {
		return codes;
	}

	public void addCode(Operation code) {
		this.codes.add(code);
	}
	
	public void addVar(String var) {
		this.lastVars.add(var);
	}

}
