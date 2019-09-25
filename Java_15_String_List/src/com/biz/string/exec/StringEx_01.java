package com.biz.string.exec;

public class StringEx_01 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		//strNation에 담긴 문자열을 알파벳단위(한글자씩)로 나누어서 strS1 배열에 담는다.
		String[] strS1 = strNation.split("");
		
		for(String s : strS1) {
			System.out.println(s);
		}
		//strNation에 담긴 문자열을 " " 기준으로 나누어서 strS2 배열에 담는다.
		String[] strS2 = strNation.split(" ");
		
		System.out.println("0:" + strS2[0]);
		System.out.println("1:" + strS2[1]);
		System.out.println("2:" + strS2[2]);
		
		try {
			System.out.println("3:" + strS2[3]);
		} catch (Exception e) {
			// 코드 없음
			// 만약 exception이 발생하면 모든 것을 무시하라.
		}
		
		try {
			System.out.println("3:" + strS2[3]);
		} catch (Exception e) {
			
			// try {} 내의 코드가 실행되는 과정에서 exception이 발생하면 JVM은 catch(e) {} 블럭에게
			// exception 정보를 전달한다. 이때 exception 정보는 변수 e가 받아서 가지고 있다.
			// e변수의 printStackTrace() method는 어떤 exception이 발생했는지 단순히 console에 보여주는 기능을 한다.
			e.printStackTrace();
		}
	}

}
