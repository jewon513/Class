package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {

	FileReader fileReader = null;

	
	/*
	 * 만약 read(String fileName) method가 실행 되는 동안
	 * exception이 발생을 하면 read() method를 호출한 곳으로
	 * exception을 throws 한다.
	 */
	public void read(String fileName) throws IOException {

		fileReader = new FileReader(fileName);
		while(true) {
			int al = fileReader.read();
			if(al<0) break;
			
			System.out.printf("%d : %c\n",al,al);
				
		}
	}
}
