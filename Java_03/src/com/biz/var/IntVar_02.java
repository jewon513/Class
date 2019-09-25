package com.biz.var;

public class IntVar_02 {

	/*
	 * main() 메서드는 최종적으로 JVM이 IntVar_02.main() 형태로 호출하여 사용하며, 만약 우리가 만든 class에 main() 메서드가 없다면 어떤 일도 시작하지 않는다.
	 * 
	 * main() 메서드를 코드의 시작점이라고 한다.
	 * 
	 */
	public static void main (String[] args) {
		
		// 한개의 EQ(=) 기호가 명령문에 있으면 항상 오른쪽을 먼저 본다.
		
		int intNum1=0;
		int intNum2=0;
		int intSum=0;
		
		// 40을 CPU로 보내고 어떤 연산을 수행할 것인가를 보고 없으니 40이라는 값을 intNum1 변수에 저장한다.
		intNum1=40;
		// intNum1에 저장된 값을 CPU로 보내고 intNum2에 저장된 값을 CPU로 보내고 두 값을 연산하고 결과를 intSum에 저장한다.
		intSum=intNum1+intNum2;
		System.out.println(intSum);
		
		intNum2=50;
		intSum=intNum1+intNum2;
		System.out.println(intSum);
		
		
		
		for (int i=0; i<100; ++i) {
			intNum2=intNum2+5;
		}
		
		intSum=intNum1+intNum2;
		
		System.out.println(intSum);
	}
}
