package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class TL extends Operation {
	
	public TL(Code3Addr code) {
		super("TL", code);
	}
	
	@Override
	public String toTSCode() {
		return this.getCode().getarg1() + " = " + "BinTree.tl(" + this.getCode().getarg2() + ");";
	}


}