package com.biz.first;

public class Var_03 {

	public static void main(String[] args) {
		
		int intKorGrade=90;
		int intEngGrade=40;
		int intMathGrade=50;
		
		int intSum = 0;
		
		intSum = intKorGrade+intEngGrade+intMathGrade;
		System.out.println(intSum);
		
		// 총점계산후 console에 보여라
		// System.out.println(intKorGrade+intEngGrade+intMathGrade);
		
		// 국어와 수학의 합계는?
		intSum=intKorGrade+intMathGrade;
		System.out.println(intSum);
		// 국어와 영어의 합계는?
		intSum=intKorGrade+intEngGrade;
		System.out.println(intSum);
		// 영어와 수학의 합계는?
		intSum=intEngGrade+intMathGrade;
		System.out.println(intSum);
		
	}

}
