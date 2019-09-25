package com.biz.array.model;

public class MemberVO {

	public String strName;
	public String strTel;
	
	/*
	 * MemberVO의 멈베 변수중 intAGe는 나이를 저장하는 변수이다.
	 * 만약 실수로 데이터를 저장(보관)할때 실제 나이 범위를 벗어나게 저장하면 
	 * 나중에 연산을 수행할 때 문제를 일으킬수도 있다.
	 * 
	 * 이럴때 멤버변수를 private로 선언하고 값을 저장할때 method를 통해서 저장하는 방법이 있다.
	 * 
	 */
	
	
	private int intAge;
	
	public int getIntAge() {
		return intAge;
	}
	
	/*
	 * this.intAGe 멤머변수에 다시 저장된다.
	 */
	
	public void setIntAge(int intAge) {
		
		if(intAge<0) {
			System.out.println("나이는 0세 이상이어야 합니다.");
			return;
		}
		
		if(intAge>120) {
			System.out.println("나이는 120세 이하이어야 합니다.");
			return;
		}
		
		this.intAge=intAge;
	}
	
}
