package com.biz.array;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		int[] nums = new int[100];
		int oddSum = 0;
		int evenSum = 0;		
		Random rnd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(10) + 1;
			if (nums[i] % 2 == 0) {
				evenSum += nums[i];
			}else {
				oddSum+=nums[i];
			}
		}
		System.out.printf("OddSum : %d\n", oddSum);
		System.out.printf("EddSum : %d\n", evenSum);
		for (int i = 0 ; i<nums.length; i++) {
			if ((i+1)%10==0) {
				System.out.println("");
			}else {
				System.out.printf("\t%2d",nums[i]);
			}
		}
	
	}
}
