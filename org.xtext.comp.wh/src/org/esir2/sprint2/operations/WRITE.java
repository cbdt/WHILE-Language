package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class WRITE extends Operation {
	
	public WRITE(Code3Addr code) {
		super("WRITE", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}

