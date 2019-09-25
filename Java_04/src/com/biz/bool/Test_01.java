package com.biz.bool;

public class Test_01 {

	public static void main(String[] args) {

		int line = 0;
		int space;
		int star;
		int count = 0;
	

		for (line = 0; line < 7; line++) {
			for (space = 0; space <= 2 - count; space++) {
				System.out.printf(" ");
			}
			for (star = 0; star <= count * 2; star++) {
				if(star>0 && star<count*2) {
					System.out.printf(" ");
					
				}
				else {
					System.out.printf("*");
				}
			}
			System.out.println("");

			if (line < 3) {
				count += 1;
			} else {
				count -= 1;
			}
			

		}
		System.out.println();
	}

}
