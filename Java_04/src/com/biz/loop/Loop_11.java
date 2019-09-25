package com.biz.loop;

public class Loop_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<=10; i+=2) {
			sum+=i;
			
		}
		System.out.println(sum);
		
		// 피보나치 수열
		
		int a=1;
		int b=1;
		int c;
		
		System.out.println(a);
		System.out.println(b);
		
		for (int i=0; i<10; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	
	}

}
