package com.biz.iolist.model;

public class GradeVO {

	private String strNum;
	private String strName;
	private int intKor;
	
	

	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GradeVO(String strNum) {
		this.strNum = strNum;
	}
	
	public GradeVO(String strNum, String strName, int intKor) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.intKor = intKor;
	}



	public final String getStrNum() {
		return strNum;
	}
	public final void setStrNum(String strNum) {
		this.strNum = strNum;
	}
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


	/*
	 * Object 클래스에서 정의돈 toString() 메서드는 객체가 생성된 주소를 보여주는 메서드이다.
	 * 실제 자바에서 객체가 생성된(저장된) 주소는 별 의미가 없다.
	 * 그래서 vo 클래스를 만들때
	 * 이클립스의 자동코드 작성 기능을 이용해서
	 * toString() method를 재 정의한다.
	 * 
	 * 이렇게 재정의를 하면 vo 객체의 맴버변수에 어떤 값을 setting 한 후 값들이 정상적으로 저장되어있는지 확인하는 용도로 toString()을 사용할 수 있다.
	 * 
	 */
	
	
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + "]";
	}
	
	
	
	
}
