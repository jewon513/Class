package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i<67 ; i++) {
			nums.add(rnd.nextInt(100)+1);
		}
		int nSize = nums.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.println(nums.get(i));
		}
		
		// nums 개수만큼 반복문을 실행하면서
		// nums의 요소를 getter 하여 n 변수에 담아둔다
		for(int n : nums) {
			System.out.println(n);
		}
		
		int sum=0;
		for (int n : nums) {
			sum+=n;
		}
		System.out.println("합계 : " + sum);
		
		// foreach문을 이용한 소수찾기.
		int index;
		for(int n :nums) {
			for(index = 2; index<n; index++) {
				if(n % index ==0) break;
			}
			if(index>=n) {
				System.out.println(n + "은 소수이다.");
			}
		}
	}

}
