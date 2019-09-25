package com.biz.var;

public class FloatVar_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intKor =90;
		int intEng =87;
		int intMath =67;
		
		int intSum=intEng+intKor+intMath;
		float fAvg=intSum/3.0f;
		
		// %d : 정수형
		// %f : 실수형
		// %6d : 전체 길이를 6자리를 하고 오른쪽 정렬한 후 왼쪽에 빈칸을 남긴 정수형
		// &6.2f : 전체 길이를 6자리로 하고 소숫점 이하 2번째 자리까지 표시하고 오른쪽 정렬한 후 왼쪽에 빈칸을 남긴 실수형
		System.out.println("=============================");
		System.out.println("성적표");
		System.out.println("-----------------------------");
		System.out.printf("국어 : %5d\n", intKor);
		System.out.printf("영어 : %5d\n", intEng);
		System.out.printf("수학 : %5d\n", intMath);
		System.out.println("-----------------------------");
		System.out.printf("총점 : %5d\n", intSum);
		System.out.printf("평균 : %5.2f\n", fAvg);
		System.out.println("=============================");
		
	}

}
