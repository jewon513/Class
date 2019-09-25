package com.biz.keyinput;

import java.util.Scanner;

/*
 * 키보드로 무엇인가(etc....)를 입력하면 변수에 저장하고 변수에 저장된 내용을 console에 표시
 */

public class Keyinput_01 {

	public static void main(String[] args) {
		/*
		 * Scanner : 키보드에서 무엇인가를 입력하면 그 내용을 수신하여 문자열로 변환시켜주는 클래스
		 * Scanner 클래스는 직접 어떤 일을 수행할 수는 없고 반드시 변수로 선언을 해주어야 한다.
		 *
		 */
		
		Scanner scanner;
		
		/*
		 * 첫 글자가 소문자인 키워드로 선언한 변수 : 기본형 변수, Primitive type 변수
		 */
		int iNum;
		long lNum;
		float fNum;
		double dNum;
		boolean bYes;
		char cA;
		
		/*
		 * 참조형 변수, type 변수
		 * 클래스 키워드를 이용해서 선언한 변수
		 * 클래스 키워드는 첫 글자가 대문자인 형태를 이루고 있음.
		 * 
		 * 객체(Object)라고 부른다.
		 * 여기서는 st와 sc 이다.
		 * 
		 * 객체의 특징중 하나는 
		 * 객체.method() 형태의 다양한 기능들이 클래스로부터 상속받아 사용할 수 있다.
		 * st.length(), st.toUpperCase()
		 *
		 * 객체 이름을 명명할때 변수의 명명 규칙과 같은 문법이 적용된다.
		 * 그리고 객체 이름은 일반적으로 클래스 이름의 첫글자를 소문자로 바꾸어 작성한다. 
		 * 
		 */
		
		
		String st;
		Scanner sc;
		
		
		
	}

}
