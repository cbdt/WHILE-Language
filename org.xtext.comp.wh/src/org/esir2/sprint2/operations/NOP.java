package org.esir2.sprint2.operations;
import org.esir2.sprint2.*;

public class NOP extends Operation {
	public NOP(Code3Addr code) {
		super("NOP", code);
	}
	
	@Override
	public String toTSCode() {
		return null;
	}

}
