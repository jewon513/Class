package com.biz.files;

import java.io.IOException;

import com.biz.files.service.FileReaderBufferServiceV3;

public class bufferEx_02 {

	public static void main(String[] args) {

		FileReaderBufferServiceV3 fb = new FileReaderBufferServiceV3();
		
		String fileName="src/com/biz/files/Data.txt";
		
		try {
			fb.read(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
