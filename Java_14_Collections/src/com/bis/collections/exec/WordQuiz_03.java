package com.bis.collections.exec;

import com.bis.collections.service.WordService;

public class WordQuiz_03 {

	public static void main(String[] args) {

		WordService wService = new WordService();
		//wService.viewWord();
		while(true) {
			if(wService.input()) {
				break;
			}
		}
		System.out.println("Game Over!");
	}

}
