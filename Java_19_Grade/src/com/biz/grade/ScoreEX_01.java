package com.biz.grade;

import com.biz.grade.service.ScoreServiceV1;

public class ScoreEX_01 {

	public static void main(String[] args) {

		ScoreServiceV1 ss = new ScoreServiceV1();
		
		String scoreFileName ="src/com/biz/grade/성적일람표.txt";
		
		try {
			ss.read(scoreFileName);
			ss.total();
			ss.list();
			ss.listTotal();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
