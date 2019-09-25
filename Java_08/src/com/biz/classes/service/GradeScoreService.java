package com.biz.classes.service;
/*
 * 서비스 클래스는 데이터를 활용하여 다양한 연산을 수행하는 클래스들을 지칭하는 접미사.
 */

import java.util.Random;

import com.biz.classes.model.GradeScoreVO;

public class GradeScoreService {

	
	private GradeScoreVO[] gradeScoreVO;
	
	public void newVO(int length) {
		gradeScoreVO = new GradeScoreVO[length];
		}
	
	public void makeScore() {
		Random rnd = new Random();
		
		for(int i = 0 ; i<gradeScoreVO.length; i++) {
			gradeScoreVO[i] = new GradeScoreVO();
			
			String strNum = String.format("%03d", i+1);
			
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			
			gradeScoreVO[i].strNum=strNum;
			gradeScoreVO[i].intKor=intKor;
			gradeScoreVO[i].intEng=intEng;
			gradeScoreVO[i].intMath=intMath;
			gradeScoreVO[i].total();
			gradeScoreVO[i].average();
		}
	}
	
	public void scoreList() {
		System.out.println("================================================");
		System.out.println("성적일람표");
		System.out.println("------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		
		for (int i=0; i<gradeScoreVO.length; i++) {
			System.out.print(gradeScoreVO[i].strNum +"\t");
			System.out.printf("%3d\t",gradeScoreVO[i].intKor);
			System.out.printf("%3d\t",gradeScoreVO[i].intEng);
			System.out.printf("%3d\t",gradeScoreVO[i].intMath);
			System.out.printf("%3d\t",gradeScoreVO[i].total);
			System.out.printf("%6.2f\n",gradeScoreVO[i].average);
			
		}
		System.out.println("================================================");
	}
	
}
