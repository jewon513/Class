package com.biz.first;

public class Var_02 {

	public static void main(String[] args) {
		// 변수의 명명규칙
		// 1. 첫 글자는 반드시 영문소문자
		// 2. 여러 단어를 묶어서 의미있게 명명
		//    변수 이름만 보고 어떤 데이터가 저장되어 있는지를 유추할 수 있도록 
		// 3. 중간, 끝에는 숫자를 포함할 수 있다.
		// 4. 경우에 따라 _ (Under Score)를 사용할 수 있다.
		// 5. 첫 글자에 _ (Under Score)를 사용할 수 있다.
		// 6. 첫 글자 숫자, 중간에 빈칸, 사칙연산기호 등은 포함되서는 안된다.
		
		//변수의 Carmel case 명명 패턴
		// 1. 변수명을 여러 단어로 묶어 만들경우 각 단어가 시작될때는 대문자로(첫 글자는 제외)
		// 2. 또는 단어와 단어사이를 _ 로 연결할 수 있다.

		int intNum1 = 30;
		int intNum2 = 40;
		System.out.println(intNum1+intNum2);

	}

}
