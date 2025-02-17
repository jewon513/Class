package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_03 {

	/*
	 * StudentVO 클래스를 사용하여
	 * 학생 10명의 신상정보를 메모리에 저장하고
	 * 학생 정보와 학생 리스트를 확인하고 싶습니다.
	 * 1.학생클래스를 객체로 선언하는 명령문을 10개 복제
	 * 2.배열을 이용하는 방법
	 */
	
	public static void main(String[] args) {
		
		
		// 배열의 선언이라고 한다.
		// StudentVO[] : 지금부터 배열을 선언하겠다.
		// new StudnetVO[10] : StudnetVO 클래스를 10개 복제하여 사용할 수 있도록 메모리를 준비하라.
		// New StudentVO() 생성자 메서드와는 다른 명령형식이다.
		StudentVO[] stVO = new StudentVO[10];
		
		// 선언된 객체를 사용할 수 있도록 초기화작업을 해야한다.
		/*
		 * 선언된 배열의 요소에 접근(읽기, 쓰기)를 하려면 요소의 index를 기준으로 참조해야한다.
		 * stVO[0] : stVO 배열의 0번 위치에 있는 요소에 접근하겠다라는 시작.
		 * 현 지점에서 stVO 배열은 10개의 메모리 장소를 사용하겠다 라고 선언만 된 상태이다.
		 * 이 상황에서 stVO의 각 맴버변수에 접근(읽기, 쓰기)를 시도하면
		 * 아직 stVO요소들이 초기화가 되지 않아서 오류가 발생한다.
		 */
		
		stVO[0].strNum="001";
		stVO[0].strName="홍길동";
		
		System.out.println(stVO[0].strName);
		
		
		
		
		
		
		
		
		
		
		
	}

}
