package com.biz.var;

public class Float_int_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float fNum = 15.5f;
		int intNum = 0;
		
		// 형변환 (type converter, cascading)
		fNum = intNum; // 암시적형변환, 자동형변환
		intNum = (int)fNum; // 명시적형변환, 강제형변환
		
	}

}
