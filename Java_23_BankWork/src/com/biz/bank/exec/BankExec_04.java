package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankServiceV1;

public class BankExec_04 {

	public static void main(String[] args) {

	

		Scanner scan = new Scanner(System.in);

		// 계좌번호
		String strAccNum = "0001";
		// balance : 잔고(예금잔고)
		int intBalance = 1000000;

		BankServiceV1 bs = new BankServiceV1(strAccNum, intBalance);
		
		while (true) {
			System.out.println("==============================================");
			System.out.println("\t\t광한루 은행");
			System.out.println("==============================================");
			System.out.println("1.조회 2.입금 3.출금 0.종료");
			System.out.println("==============================================");
			System.out.print("선택 >> ");
			String strMenu = scan.nextLine();
			int intMenu = Integer.valueOf(strMenu);

			
			/*
			 * Java에서는
			 * swtich(문자열, 숫자, 문자...) 가능
			 * 			 
			 * 하지만 문자열일 경우 약간의 문제 발생 가능성이 있다 
			 */
			switch (intMenu) {
			case 1: // lable, GOTO명령을 사용할 때 쓰는 키워드
				System.out.println("계좌조회");
				break;
			case 2:
				System.out.println("입금처리");
				break;
			case 3:
				System.out.println("출금처리");
				break;
			case 0:
				System.out.println("업무종료");
				break;
			}
			
		}
		//System.out.println("업무종료");

	}

}
