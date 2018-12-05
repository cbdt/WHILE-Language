package org.esir2.sprint2;

public class Code3Addr {

	private String arg1;
	private String arg2;
	private String arg3;

	public Code3Addr(String argr1, String argr2, String argr3) {
		this.arg1 = argr1;
		this.arg2 = argr2;
		this.arg3 = argr3;
	}
	
	public Code3Addr(String argr1, String argr2) {
		this(argr1, argr2, "_");
	}
	
	public Code3Addr(String argr1) {
		this(argr1, "_", "_");
	}
	
	public Code3Addr() {
		this("_", "_", "_");
	}

	public String getarg1() {
		return this.arg1;
	}

	public String getarg2() {
		return this.arg2;
	}

	public String getarg3() {
		return this.arg3;
	}

}
