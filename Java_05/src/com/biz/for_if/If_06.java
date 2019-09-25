package com.biz.for_if;

public class If_06 {

	public static void main(String[] args) {

		int num = 47;
		/*
		 *다양한 조건에 따라 명령문들을 실행할 경우 여러번의 조건을 수행하는 방법이다. 
		 */
		if (num % 3 == 0) {
			System.out.println(num + "는 3의 배수");
		} else if (num % 4 == 0) {
			System.out.println(num + "는 4의 배수");
		} else if (num % 2 == 0) {
			System.out.println(num + "는 2의 배수");
		} else {
			System.out.println(num + "는 2,3,4의 배수가 아니다");
		}

		// 그냥 if문을 반복하여서 코드를 구성할 수 있지만, 그렇게 하게되면 조건값을 찾았는데도 불구하고 계속적으로 검사하기 때문에 별로다.
		// 그러나 위에 코드에서 num가 8인 경우 4의 배수만 출력되고 2의 배수라고는 출력되지 않는다.
		// 반면에 if문을 반복하여 코드를 구성하게 되면 4의 배수도 출력되고 2의 배수도 출력된다.
		// 상황에 따라 다르게 사용할 수 있음을 기억할 필요가 있다.
	}
}
