package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class READ extends Operation {
	
	public READ(Code3Addr code) {
		super("READ", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}