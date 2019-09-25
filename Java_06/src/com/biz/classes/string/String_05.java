package com.biz.classes.string;

import java.util.Scanner;

public class String_05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
			
		String strNation="Republic of Korea";
		
		System.out.println("저장된 문자열 : " + strNation);

		System.out.printf("찾을 문자를 입력하세요 >> ");
			
		String strSearch = scanner.nextLine();
		String strA="";
		int intLength =strNation.length();
			
		for (int i=0; i<intLength; i++) {
			strA=strNation.substring(i,i+1);
			if(strA.equalsIgnoreCase(strSearch)) {
				System.out.println(strSearch + "은(는)" + i + "번째에 위치해 있습니다.");
			}	
		
		}
		scanner.close();
	
	}
}


