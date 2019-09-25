package com.biz.loop;

public class Loop_02 {

	public static void main(String[] args) {

		int intNum=6;
		int nCount=2;
		
		while(nCount<10) {
			System.out.printf("%d x %d = %2d\n", intNum,nCount,intNum*nCount++);
		}
		System.out.println("=====================");
		for (nCount=2; nCount<10; nCount++) {
			System.out.printf("%d x %d = %2d\n", intNum,nCount,intNum*nCount);
		}
	
		int a;
		int b;
		for (a=2; a<10; a++) {
			for (b=1; b<10; b++) {
				System.out.printf("%d x %d = %d\n", a,b,a*b);
				
			}
			System.out.println("=======================");
		}
	}
}



