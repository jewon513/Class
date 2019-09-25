package com.biz.grade.service;

import java.util.Random;

import com.biz.grade.model.GradeVO;

public class GradeVOService {

	private GradeVO[] gradeVO;
	Random rnd;

	public GradeVOService(int length) {

		gradeVO = new GradeVO[length];
		for (int i = 0; i < gradeVO.length; i++) {
			gradeVO[i] = new GradeVO();
		}
		rnd = new Random();

	}// GardeVOService() end

	public void input() {
		for (int i = 0; i < gradeVO.length; i++) {
			String strNum = String.format("%05d", (i + 1));
			gradeVO[i].strNum = strNum;

			int intKor = rnd.nextInt(50) + 51;
			gradeVO[i].intKor = intKor;
			int intEng = rnd.nextInt(50) + 51;
			gradeVO[i].intEng = intEng;
			int intMath = rnd.nextInt(50) + 51;
			gradeVO[i].intMath = intMath;

		} // input() end
	}

	public void total() {
		for (int i = 0; i < gradeVO.length; i++) {
			int intSum = gradeVO[i].intKor;
			intSum += gradeVO[i].intEng;
			intSum += gradeVO[i].intMath;
			gradeVO[i].intSum = intSum;
			gradeVO[i].intAvg = intSum / 3.0f;
		}
	}

	public void view() {
		
		int allKor = 0;
		int allEng= 0;
		int allMath = 0;
		int allSum = 0;
		float allAvg = 0;
		
		System.out.println("==========================================================");
		System.out.println("성적표");
		System.out.println("==========================================================");
		System.out.printf("학번\t국어\t영어\t수학\t총점\t평균\t석차\n");

		for (int i = 0; i < gradeVO.length; i++) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%4d\t%4.1f\t%3d\n", 
					gradeVO[i].strNum, 
					gradeVO[i].intKor,
					gradeVO[i].intEng, 
					gradeVO[i].intMath,
					gradeVO[i].intSum,
					gradeVO[i].intAvg, 
					gradeVO[i].intRank);
			
			allKor+=gradeVO[i].intKor;
			allEng+=gradeVO[i].intEng;
			allMath+=gradeVO[i].intMath;
			allSum+=gradeVO[i].intSum;
			allAvg+=gradeVO[i].intAvg;
		}
		System.out.println("==========================================================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%4.1f\n", 
				allKor,
				allEng,
				allMath,
				allSum, 
				allAvg/gradeVO.length );
		
		System.out.println("==========================================================");
		

	}// view() end
	
	public void rank() {
		
		for (int i = 0 ; i < gradeVO.length; i++) {
			for (int j = i+1; j< gradeVO.length ; j++) {
				if (gradeVO[i].intSum < gradeVO[j].intSum) {
					
					GradeVO _temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = _temp;
				
				}
			}
		}// for i end
		
		for (int i = 0 ; i <gradeVO.length; i++) {
			gradeVO[i].intRank = i + 1;
		}
	}//rank () end
	
	public void sort() {
		for (int i = 0 ; i <gradeVO.length; i++) {
			for(int j=i+1 ; j<gradeVO.length; j++) {
				if(Integer.valueOf(gradeVO[i].strNum) > Integer.valueOf(gradeVO[j].strNum)) {
					GradeVO _temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = _temp;
				}
			}//if () end
		}//for () end
	}//sort () end
	
	
}