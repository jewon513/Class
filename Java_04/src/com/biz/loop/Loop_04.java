package com.biz.loop;

public class Loop_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nCount = 0;
		for (; nCount<9 ;) {
			System.out.printf("%d x %d = %d\n", 3,++nCount,3*nCount);
		}
	}

}
