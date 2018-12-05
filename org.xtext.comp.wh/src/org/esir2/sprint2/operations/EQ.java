package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class EQ extends Operation {
	
	public EQ(Code3Addr code) {
		super("EQ", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}
