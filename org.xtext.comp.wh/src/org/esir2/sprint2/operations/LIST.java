package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class LIST extends Operation {
	
	public LIST(Code3Addr code) {
		super("LIST", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}
