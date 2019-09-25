package com.biz.keyinput;

import java.util.Scanner;

public class Keyinput_02 {

	public static void main(String[] args) {
		
		// scanner를 선언함.
		// System.in(키보드와 JVM 사이에서 키보드의 전기신호를 컴퓨터의 이진수 정보로 변환시키는 역할을 수행하는 클래스
		// new Scanner() : 생성자 메서드 라고 읽는다. scanner 객체를 사용할 수 있도록 생성, 초기화를 수행한다.
		
		Scanner scanner = new Scanner(System.in);
		
		String strNation = new String("대한민국");
		String strKorea = "대한민국";
		
		
		String strKeyIn;
		
		/*
		 * 이 코드가 실행이 되면
		 * 프로젝트는 모든 진행을 멈추고
		 * 키보드에 무엇인가 입력되기를 기다린다
		 */
		
		strKeyIn = scanner.nextLine();
		System.out.printf("키보드에서 입력된 문자열 : " + strKeyIn);
		
		
	}

}
