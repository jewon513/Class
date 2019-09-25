package com.biz.string.service;

import java.util.List;

import com.biz.string.domain.ScoreVO;
import com.biz.string.domain.StudentVO;

/*
 * ScoreServiceV1은 성적 성적정보만을 출력하는 Service이다.
 * 여기에
 * 성적정보를 출력하면서 학번번호를 기준으로 학생정보(이름)를 같이 보여주는 list() method를 재 정의 하고자한다.
 */

public class ScoreServiceV2 extends ScoreServiceV1 {

	// List<ScoreVO> scList protected 상태로 상속받아 존재하고 있다.
	// 접근제한자가 없을 경우 같은 package 내에서 public처럼 동작을 하고, 다른 package끼리는 private처럼 동작을 한다.
	
	// Java 패턴에서는 특별한 경우가 아니면 맴버변수들은 private나 protected로 선언한다.
	
	
	private List<StudentVO> stdList = null;
	
	public void list() {
		System.out.println("========================================================");
		System.out.println("성적 일람표");
		System.out.println("========================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("========================================================");
		for(ScoreVO scVO : scList) {
			// 학번을 scVO로 추출
			String strNum = scVO.getStrNum();
			StudentVO stVO = this.searchStd(strNum);
			// 학번으로 학생정보를 조회
			
			String strName;
			String strAddr;
			String strTel;
			if(stVO==null) {
				strName = "(없음)";
				strAddr = "(없음)";
				strTel = "(없음)";
			}else {
				strName=stVO.getStrName();
				strAddr=stVO.getStrAddr();
				strTel=stVO.getStrTel();
			}
			
			System.out.print(scVO.getStrNum()+"\t");
			System.out.print(strName+"\t");
			System.out.printf("%3d\t",scVO.getIntKor());
			System.out.printf("%3d\t",scVO.getIntEng());
			System.out.printf("%3d\t",scVO.getIntMath());
			System.out.printf("%3d\t",scVO.getIntTotal());
			System.out.printf("%3d\n",scVO.getIntAvg());
			
			
		}
	
		System.out.println("========================================================");
	}
	
	
	//ScoreServiceV2에 맴버변수로 선언된 stdList는 StudentServiceV1에서 값이 세팅된 리스트이다.
	//StudentServicfe에서 세팅된 리스트를 ScoreService에서 사용하기 위해서
	//main() method에서 StudentService로부터 stdList를 getter하여 setStdList() 메서드를 통해
	//ScoreServiceV2에 전달한다.
	public void setStdList(List<StudentVO> stdList) {
		this.stdList = stdList;
	}
	
	//학번을 매개변수로 받고 stdList에 해당 학번의 학생정보가 있는지 찾아서 StudentVO를 return 해주는 method
	private StudentVO searchStd(String strNum) {
		
		for(StudentVO stVO : stdList) {
			if(stVO.getStrNum().equals(strNum)) {
				return stVO;
			}
		}
		
		return null;
	}
}
