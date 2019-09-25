package com.biz.iolist.model;

/*
 * 클랫흐를 작성할때 다른 클래스를 extends 하지 않으면 모든 클래스는 Object 클래스를 자동으로 상속받는다.
 * Object에는 클래스를 객체로 생성하거나 하는 몇가지 method가 설정되어 있다.
 * 그 method들을 자동으로 상속받아서 쓸 수 있다.
 */


public class BookVO {

	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intYear;

	/*
	 * 생성자 method가 기본 연산
	 * 1. 클래스에 선언된 맴버변수(필드)를 초기화한다.
	 * 
	 */
	
	// BookVO 클래스를 객체로 생성하면서 외부에서 전달해준  "이름" 을 strName의 매개변수에 받아서
	// 맴버변수를 초기화 할때 strName=""으로 하지 않고 매개변수 strName에 받은 값으로 초기화 한다.
	
	// 매개변수가 있는 생성자 메소드를 만들게 되면,
	// 최초에 자동으로 만들어지던 생성자
	// public BooKVO(){} 코드가 만들어지지 않는다.
	public BookVO(String strName) {
		this.strName=strName;
	}
	
	
	public final String getStrName() {
		return strName;
	}
	public final void setStrName(String strName) {
		this.strName = strName;
	}
	public final String getStrWriter() {
		return strWriter;
	}
	public final void setStrWriter(String strWriter) {
		this.strWriter = strWriter;
	}
	public final String getStrComp() {
		return strComp;
	}
	public final void setStrComp(String strComp) {
		this.strComp = strComp;
	}
	public final int getIntPrice() {
		return intPrice;
	}
	public final void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public final int getIntYear() {
		return intYear;
	}
	public final void setIntYear(int intYear) {
		this.intYear = intYear;
	}
	
	
	
}
