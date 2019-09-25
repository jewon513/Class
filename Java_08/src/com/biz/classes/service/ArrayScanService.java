package com.biz.classes.service;

import java.util.Random;
import java.util.Scanner;

public class ArrayScanService {

	private int[] nums;
	
	//클래스에 포함되는 method 중에 
	//void 등이 없고 
	//이름이 클래스 이름과 같은 method
	//생성자 메서드는 누군가 new ArrayScanService()를 호출하면 자동으로 호출되는 method이다. 
	public ArrayScanService(int length){
		
		Random rnd = new Random();
		
		nums= new int[length];
		for (int i = 0; i < nums.length ; i++) {
			nums[i]=rnd.nextInt(10)+1;
		}
	}
	
	public void scanArray() {
		Scanner scan = new Scanner(System.in);
		
		int nums2[] = new int[10];

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
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
		}
	}
	
	
}
	

