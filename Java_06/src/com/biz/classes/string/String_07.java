package com.biz.classes.string;

import java.util.Scanner;

public class String_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sNum = 0;
		int num2 = 0;
		int Max= 0;
		
		System.out.printf("몇번째? >> ");
		sNum = scan.nextInt();
		System.out.printf("몇의 배수? >> ");
		num2 = scan.nextInt();
		System.out.printf("최대 몇까지? >>");
		Max = scan.nextInt();
		
		int count = 0;
		for (int i = 1; i <= Max; i++) {
			if (i % num2 == 0) {
				count += 1;
			}
			if (sNum == count) {
				System.out.println(count + " : " +i);
				break;
			}
		}
		scan.close();
	}
}
