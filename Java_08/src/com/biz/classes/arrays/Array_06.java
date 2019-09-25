package com.biz.classes.arrays;

import java.util.Scanner;

import com.biz.classes.service.ArrayScanService;

public class Array_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	
		while(true) {
		ArrayScanService aService = new ArrayScanService(10);
		aService.scanArray();
		System.out.println("Press any Key..(End:quit)");
		
		String keyIn = scan.nextLine();
		if(keyIn.equals("END")) break;
		}
		
		System.out.println("Game Over!!");
	}

}
