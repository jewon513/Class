package com.biz.classes.user;

public class Exec_New_01 {

	public static void main(String[] args) {
		
		
		//User_New_01 클래스를 un 객체로 선언하는 것
		//new User_New_01() : 생성자 메서드로 un 객체를 사용할 수 있도록 초기화 한다.
		User_New_01 un = new User_New_01();
		
		un.add();
		
		/*
		 * 어떤 클래스에 있는 method에 static 키워드가 붙어 있으면
		 * 클래식.method() 형식으로 호출하여 사용이 가능하다.
		 * 
		 * static 키워드가 없는 method는 객체를 생성하여 객체.method() 형식으로 호출해야 한다.
		 * 이때 객체는 클래스의 대리자(복제자)역할을 한다.
		 */
		
		
	}

}
