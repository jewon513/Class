package com.biz.list.model;

public class StudentVO {

	//맴버변수를 외부에서 직접 접근하지 못하도록 제한을 걸겠다.
	private int intNum; //학번
	private String strName; //이름
	
	private String dpt;; //전공
	private int intGrade; //학년
	
	private String strTel; //전화번호
	private String strAddr; //주소

	// private로 선언된 맴버변수에 접근할 수 있도록 
	// 통로를 생성해야한다
	
	// getter(), setter()
	// private로 정보 은닉된 맴버변수를 외부에서 접근 할 수 있도록 해주는 method
	// 학번 맴버변수 값을 읽을 method
	public int getIntNum() {
		return intNum;
	}
	
	// 학번 맴버변수에 값을 저장할 method
	public void setIntNum(int intNum) {
		this.intNum=intNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public int getIntGrade() {
		return intGrade;
	}

	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}

	public String getStrTel() {
		return strTel;
	}

	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}

	public String getStrAddr() {
		return strAddr;
	}

	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	
	
}


