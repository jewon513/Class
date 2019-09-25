package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {
	
	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		int[] nums = new int[10];
		
		for (int i=0; i<nums.length ; i++) {
			nums[i]=rnd.nextInt(10)+1;
		}
		System.out.printf("찾고자 하는 숫자를 입력하세요 >> ");
		String strNum = scan.nextLine();
		int sNum = Integer.valueOf(strNum);
		
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
	
		scan.close();
		
	}

}
