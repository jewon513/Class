package com.biz.array.exec.method;

import com.biz.array.service.MethodService;

public class MethodEx_04 {

	public static void main(String[] args) {

		MethodService ms = new MethodService();
		
		int retNum = ms.getIntSum(30, 40);

		System.out.println(retNum);
	
	}

}
