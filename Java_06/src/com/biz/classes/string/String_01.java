package com.biz.classes.string;

public class String_01 {

	public static void main(String[] args) {

		String strNation;
		strNation = "Republic of Korea";
		
		int length = strNation.length();
		for(int i=0; i<length; i++) {
			char cA = strNation.charAt(i);
			if (cA == 'u') {
				System.out.println("u는 " +(i+1) +"번째에 있습니다.");
			}
		}
		
		
		int strNationIndex = strNation.indexOf("u");
		
		System.out.printf("u는 %d번째에 있습니다.", (strNationIndex+1));
		
		
		
	}

}
