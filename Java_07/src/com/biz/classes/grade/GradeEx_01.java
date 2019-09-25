package com.biz.classes.grade;

import java.util.Scanner;

public class GradeEx_01 {

	/*
	 * 키보드로 한 학생의 성적정보를 입력받은 후 GradeVO 클래스의 객체에 저장하고 입력된 정보를 콘솔에 확인하는 방법.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("성적 정보 입력");
		System.out.println("==========================");
		System.out.print("학번>>");
		String strNum = scan.nextLine();
		
		System.out.print("이름>>");
		String strName = scan.nextLine();
		
		System.out.print("국어>>");
		String strKor = scan.nextLine();
		
		System.out.print("영어>>");
		String strEng = scan.nextLine();
		
		System.out.print("수학>>");
		String strMath = scan.nextLine();

		Grade grade = new Grade();
		grade.strNum=strNum;
		grade.strName=strName;
		grade.intKor=Integer.valueOf(strKor);
		grade.intEng=Integer.valueOf(strEng);
		grade.intMath=Integer.valueOf(strMath);
	}
}
