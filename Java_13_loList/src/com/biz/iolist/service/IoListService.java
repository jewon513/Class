package com.biz.iolist.service;

public interface IoListService {

	//판매 정보 입력
	public void input();

	//여러 데이터를 연속해서 입력하고자 할때
	//몇개의 데이터를 입력할 것인가를 지정하여 처리하는 method
	public void input(int count);
	
	//판매 금액 계산
	public void total();
	
	//판매 정보 리스트 보기
	public void list();
	
	//판매 정보 1개의 정보보기
	public void view();
	
	
	
}
