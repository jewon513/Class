package com.biz.bank.service;

import java.util.Scanner;

import com.biz.bank.domain.BankAccVO;

// 1개의 계좌에 대한 처리를 수행할 클래스

public class BankAccServiceV1 implements BankAccService {

	BankAccVO bankAccVO;
	Scanner scan;

	public BankAccServiceV1(String strNum, int intBalance) {
		bankAccVO = new BankAccVO();
		scan = new Scanner(System.in);
		
		this.bankAccVO.setNum(strNum);
		this.bankAccVO.setBalance(intBalance);
	}
	
	//키보드에서 계좌번호를 입력받아서 vo에 담긴 계좌번호가 일치하면 계좌 내용을 보여주고 true값을 return
	//아니라면 false값을 return.
	
	@Override
	public boolean viewAcc() {
		System.out.print("계좌번호 >> ");
		// 키보드에서 계좌번호를 입력받기.
		String strAccNum = scan.nextLine();
		
		if (!strAccNum.equals(bankAccVO.getNum())){ //계좌번호가 다르면 false
			System.out.println("계좌번호 오류");
			return false;
		}
		
		System.out.println("===========================");
		System.out.println("계좌번호 : " + bankAccVO.getNum());
		System.out.println("최종잔액 : " + bankAccVO.getBalance());
		System.out.println("최종거래 : " + bankAccVO.getLastDate());
		System.out.println("비고 : " + bankAccVO.getRemark());
		return true;
	}

	@Override
	public void input() {
		
		// 계좌정보가 맞으면 입금진행
		if(this.viewAcc()) {
			
			System.out.print("입금액 >> ");
			
			// 키보드에서 입금액을 입력받기
			String strinput = scan.nextLine();
			int intInput = Integer.valueOf(strinput);

			// 입력받은 입금액을 총잔액에 합산하기
			bankAccVO.setBalance(bankAccVO.getBalance()+intInput);
		
		}

	}

	@Override
	public void output() {
		
		// 계좌정보가 맞으면 출금진행
		if(this.viewAcc()) {
			System.out.print("출금액 >> ");
			// 키보드에서 출금액을 입력받기
			String strOutput = scan.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			int intBalance = bankAccVO.getBalance();
			
			// 총잔액과 출금액을 비교하여
			if (intBalance >= intOutput) {
				// 총잔액 >= 출금액이면 출금하여 입력받은 출금액을 총 잔액에서 감산하기
				intBalance -= intOutput;
				bankAccVO.setBalance(intBalance);
			}else {
				// 총잔액 < 출금액이면 잔액부족 표시
				System.out.println("잔액부족");
			}
			
		}
	
	}

	@Override
	public void bankBookList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeAccBook(String strBookFile) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
