package com.biz.classes;

import com.biz.classes.grade.Grade;

public class GradeMain_01 {

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
		
		System.out.println("001 학생의 성적");
		System.out.println("국어 :" + grade01.intKor);
		System.out.println("영어 :" + grade01.intEng);
		System.out.println("수학 :" + grade01.intMath);
		
		int intSum = grade01.intKor + grade01.intEng + grade01.intMath;
		System.out.println("총점 :" + intSum);
		
		System.out.println("002 학생의 성적");
		System.out.println("국어 :" + grade02.intKor);
		System.out.println("영어 :" + grade02.intEng);
		System.out.println("수학 :" + grade02.intMath);
		
		intSum = grade01.intKor + grade02.intEng + grade02.intMath;
		System.out.println("총점 :" + intSum);
		
	
		System.out.println("003 학생의 성적");
		System.out.println("국어 :" + grade03.intKor);
		System.out.println("영어 :" + grade03.intEng);
		System.out.println("수학 :" + grade03.intMath);
		
		intSum = grade01.intKor + grade03.intEng + grade03.intMath;
		System.out.println("총점 :" + intSum);
	}

}
