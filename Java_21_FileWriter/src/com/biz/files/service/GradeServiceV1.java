package com.biz.files.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.files.domain.ScoreVO;

public class GradeServiceV1 implements GradeService {

	protected List<ScoreVO> scList = null;
	
	public GradeServiceV1() {

		scList = new ArrayList<ScoreVO>();
		
	}
	
	public void makeScoreFile(String fileName, int length) throws Exception {
		
		Random rnd = new Random();
		
		/* 매개변수로 전달받은 length만큼
		 * Score 정보를 생성하고 scList에 추가.
		 */
		
		for (int i = 0; i < length; i++) {
			
			String strNum = String.format("A%03d", i+1); // 학번을 A001 ~~ 처럼 생성
			int intKor = rnd.nextInt(50)+51;
			int intEng= rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;

			ScoreVO scVO = new ScoreVO();
			
			scVO.setNum(strNum);
			scVO.setKor(intKor);
			scVO.setEng(intEng);
			scVO.setMath(intMath);
			
			scList.add(scVO);
			
		} //생성된 scList의 성적 정보를 file에 기록
		
		PrintWriter fileOut = null;
		fileOut = new PrintWriter(fileName);
		
		for(ScoreVO vo : scList) {
			
			fileOut.printf("%s:%d:%d:%d\n", 
					vo.getNum(),
					vo.getKor(),
					vo.getEng(),
					vo.getMath()); // A001:90:90:90 과 같은 형식으로 작성
			
			//현재의 데이터를 안전하게 기록하기 위해서
			//한 사람의 성적을 기록한 후 파일에 강제 저장하도록 flush() method를 호출한다.
			//데이터가 많을경우 성능상에 불리할 수 있다.
			fileOut.flush();			
		}

		fileOut.close();
		
	}

	@Override
	public void readNameFile(String nameFile) throws Exception {
		
	}

	
	@Override
	public void makeStudentFile(String studentFile, int length) throws Exception {
		
	}
	
	
}
