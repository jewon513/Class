package com.biz.for_if;

public class If_07 {

	public static void main(String[] args) {

		int num = 56;
		// && and 연산
		if (num % 3 == 0 && num % 6 == 0) {
			System.out.println(num + "는 3의 배수이고,6의 배수이다.");
		}
		// || or 연산
		if (num % 3 == 0 || num % 6 == 0) {
			System.out.println(num + "는 3의 배수거나 ,6의 배수이다.");
		}
		
	}
}
