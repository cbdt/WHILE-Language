package org.esir2.sprint2.operations;

import java.util.ArrayList;
import java.util.List;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class WHILE extends Operation {
	
	private List<Operation> condCodes;
	private List<Operation> bodyCodes;
	
	public WHILE(Code3Addr code) {
		super("WHILE", code);
		bodyCodes = new ArrayList<>();
		condCodes = new ArrayList<>();
	}
	
	public void setCond(List<Operation> codes) {
		this.condCodes = codes;
	}
	
	public void setBody(List<Operation> codes) {
		this.bodyCodes = codes;
	}
	
	@Override
	public String toString() {
		return "< WHILE" + "\n\tcondition\n\t" + this.condCodes.toString() + "\n\tbody\n\t" + this.bodyCodes.toString() + "\n>";
	}
	
	@Override
	public String toTSCode() {
		StringBuilder str = new StringBuilder();
		for(Operation op:condCodes) {
			str.append(op.toTSCode() + "\n");
		}
		str.append("\n");
		str.append("    while(BinTree.isTrue("+ getCode().getarg2()+")) {\n");
		for(Operation op:bodyCodes) {
			str.append("        "+op.toTSCode()+ "\n");
		}
		for(Operation op:condCodes) {
			str.append("        "+op.toTSCode() + "\n");
		}
		str.append("\n    }");
		return str.toString();
	}

}