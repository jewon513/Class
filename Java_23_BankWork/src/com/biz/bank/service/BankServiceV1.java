package com.biz.bank.service;

import java.util.Scanner;

public class BankServiceV1 {

	int intBalance = 0 ;
	String strAccNum;
	boolean check;
	Scanner scan = null;
	
	
	// BankServiceV1의 생성자
	public BankServiceV1() {
		scan = new Scanner(System.in);
	}
	
	public BankServiceV1(String strAccNum, int intBalance) {
		this.intBalance = intBalance;
		this.strAccNum = strAccNum;
		scan = new Scanner(System.in);
	}
	
	public boolean viewAcc () {
		System.out.println("계좌조회");
		System.out.print("계좌번호 입력 >> ");
		String strAccKeyIn = scan.nextLine();
		if(strAccKeyIn.equals(strAccNum)) {
			System.out.println("==============================================");
			System.out.printf("계좌번호: %s\n", strAccNum);
			System.out.printf("잔고: %d\n", intBalance);
			System.out.println("==============================================");
			
		}else {
			System.out.println("==============================================");
			System.out.println("조회된 계좌번호가 없음");
			System.out.println("==============================================");
			return check = false;
		}
		return check = true;
	}
	
	// method가 실행되는 동안 NumberFormatException이 발생하면 method를 호출한 곳에 exception을 넘긴다.
	public void input() throws NumberFormatException{
		System.out.println("입금처리");
		System.out.println("==============================================");
		// 입금을 받고
		// 계좌잔액 = 입금액 + 계좌잔액
		System.out.print("입금액 >> ");
		String strInput = scan.nextLine();
		int intInput = Integer.valueOf(strInput); //exception 처리부분
		intBalance += intInput;
	}
	
	// method가 실행되는 동안 NumberFormatException이 발생하면 method를 호출한 곳에 exception을 넘긴다.
	public void output() throws NumberFormatException{
		System.out.println("출금처리");
		System.out.println("==============================================");
		// 출금을 받고
		// 잔액 >= 출금 이면 : 잔액 = 잔액-출금;
		// 잔액 < 출금 이면 : 출금거부
		System.out.print("출금액 >> ");
		String strOutput = scan.nextLine();
		int intOutput = Integer.valueOf(strOutput); //exception 처리부분
		if(intBalance >= intOutput) { 
			intBalance -= intOutput;
		}else {
			System.out.println("잔액부족");
		}
		
	}
	
}
