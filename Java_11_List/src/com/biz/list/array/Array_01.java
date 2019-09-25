package com.biz.list.array;

import java.util.Random;

public class Array_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNum = new int[50];
		int count;
		
		for (int i = 0 ; i<intNum.length ; i++) {
			intNum[i]=rnd.nextInt(100)+1;
			count=0;
			for (int j =2 ; j<intNum[i]; j++) {
				if (intNum[i]%j==0) {
					count+=1;
					break;
				}
			}
			if(count==0 & intNum[i]!=1) {
				System.out.printf("intNum[%2d] : %3d\n", i,intNum[i]);
			}
		}
	}
}
