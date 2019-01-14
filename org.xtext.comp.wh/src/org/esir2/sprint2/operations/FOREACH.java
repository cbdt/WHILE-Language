package org.esir2.sprint2.operations;

import java.util.ArrayList;
import java.util.List;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class FOREACH extends Operation {
	

	private List<Operation> condCodes;
	private List<Operation> bodyCodes;
	private List<Operation> ensCodes;
	
	public FOREACH(Code3Addr code) {
		super("FOREACH", code);
		condCodes = new ArrayList<>();
		bodyCodes = new ArrayList<>();
		ensCodes = new ArrayList<>();
	}

	public List<Operation> getCondCodes() {
		return condCodes;
	}

	public void setCondCodes(List<Operation> condCodes) {
		this.condCodes = condCodes;
	}

	public List<Operation> getBodyCodes() {
		return bodyCodes;
	}

	public void setBodyCodes(List<Operation> bodyCodes) {
		this.bodyCodes = bodyCodes;
	}

	public List<Operation> getEnsCodes() {
		return ensCodes;
	}

	public void setEnsCodes(List<Operation> commandsCodes) {
		this.ensCodes = commandsCodes;
	}

	
	@Override
	public String toString() {
		return "< FOREACH" + "\n\tcondition\n\t" + this.condCodes.toString()+ "\n\tbody\n\t" + this.bodyCodes.toString() + "\n>";
	}
	

	@Override
	public String toTSCode() {
		// TODO: revoir les indentations
		StringBuilder str = new StringBuilder();
		
		for(Operation op: this.condCodes) {
			str.append(op.toTSCode());
		}
		
		for(Operation op: this.ensCodes) {
			str.append(op.toTSCode());
		}
		
		str.append("while(BinTree.isTrue("+this.getCode().getarg3()+")){\n");
		

		str.append("        "+this.getCode().getarg2() + " = BinTree.hd("+this.getCode().getarg3()+");\n");
		str.append("        "+this.getCode().getarg3() + " = BinTree.tl("+this.getCode().getarg3()+");\n");	
		
		for(Operation op: this.bodyCodes) {
			str.append("        "+op.toTSCode()+"\n");
		}
		
		
		str.append("    }\n");
		
		
		
		return str.toString();
	}
}
