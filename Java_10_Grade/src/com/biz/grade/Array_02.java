package com.biz.grade;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		int intKor[] = new int[50];
		int intEng[] = new int[50];
		
		int korSum=0;
		int engSum=0;
		
		Random rnd = new Random();
		
		for (int i = 0 ; i<intKor.length; i++) {
			intKor[i]=rnd.nextInt(100)+1;
			intEng[i]=rnd.nextInt(100)+1;
			
			korSum+=intKor[i];
			engSum+=intEng[i];
		}
		System.out.println("===================================");
		System.out.println("Kor\tEng");
		System.out.println("-----------------------------------");
		
		for (int i = 0 ; i<intKor.length; i++) {
			System.out.printf("%d\t%d\n",intKor[i], intEng[i]);
		}
		System.out.println("===================================");
		System.out.printf("%d\t%d", korSum ,engSum);
		
	}

}
