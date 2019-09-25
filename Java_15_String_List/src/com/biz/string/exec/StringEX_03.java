package com.biz.string.exec;

public class StringEX_03 {

	
	/*
	 * strNation에 담긴 문자열을 여순으로 콘솔에 표시하시오.
	 * 
	 */
	
	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		String[] ss = strNation.split("");
		
		int length = strNation.length();
		
		for (int i = length-1; i >=0; i--) {
			System.out.print(ss[i]);
		}
		String ss2 ="";
		for (int i = 0 ; i<ss.length ; i++) {
			ss2 =ss2.concat(ss[i]);
			
		}
		System.out.println("");
		System.out.println(ss2);
		
	}

}
