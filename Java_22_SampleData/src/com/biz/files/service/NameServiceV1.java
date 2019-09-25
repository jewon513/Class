package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NameServiceV1 {

	private List<String>nameList=null;
	private List<String>familyNameList=null;
	
	public NameServiceV1() { // 생성자 메소드 => 클래스 이름과 같은 method이고 retrun type이 없다.
		nameList= new ArrayList<String>();
		familyNameList= new ArrayList<String>();
	}
	
	public void nameRead(String nameFile) throws Exception { //이름리스트를 읽는 method
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(nameFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader==null) break;
			
			nameList.add(reader);
		}
		buffer.close();
		fileReader.close();
		
		System.out.println("이름리스트 읽기 완료 : " + System.currentTimeMillis());
	}
	
	public void familyNameRead(String familyNameFile) throws Exception { //성씨리스트를 읽는 method
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(familyNameFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		String[] firstDivideList = null; 
		String[] secondDivideList = null;
		while(true) {
			reader = buffer.readLine();
			if(reader==null)break;
			
			firstDivideList = reader.split(":"); // firstDivideList[1]에 이름이 있음(한자포함)
			secondDivideList = firstDivideList[1].split(""); // secondDivideList[0]에 이름이 있음(한자제외)
			
			familyNameList.add(secondDivideList[0]);
			
		}
		buffer.close();
		fileReader.close();
		
		System.out.println("성씨리스트 읽기 완료 : "+ System.currentTimeMillis());
		
	}
	
	public void writeNameFile(String korNameFile, int length) throws Exception { //읽어 저장한 이름과 성을 Random을 이용하여 무작위로 조합하는 method
		
		Random rnd = new Random(); // 이름과 성을 무작위로 조합하기 위해서 Random을 사용
		
		PrintWriter fileOut;
		fileOut = new PrintWriter(korNameFile);
		List<String>korNameList = new ArrayList<String>(); // 이름과 성을 합쳐서 저장할 리스트
		
		
		// 이름과 성을 합쳐서 korNameList에 저장하는 부분
		for (int i = 0; i < length; i++) {
			String name = nameList.get(rnd.nextInt( nameList.size() ) );
			String fName = familyNameList.get(rnd.nextInt( familyNameList.size() ) );
			
			String korName = fName+name;
			korNameList.add(korName);
			
		}
		
		//성씨순으로 정렬하고 번호를 붙여주는 부분
		Collections.sort(korNameList);
		
		for (int i = 0; i < length; i++) {
			fileOut.printf("%03d\t%s\n",i+1,korNameList.get(i));
			fileOut.flush();
		}
		
		
		fileOut.close();
		System.out.println("리스트 쓰기 완료 : "+ System.currentTimeMillis());
	
	}
	
	
}
