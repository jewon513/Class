package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_04 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();

		for (int i = 0; i < 7; i++) {
			nums.add(rnd.nextInt());
		}
		
		//list.size()
		//현재까지 추가된 리스트의 길이를 알려주는 method
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		//nums.size()의 메소드 호출을 한번만 하기 위해 변수에 저장하여 사용.
		int numsSize=nums.size();
		for (int i = 0; i<numsSize ; i++) {
			System.out.println(nums.get(i));
		}
	}

}
