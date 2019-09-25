package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.grade.model.GradeVO;
import com.biz.grade.model.StudentVO;

public class MergeService {

	private List<StudentVO> sList;
	private List<GradeVO> gList;
	private int nSize=0;
	
	public void input() {
		sList = new ArrayList<StudentVO>();
		gList = new ArrayList<GradeVO>();
		
		StudentService ss = new StudentServiceImpV1();
		ScoreService gs = new ScoreServiceImpV1(); 
		
		gs.input(10);
		gs.total();
		
		sList.addAll(ss.getList());
		gList.addAll(gs.getList());
		
		
		
		
	}
	
	
	public void list() {
		
		
		
		System.out.println("=============================================================");
		System.out.println("점수표");
		System.out.println("=============================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("=============================================================");
		
		for(int i = 0 ; i < nSize ; i++) {
			for(int j = 0 ; i <nSize ; i++) {
				if (gList.get(i).getStrNum().equalsIgnoreCase(sList.get(j).getStrNum())) {
					break;
				}
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
						gList.get(i).getStrNum(),
						sList.get(j).getStrName(),
						gList.get(i).getIntkor(),
						gList.get(i).getIntEng(),
						gList.get(i).getIntMath(),
						gList.get(i).getIntTotal(),
						gList.get(i).getIntAvg(),
						gList.get(i).getIntRank());
			}
		}
		System.out.println("=============================================================");
	}
}
