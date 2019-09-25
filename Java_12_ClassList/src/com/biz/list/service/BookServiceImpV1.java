package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

public class BookServiceImpV1 implements BookService {

	Scanner scan; // 키보드에서 값을 입력받기 위한 준비
	List<BookVO> bookList; //BookVO를 이용해서 bookList를 선언
	
	//생성자 메소드에서는 scan과 bookList를 사용 할 수 있도록 초기화하고 생성할 것이다.
	public BookServiceImpV1() {
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	}
	
	@Override
	public void input() {
		System.out.printf("도서번호 >>");
		String strNum = scan.nextLine();
		
		System.out.printf("도서명>>");
		String strName= scan.nextLine();
		
		System.out.printf("저자>>");
		String strWriter= scan.nextLine();
		
		System.out.printf("출판사>>");
		String strComp= scan.nextLine();
		
		/*
		 * 사용자가 데이터를 입력하는 중에 가격이나, 출판년도를 숫자가 아닌 문자열을 입력하게 되면, 문자열을 숫자로 바꾸는 과정에서
		 * NumberFormatException이 발생하게 된다.
		 * 
		 * 이럴 경우 사용자가 입력하는 과정에서 약간의 실수만 하게 되어도 그동안 앞에서 입력했던 모든 데이터를 잃게 된다.
		 * 
		 * 개발자 입장에서는 별다른 의미가 없고 추가 코드가 없어서 좋겠지만 사용자 입장에서는 매우 불편하다.
		 * 
		 * 그렇기 때문에 개발자는 적절한 해결방법을 만들어야 한다.
		 * 
		 * 1. 만약 사용자가 가격이나, 출판년도를 문자열함하여 입력할 경우 안내 메세지를 보여주고 다음 값을 입력하도록 유도하는 코드를 작성하고자 한다.
		 * 
		 * 
		 */
		
		System.out.printf("가격>>");
		String strPrice= scan.nextLine();
		int intPrice = 0;
		
		/*
		 * 
		 */
		
		try {
			intPrice =  Integer.valueOf(strPrice);
		} catch (Exception e) {
			System.out.println("가격에 문자열이 포함됨!!");
			System.out.println("현재 도서 정보는 추가되지 않음.");
			return;
		}
		
		System.out.printf("출판년도 >>");
		String strYear= scan.nextLine();
		int intYear=0;
		
		try {
			intYear= Integer.valueOf(strYear);
		} catch (Exception e) {
			System.out.println("출판년도에 문자열이 포함됨!!");
			System.out.println("현재 도서 정보는 추가되지 않음.");
			return;
		}
		
		
		BookVO bookVO = new BookVO();
		bookVO.setStrNum(strNum);
		bookVO.setStrName(strName);
		bookVO.setStrWriter(strWriter);
		bookVO.setIntPrice(intPrice);
		bookVO.setStrComp(strComp);
		bookVO.setIntYear(intYear);
		
		bookList.add(bookVO);
	}
	//service.input(30); 30개의 데이터를 입력받아라.
	public void input (int count) {
		for(int i = 0 ; i<count; i++) {
			
			this.input();
			
		}
	}

	@Override
	public void list() {
		
		System.out.println("============================================================");
		System.out.println("도서 정보 일람표");
		System.out.println("============================================================");
		System.out.println("ISBN\t도서명\t출판사\t저자\t가격\t출판연도");
		System.out.println("============================================================");
		
		int nSize=bookList.size();
		for (int i = 0 ; i<nSize ; i++) {
			BookVO vo = bookList.get(i);
			
			System.out.printf("%s\t%s\t%s\t%s\t%5d\t%4d\n",
					bookList.get(i).getStrNum(),
					vo.getStrName(),
					vo.getStrComp(),
					vo.getStrWriter(),
					vo.getIntPrice(),
					vo.getIntYear());
			
		}

	}

	@Override
	public void view(int index) {

		System.out.println("=======================================");
		System.out.println("ISBN : " + bookList.get(index).getStrNum());
		System.out.println("도서명 : " + bookList.get(index).getStrName());
		System.out.println("출판사 : " + bookList.get(index).getStrComp());
		System.out.println("저자 : " + bookList.get(index).getStrWriter());
		System.out.println("가격 : " + bookList.get(index).getIntPrice());
		System.out.println("출판년도 : " + bookList.get(index).getIntYear());
		
	}

	@Override
	public void view(String strName) {
		int nSize = bookList.size();
		for(int i = 0 ; i<nSize ; i++) {
			if(bookList.get(i).getStrName().equalsIgnoreCase(strName)) {
				this.view(i);
			}
		}

}

}
