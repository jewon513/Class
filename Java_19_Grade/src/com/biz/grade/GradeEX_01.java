package com.biz.grade;

import java.util.Map;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.service.GradeServiceV1;
import com.biz.grade.service.ScoreServiceV1;
import com.biz.grade.service.StudentServiceV1;

public class GradeEX_01 {

	public static void main(String[] args) {

		ScoreServiceV1 ss = new ScoreServiceV1();
		StudentServiceV1 stds = new StudentServiceV1();
		
		String scoreFileName = "src/com/biz/grade/Score.txt";
		String stdFileName = "src/com/biz/grade/학생명부.txt";
		
		try {
			ss.read(scoreFileName);
			ss.total();
			ss.rank();
			stds.read(stdFileName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		Map<String, ScoreVO> scList = ss.getSCList();
		Map<String, StudentVO> stdList = stds.getStdList();
		
		GradeServiceV1 gs = new GradeServiceV1();
		gs = new GradeServiceV1(scList);
		gs = new GradeServiceV1(scList, stdList);
		
		gs.list();
		
	}

}
