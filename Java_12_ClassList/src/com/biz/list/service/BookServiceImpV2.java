package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

/*
 * 키보드에서 도서정보를 입력받아서
 * List에 추가하고 목록보기, 정보보기
 * 기능이 업그레이드 된 코드
 */


public class BookServiceImpV2 implements BookService {

	Scanner scan;
	List<BookVO> bookList;
	
	
	public BookServiceImpV2() {
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	}
	
	
	@Override
	public void input(int count) {

		for(int i = 0 ; i < count ; i++) {
			System.out.println("=============================");
			System.out.println((i+1) + "번째 도서정보 입력");
			try {
				this.input();	
			} catch (Exception e) {
				System.out.println("데이터를 다시 입력하세요");
				i--;
				continue;
			}
		}
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
		
		System.out.printf("가격>>");
		String strPrice= scan.nextLine();
		int intPrice = 0;
		
		try {
			intPrice =  Integer.valueOf(strPrice);
		} catch (Exception e) {
			//System.out.println("가격에 문자열이 포함됨!!");
			//만약 도서가격을 입력하는 도중에 NumberFormat... 예외가 발생하면
			//현재 입력하던 도서 정보를 다시 입력하도록 코드를 작성할 것이다.
			
			System.out.println("!!가격은 숫자만 입력하세요!!");
			throw new NumberFormatException();
		}
		
		System.out.printf("출판년도 >>");
		String strYear= scan.nextLine();
		int intYear=0;
		
		try {
			intYear= Integer.valueOf(strYear);
		} catch (Exception e) {
			System.out.println("출판년도에 문자열이 포함됨!!");
			
			while(true) {
				System.out.println("연도를 다시 입력 (종료 : -1)> ");
				String s1 = scan.nextLine();
				
				try {
					intYear=Integer.valueOf(s1);
					if(intYear==-1) break;
					break;
				}catch(Exception e2) {
					
				}
			}
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

	@Override
	public void list() {

		System.out.println("====================================================");
		System.out.println("도서 리스트");
		System.out.println("====================================================");
		System.out.println("ISBN\t도서이름\t저자\t출판사\t가격\t출판년도");
		System.out.println("====================================================");
		
	
		for(BookVO vo : bookList) {
			System.out.printf("%s\t%s\t%s\t%s\t%d\t%d\n",
					vo.getStrNum(),
					vo.getStrName(),
					vo.getStrWriter(),
					vo.getStrComp(),
					vo.getIntPrice(),
					vo.getIntYear());	
		}
	}
	

	@Override
	public void view(int index) {

		BookVO vo = bookList.get(index);
		System.out.println("ISBN : " + vo.getStrNum());
		System.out.println("도서명 : " +vo.getStrName());
		System.out.println("저자 : " + vo.getStrWriter());
		System.out.println("출판사 : " + vo.getStrComp());
		System.out.println("가격 : " + vo.getIntPrice());
		System.out.println("출판년도 : " + vo.getIntYear());
	
	}

	@Override
	public void view(String strName) {

		int nSize = bookList.size();
		for (int i = 0 ; i < nSize ; i++) {
			
			BookVO vo = bookList.get(i);
			String voStrName = vo.getStrName();
			
			//도서명과 검색어(strName)이 반드시 일치하는 것만 찾아낸다.
			if(voStrName.equalsIgnoreCase(strName)) {
				this.view(i);
			}
			//도서명 문자열중에 strName 문자열이 포함되어 있으면 그 값을 표시하자. (중간 문자열 검색)
			if(voStrName.toUpperCase().contains(strName.toUpperCase())) {
				this.view(i);
			}
		}
	}
}
