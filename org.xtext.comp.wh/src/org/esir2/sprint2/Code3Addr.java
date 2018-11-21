package org.esir2.sprint2;

public class Code3Addr {

	private int operator;
	private String arg1;
	private String arg2;
	private String arg3;

	public Code3Addr(int operator, String argr1, String argr2, String argr3) {
		this.operator = operator;
		this.arg1 = argr1;
		this.arg2 = argr2;
		this.arg3 = argr3;
	}

	public int getop() {
		return this.operator;
	}

	public String getarg1() {
		return this.arg1;
	}

	public String getarg2() {
		return this.arg1;
	}

	public String getarg3() {
		return this.arg1;
	}

	@Override
	public String toString() {
		return "<" + operator + ", " + arg1 + ", " + arg2 + ", " + arg3 + ">";
	}

}
