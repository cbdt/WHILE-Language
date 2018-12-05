package org.esir2.sprint2;

abstract public class Operation {
	 Code3Addr code;
	private String operator;
	
	public Operation(String operator, Code3Addr code) {
		this.code = code;
		this.operator = operator;
	}
	
	public Code3Addr getCode() {
		return this.code;
	}
	
	public String toString() {
		return "< " + this.operator + ", " + code.getarg1() + ", " + code.getarg2()+ ", " + code.getarg3() + ">";
	}
	
	abstract public String toTSCode();
}
