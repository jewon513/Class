package com.biz.classes.arrays;

public class Array_01 {

	public static void main(String[] args) {

		// 문자열을 저장할 메모리 10개를 준비하라.
		String[] str = new String[10];

		
		// 배열에 값을 저장.
		// 배열의 요소를 지정하는 방법
		// 배열[index] 형식으로 지정
		// index를 배열 첨자라고 한다.
		// array index 라고 부른다.
		
		str[0]="대한민국";
		str[1]="우리나라";
		str[2]="Republic of Korea";
		
		// 배열1번 위치의 값을 읽어서 콘솔에 보여준다.
		System.out.println(str[1]);
		
		/*
		 * str 배열을 10개 선언하였으므로
		 * index는 0부터 9까지만 사용할 수 있다.
		 */
		
		System.out.println(str[10]);
		// 정수값을 저장할 메모리 10개를 준비하라.
		int[] intNum = new int[10];
		intNum[0]=10;
		intNum[1]=30;
		intNum[3]=40;
		intNum[9]=100;
		
		
		
		// 실수값을 저장할 메모리 10개를 준비하라.
		float[] fNum = new float[10];
		
		
		
		
	}

}
