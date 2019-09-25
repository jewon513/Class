package com.biz.classes.grade;

public class StaticGrade {

	/*
	 * 어떤 class를 만들고, 멤버변수, 메서드에 한개라도 static이라는 키워드를 붙이게 되면 
	 * class가 static class가 된다.
	 * 
	 * static class가 된다는 것
	 * - 프로젝트를 RUN(컴파일, 실행)을 하게 된다면, JVM이 자동으로 클래스를 선언, 생성, 초기화 하여 사용할 수 있도록 미리 준비시켜준다는 개념.
	 */
	
	
	// 맴버변수들
	public static String strNum;
	public static String strName;
	public static int intKor;
	public static int intEng;
	public static int intMath;
	
	public static void sum() {
		//StaticGrade 클래스의 sum() 메서드의 몸체 부분이다.
		int sum = intKor+intEng+intMath;
		System.out.println("총점 : " + sum);
	
	}
	
}
