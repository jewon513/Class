package com.biz.classes;
/*
 * 나는 Class_01 이름을 가진 클래스(class)입니다.
 * 클래스는 첫 글자를 대문자로 시작하는 이름을 가져야 합니다.
 * 중간에 숫자 _ 를 포함할 수 있습니다.
 * 빈칸이나 기타 특수문자는 사용할 수 없습니다.
 * 
 * 나는 3개의 method를 가지고 있습니다.
 * method의 첫 글자는 소문자로 시작하는 이름을 가져야 합니다.
 * 변수명을 짓는 규칙과 같습니다.
 * 
 * 나는 더 많은 method를 가질 수 있습니다.
 * 더욱 다양한 명령들을 한 곳에 묶어 놓을 수 있습니다.
 * 내가 포함 method는 static이 없으므로 
 * method를 사용하기 위해서는 반드시 객체로 선언해야 합니다.
 */

public class Class_01 {

	public String strMember = "나는 멤버변수";

	public void method_01() {
		System.out.println("나는 method_01입니다.");
		System.out.println(strMember);
	}

	public void method_02() {
		System.out.println("나는 method_02입니다.");
		System.out.println("Class_01의 두번째 메서드 입니다.");
	}

	public void method_03() {
		System.out.println("나는 method_03입니다.");
		System.out.println("우리나라 만세");
		System.out.println("대한민국 만세");
	}
}
