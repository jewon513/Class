package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankAccService;
import com.biz.bank.service.BankAccServiceV2;

public class BankAccEx_02 {

	public static void main(String[] args) {

		BankAccService bs = new BankAccServiceV2();
		Scanner scan = new Scanner(System.in);
		String strBookFile = "src/com/biz/bank/domain/계좌원장.txt";
		
		while(true) {
			System.out.println("===========================================");
			System.out.println("\t한국은행 차세대시스템 v2");
			System.out.println("===========================================");
			System.out.println("1.조회 2.입금 3.출금 4.전체조회 0.종료");
			System.out.println("-------------------------------------------");
			System.out.print("업무선택 >> ");
			String strMenu = scan.nextLine();
			int intMenu = Integer.valueOf(strMenu);
		
				try {
					if(intMenu==0) {
						bs.writeAccBook(strBookFile);
						break;
					}
					else if(intMenu==1) {
						bs.viewAcc();
					}else if(intMenu==2) {
						bs.input();
					}else if(intMenu==3) {
						bs.output();
					}else if(intMenu==4) {
						bs.bankBookList();
					}else {
						System.out.println("잘못 입력하셨습니다.");
					}
				} 
					catch (Exception e) {
					e.printStackTrace();
				}
			
		}
		
		scan.close();
		System.out.println("오늘도 수고하셨습니다.");
		
	}

}
