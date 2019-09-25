package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Text 파일을 생성하여 내용을 기록하는 방법
 */

public class FileWriter_01 {

	public static void main(String[] args) {

		String fileName="src/com/biz/filewriter/data.txt";
		
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.write("대한민국만세");
			fileWriter.write(97);
			for(int i = 97; i<100 ; i++) {
				fileWriter.write(i);
			}
			fileWriter.write(13);
			// char는 실제적으로 문자의 ASCII코드 값의 int형과 유사하기 때문에
			// int 문과 연관하여 코드 작성이 가능하다.
			
			for (int i = 'A'; i <= 'Z'; i++) {
				fileWriter.write(i);
			}
			
			//파일을 기록할 때 write() 메서드는 직접 파일을 기록하지만
			//JVM이 임시로 기억장치 어딘가에 모아둔다.
			//만약 close()하지않고 프로젝트가 끝나면 
			//JVM이 모아둔 데이터는 사라져버린다.
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
