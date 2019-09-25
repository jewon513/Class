package com.biz.classes.student;

public class Main {
	public static void main(String[] args) {
		
		//Student 클래스를 활용하여
		//실제 작동되는 코드를 작성
		
		Student student01 = new Student();
		Student student02 = new Student();
		Student student03 = new Student();
		
		student01.num="01";
		student01.name="박제원";
		student01.year=2014;
		student01.major="PA";
		
		student02.num="02";
		student02.name="김성룡";
		student02.year=2012;
		student02.major="Hell";
		
		student03.num="03";
		student03.name="이순신";
		student03.year=1500;
		student03.major="Hell";
		
		
		System.out.println("===========================================");
		System.out.println("이름\t학번\t입학년도\t전공\t학년");
		student01.listView();
		student02.listView();
		student03.listView();
		System.out.println("===========================================");
		student01.studentView();
		
		
	}
}
