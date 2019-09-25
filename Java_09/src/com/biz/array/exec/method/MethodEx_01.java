package com.biz.array.exec.method;

import com.biz.array.service.MethodService;

public class MethodEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodService ms = new MethodService();
		
		ms.consoleView();
		
		int num = ms.numRet();
		System.out.println("numRet가 return 한 값 : " + num);
		
		int num1 = ms.numRet()+200;
		System.out.println(num1);
		
		String strRet = ms.strRet();
		String strRet1 = ms.numRet()+"";
		String strRet2 = ms.numRet()+ms.strRet();
		
	}

}
