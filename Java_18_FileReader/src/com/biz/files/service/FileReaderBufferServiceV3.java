package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader 만으로 text 파일을 읽으면 OS와 JVM, App 사이에서 데이터가 이동되면서
 * 데이터를 읽는 동안 프로세스가 집중되어 매우 비효율적이고, 상당히 위험을 내포하고 있다.
 * 
 * 그래서 고급프로그래밍에서는 파일을 직접 읽어 메모리로 데이터를 가져오는 대신에
 * 중간에 완충장치를 두어서 안전하게 파일을 읽을 수 있도록 하고 있다. 
 * Java에서는 그 중 가장 기본적인 도구로 BufferedReader 라는 클래스를 제공하고 있다.
 * 
 * Java에서 Text 파일을 읽어서 메모리로 가져올때에는
 * FileReader >> BufferedReader 를 연결하여 안전하게 파일을 읽어올 수 있도록 한다.
 */


public class FileReaderBufferServiceV3 {

	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		
		//fileReader 객체에 담긴 파일읽기 정보를
		//bufferedReader에게 주입하면
		//fileReader와 buffer 사이에서
		// 이미 파일 내용을 읽어서
		// 메모리 어딘가에 안전하게 보관하고 있을 것이다.
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		
		//먼저 buffer에서 한 줄을 읽고
		//console에 표시한다음
		//null 이 아니면 계속해서 다음줄을 읽어들인다.
		String reader="";
		do {
			reader = buffer.readLine();
			System.out.println(reader);
		} while (reader!=null);
		
		//close() method는 resource를 반납하는 기능
		//close() 실행할때는 buffer를 먼저 close 하라.
		buffer.close();
		fileReader.close();
	}
	
}
