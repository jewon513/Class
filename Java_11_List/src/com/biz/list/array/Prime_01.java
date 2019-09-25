package com.biz.list.array;

import java.util.Random;

public class Prime_01 {

	public static void main(String[] args) {

		int[] nums = new int[50]; // 정수형 배열 50개 생성
		Random rnd = new Random(); // Random class를 사용하기 위해 rnd 객체로 생성
		
		int index;
		
		for (int i = 0 ; i<nums.length; i++) {
			nums[i] = rnd.nextInt(100)+1; // nums 0~49에 1~100까지의 임의의 수 저장
			if(nums[i]<2) {
				continue;
			}
			
			for (index = 2 ; index<nums[i] ; index++) { // 2부터 자기자신까지 범위로
				if(nums[i]%index==0) { // 나누었을때 나머지가 0이 나오면 소수가 아님.
					break; 
				}
			}
			if (index>=nums[i]) { // 위에서 한번이라도 걸리면 참이 될 수 없음.
				System.out.printf("nums[%2d] : %3d\n", i, nums[i]);
			}
		
		}
		
	}

}
