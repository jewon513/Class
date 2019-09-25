package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * data.txt 파일을 읽어서 기억장치로 가져 오려고 한다.
 * 1. 운영체제에게 data.txt 을 읽을테니 허락을 해달라 라고 요청을 해야한다.
 * 2. 
 * 
 */

public class fileEX_01 {

	public static void main(String[] args) {

		String file = "src/com/biz/files/data.txt";
		
		/*
		 * FileReader;
		 * 운영체제에게 파일을 읽을테니 허락해달라 하는 요청과
		 * 운영체제가 허락을 하면, 읽을 파일에 대한 정보를 java 코드에서 사용 할 수 있도록
		 * 준비해주는 클래스이다.
		 * 
		 * 읽고자 하는 파일의 이름을 파일이 저장된 폴더 path(경로)까지 문자열 형태로 전달하면서 객체로 생성해주면 된다.
		 */
		
		
		FileReader fileReader = null; // 파일 스코프때문에 따로 분리한 것이다.
	
			
		try {
			/*
			 * FileReader 클래스를 사용해서 파일을 읽을 준비를 수행하는데
			 * 알 수 없는 여러가지 이유로 파일을 읽는데 문제가 발생할 수 있는데 이때 만약 파일이
			 *  만약 파일이 어떤 이유로 지워졌거나 깨졌을 경우 FileNotFoundException이 발생할 확률이 있다.
			 *  그래서 파일을 읽기 위한 객체 생성(초기화)명령문은 반드시 try catch문으로 감싸도록 되어있다.
			 *  
			 * try 문안에 선언과 생성을 동시에 하면 try문이 끝나면 사용할 수 없게되버린다.
			 * 따라서 선언과 생성을 분리시킬 필요가 있다 (try문을 사용할때)
			 */
			
			
			fileReader = new FileReader(file);
			int alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
			
			alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
			
			alpha = fileReader.read();
			System.out.println(alpha);
			System.out.println((char)alpha);
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
