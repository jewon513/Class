package com.biz.classes.model;
/*
 * 학생의 성적처리에 사용할 VO 클래스 디자인
 * prototype 코드 작성
 * 객체를 생성하는 근본코드
 * 
 * 성적처리를 위해 필요한 데이터 항목들
 * 학번, 국어점수, 영어점수, 수학점수, 총점, 평균
 * 
 * 이 데이터 항목중에서 총점과 평균을 제외한 나머지는 어쩔 수 없이 입력해야하는 데이터들이다.
 */


public class GradeScoreVO {
	
	public String strNum;
	public int intKor;
	public int intEng;
	public int intMath;
	public int total;
	public float average;
	
	
	public void total() {
		total = intKor+intEng+intMath;
	}
	public void average() {
		int sum = intKor+intEng+intMath;
		average = sum /3.0f;
	}
}
