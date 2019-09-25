package com.biz.loop;

public class Loop_09 {

	public static void main(String[] args) {
		/*
		 * 표쥰 for 반복문의 실행구조
		 * 1. int i = 0 :카운트 변수 초기화 최초 1번만 실행
		 * 2. i<10 : i 값을 범위조건과 비교
		 * 3. 참이면 System.out.println(i) 명령문 실행
		 * 4. i++ : 카운트 변수 1 증가
		 * 
		 * 1~4까지 i<10이 true 인동안 반복 실행
		 */
		for(int i=0; i<10; i++) {
			System.out.println(i);
		
		}
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}

}
