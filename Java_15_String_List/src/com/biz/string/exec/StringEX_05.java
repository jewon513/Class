
package com.biz.string.exec;

import java.util.Random;

public class StringEX_05 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		int sum=0;
		
		for (int i = 0; i < 10; i++) {
			
			int rNum = rnd.nextInt();
			if( rNum<0) {
				rNum*=-1;
			}
			String strNum = rNum+"";
			String strSum = strNum.substring(3, 4);
			sum += Integer.valueOf(strSum);
		}
		System.out.println("========================");
		System.out.println(sum);
		
	
	
		
	}

	
}
