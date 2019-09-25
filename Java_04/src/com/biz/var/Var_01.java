package com.biz.var;

public class Var_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum=5;
		int i;
		for (i=2; i<999; i++) {
			System.out.printf("%d x %d = %4d\n", intNum,i,intNum*i);
			//("형식문자열", 대치값)
			// frintf는 자동으로 줄 바꿈이 안된다. \n을 이용한 줄바꿈.
			
		}
		System.out.println(intNum + " x " + 2 + " = " + intNum*i );
		// frintf 에서 뒤에 f는 formating의 약자.
		
	}

}
