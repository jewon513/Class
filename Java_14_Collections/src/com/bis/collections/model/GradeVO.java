package com.bis.collections.model;

public class GradeVO {

	private String strName;
	private int intKor;
	private int intEng;
	private int intMath;
	
	public final String getStrName() {
		return strName;
	}
	public final void setStrName(String strName) {
		this.strName = strName;
	}
	public final int getIntKor() {
		return intKor;
	}
	public final void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public final int getIntEng() {
		return intEng;
	}
	public final void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public final int getIntMath() {
		return intMath;
	}
	public final void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	@Override
	public String toString() {
		return "GradeVO [strName=" + strName + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ "]";
	}
	
	
	
	
	
}
