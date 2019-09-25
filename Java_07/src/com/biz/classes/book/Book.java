package com.biz.classes.book;

public class Book {

	public String bookName;
	public String publisher;
	public String writer;
	public int price;
	
	public void bookView() {
		System.out.println("도서 개별 정보");
		System.out.println("도서명 : " + bookName);
		System.out.println("출판사 : " + publisher);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
	}
	public void bookList() {
		System.out.printf("%s\t%s\t%s\t%d\n", bookName,publisher,writer,price);
	}
}
