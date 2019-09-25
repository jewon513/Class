package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class Array_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int nums[] = new int[10];
		int nums2[] = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(10) + 1;
		}
		System.out.printf("찾으시는 숫자를 입력해주세요 >> ");
		String strNum = scan.nextLine();
		int sNum = Integer.valueOf(strNum);

		int index;
		int count = 0;

		for (index = 0; index < nums.length; index++) {
			if (nums[index] == sNum) {
				nums2[count] = index;
				count += 1;
			}
		}

		if (count == 0) {
			System.out.println("찾는 숫자가 배열에 없습니다.");
		} else {
			for (int j = 0; j < count; j++) {
				System.out.printf("%d번째 배열에 찾으시는 숫자가 있습니다.\n", nums2[j]);
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("count : "+ count);
	}

}
