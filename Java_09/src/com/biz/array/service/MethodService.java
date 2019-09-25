package com.biz.array.service;

import java.util.Scanner;

public class MethodService {

	private int intSum;

	/*
	 * method를 정의 할 떄 (method 코드를 작성할 때) void mathod() : return 문이 있거나 없거나. 변수를 선언하는
	 * 키워드 method () int method() String method() float method() boolean method()
	 * long method() double method() char method() ScoreVO method()
	 * 
	 * 
	 * 변수를 선언하는 키워드를 변수형(Varriable Type)이라고 하는데, 같은 키워드가 method() 정의 문에 나타나면 return
	 * type 이라고 한다. 이때 이 키워드는 return 문에 포함된 값과 밀접한 관계가 있다.
	 * 
	 * 
	 * int method(){return 0;} String method(){return " 대한민국 "} float
	 * method(){return 3.0f} boolean method(){return false;}
	 * 
	 * 
	 */

	public void consoleView() {
		System.out.println("나는 콘솔에 표시하는 method()");
	}

	public int numRet() {
		int num = 100 + 200 + 300;
		return num;
	}

	public String strRet() {
		return "";
	}

	public int getIntSum(int a, int b) {
		intSum = a * b;
		return intSum;
	}

	public void add() {
		System.out.println("매개변수가 없는 method");
	}

	public void add(int num) {
		System.out.printf("매개변수 1개 : %d\n", num);
	}

	public void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.printf("두개의 매개 변수 합 : %d+%d=%d\n", num1, num2, sum);
	}

	public void add(float f1, float f2) {
		float sum = f1 + f2;
		System.out.printf("두개의 실수 매개 변수의 합 : %f+%f=%f\n", f1,f2,sum);
	}
	
	public void ex() {
		Scanner scan = new Scanner(System.in);
		
		
	}
}
