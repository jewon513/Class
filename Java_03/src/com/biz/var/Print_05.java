package com.biz.var;

public class Print_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		int i;
		for (i=1; i<10; i=i+1) {
			System.out.printf("%d x %d = %2d\n", num,i,num*i);
		}
		
		/*
		 * frintf() 메서드는
		 * 형식에 맞는 모양의 출력결과를 얻기위한 명령문이다.
		 * 출력하고자 하는 형식의 문자열을 만든 후
		 * 변수, 값, 계산식이 위치할 곳에 %d 특수문자열을 포함시키면 해당 특수문자열 대신에 변수, 값, 계산식과 바꾸어
		 * 문자열을 생성하고 출력해준다.
		 * 자동 줄바꿈이 되지 않으므로 문자열 끝에서는 \n을 넣어준다.
		 * 
		 */
	}
}
