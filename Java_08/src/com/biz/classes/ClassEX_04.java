package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEX_04 {

	/*
	 * 클래스를 객체배열로 선언했을경우
	 * 몇몇클래스(String 등)을 제외하고는
	 * 객체 배열의 요소를 모두 초기화 작업을 해야 
	 * 맴버변수의 접근(읽기,쓰기)가 가능하다.
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		//1. 객체 선언
		StudentVO[] stVO = new StudentVO[10];
		
		//2. 객체요소의 초기화
		stVO[0] = new StudentVO();
		
		//3. 객체요소의 맴버변수(또는 메서드)에 접근하기
		stVO[0].strNum="001";
		stVO[0].strName="홍길동";
		
		System.out.println(stVO[0].strName);
		
		// 아직 index 1의 요소는 초기화 하지 않았기 떄문에 
		// 맴버변수에 접근하면 NullPointer Exception 이 발생한다.
	}

}
