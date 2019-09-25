package com.biz.array;

import java.util.Random;

/*
 * 배열 요소의 정렬
 */

public class Array_04 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("\t%2d", nums[i]);
		}
		System.out.println("");
		int _temp=0;
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if(nums[i] < nums[j]) {
					_temp=nums[i];
					nums[i]=nums[j];
					nums[j]=_temp;
				}
			}
			
		}
		System.out.println("================================================================================================");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("\t%2d", nums[i]);
		}
	}
}
