package com.biz.for_if;

public class if_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
