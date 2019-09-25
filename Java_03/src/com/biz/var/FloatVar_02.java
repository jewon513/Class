package com.biz.var;

public class FloatVar_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fNum=60.0f;
		System.out.println(fNum);
		// 정수 100이 실수로 바뀌어 변수에 저장
		fNum = 100;
		System.out.println(fNum);
		// 정수3이 실수 3.0으로 바뀐 후 계산되어 저장
		fNum = 30.0f /3;
		System.out.println(fNum);
		// 정수 55와 3이 나뉘어 지고 결과가 실수로 바뀌어 저장
		fNum = 55 / 3;
		System.out.println(fNum);
		// 55가 실수로 변한되고 계산되어 저장
		fNum = 55 / 3.0f;
		System.out.println(fNum);
	}

}
