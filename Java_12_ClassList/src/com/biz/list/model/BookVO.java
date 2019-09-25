package com.biz.list.model;

/*
 * 도서 정보 관리 어플에서 사용할 클래스를 만들려고 한다.
 * 
 * 추상화단계
 * 1. 도서명 : name , (String) strName
 * 2. 저자 : writer (String) strWriter
 * 3. 출판사 : company (String) strComp
 * 4. 도서가격 : price (int) intPirce
 * 5. 출판년도 : year (int) intYear
 * 6. ISBN(Internatioal Serial Book Number) 도서일련번호 : num (String) strNum
 * 
 * VO : Value Object : 데이터를 담는 최소 클래스
 * VO 클래스를 만들때
 * 1. 추상화 단계
 * 2. 멤버변수를 선
 * 3. 접근제한자를 기본으로 private로 선언
 * 
 */

public class BookVO {

	private String strNum;
	
	private String strName;
	private String strWriter;
	private String strComp;
	private int intPrice;
	private int intYear;
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
	public String getStrWriter() {
		return strWriter;
	}
	public void setStrWriter(String strWriter) {
		this.strWriter = strWriter;
	}
	public String getStrComp() {
		return strComp;
	}
	public void setStrComp(String strComp) {
		this.strComp = strComp;
	}
	public int getIntPrice() {
		return intPrice;
	}
	public void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public int getIntYear() {
		return intYear;
	}
	public void setIntYear(int intYear) {
		this.intYear = intYear;
	}
	

	
	
}
