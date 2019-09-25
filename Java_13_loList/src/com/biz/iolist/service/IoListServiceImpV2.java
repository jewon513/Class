package com.biz.iolist.service;

import com.biz.iolist.model.IoListVO;

public class IoListServiceImpV2 extends IoListServiceImpV1 {

	/*
	 * V1에 이미 작성된 list() 메서드를 Override. 재 정의 하였다.
	 * 
	 */
	
	@Override
	public void list() {
		System.out.println("==================================================");
		System.out.println("판매리스트");
		System.out.println("==================================================");
		System.out.println("상품이름\t단가\t수량\t공급가액\t부가세\t공급대가");
		System.out.println("==================================================");
		
		for ( IoListVO vo : ioList) {
			int amt = (int) (vo.getIntTotal()/1.1);
			int vat = vo.getIntTotal() - amt;
			
			System.out.printf("%s\t%d\t%2d\t%6d\t\t%6d\t%6d\n",
					vo.getStrPName(),
					vo.getIntPrice(),
					vo.getIntQty(),
					amt,
					vat,
					vo.getIntTotal());
		}
		
	}

	
	
}
