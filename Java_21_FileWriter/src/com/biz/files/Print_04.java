package com.biz.files;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Print_04 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/files/data4.txt";
		
		FileWriter fileWriter = null;
		
		PrintWriter fileOut = null;
		
		try {
			
			/*
			 * java1.5부터는 PrintWriter 클래스만 단독으로 사용해서 파일에 text를 기록할 수 있다.
			 * 
			 * 
			 * FileWriter로 파일을 open하고
			 * PrintWriter에 주입을 하면
			 * 
			 * PrintWriter의 두번째 매개변수를 지정하여
			 * flush() method를 자동으로 실행할 수 있다.
			 * 
			 * 자동 flush는 print() method를 실행할때마다
			 * 기록이 되는 것이 아니고, 내부에서 buffer를 별도로 관리하면서
			 * 내용을 기록한다.
			 * 자동 fulsh는 원하는 만큼의 안정성을 보장하지 않는다.
			 * 
			 * 만약 file을 append mode로 open 하고자 할 때에는 
			 * 일단 FileWriter를 사용해서 append mode로 open을 하고
			 * PrintWriter에 buffer를 생략하고 직접 주입한다.
			 * 
			 */
			fileWriter = new FileWriter(fileName);
			fileOut = new PrintWriter(fileWriter, true);
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
