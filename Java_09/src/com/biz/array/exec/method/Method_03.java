package com.biz.array.exec.method;

import com.biz.array.service.MethodProtoType;

public class Method_03 {

	public static void main(String[] args) {

		MethodProtoType mt = new MethodProtoType();
		/*
		 * MethodProtoType 클래스에는 view()라는 메소드가 있을 텐데 아마도 
		 * public void view() {  } 형식일 것이다.
		 */
		mt.view();
		
		/*
		 * public int ret() { return 0;} 형이다.
		 */
		
		int n = mt.ret();
		
		/*
		 * public void (int num1, int num2){  } 형일 것이다.
		 */
		
		mt.mret(30,40);
		
		/*
		 * 같은 mret 메소드를 호출 했는데
		 * 이 호출 명령문에 의해서 mret() method()는 
		 * public int (int num1, int num2) {   } 이다.
		 */
		
		
		int m = mt.mret(50,30);
		
	}

}
