package com.biz.list.addr;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrEx_01 {

	public static void main(String[] args) {

		List<AddrVO> addrList = new ArrayList<AddrVO>();
		
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
		
		// addrList의 개수를 계산해서 nSize 변수에 담는다.
		
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
		
		for(AddrVO vo : addrList) {
			System.out.printf("%s\t", vo.getStrName());
			System.out.printf("%s\t", vo.getStrtel());
			System.out.printf("%s\t", vo.getStrAddr());
			System.out.printf("%s\t", vo.getStrEmail());
			System.out.printf("%s\n", vo.getStrHP());
		}
		System.out.println("================================================");
	}

}
