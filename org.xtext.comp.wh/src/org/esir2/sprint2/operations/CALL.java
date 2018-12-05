package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class CALL extends Operation {
	
	public CALL(Code3Addr code) {
		super("CALL", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}
