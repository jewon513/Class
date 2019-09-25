package com.biz.list.exec;

public class Try_Catch {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		try {
			num1 = Integer.valueOf("30");	
		} catch (Exception e) {
			System.out.println("입력한 값에 문자열이 포함되어 숫자로 변환하지 못했습니다.");
		}
		
		try {
			num2 = Integer.valueOf("40 ");
		} catch (Exception e) {
			System.out.println("입력한 값에 문자열이 포함되어 숫자로 변환하지 못했습니다.");
		}
		
		try {
			num3 = Integer.valueOf(" 50");
		} catch (Exception e) {
			System.out.println("입력한 값에 문자열이 포함되어 숫자로 변환하지 못했습니다.");
		}
		
		
		

		int sum = num1 + num2 + num3;
		System.out.println(sum);
	}

}
