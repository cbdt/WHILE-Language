package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class FOREACH extends Operation {
	
	public FOREACH(Code3Addr code) {
		super("FOREACH", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}
