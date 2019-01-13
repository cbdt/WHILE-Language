package org.esir2.sprint2.operations;

import java.util.ArrayList;
import java.util.List;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.FunctionInternal;
import org.esir2.sprint2.Operation;

public class CALL extends Operation {
	
	private List<String> returnVars;
	private List<String> callableVars;
	private FunctionInternal fn;
	
	public CALL(Code3Addr code, FunctionInternal fn) {
		super("CALL", code);
		returnVars = new ArrayList<>();
		callableVars = new ArrayList<>();
		this.fn = fn;
	}
	
	public List<String> getReturnVars() {
		return this.returnVars;
	}
	
	public List<String> getCallableVars() {
		return this.callableVars;
	}
	
	
	@Override
	public String toTSCode() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		for (int i = 0; i < returnVars.size(); i++) {
			str.append(returnVars.get(i));
			if(i != returnVars.size()-1) {
				str.append(", ");
			}
		}
		
		str.append("] = ");
		
		str.append(getCode().getarg2() + "(");
		
		for (int i = 0; i < callableVars.size(); i++) {
			str.append(callableVars.get(i));
			if(i != callableVars.size()-1) {
				str.append(", ");
			} else {
				str.append(");\n");
			}
		}
		
		return str.toString();
	}

}
