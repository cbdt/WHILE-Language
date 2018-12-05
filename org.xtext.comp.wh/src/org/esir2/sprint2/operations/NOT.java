package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class NOT extends Operation {
	
	public NOT(Code3Addr code) {
		super("NOT", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}
