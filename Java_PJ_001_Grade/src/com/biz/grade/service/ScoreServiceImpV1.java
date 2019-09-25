package com.biz.grade.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.biz.grade.model.GradeVO;

public class ScoreServiceImpV1 implements ScoreService {

	private Random rnd;
	private List<GradeVO> scoreList;
	
	public ScoreServiceImpV1() {
		scoreList = new ArrayList<GradeVO>();
	}
	
	@Override
	public void input(int count) {
		
		
		
		for(int i = 0 ; i<count ; i++) {
			
			rnd = new Random();
			
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			
			GradeVO VO_02 = new GradeVO();
			
			
			VO_02.setIntkor(intKor);
			VO_02.setIntEng(intEng);
			VO_02.setIntMath(intMath);
			VO_02.setStrNum(String.format("%04d", i+1));
			
			scoreList.add(VO_02);
			
		}
		
		
	}

	@Override
	public void list() {
		System.out.println("=============================================================");
		System.out.println("점수표");
		System.out.println("=============================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("=============================================================");
		
		for (GradeVO vo02 : scoreList) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\n",
					vo02.getStrNum(),
					vo02.getIntkor(),
					vo02.getIntEng(),
					vo02.getIntMath(),
					vo02.getIntTotal(),
					vo02.getIntAvg(),
					vo02.getIntRank());
		}
		System.out.println("=============================================================");
	}

	@Override
	public void total() {
		int nSize=scoreList.size();
		for (int i = 0 ; i<nSize ; i++) {
			GradeVO vo02 = scoreList.get(i);
			int intTotal = vo02.getIntkor()+vo02.getIntEng()+vo02.getIntMath(); 
			vo02.setIntTotal(intTotal);
			vo02.setIntAvg(intTotal/3);
		}
	}

	@Override
	public void rank() {
		int nSize = scoreList.size();
		for (int i = 0 ; i<nSize ; i++) {
			GradeVO vo = scoreList.get(i);
			vo.setIntRank(i+1);
		}
		
	}

	@Override
	public void totalSort() {

		Collections.sort(scoreList, new Comparator<GradeVO>(){
			
			public int compare(GradeVO o1, GradeVO o2) {
				
				return o1.getIntTotal() < o2.getIntTotal() ? 1
						: o1.getIntTotal() > o2.getIntTotal() ? -1 : 0;
			}
		});
		
	}
	
	public void numSort() {
		
		Collections.sort(scoreList, new Comparator<GradeVO>(){
	
			public int compare(GradeVO o1, GradeVO o2) {
				
				return Integer.valueOf(o1.getStrNum()) > Integer.valueOf(o2.getStrNum()) ? 1
						: Integer.valueOf(o1.getStrNum()) < Integer.valueOf(o2.getStrNum()) ? -1 : 0;
			}
		});
	}
	
	public List<GradeVO> getList() {
		return scoreList;
	}
	

}
