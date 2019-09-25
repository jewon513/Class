package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV3 {
	
	private int[] intKor;
	private int[] intEng;
	private int[] intMath;
	private int[] intNum;
	
	private int[] sum;
	private int[] avg;
	
	private Scanner scan;

	// 생성자(메서드) 만들기
	
	public GradeServiceV3(int length) {
		
		intKor = new int[length];
		intEng = new int[length];
		intMath = new int[length];
		sum = new int[length];
		scan = new Scanner(System.in);
		intNum = new int[length];
		
	}// GradeSerivce() end
	
	public void input() {
		
		for(int i = 0 ; i<intKor.length; i++) {
			inputKor(i);
			inputEng(i);
			inputMath(i);
			total(i);
			inputNum(i);
		}
	}// input() end
	private void inputNum(int index) {
		intNum[index] = index+1;
	}
	
	
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
	
	private void total(int index) {
		int intTotal= intKor[index]+intEng[index]+intMath[index];
		
		sum[index] = intTotal;
	}
	
	public void view() {
		System.out.println("==========================================================");
		System.out.println("성적표");
		System.out.println("==========================================================");
		System.out.printf("국어\t영어\t수학\t총점\n");
		for(int i = 0 ; i<intKor.length; i++) {
			System.out.printf("%03d\t%d\t%d\t%d\t%d\n", intNum[i], intKor[i],intEng[i],intMath[i],sum[i]);
		}
	}// view() end
	
	public void sort() {
		for(int i = 0 ; i < sum.length ; i ++) {
			for(int j = i+1; j <sum.length ; j++) {
				if(sum[i]<sum[j]) {
					
					int _temp = sum[i];
					sum[i]=sum[j];
					sum[j]=_temp;
					
					_temp = intKor[i];
					intKor[i]=intKor[j];
					intKor[j]=_temp;
				
					_temp = intEng[i];
					intEng[i]=intEng[j];
					intEng[j]=_temp;
				
					_temp = intMath[i];
					intMath[i]=intMath[j];
					intMath[j]=_temp;
				
					_temp = intNum[i];
					intNum[i]=intNum[j];
					intNum[j]=_temp;
					
					
				}
			}
		}
	}
	
	
	
}