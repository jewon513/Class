package com.biz.for_if;

public class If_03 {

	public static void main(String[] args) {

		int num=32;
		
		if(num%2 ==0){
			System.out.println(num+"는 짝수");
		}
		if(num%2 !=0) {
			System.out.println(num+"는 홀수");
			
		}
		for (int i=0; i<=100; i++) {
			if (i%2==0) {
				System.out.println(i+"는 짝수!!!");
			}
		}
		
	}

}
