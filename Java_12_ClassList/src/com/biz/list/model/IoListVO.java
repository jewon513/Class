package com.biz.list.model;

public class IoListVO {

	/*
	 * 몽룡씨가 최근에 마트를 오픈하면서
	 * 마트에서 판매되는 거래내용을 관리할 App을 만들려고 한다.
	 * 거래 내용을 관리할 클래스를 만들고자 한다.
	 * 
	 * 추상화
	 * 
	 * 거래일자 : date, String, strDate
	 * 거래시각 : time, String, strTime
	 * 상품이름 : pName , String, strPName
	 * 상품단가 : price , int, intPrice
	 * 수량 	: qty , int, intQty
	 * 상품금액 : 상품단가 * 수량, total, int, intTotal
	 * 

	 */

	private String strDate;
	private String strTime;
	private String strPName;
	private int intPrice;
	private int intQty;
	private int intTotal;
	
	public IoListVO(String strDate, String strTime, String strPName, int intPrice) {
		this.strDate=strDate;
		this.strTime=strTime;
		this.strPName=strPName;
		this.intPrice=intPrice;
		
	}
	
	public IoListVO(String strDate, String strTime, String strPName, int intPrice, int Qty) {
		this.strDate=strDate;
		this.strTime=strTime;
		this.strPName=strPName;
		this.intPrice=intPrice;
		this.intQty=Qty;
		
	}
	
	public final String getStrDate() {
		return strDate;
	}
	public final void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public final String getStrTime() {
		return strTime;
	}
	public final void setStrTime(String strTime) {
		this.strTime = strTime;
	}
	public final String getStrPName() {
		return strPName;
	}
	public final void setStrPName(String strPName) {
		this.strPName = strPName;
	}
	public final int getIntPrice() {
		return intPrice;
	}
	public final void setIntPrice(int intPrice) {
		this.intPrice = intPrice;
	}
	public final int getIntQty() {
		return intQty;
	}
	public final void setIntQty(int intQty) {
		this.intQty = intQty;
	}
	public final int getIntTotal() {
		return intTotal;
	}
	public final void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}

}
