package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class AFF extends Operation {
	
	public AFF(Code3Addr code) {
		super("AFF", code);
	}
	
	@Override
	public String toTSCode() {
		return this.getCode().getarg1() + " = " + this.getCode().getarg2();
	}

}
