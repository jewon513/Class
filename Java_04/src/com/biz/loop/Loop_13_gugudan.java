package com.biz.loop;

public class Loop_13_gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int dan=2; dan<=9; dan++) {
			System.out.println("==================");
			System.out.printf("구구단 %d단\n", dan);
			System.out.println("------------------");
			for(int num=2; num<=9; num++) {
				System.out.printf("%d x %d = %d\n", dan,num,dan*num);
			}
			
		}
	}

}
