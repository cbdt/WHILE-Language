package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class PUSH extends Operation {
	
	public PUSH(Code3Addr code) {
		super("PUSH", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}