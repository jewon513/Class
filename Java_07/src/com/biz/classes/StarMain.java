package com.biz.classes;

import com.biz.classes.grade.Grade;
import com.biz.classes.grade.StaticGrade;

public class StarMain {

	public static void main(String[] args) {
		
		/*
		 * static class는 선언, 생성, 초기화 과정을 코딩하지 않고 직접 클래스.~~~ 방식으로 접근 할 수 있다.
		 * 
		 */
		
		StaticGrade.strNum="001";
		StaticGrade.strName="홍길동";
		StaticGrade.intKor=90;
		StaticGrade.intEng=80;
		StaticGrade.intMath=80;
		
		StaticGrade.sum();
		
		
		
		/*
		 * non static class는 반드시 접근(읽기, 쓰기)전에 대리자를 선언, 생성, 초기화 과정을 코딩해야한다.
		 * 대리자 : 객체, Object, instance 라고 한다.
		 * 대리자는 클래스의 복제품이다.
		 * 
		 * 대리자가 선언, 생성, 초기화되면 대리자는 일반 변수와 같은 방식으로 사용된다.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Grade grade01 = new Grade();
		grade01.strNum="002";
		grade01.strName="성춘향";
		grade01.intKor=99;
		grade01.intEng=99;
		grade01.intMath=99;
		
		grade01.sum();
		
		
		/*
		 * grade01과 마찬가지로 GradeNew의 복제자이지만
		 * 전혀 별개의 메모리 장소에 존재하므로
		 * grade01과는 관계, 영향이 전혀 미치지 않는다.
		 * 
		 */
		
		
		
		
	}
}
