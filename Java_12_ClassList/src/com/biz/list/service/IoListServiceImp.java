package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.IoListVO;

public class IoListServiceImp {

	List<IoListVO> ioList;
	
	public IoListServiceImp () {
		ioList = new ArrayList<IoListVO>();
	}
	
	public void input() {
		
		IoListVO ioListVO;
		
		ioListVO= new IoListVO("2019-09-05","14:00:01","CJ 햇반", 1500);
		ioList.add(ioListVO);
		
		ioListVO= new IoListVO("2019-09-05","14:00:02","CJ 햇반", 1500);
		ioList.add(ioListVO);
		
		ioListVO= new IoListVO("2019-09-05","14:00:03","CJ 햇반", 1500);
		ioList.add(ioListVO);
		
		ioListVO= new IoListVO("2019-09-05","14:00:04","CJ 햇반", 1500);
		ioList.add(ioListVO);

		ioListVO= new IoListVO("2019-09-05","14:00:05","CJ 햇반", 1500);
		ioList.add(ioListVO);
	}// input() end;
	
	public void input(int count) {
		IoListVO ioListVO;
		
		Random rnd = new Random();
		
		for (int i = 0 ; i <count ; i++) {
			String strTime = String.format("10:00:%02d", i);
			int intH = rnd.nextInt(5)+1;
			String strPName = String.format("일반미 %d 호", intH);
			
			int intqty = rnd.nextInt(30)+10;
			
			ioListVO= new IoListVO("2019-09-05",strTime,strPName, 1000*intH, intqty);
			ioList.add(ioListVO);	
		}
		
	}
	public void total() {
		int nSize = ioList.size();
		for(int i = 0 ; i <nSize ; i++) {
			IoListVO vo = ioList.get(i);
			vo.setIntTotal(vo.getIntPrice()*vo.getIntQty());
		}
	}
	
	public void list() {
		System.out.println("============================================================================");
		System.out.println("거래내역");
		System.out.println("============================================================================");
		System.out.println("일자\t\t시각\t\t상품명\t\t단가\t수량\t합계");
		System.out.println("============================================================================");
		for ( IoListVO vo : ioList) {
			System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\n",
					vo.getStrDate(),
					vo.getStrTime(),
					vo.getStrPName(),
					vo.getIntPrice(),
					vo.getIntQty(),
					vo.getIntTotal());
		}
		System.out.println("============================================================================");
	}
	
}
