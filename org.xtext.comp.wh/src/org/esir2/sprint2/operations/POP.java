package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class POP extends Operation {
	
	public POP(Code3Addr code) {
		super("POP", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}