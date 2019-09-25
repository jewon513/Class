package com.biz.classes;

import java.util.Random;

import com.biz.classes.model.GradeScoreVO;

public class GSEx_02 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		for(int i =0; i<10; i++) {
			int n =rnd.nextInt(10)+1;
			System.out.println(n);
		}
		
		
		GradeScoreVO[] gsVO = new GradeScoreVO[100];
		for(int i =0; i<gsVO.length;i++) {
			gsVO[i] = new GradeScoreVO();
			gsVO[i].strNum =String.format("%03d", i+1);
			gsVO[i].intKor=rnd.nextInt(50)+51;
			gsVO[i].intEng=rnd.nextInt(50)+51;
			gsVO[i].intMath=rnd.nextInt(50)+51;
			gsVO[i].total();
			gsVO[i].average();
			
		}
		
		System.out.println("================================================");
		System.out.println("성적일람표");
		System.out.println("------------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");
		
		for (int i=0; i<gsVO.length; i++) {
			System.out.print(gsVO[i].strNum +"\t");
			System.out.printf("%3d\t",gsVO[i].intKor);
			System.out.printf("%3d\t",gsVO[i].intEng);
			System.out.printf("%3d\t",gsVO[i].intMath);
			System.out.printf("%3d\t",gsVO[i].total);
			System.out.printf("%6.2f\n",gsVO[i].average);
			
		}
		System.out.println("================================================");
	}

}
