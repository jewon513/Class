package com.biz.files;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Print_03 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/files/data4.txt";
		
		FileWriter fileWriter = null;
		PrintWriter fileOut = null;
		
		try {
			
			/*
			 * java1.5부터는 PrintWriter 클래스만 단독으로 사용해서 파일에 text를 기록할 수 있다.
			 * 
			 * PrintWriter는 무조건 모든 파일을 새로 생성한다.
			 * append mode로 파일을 open 할 수 없다.
			 * 
			 * 만약 file을 append mode로 open 하고자 할 때에는 
			 * 일단 FileWriter를 사용해서 append mode로 open을 하고
			 * PrintWriter에 buffer를 생략하고 직접 주입한다.
			 * 
			 */
			fileWriter = new FileWriter(fileName);
			fileOut = new PrintWriter(fileWriter);
			fileOut.println("우리나라 만세");
			fileOut.println(30*40);
			fileOut.println(200%2);
			fileOut.printf("%5d\n", 30+40);
			
			fileOut.print("Repbulic of Korea\n");
			
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
