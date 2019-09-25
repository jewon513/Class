package com.biz.classes.string;

public class String_03 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		int intLength=strNation.length();
		char cSearch = 'u';
		int index = 0;
		
		for(index=0; index<intLength; index++) {
			char cA =strNation.charAt(index);
			
			if(cA == cSearch) {
				System.out.println(index+"번 위치에 있음");	
			}

		
			
		}
	
	}

}
