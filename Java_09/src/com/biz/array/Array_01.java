package com.biz.array;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {

		int[] nums = new int[100];
		int sum = 0;

		Random rnd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(10) + 1;
			if (nums[i] % 2 == 0) {
				sum += nums[i];
			}
		}
		System.out.println(sum);

		for (int i = 0 ; i<nums.length; i++) {
			if ((i+1)%10==0) {
				System.out.println();
			}
		}
	
	}
}
