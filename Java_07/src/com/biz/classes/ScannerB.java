package com.biz.classes;

import java.util.Scanner;

public class ScannerB {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("이름>> ");
		String strName = scan.nextLine();

		System.out.print("국어>> ");
		int intKor = scan.nextInt();

		System.out.print("영어>> ");
		int intEng = scan.nextInt();
		
		
		System.out.print("전화>> ");
		String strTel =scan.nextLine();
		
		System.out.print("전화2>> ");
		String strTel2 =scan.nextLine();
		
		
	}

}
