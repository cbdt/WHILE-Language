package org.esir2.sprint2.operations;

import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class AND extends Operation {
	
	public AND(Code3Addr code) {
		super("AND", code);
	}
	
	@Override
	public String toTSCode() {
		return this.getCode().getarg1() + " = BinTree.and("+this.getCode().getarg2() + ", " + this.getCode().getarg3()+")";
	}

}
