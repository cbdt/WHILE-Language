package org.esir2.sprint2.operations;
import org.esir2.sprint2.Code3Addr;
import org.esir2.sprint2.Operation;

public class CONS extends Operation {
	
	public CONS(Code3Addr code) {
		super("CONS", code);
	}
	
	@Override
	public String toTSCode() {
		return this.getCode().getarg1() + " = BinTree.cons("+this.getCode().getarg2()+", " +this.getCode().getarg3()+");";
	}

}
