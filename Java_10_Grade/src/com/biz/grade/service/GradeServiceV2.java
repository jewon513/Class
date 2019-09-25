package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV2 {
	
	private int[] intKor;
	private int[] intEng;
	private int[] intMath;
	
	private int[] sum;
	
	private Scanner scan;
	

	// 생성자(메서드) 만들기
	
	public GradeServiceV2(int length) {
		
		intKor = new int[length];
		intEng = new int[length];
		intMath = new int[length];
		sum = new int[length];
		scan = new Scanner(System.in);
		
		
	}// GradeSerivce() end
	
	public void input() {
		
		for(int i = 0 ; i<intKor.length; i++) {
			inputKor(i);
			inputEng(i);
			inputMath(i);
		}
	}// input() end
	
	private void inputKor(int index) {
		System.out.print((index+1)+"번 국어 >> ");
		intKor[index] = Integer.valueOf(scan.nextLine());
	}
	private void inputEng(int index) {
		System.out.print((index+1)+"번 영어 >> ");
		intEng[index] = Integer.valueOf(scan.nextLine());
	}
	private void inputMath(int index) {
		System.out.print((index+1)+"번 수학 >> ");
		intMath[index] = Integer.valueOf(scan.nextLine());
	}
	
	public void view() {
		System.out.println("==========================================================");
		System.out.println("성적표");
		System.out.println("==========================================================");
		System.out.printf("국어\t영어\t수학\n");
		for(int i = 0 ; i<intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\n", intKor[i],intEng[i],intMath[i]);
		}
	}
}
