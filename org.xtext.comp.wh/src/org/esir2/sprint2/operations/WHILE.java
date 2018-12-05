package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class WHILE extends Operation {
	
	public WHILE(Code3Addr code) {
		super("WHILE", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}