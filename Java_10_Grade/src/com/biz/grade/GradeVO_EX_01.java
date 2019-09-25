package com.biz.grade;

import com.biz.grade.service.GradeVOService;

public class GradeVO_EX_01 {

	public static void main(String[] args) {

		GradeVOService gs = new GradeVOService(20);
		gs.input();
		gs.total();
		gs.view();
		gs.rank();
		gs.view();
		gs.sort();
		gs.view();
		
		
	}

}
