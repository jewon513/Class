package com.biz.grade;

import com.biz.grade.service.GradeServiceV3;

public class Grade_04 {

	public static void main(String[] args) {

		GradeServiceV3 gs = new GradeServiceV3(5);
		
		gs.input();
		
		gs.view();
		
		gs.sort();
		
		gs.view();
		
		
		
		//gs.inputKor(); ==> private로 되어있어서 직접 호출 불가능
		
	}

}
