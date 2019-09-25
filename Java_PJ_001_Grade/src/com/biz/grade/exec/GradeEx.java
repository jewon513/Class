package com.biz.grade.exec;

import java.util.List;

import com.biz.grade.model.GradeVO;
import com.biz.grade.model.StudentVO;
import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImpV1;
import com.biz.grade.service.MergeService;
import com.biz.grade.service.StudentService;
import com.biz.grade.service.StudentServiceImpV1;

public class GradeEx {

	public static void main(String[] args) {

		StudentService ss = new StudentServiceImpV1();
		ScoreService gs = new ScoreServiceImpV1();
		MergeService ms = new MergeService();
		
		//ss.input(3);
		//ss.list();
		
		gs.input(10);
		gs.total();
		gs.list();
		gs.totalSort();
		gs.rank();
		gs.numSort();
		gs.list();
		
		List<StudentVO> studentList;
		List<GradeVO> gradeList;
		
		studentList = ss.getList();
		gradeList = gs.getList();
		
		ms.input();
		ms.list();
		
		
		
	}

}
