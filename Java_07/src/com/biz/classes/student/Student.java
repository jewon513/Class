package com.biz.classes.student;

public class Student {

	
	/*
	 * main() 메서드가 없는 class
	 * 정보처리(data 처리)를 하기 위해서
	 * 데이터를 보관하고, 읽기, 쓰기 등을 수행하는 클래스
	 * 혼자는 아무일도 하지 모한다.
	 * 반드시 어딘가에 있는 main() 메서드에서
	 * 선언, 생성, 초기화를 수행한 후
	 * 포함된 멤버변수에 값을 쓰기, 읽기를 수행하고
	 * 포함된 method를 호출하여 기능을 수행한다.
	 * 
	 * class를 만드는 규칙
	 * 1. 한개의 파일(클래스)에는
	 * 	  class 키워드가 특별한 경우가 아니면
	 * 	  1개만 존재해야한다.
	 * 2. 파일의 이름 클래스 이름과 같다.
	 * 	  현재 이 파일은 Studunt.java 이다.
	 * 3.클래스 이름의 첫 글자는 대문자이다. 
	 * 4. method가 없는 클래스는 맴버변수만을 가질 수 있다.
	 */
	public String name;
	public String num;
	public int year;
	public String major;
	
	
	public void listView() {
		System.out.printf("%s\t%s\t%d\t\t%s\t%d\n", name, num, year, major, 2019-year);
	}
	public void studentView() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + num);
		System.out.println("입학년도 : " + year);
		System.out.println("전공 : " + major );
		System.out.println("학년 : " + (2019-year));
	}
}
