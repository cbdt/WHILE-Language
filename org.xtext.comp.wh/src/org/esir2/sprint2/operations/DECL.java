package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class DECL extends Operation {
	
	public DECL(Code3Addr code) {
		super("DECL", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}
