package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class HD extends Operation {
	
	public HD(Code3Addr code) {
		super("HD", code);
	}
	
	@Override
	public String toTSCode() {
		return this.getCode().getarg1() + " = " + "BinTree.hd(" + this.getCode().getarg2() + ");";
	}

}
