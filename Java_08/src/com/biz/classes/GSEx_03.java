package com.biz.classes;

import com.biz.classes.service.GradeScoreService;

public class GSEx_03 {

	public static void main(String[] args) {

		// GradeScoreVO[] gsVO = new GradeScoreVO[100];
		GradeScoreService gService = new GradeScoreService();
		gService.newVO(200);
		gService.makeScore();
		gService.scoreList();
		
		
	}

}
