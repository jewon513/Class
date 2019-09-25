package com.biz.classes;

import com.biz.classes.grade.Grade;

public class GradeMain_03 {

	public static void main(String[] args) {

		//성적 처리를 위하여 학생의 7명의 객체를 선언, 생성, 초기화 하는 부분;
		Grade grade01 = new Grade();
		Grade grade02 = new Grade();
		Grade grade03 = new Grade();
		Grade grade04 = new Grade();
		Grade grade05 = new Grade();
		Grade grade06 = new Grade();
		Grade grade07 = new Grade();
		
		
		// grade01 객체의 멤버변수에 값을 setting 한다.
		// 변수에 값을 저장한다.
		grade01.strName="홍길동";
		grade01.strNum="001";
		grade01.intKor=90;
		grade01.intEng=88;
		grade01.intMath=77;
		

		grade02.strNum="002";
		grade02.strName="이몽룡";
		grade02.intKor=78;
		grade02.intEng=88;
		grade02.intMath=66;
		

		grade03.strNum="003";
		grade03.strName="사또";
		grade03.intKor=99;
		grade03.intEng=99;
		grade03.intMath=99;
		
		grade04.strNum="003";
		grade04.strName="사또";
		grade04.intKor=99;
		grade04.intEng=99;
		grade04.intMath=99;
		
		grade05.strNum="003";
		grade05.strName="사또";
		grade05.intKor=99;
		grade05.intEng=99;
		grade05.intMath=99;
		
		grade06.strNum="003";
		grade06.strName="사또";
		grade06.intKor=99;
		grade06.intEng=99;
		grade06.intMath=99;
		
		grade07.strNum="003";
		grade07.strName="사또";
		grade07.intKor=99;
		grade07.intEng=99;
		grade07.intMath=99;
		
		

		
		
		//결과를 List로 출력하는 부분
		
		System.out.println("============================================");
		System.out.println("응용SW반 성적표");
		System.out.println("============================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점");
		grade01.gradeList();
		grade02.gradeList();
		grade03.gradeList();
		grade04.gradeList();
		grade05.gradeList();
		grade06.gradeList();
		grade07.gradeList();
		System.out.println("============================================");
		
	}

}
