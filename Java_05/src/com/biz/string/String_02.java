package com.biz.string;

public class String_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNation="Republic of Korea";
		int intLength = strNation.length();
		
		for(int i=0; i< intLength; i++) {
			char cA=strNation.charAt(i);
			System.out.println(i + "번째 : " + cA);
		}
		System.out.println("===========================");
		for(int i=0; i< intLength; i++) {
			char cA=strNation.charAt(i);
			System.out.print(cA);
		}
	}

}
