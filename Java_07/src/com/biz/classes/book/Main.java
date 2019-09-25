package com.biz.classes.book;

public class Main {

	public static void main(String[] args) {

		Book Book_01 = new Book();
		Book Book_02 = new Book();
		Book Book_03 = new Book();
		
		Book_01.bookName = "Do it. 자바프로그래밍 입문";
		Book_01.publisher = "이지스퍼블리싱";
		Book_01.writer = "박은종";
		Book_01.price =25000;
		
		Book_02.bookName = "Do it. 자바프로그래밍 실전";
		Book_02.publisher = "이지스퍼블리싱";
		Book_02.writer = "박은종";
		Book_02.price =25000;

		Book_03.bookName = "Do it. 집에 빨리가는 방법!";
		Book_03.publisher = "이지스퍼블리싱";
		Book_03.writer = "박제원";
		Book_03.price =11111;
		
		
		Book_01.bookView();
		System.out.println("===========================================");
		System.out.printf("도서명\t\t\t\t출판사\t\t저자\t가격\n");
		Book_01.bookList();
		Book_02.bookList();
		Book_03.bookList();
		

		        System.out.printf("\u250c\u252c\u2510\n");
		        System.out.printf("\u251c\u253c\u2524\n");
		        System.out.printf("\u2514\u2534\u2518\n");
		  
		
	}

}
