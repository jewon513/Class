package com.biz.classes.Search;

import java.util.Scanner;

public class SearchMain {

	public static void main(String[] args) {
		
		Searchsub ss = new Searchsub();
		Scanner scan = new Scanner(System.in);
		ss.strNation ="UNITED NATION"
				+ "";
		
		String anyKey ="";
		String end ="END";
		
		while(true) {
			ss.main();
			
			System.out.println("계속하려면 아무키나 누르세요...");
			System.out.println("종료하려면 END를 입력하세요.");
			anyKey = scan.nextLine();
		
			if(anyKey.equalsIgnoreCase(end)) {
				System.out.println("종료합니다.");
				break;
			}
		}
			
			
		
	}
}

