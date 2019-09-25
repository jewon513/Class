package com.biz.classes;

import java.util.Scanner;

import com.biz.classes.model.StudentVO;

public class ClassEx_05 {

	public static void main(String[] args) {

		/*
		 * 기본형 변수, String 형변수 등은 배열을 선언만해도 자체적으로 초기화하는 코드가 실행되도록 설계되어있다.
		 * 하지만 사용자가 만든 클래스는 배열을 선언한 후에 반드시 각 요소 모두를 초기화 해야만 사용가능하다.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 길이를 설정하세요 >> ");
		String strNum = scan.nextLine();
		int intNum = Integer.valueOf(strNum);
		
		
		StudentVO[] stVO = new StudentVO[intNum];
		for (int i = 0; i<stVO.length; i++) {
			stVO[i] = new StudentVO();
		}
		
		System.out.println(stVO.length); 
	
		stVO[101].strName="홍길동";
		System.out.println(stVO[101].strName);
	}

}
