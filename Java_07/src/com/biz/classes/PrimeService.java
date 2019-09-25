package com.biz.classes;



public class PrimeService {

	public void checkPrime(int num) {

		/*
		 * 어떤수(num)가 소수인지 아닌지를 알아보는 방법.
		 */
	
		int i;
		
		for (i=2; i<num/2; i++) {
			if(num%i==0) break;
		}
		if(i>=num/2) {
			System.out.println(num + "은 소수입니다.");
		}else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
	}

}
