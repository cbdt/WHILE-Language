package org.esir2.sprint2.operations;

import java.util.ArrayList;
import java.util.List;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.FunctionInternal;
import org.esir2.sprint2.Operation;

public class FOR extends Operation {
	
	private List<Operation> condCodes;
	private List<Operation> bodyCodes;
	private FunctionInternal functionInternal;
	
	public FOR(Code3Addr code, FunctionInternal functionInternal) {
		super("FOR", code);
		condCodes = new ArrayList<>();
		bodyCodes = new ArrayList<>();
		this.functionInternal = functionInternal;
	}
	

	public List<Operation> getCondCodes() {
		return condCodes;
	}

	public void setCondCodes(List<Operation> exprCodes) {
		this.condCodes = exprCodes;
	}

	public List<Operation> getBodyCodes() {
		return bodyCodes;
	}

	public void setBodyCodes(List<Operation> bodyCodes) {
		this.bodyCodes = bodyCodes;
	}
	
	@Override
	public String toString() {
		return "< FOR" + "\n\t" + this.condCodes.toString()+ "\n\n\t" + this.bodyCodes.toString() + "\n>";
	}
	

	@Override
	public String toTSCode() {
		StringBuilder str = new StringBuilder();
		
		for(Operation op: condCodes) {
			str.append(op.toTSCode() + "\n");
		}
		String tmpVar = functionInternal.getTempVar();
		
		str.append("let " + tmpVar + ": number = BinTree.binTreeToNumber("+getCode().getarg2()+");\n");
		
		str.append("    for(let i = 0; i < "+tmpVar+"; i++){\n");
		
		for(Operation op: bodyCodes) {
			str.append("        " + op.toTSCode() + "\n");
		}
		
		str.append("    }\n");
		
		return str.toString();
	}

}
