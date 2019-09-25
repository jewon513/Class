package com.biz.files.grade;

import java.io.IOException;

import com.biz.files.service.FileGradeServiceV1;

public class GradeEx_01 {

	public static void main(String[] args) {

		FileGradeServiceV1 fg = new FileGradeServiceV1();
		
		String fileName = "src/com/biz/files/Score.txt";
		
		try {
			fg.read(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		fg.list();
		
	}

}
