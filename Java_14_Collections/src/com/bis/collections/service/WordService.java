package com.bis.collections.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordService {

	public int count;
	private List<String> wordList;
	private String word;
	private List<String> words;
	private Scanner scan;
	
	public WordService() {
		
		scan = new Scanner(System.in);
		
		wordList = new ArrayList<String>();
		wordList.add("history");
		wordList.add("servay");
		wordList.add("counter");
		wordList.add("human");
		wordList.add("school");
		
		count=0;
		
	}
	
	public void makeWord() {
		Collections.shuffle(wordList);
		
		word = wordList.get(0);
		
		words = Arrays.asList(word.split(""));
		
		Collections.shuffle(words);		
	}
	
	public boolean input() {
		
		if(count < 1 ) {
			this.makeWord();	
		}
		
		
		System.out.println("===========================================");
		System.out.println("단어맞추기 게임");
		System.out.println("===========================================");
		System.out.println("제시한 알파벳을 잘 배열하여 단어를 완성하세요.");
		System.out.println("===========================================");
		System.out.println(words);
		System.out.println("===========================================");
		System.out.printf("(END:-1) >> ");
		String strKeyIn = scan.nextLine();
		if(strKeyIn.equals("-1")) {
			return true;
		}
		if(strKeyIn.equalsIgnoreCase(word)) {
			System.out.println((count+1) + " 번만에 맞았습니다.");
			count = 0 ;
		}else {
			System.out.println("오답입니다.");
			count++;
		}
		
		return false;
		
		
	}
	
	
	
	
	
}
