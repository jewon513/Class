package com.biz.iolist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.iolist.model.IoListVO;

public class IoListServiceImpV1 implements IoListService {

	//입력한 데이터를 보관할 리스트 저장소
	protected List<IoListVO> ioList;
	
	//생성자 메서드
	//외부에서 이 클래스를 사용하여 객체로 선언할때 자동으로 실행되는 method
	//1. 맴버변수나 객체 등을 작동하는데 필요한 요소들을 초기화 하는 코드를 작성 
	public IoListServiceImpV1() {
		// 이 코드가 누락되면 input() method에서 NullpointException이 발생한다.
		ioList = new ArrayList<IoListVO>();
	}
	
	@Override
	public void input() {
		
		IoListVO ioListVO = new IoListVO();
		Random rnd= new Random();
		
		//상품 이름을 일반미 1~5호로 임의로 붙여줌
		
		int intH = rnd.nextInt(5)+1;
		String strPName = String.format("청정미 %d호", intH);
		
		// 시간,분,초를 임의로 생성
		int intHour = rnd.nextInt(24);
		int intMin = rnd.nextInt(60);
		int intSec = rnd.nextInt(60);
		String strTime = String.format("%02d:%02d:%02d", intHour, intMin, intSec);
	
		// 임의의 수량을 생성
		int intQty = rnd.nextInt(30)+1;
		
		ioListVO.setStrDate("2019-09-06");
		ioListVO.setStrTime(strTime);
		ioListVO.setStrPName(strPName);
		ioListVO.setIntPrice(intH*1000);
		ioListVO.setIntQty(intQty);
		
		ioList.add(ioListVO);
		
	}// input() end 

	@Override
	public void input(int count) {

		for(int i = 0; i<count ; i++) {
			this.input();
		}
	}

	@Override
	public void total() {
		
		int nSize=ioList.size();
		for (int i = 0 ; i<nSize ; i++) {
			IoListVO vo = ioList.get(i);
			int intTotal = vo.getIntPrice()*vo.getIntQty();
			vo.setIntTotal(intTotal);
		}
		
	}

	@Override
	public void list() {

		System.out.println("=======================================================================================");
		System.out.println("판매 리스트");
		System.out.println("=======================================================================================");
		System.out.println("거래일자\t거래시간\t상품이름\t상품단가\t수량\t금액");
		System.out.println("=======================================================================================");
		
		for (IoListVO vo : ioList) {
			System.out.printf("%s\t%s\t%s\t%5d\t\t%2d\t%6d\n",
					vo.getStrDate(),
					vo.getStrTime(),
					vo.getStrPName(),
					vo.getIntPrice(),
					vo.getIntQty(),
					vo.getIntTotal());
		}
		System.out.println("=======================================================================================");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

}
