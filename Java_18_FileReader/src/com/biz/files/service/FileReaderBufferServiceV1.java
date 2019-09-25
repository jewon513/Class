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


public class FileReaderBufferServiceV1 {

	FileReader fileReader;
	BufferedReader buffer;
	
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		//buffer.readLine()은 파일에서 한줄(~~\n)을 읽는다.
		//buffer.readLine()이 반복해서 실행될때마다
		//계속해서 다음줄의 문자열을 읽어 들이도록 되어 있다.
		//파일에 저장된 문장의 줄 수 만큼 buffer.readLine()을 반복해서 실행하면
		//파일의 모든 내용을 읽을 수 있을 것이다.
		
		while(true) {
			String reader = buffer.readLine();
			System.out.println(reader);
		}
		
		
	}
	
}
