package com.biz.var;

public class String_04 {

	public static void main(String[] agrs) {
		// 숫자를 문자열 변수에 저장하려면
		// 숫자를 문자열형으로 변환을 시켜야 한다.
		// 숫자를 문자열형으로 변환시키려면
		// 숫자 +"" 형식으로 만들어주면 문자열로 저장된다.
		String num =0 + ""; // num="0" 과 같다.
		
		num = 3+" "+4;
		System.out.println(num);
		
		num = 3+""+4;
		System.out.println(num);
		
	}
}
