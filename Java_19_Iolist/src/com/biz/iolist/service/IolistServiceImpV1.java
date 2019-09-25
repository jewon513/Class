package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;

public class IolistServiceImpV1 implements IolistService{

	
	@Override
	public void read(String fileName) throws Exception {
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		while(true) {
			
			String reader = buffer.readLine();
			if(reader==null) break;
			
			
			System.out.println(reader);
			
		}
		
		buffer.close();
		fileReader.close();
		
		
	}

	@Override
	public void list() {
		
	}

	@Override
	public void summary() {
		
	}

}
