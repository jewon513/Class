package com.biz.classes;

import java.util.Scanner;

public class Prime_02 {

	public static void main(String[] args) {

		PrimeService pService = new PrimeService();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자(-1 종료) ==> " );
			String strNum= scan.nextLine();
			int num = Integer.valueOf(strNum);
			
			if(num<0) break;
			pService.checkPrime(num);
			System.out.println("============================");
		}
		System.out.println("종료되었습니다.");
		
		
		
	}

}
