package org.esir2.sprint2.operations;

import java.util.ArrayList;
import java.util.List;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class IF extends Operation {
	
	private List<Operation> condCodes;
	private List<Operation> bodyCodes;
	private List<Operation> elseCodes;
	
	public IF(Code3Addr code) {
		super("IF", code);
		condCodes = new ArrayList<>();
		bodyCodes = new ArrayList<>();
		elseCodes = new ArrayList<>();
		
	}
	

	
	@Override
	public String toTSCode() {
		StringBuilder str = new StringBuilder();
		
		for(Operation op: condCodes) {
			str.append(op.toTSCode() + "\n");
		}
		str.append("\n    if(BinTree.isTrue("+getCode().getarg2()+")){\n");
		
		for(Operation op: bodyCodes) {
			str.append("        " + op.toTSCode() + "\n");
		}
		
		str.append("    }");
		
		if(!elseCodes.isEmpty()) {
			str.append(" else {\n");
			
			for(Operation op: elseCodes) {
				str.append("        " + op.toTSCode() + "\n");
			}
			
			str.append("    }");
		}
		str.append("\n");
		
		return str.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("< IF" + "\n\t" + this.condCodes.toString() + "\n\n\t" + this.bodyCodes.toString());;
		if(!this.elseCodes.isEmpty()) {
			str.append("\n\n\t"+this.elseCodes.toString());
		}
		str.append("\n>");
		return str.toString();
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



	public List<Operation> getElseCodes() {
		return elseCodes;
	}



	public void setElseCodes(List<Operation> elseCodes) {
		this.elseCodes = elseCodes;
	}
	
	

}
