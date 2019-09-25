package com.biz.for_if;

public class If_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// main() 메서드 scope에서 선언된 변수
		// main 영역의 변수라고 한다.
		int numM=100;
		if(3==3) {
			// if keyword 영역에서 한정된 scope에서 선언된 변수
			// if 영역 내에서만 참조가 가능
			//
			int numIf=200;
			
			System.out.println("numM: " +numM);
			System.out.println("numIf:" +numIf);
			
		}
			System.out.println("numM: " +numM);
			
			//if 영역 내에서 선언되었기 때문에 영역 밖에서는 참조할 수 없다.
			//System.out.println("numIf:" +numIf);
		
	}

}
