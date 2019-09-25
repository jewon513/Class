package com.biz.list.model;

/*
 * 고객관리 기능을 만드는데 고객의 주소록을 관리하는 클래스를 디자인 한다.
 * 
 * 이름 strName 
 * 주소 strAddr
 * 전화번호 strTel
 * 핸드폰 strHP
 * 
 * 포인트 intPoint
 * 
 */


public class AddrVO {

	private String strName;
	private String strAddr;
	private String strTel;
	private String strHP;
	private int intPoint;
	
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
	public String getStrHP() {
		return strHP;
	}
	public void setStrHP(String strHP) {
		this.strHP = strHP;
	}
	public int getIntPoint() {
		return intPoint;
	}
	public void setIntPoint(int intPoint) {
		this.intPoint = intPoint;
	}
	
	
}
