package org.esir2.sprint2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.esir2.sprint2.operations.READ;
import org.esir2.sprint2.operations.WRITE;
import org.omg.IOP.CodecOperations;

public class FunctionInternal {

	private Map<String, String> vars;
	private List<Operation> operations;
	private int input;
	private int output;
	private int counter = 0;
	private int counterTemp = 0;
	private String name = "";

	public FunctionInternal(String name, int input, int output) {
		this.name = name;
		this.operations = new ArrayList<Operation>();
		this.vars = new HashMap<String, String>();
		this.input = input;
		this.output = output;
	}
	
	public String getName() {
		return this.name;
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

	public List<Operation> getOperations() {
		return this.operations;
	}

	public void addCode(Operation code) {
		this.operations.add(code);
	}
	
	public void addCodes(List<Operation> codes) {
		this.operations.addAll(codes);
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

	public StringBuilder toTSCode() {
		StringBuilder str = new StringBuilder();
		
		str.append("function " + getName() + "(");
		for(int counterInput = 0; counterInput < getInput(); counterInput++) {
			Operation read = this.operations.get(0);
			this.operations.remove(0);
			str.append(read.getCode().getarg1() + ": BinTree");
			if(counterInput != getInput()-1) {
				str.append(", ");
			}
			
		}
		str.append(") : BinTree[] {\n");
		
		List<Operation> outputs = new ArrayList<>();
		int size = operations.size();
		for(int counterOutput = 0; counterOutput <  getOutput(); counterOutput++) {
			int index =  size - getOutput();
			Operation out = this.operations.get(index);
			outputs.add(out);
			this.operations.remove(index);
		}
		
		str.append("\n");
		
		for (int i = getInput(); i < vars.size(); i++) {
			str.append(indent(4) + "let Var" + (i + 1) + ": BinTree = new BinTree(\"nil\", null, null);\n");
			if(i == vars.size()-1) {
				str.append("\n");
			}
		}
		
		
		for (int i = 0; i < counterTemp; i++) {
			str.append(indent(4) + "let TempVar" + i + ": BinTree;\n");
			if(i == counterTemp-1) {
				str.append("\n");
			}
		}
		
		
		for(Operation op: operations) {
			str.append(indent(4));
			str.append(op.toTSCode());
			str.append("\n");
		}
		
		str.append("\n"+indent(4)+"return [");
		for(int i = 0; i < getOutput(); i++) {
			str.append(outputs.get(i).getCode().getarg1());
			if(i != getOutput() - 1) {
				str.append(", ");
			}
		}
		
		str.append("];\n}");
		
		return str;
		
	}
	
	public String indent(int nb) {
		String res = "";
		for(int i = 0; i < nb; i++) {
			res += " ";
		}
		return res;
	}
	
	
	

}
