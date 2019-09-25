package com.biz.bool;

import java.util.Scanner;

public class Test_03 {

	public static void main(String[] args) {
		int line;
		int star;
		int space;
		int count = 0;

		Scanner input = new Scanner(System.in);

		System.out.printf("How long is the line?(only odd) : ");
		line = input.nextInt();
		if (line%2==0) {
			System.out.println("not odd.");
		}else {
			for (int i = 0; i < line; i++) {
				for (space = 0; space <= line/2 - count-1; space++) {
					System.out.printf(" ");
				}
				for (star = 0; star <= count * 2; star++) {
					if(star>0 && star<count*2) {
						System.out.printf("☆");
					}else {
						System.out.printf("★");
					}
				}
				if(i<line/2) {
					count += 1;
				}else {
					count -= 1;
				}
				System.out.println("");
			}
		}
	}
}
