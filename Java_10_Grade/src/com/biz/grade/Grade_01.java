package com.biz.grade;

import java.util.Scanner;

public class Grade_01 {

	private static int[] intKor;
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		intKor = new int[5];
		
		for (int i=0 ; i<intKor.length; i++) {
			input(i);
		}
		
		
		
		for (int i=0 ; i<intKor.length; i++) {
			System.out.printf("intKor[%d] = %d\n", i, intKor[i]);
		}
		
	}
	
	public static void input(int index) {
		scan = new Scanner(System.in);
		
		System.out.printf("숫자를 입력하세요 >> ");
		String strKor=scan.nextLine();
		int inputKor=Integer.valueOf(strKor);
		
		intKor[index]=inputKor;
	}
}
