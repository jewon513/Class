package com.biz.classes.arrays;

import java.util.Random;

public class Array_02 {
	
	public static void main(String[] args) {

		Random rnd = new Random();
		
		
		int[] nums = new int[10];
		
		for (int i=0; i<nums.length ; i++) {
			nums[i]=rnd.nextInt(10)+1;
		}
		int sNum=3;
		int index=0;
		
		for(index =0; index<nums.length ; index++) {
			if(nums[index] == sNum) break;
			
		}
		if(index>=nums.length) {
			System.out.printf("배열에 %d 값이 없음\n");
		}else {
			System.out.printf("배열의 %d 번째에 값이 있음\n", index);
		}
		for (int i=0; i<nums.length ; i++) {
			System.out.println(nums[i]);
		}
	
		
	}

}
