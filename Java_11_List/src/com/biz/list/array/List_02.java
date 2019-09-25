package com.biz.list.array;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class List_02 {

	public static void main(String[] args) {
		
		// 정수값을 담을 nums list를 선언과 생성
		List<Integer> nums = new ArrayList<Integer>();

		Random rnd = new Random();
		
		// 명령문을 55번 반복 실행하라.
		// 4byte 정수 범위의 임의 숫자 1개 생성하여 nums 리스트에 추가
		for(int i = 0 ; i<55 ; i++) {
			nums.add(rnd.nextInt());
		}
		// 30번 요소의 값을 num 변수에 복사하고 console에 출력
		int num =nums.get(30);
		System.out.println(num);
		
		for(int i = 0 ; i<55 ; i++) {
			System.out.println(nums.get(i));
		}
	}

}
