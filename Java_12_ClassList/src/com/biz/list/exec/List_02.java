package com.biz.list.exec;

import com.biz.list.service.BookService;
import com.biz.list.service.BookServiceImpV2;

public class List_02 {

	public static void main(String[] args) {

		//도서 정보들을 키보드에 입력받아서
		//리스트로 만들고
		//리스트를 console에 보이는 코드
		
		BookService bs = new BookServiceImpV2();
		
		
		// bs.input(); // 1개의 도서 정보를 입력 받아라
		
		// interface에 구현되지 않은 input(int count) method를 호출하려면
		// bs 객체를 BookServiceImpV1 class로 형 변환을 해야 한다.
		// 이 코드로 인해서 interface를 활용하는 의미가 일부 퇴색된다.
		// 그래서 input(int count)처럼 처음에 interface를 만들때 없던 메소드를 호출하려면
		// 가급적 설계자에게 요청하여 interface에 등록하도록 하는 것이 좋다.
		//((BookServiceImpV1)bs).input(3);
		
		bs.input();
		bs.list();
		bs.view(0);
		bs.view("Java");
		
	}

}
