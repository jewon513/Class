package com.biz.classes;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {

		/*
		 * 어떤수(num)가 소수인지 아닌지를 알아보는 방법.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.printf("판별하고 싶은 숫자를 입력하세요 >> ");
		String strNum = scan.nextLine();
	
		int num=Integer.valueOf(strNum);
		
		int i;
		
		for (i=2; i<num/2; i++) {
			if(num%i==0) break;
		}
		if(i>=num/2) {
			System.out.println(num + "은 소수입니다.");
		}else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
	}

}
