package com.biz.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx_01 {

	public static void main(String[] args) {

		String fileName = "scr/com/biz/files/data1.txt";
		
		/*
		 * FileWriter 클래스(class)를 사용해서 fileWriter 객체(object)를 선언.
		 */
		
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
			/*
			 * fileWriter 객체를 FileWriter() 생성자 method를 이용해서
			 * 초기화 한다.
			 * fileWriter는 FileWriter 클래스의 instance(FileWriter의 복제본)가 된다.
			 * 
			 * FileWirter() 생성자는 파일의 경로와 이름을 매개변수로 받아서 파일을 새로 작성한다.
			 * 
			 * FileWriter 클래스에 선언되어 있을 여러 method들을 사용해서 파일 기록과 관련된 기능을 수행할 수 있다.
			 */
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
