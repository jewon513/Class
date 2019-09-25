package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeServiceV2 extends GradeServiceV1 {

	protected List<String> nameList = null;

	public GradeServiceV2() {

		nameList = new ArrayList<String>();

	}

	// nameFile을 읽어서 nameList 를 생성
	@Override
	public void readNameFile(String nameFile) throws Exception {

		FileReader fileReader = null;
		BufferedReader buffer = null;

		fileReader = new FileReader(nameFile);
		buffer = new BufferedReader(fileReader);

		String reader = new String();

		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			nameList.add(reader);
		}
		buffer.close();
		fileReader.close();
		
	}

	//nameList에서 length 개수만큼의 리스트를 보이기
	//A0001, 이름 형식으로 리스트를 
	@Override
	public void makeStudentFile(String studentFile, int length) throws Exception {

		Random rnd = new Random();
		
		PrintWriter fileOut;
		fileOut = new PrintWriter(studentFile);
		
		for (int i = 0; i < length; i++) {
			
			int tel1st = rnd.nextInt(9999)+1; // 1~9999 중의 1개 숫자
			int tel2nd = rnd.nextInt(9999)+1; // 1~9999 중의 1개 숫자
			
			String strTel = String.format("010-%04d-%04d", tel1st,tel2nd);
			
			int intYear = rnd.nextInt(100) +1980; // 1900~2000
			int intMonth = rnd.nextInt(12)+1; // 1~12중의 1개 숫자
			int intday = rnd.nextInt(28)+1; //1~28
			
			String strBirth = String.format("1993-%02d-%02d", intMonth, intday);
					
			String strNum = String.format("A%03d", i+1);
			
			//console에 보이기
			System.out.printf("%s\t%s\t%s\t%s\n",
					strNum,
					nameList.get(i),
					strTel,
					strBirth);
			
			//file로 기록하기
			fileOut.printf("%s:%s:%s:%s\n",
					strNum,
					nameList.get(i),
					strTel,
					strBirth);
			
			fileOut.flush();
		}
		fileOut.close();
	}

}
