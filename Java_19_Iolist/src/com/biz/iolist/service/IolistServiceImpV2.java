package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.iolist.domain.IolistVO;

public class IolistServiceImpV2 implements IolistService {

	protected List<IolistVO> iolist;
	
	public IolistServiceImpV2() {
		iolist = new ArrayList<IolistVO>();
	}
	
	@Override
	public void read(String fileName) throws Exception {

		FileReader fileReader = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader==null) break; //End Of File(EOF)에 다다르면 while문 종료 
			

			//문자열을 분리하여 token 생성
			String[] ios = reader.split(":");
			/*
			 * ios[0] : 날짜
			 * ios[1] : 상품명
			 * ios[2] : 매입매출구분 , 1: 매입 2: 매출
			 * ios[3] : 단가
			 * ios[4] : 수량
			 */
			
			// 생성된 tken을 vo에 담기
			IolistVO ioVO = new IolistVO();
			ioVO.setStrDate(ios[0]);
			ioVO.setStrPName(ios[1]);
			ioVO.setStrIO(ios[2]);
			ioVO.setIntPrice(Integer.valueOf(ios[3]));
			ioVO.setIntQty(Integer.valueOf(ios[4]));
			
			iolist.add(ioVO);
			
		}
		buffer.close();
		fileReader.close();
	}

	@Override
	public void list() {

		int inPrice=0;
		int outPrice=0;

		this.list_header();
		
		for(IolistVO vo : iolist) {

			String io = "매입";
			if(vo.getStrIO().equalsIgnoreCase("1")) {
				inPrice=vo.getIntPrice();
			}else {
				outPrice=vo.getIntPrice();
				io = "매출";
			}
			System.out.printf("%8s\t%-14s\t%3s\t%8d\t%8d\t%8d\n",
					vo.getStrDate(),
					vo.getStrPName(),
					io,
					inPrice,
					outPrice,
					vo.getIntQty());
			
			inPrice=0;
			outPrice=0;
		}
		System.out.println("===================================================================================================");
		
	}

	protected void list_header() {
		System.out.println("====================================================================================================");
		System.out.println("매입매출정보");
		System.out.println("====================================================================================================");
		System.out.println("거래일자\t상품명\t\t\t구분\t매입단가\t매출단가\t수량");
		System.out.println("====================================================================================================");
	}
	@Override
	public void summary() {
		// TODO Auto-generated method stub

	}

}
