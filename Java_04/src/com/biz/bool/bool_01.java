package com.biz.bool;

public class bool_01 {

	public static void main(String[] args) {

			boolean bYes = 3 == 3;
			System.out.println(bYes);
			
			
			bYes = 4 == 4;
			System.out.println(bYes);
			bYes = 4 > 4;
			System.out.println(bYes);
			bYes = 5 == 5 || 4 == 4; //or 연산
			System.out.println(bYes);
			bYes = 5>5 || 4==4;
			System.out.println(bYes);
			bYes = 5>=5 || 4>4;
			System.out.println(bYes);
			
			bYes = 5 == 5 && 4 == 4; //and 연산
			
	}

}
