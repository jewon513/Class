package com.biz.keyinput;

import java.util.Scanner;

public class Keyinput_04 {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		
		System.out.println("=======================================");
		System.out.println("회원가입");
		System.out.println("=======================================");
		
		
		System.out.print("이름 > ");
		String strName=scanner.nextLine();
		
		System.out.print("전화번호 > ");
		String strTel=scanner.nextLine();
		
		System.out.print("주소 > ");
		String strAddr=scanner.nextLine();
		
		System.out.println("======================================");
		System.out.println("축하드립니다. 곧 집에 가실수 있습니다.");
		System.out.println("--------------------------------------");
		System.out.println(strName);
		System.out.println(strTel);
		System.out.println(strAddr);
		System.out.println("======================================");
	
	}

}
