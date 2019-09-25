package com.biz.grade;

import java.util.Scanner;

public class Grade_02_exec {

	private static int[] intKor;
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		intKor = new int[5];
		
		for (int i=0 ; i<intKor.length; i++) {
			input(i);
		}
		for (int i=0 ; i<intKor.length; i++) {
			view(i);
		}
		
		view(intKor);
	}
	
	public static void input(int index) {

		System.out.printf("%d번의 국어점수 >> ", index+1);
		String strKor=scan.nextLine();
		int inputKor=Integer.valueOf(strKor);
		
		intKor[index]=inputKor;
	}
	
	public static void view(int index) {
		System.out.printf("intKor[%d] = %d\n", index, intKor[index]);
	}
	
	public static void view(int[] intKor) {
		for(int i = 0 ; i<intKor.length; i++) {
			System.out.println((i+1) + "번 국어 : " + intKor[i]);
		}
	}
}
