package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrServiceImpV2 implements AddrService {

	private List<AddrVO> addrList;
	
	
	public void input() {
		
		// input() method 의 구현
		// input() method에서 할 일들의 코드를 작성하는것
		
		addrList = new ArrayList<AddrVO>();
		
		AddrVO aVO = new AddrVO();
		
		aVO.setStrName("홍길동");
		aVO.setStrtel("01-111-1111");
		aVO.setStrAddr("서울시");
		aVO.setStrEmail("Jewon513@gmail.com");
		aVO.setStrHP("010-111-1111");
		
		addrList.add(aVO);
		
		aVO = new AddrVO();

		aVO.setStrName("이몽룡");
		aVO.setStrtel("063-222-2222");
		aVO.setStrAddr("남원시");
		aVO.setStrEmail("Jewon513@gmail.com");
		aVO.setStrHP("010-222-2222");

		addrList.add(aVO);

		aVO = new AddrVO();

		aVO.setStrName("성춘향");
		aVO.setStrtel("063-333-3333");
		aVO.setStrAddr("남원시");
		aVO.setStrEmail("Jewon513@gmail.com");
		aVO.setStrHP("010-333-3333");
		
		addrList.add(aVO);
		
	}

	public void list() {
		
		System.out.println("================================================");
		System.out.println("주소록");
		System.out.println("================================================");
		System.out.println("이름\t전화번호\t주소\t이메일\t핸드폰");
		System.out.println("================================================");
		int nSize = addrList.size();
		for (int i = 0 ; i<nSize ; i++) {
			System.out.printf("%s\t", addrList.get(i).getStrName());
			System.out.printf("%s\t", addrList.get(i).getStrtel());
			System.out.printf("%s\t", addrList.get(i).getStrAddr());
			System.out.printf("%s\t", addrList.get(i).getStrEmail());
			System.out.printf("%s\n", addrList.get(i).getStrHP());
		}
		System.out.println("================================================");

	}

	public void view(int num) {

		if (num > addrList.size()-1) {
			System.out.println("데이터가 없음");
			return; // view() 메소드 강제로 끝
		}
		AddrVO aVO =addrList.get(num);
		
		System.out.println("이름 : " + aVO.getStrName());
		System.out.println("전화 : " + aVO.getStrtel());
		System.out.println("주소 : " + aVO.getStrAddr());
		System.out.println("이메일 : " + aVO.getStrEmail());
		System.out.println("핸드폰 : " + aVO.getStrHP());
	}

}
