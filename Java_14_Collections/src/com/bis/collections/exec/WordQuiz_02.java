package com.bis.collections.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordQuiz_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String word = "history";
		List<String> words = Arrays.asList(word.split(""));
	
		Collections.shuffle(words);
		System.out.println("다음 알파벳을 알맞게 배열하여 단어를 만드세요.");
		System.out.println(words);
		System.out.println("==============================================");
		System.out.printf("단어 >> ");
		String strWord = scan.nextLine();
		
		if(word.equalsIgnoreCase(strWord)) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
			System.out.println("단어는 " + word +" 였습니다.");
		}
	
	}

}
