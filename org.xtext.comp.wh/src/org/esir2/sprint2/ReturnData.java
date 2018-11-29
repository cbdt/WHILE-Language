package org.esir2.sprint2;

import java.util.ArrayList;
import java.util.List;

public class ReturnData {
	
	private List<String> lastVars;
	
	public ReturnData() {
		this.lastVars = new ArrayList<>();
	}
	
	public List<String> getLastVars() {
		return this.getLastVars();
	}
	
	public void addVar(String var) {
		this.lastVars.add(var);
	}
	
	public String getLastVar() {
		return this.lastVars.get(0);
	}

}
