package com.biz.files.exec;

import com.biz.files.service.GradeService;
import com.biz.files.service.GradeServiceV1;

public class GradeEx_01 {

	public static void main(String[] args) {

		GradeService gs = new GradeServiceV1();
		
		String fileName ="src/com/biz/files/성적일람표.txt";
		int length=30;
		
		try {
			gs.makeScoreFile(fileName, length);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로세스 완료!!");
	}

}
