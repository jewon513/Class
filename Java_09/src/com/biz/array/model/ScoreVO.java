package com.biz.array.model;

public class ScoreVO {

	public String strNum;
	public int intKor;
	public int intEng;
	public int intMath;

	
	// private 변수 
	// public, private 키워드를 접근 제한자라고 한다.
	// public은 다른 클래스에서 자유롭게 값을 읽기 쓰기가 가능하다.
	// private는 현재 클래스(ScroeVO)에서만 값을 읽기 쓰기가 가능하도록 제한하는것.
	// 외부에서 어떤 코드에서도 이 값들을 변경하거나 읽어서 사용하지 못하도록 한다.
	
	private int intSum;
	private int intAvg;
	private int intRank;

	public void add() {
		int num = 100 + 200 + 300 ;
	}
	public int add_ret() {
		int num = 100 + 200 + 300;
		return num;
	}
	
	
	public int sum() {
		intSum=intKor+intEng+intMath;
		return intSum;
	}

}

