package com.biz.classes.Search;

import java.util.Scanner;

public class Searchsub {
	//맴버영역에 선언된 변수는 현재 클래스(SearchSub)가 아닌곳에서 값을 참조(읽기, 쓰기)가 가능하다.
	//단 public이라는 keyword가 포함되어 있어야한다.
	public String strNation;
	
	public void main() {
		
		
		//String strNation = "Republic of Korea";
		System.out.println("문자열 : " + strNation);

		Scanner scan = new Scanner(System.in);
		System.out.printf("문자를 입력하세요 >> ");
		String strSearch = "";
		strSearch = scan.nextLine();

		int intLength = strNation.length();
		String strA = "";
		
		int index=0;
		for (index = 0; index < intLength; index++) {
			strA = strNation.substring(index, index + 1);
			if (strA.equalsIgnoreCase(strSearch)) {
				break;
			}
		}
		if(index<intLength) {
			System.out.println(index + "번째에 있습니다.");
			
		}else {
			System.out.println("포함된 문자열이 아닙니다.");
			
		}
		

	}
}

