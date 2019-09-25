package com.biz.grade.service;

import java.util.Map;
import java.util.Set;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.util.LineMake;

public class GradeServiceV1 {

	Map<String, StudentVO> stdList;
	Map<String, ScoreVO> scList;
	
	public GradeServiceV1() {
		//기본생성자
	}
	
	public GradeServiceV1(Map<String,ScoreVO> scList) {
		this.scList = scList;
		// scList를 호출한 곳으로부터 받는 생성자
	}
	
	public GradeServiceV1(Map<String,ScoreVO> scList, Map<String,StudentVO> stdList) {
		
		//scList와 stdList를 호출한 곳으로부터 받는 생성자
		this.scList = scList;
		this.stdList = stdList;
	}
	
	public void setScList(Map<String,ScoreVO> scList) {
		this.scList = scList;
	}

	public void setStdList(Map<String,StudentVO> stdList) {
		
	}
	
	public void list() {
		
		int length = 65;
		
		System.out.println(LineMake.make("=", length));
		System.out.println("성적표");
		System.out.println(LineMake.make("=", length));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t등수");
		
		Set<String> keys = scList.keySet();
		for(String key : keys) {
			ScoreVO scVO = scList.get(key);
			StudentVO stdVO = stdList.get(scVO.getNum());
			System.out.print(scVO.getNum()+"\t");
			System.out.print(stdVO.getName()+"\t");
			System.out.print(scVO.getKorScore()+"\t");
			System.out.print(scVO.getEngScore()+"\t");
			System.out.print(scVO.getMathScore()+"\t");
			System.out.print(scVO.getSumScore()+"\t");
			System.out.print(scVO.getAverage()+"\t");
			System.out.print(scVO.getRank()+"\n");
			
		}
		
		System.out.println(LineMake.make("=", length));		
	}
}
