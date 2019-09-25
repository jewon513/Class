package com.biz.var;

public class IntVar_03 {

	// method : 일종의 개발자가 만든 Keyword 명령문들의 모음
	// main(String[] args)
	// main()
	public static void main(String[] args) {
		int sum=0;
		int i=1;
		do {
			sum=sum+2;
			i=i+1;
		}while(i<100);
		
		System.out.println(sum);
	}
}
