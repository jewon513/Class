package com.biz.grade;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int intNum[] = new int[50];
		int intSum=0;
		Random rnd = new Random();
		for (int i = 0 ; i<intNum.length; i++) {
			intNum[i]=rnd.nextInt(100)+1;
			intSum+=intNum[i];
		}
		
		System.out.printf("합계 : %d \n"
				+ "평균 : %4.1f ", 
				intSum, 
				intSum/(float)intNum.length);
		
		
	}

}
