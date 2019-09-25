package com.biz.var;

public class Print_02 {

	public static void main(String[] args) {
		int num1 =30;
		int num2 =40;
		int sum=num1+num2;
		
		System.out.println(num1 + "+" + num2 + "=" + sum);
		// println()에서 ""로 문자열을 입력하게 되면 다른 값들을 모두 문자열로 인식하게 된다.
		// 따라서 ()를 이용하여 연산에 우선순위를 두거나 새로운 변수를 이용하여 문제를 해결하면 된다.
		// ex) 	System.out.println(num1 + "+" + num2 + "=" + num1 + num2); => 3040 값이 나온다.
		// 	System.out.println(num1 + "+" + num2 + "=" + (num1+num2)); => 정상적인 70 값이 나온다.
		// 	System.out.println(num1 + "+" + num2 + "=" + sum); => 새로운 변수를 이용하였으므로 70이 나온다.
		
		
		
			
	
	}
	
}
		
