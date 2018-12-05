package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class OR extends Operation {
	
	public OR(Code3Addr code) {
		super("OR", code);
	}
	
	@Override
	public String toTSCode() {
		return this.getCode().getarg1() + " = BinTree.or("+this.getCode().getarg2() + ", " + this.getCode().getarg3()+")";
	}

}
