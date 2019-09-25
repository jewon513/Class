package com.biz.string.exec;

import java.util.Random;

public class StringEX_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		int sum=0;
		
		for (int i = 0; i < 10; i++) {
			
			int rNum = rnd.nextInt();
			if( rNum<0) {
				rNum*=-1;
			}
			String strNum = rNum+"";
			String[] rList = strNum.split("");
			String strSum = rList[3];
			System.out.println("랜덤으로 생성된 수 :" + rNum);
			System.out.println("앞에서 4번째에 있는 수 :" + strSum);
			sum += Integer.valueOf(strSum);
		}
		System.out.println("========================");
		System.out.println(sum);
		
	
	
		
	}

	
}
