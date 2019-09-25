package com.biz.string.domain;

/*
 * 보통 VO(value Object)클래스를 조정하는 package 이름
 * 과거엔 model이라고 사용하였고 현재는 domain이라는 이름도 많이 사용하고 있다.
 * 일부에서는 command를 쓰기도 한다.
 * 
 * DTO (Data Transfer Object) 데이터를 보내는 클래스 : VO와 쓰임새가 거의 같다.
 * VO와 혼용하여 사용하는 경우도 있다.
 * 일부 프로젝트 패턴, 구조에서는 VO와 구별해서 사용을 한다.
 * 
 */


public class StudentVO {

	//맴버변수, 필드, 속성
	private String strNum;
	private String strName;
	private String strAddr;
	private String strTel;
	private  int intAge;
		
	public StudentVO(String strNum, String strName, String strAddr, String strTel, int intAge) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.strAddr = strAddr;
		this.strTel = strTel;
		this.intAge = intAge;
	}
	
	public StudentVO() {
		super();
	}


	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public int getIntAge() {
		return intAge;
	}
	public void setIntAge(int intAge) {
		this.intAge = intAge;
	}
	
	@Override
	public String toString() {
		return "StudentVO [strNum=" + strNum + ", strName=" + strName + ", strAddr=" + strAddr + ", strTel=" + strTel
				+ ", intAge=" + intAge + "]";
	}
	
	
}
