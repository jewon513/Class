package com.biz.classes.grade;

/*
 * dynamic class라고 정의하기도 하는데 이렇게 의미로 해석하게 되면 어려움이 있다.
 * 그냥 static이 아닌 class라고 이해를 해야하는게 좋다.
 *
 */


public class Grade {
	
	/*
	 * 객체의 정의
	 * 1. 연산을 통해서 얻을 수 없는 데이터 (ex:학번, 이름, 과목점수 etc...)들을 변수로 정의하는 단계 ==> 맴버 변수라고 한다.
	 * 2. 멤버변수를 기초로 하여 연산을 통해서 얻을 수 있는 항목들을 위하여 method()를 정의
	 * 3. 처리하고자 하는 대상(데이터 etc...) 을 객체로 정의 하는 단계를 추상화라고 한다. 추상화는 객체지향 언어를 이용하는 프로그래밍에서 매우 중요한 개념이다. 
	 * 
	 * 
	 */

	public String strNum;
	public String strName;
	public int intKor;
	public int intEng;
	public int intMath;
	
	public void sum() {
		int sum = intKor+intEng+intMath;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/3);
	}
	
	public void gradeList() {
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\n", 
				strNum, 
				strName, 
				intKor, 
				intEng, 
				intMath, 
				intKor+intEng+intMath);
		
	}
}
