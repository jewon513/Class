package com.biz.classes;

import com.biz.classes.grade.Grade;

public class GradeMain_02 {

	public static void main(String[] args) {

		
		Grade grade01 = new Grade();
		
		// grade01 객체의 멤버변수에 값을 setting 한다.
		// 변수에 값을 저장한다.
		grade01.strName="홍길동";
		grade01.strNum="001";
		
		grade01.intKor=90;
		grade01.intEng=88;
		grade01.intMath=77;
		
		Grade grade02 = new Grade();
		grade02.strNum="002";
		grade02.strName="이몽룡";
		
		grade02.intKor=78;
		grade02.intEng=88;
		grade02.intMath=66;
		
		Grade grade03 = new Grade();
		grade03.strNum="003";
		grade03.strName="사또";
		
		grade03.intKor=99;
		grade03.intEng=99;
		grade03.intMath=99;

		
		System.out.println("============================================");
		System.out.println("응용SW반 성적표");
		System.out.println("============================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		System.out.println("============================================");
		
	}

}
