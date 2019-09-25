package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.GradeVO;

public class GradeServiceImp_01 implements GradeService {

	// GradeVO 클래스를 리스트로 선언
	private List<GradeVO> gradeList ;
	
	private Random rnd;
	
	public GradeServiceImp_01() {
		
		//리스트를 사용할 수 있도록 생성
		gradeList = new ArrayList<GradeVO>();
		rnd = new Random();
	}
	
	//GradeVO를 gradeList에 추가하는 코드
	//input() method를 호출할때 생성할 리스트 개수를 보내주면 개수를 size 변수에 받고
	//그 개수만큼 생성해서 gradeList에 추가
	public void input(int size) {
		for(int i = 0 ; i <size ; i++) {
			
			// 데이터 생성
			String strNum = String.format("%05d", (i+1)); // 학번
			int intKor = rnd.nextInt(50)+51; // 성적
			int intEng= rnd.nextInt(50)+51; // 성적
			int intMath = rnd.nextInt(50)+51; // 성적
			
			// VO를 작성
			GradeVO gVO = new GradeVO();
			gVO.strNum=strNum;
			gVO.intKor=intKor;
			gVO.intEng=intEng;
			gVO.intMath=intMath;
			
			// VO를 List에 추가
			gradeList.add(gVO);
		}
		
	}// input() end
	
	public void total() {
		int nSize = gradeList.size();
		for (int i =0 ; i < nSize ; i++) {
			int total = gradeList.get(i).intKor; // gradeList 의 i 번째에 있는 intKor,intEng,intMath를 읽어서 total에 더하라.
			total += gradeList.get(i).intEng;
			total += gradeList.get(i).intMath;
			
			gradeList.get(i).intTotal = total; //gradeList 의 i번째의 gVO.intTotal 맴버변수에 total 변수에 저장된 값을 복사.
			gradeList.get(i).intAvg = total/3;
			
		}
		
	}
	
	public void view() {
		System.out.println("=====================================================");
		System.out.println("성적 일람표");
		System.out.println("=====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("=====================================================");
		for ( GradeVO vo : gradeList) {
			System.out.printf("%5s\t", vo.strNum);
			System.out.printf("%3d\t", vo.intKor);
			System.out.printf("%3d\t", vo.intEng);
			System.out.printf("%3d\t", vo.intMath);
			
			System.out.printf("%3d\t", vo.intTotal);	
			System.out.printf("%3d\t", vo.intAvg);	
			
			System.out.printf("%3d\t\n", vo.intRank);	
		}
		System.out.println("=====================================================");
		
		
		
	}
}
