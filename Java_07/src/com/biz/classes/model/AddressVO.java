package com.biz.classes.model;

public class AddressVO {
	public String strName;
	public String strTel;
	public String strAddr;
	public String strRelation;
	
	public void addressView() {
		System.out.println("이름 : " + strName);
		System.out.println("전화번호 : " + strTel);
		System.out.println("주소 : " + strAddr);
		System.out.println("관계 : " + strRelation);
		
	}

}
