package com.biz.bank.service;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.biz.bank.domain.BankAccVO;

/*
 *여러개 계좌에 대한 입출금 처리 
 */

public class BankAccServiceV2 implements BankAccService {

	/*
	 * 멤버변수 영역에 선언된 변수들
	 * 멤버변수, 필드라고 부르며
	 * 여기에 선언된 변수들은
	 * 프로젝트가 실행되어서 작동되는 동안
	 * 그 값을 계속해서 유지하고 있다.
	 */
	
	Map<String, BankAccVO> bankList;
	
	/*
	 * viewAcc() method에서 bankList를
	 * 계좌번호로 조회를 했을때 해당하는 계좌번호가 조회되면
	 * bankList에서 해당하는 계좌정보를 담고 있을 인스턴스 변수이다.
	 * 또한 이 인스턴스가 가지고 있는 맴버변수들을 변경(수정) 하면
	 * 그 정보는 banList에도 반영이 된다.
	 * 
	 * bankAccVO의 balance, lastDate, remark 정보를 update하면
	 * bankList에 다시 담지 않아도
	 * 자동으로 bankList에 반영이 된다.
	 */
	
	BankAccVO bankAccVO;
	Scanner scan;
	
	public BankAccServiceV2() {
		bankList = new TreeMap<String, BankAccVO>();
		scan = new Scanner(System.in);
		
		// 계좌정보 생성
		for (int i = 0; i < 10; i++) {
			String strNum = String.format("%04d", i+1);		// 0001형태의 계좌번호 생성
			
			//
			BankAccVO bVO = new BankAccVO();
			bVO.setNum(strNum);
			bVO.setBalance(1000000);
			bVO.setLastDate("2019-09-20");
			bVO.setRemark("신규");
			
			bankList.put(strNum, bVO);
			
		}
		
	}
	
	@Override
	public boolean viewAcc() throws Exception {
		
		System.out.print("계좌번호 >> ");
		String strNum = scan.nextLine();
		
		// 필드변수
		bankAccVO = bankList.get(strNum);
		// 만약 strNum 계좌가 bankList에 있으면 해당 계좌정보가 bankAccVO에 담길 것이다.
		// 그렇지 않으면 bankAccVO는 null 값이 담길 것이다.
		
		if(bankAccVO !=null) {
			System.out.println("===========================================");
			System.out.println("계좌번호 : " + bankAccVO.getNum() );
			System.out.println("최종잔액 : " + bankAccVO.getBalance());
			System.out.println("거래일자 : " + bankAccVO.getLastDate());
			System.out.println("거래구분 : " + bankAccVO.getRemark());
			System.out.println("===========================================");
		}else {
			System.out.println("계좌정보 없음");
		}
		
		return false;
	}

	@Override
	public void input() throws Exception {
		
		this.viewAcc();
		if(bankAccVO != null) {
			// 입금처리 수행
			System.out.print("입금액 >> ");
			String strInput = scan.nextLine();
			int intInput = Integer.valueOf(strInput);
			
			int intBalance = bankAccVO.getBalance() ;
			intBalance += intInput;
			
			/*
			 * 지금 BankAccVO의 balance 필드에 값을 변경하면
			 * bankList의 자동으로 현재 값이 반영이 된다.
			 * 
			 * bankAccVO 값을 변경한 후
			 * bankList에 저장하거나 하는 코드를 사용할 필요가 없다.
			 */
			bankAccVO.setBalance(intBalance);
			bankAccVO.setRemark("입금");
			
			// 현재 입금처리한 날짜를 추가
			Date date = new Date();
			
			// DecimalFormat
			// 3000 = 3,000
			
			// 날짜값을 원하는 형태의 문자열로 변환시키는 클래스
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			String strLastDate = sd.format(date);
			bankAccVO.setLastDate(strLastDate);
			
		}else {
			System.out.println("계좌정보 없음");
			return;
		}
	}

	@Override
	public void output() throws Exception {
		this.viewAcc();
		if(bankAccVO!=null) {
			System.out.print("출금액 >> ");
			String strOutput = scan.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			int intBalance = bankAccVO.getBalance();
			if(intBalance >= intOutput) {
				intBalance -= intOutput;
				
				bankAccVO.setBalance(intBalance);
				
				bankAccVO.setRemark("출금");
				
				// 현재 입금처리한 날짜를 추가
				Date date = new Date();
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
				String strLastDate = sd.format(date);
				
				
				bankAccVO.setLastDate(strLastDate);
				
			}else {
				System.out.println("잔액부족 출금불가");
			}
		}
	}
	
	public void bankBookList() {
		System.out.println("===========================================");
		System.out.println("계좌\t잔액\t거래일자\t구분");
		System.out.println("===========================================");
		
		for(String key : bankList.keySet()) {
			System.out.printf("%s\t%d\t%s\t%s\n",
					bankList.get(key).getNum(),
					bankList.get(key).getBalance(),
					bankList.get(key).getLastDate(),
					bankList.get(key).getRemark());
		}
		System.out.println("===========================================");
	}
	
	//업무가 종료 될 때 현재 메모리에서 수행중이던
	//계좌 내용을 파일에 저장
	public void writeAccBook(String strBookFile) throws Exception {
		PrintWriter fileOut;
		fileOut = new PrintWriter(strBookFile);

		for(String key : bankList.keySet()) {
			
			fileOut.printf("%s:%d:%s:%s\n", 
					bankList.get(key).getNum(),
					bankList.get(key).getBalance(),
					bankList.get(key).getLastDate(),
					bankList.get(key).getRemark());
			fileOut.flush();
			
		}
		
		fileOut.close();
		
	}
	

}
