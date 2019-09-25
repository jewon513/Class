package com.biz.iolist.exec;

import java.util.Random;

import com.biz.iolist.model.GradeVO;

/*
 * VO 클래스 만들기
 * 1. private로 시작하는 맴버변수들을 정의한다.
 * 2. getter() setter() method 정의
 * 3. super 생성자 field 생성자 정의
 * 4. toString() 정의
 */

public class GradeEX_01 {

	public static void main(String[] args) {

		GradeVO gradeVO= new GradeVO();
		
		String s = gradeVO.toString();
		System.out.println(s);
		
		gradeVO.setStrNum("001");
		gradeVO.setStrName("홍길동");
		gradeVO.setIntKor(90);
		
		s = gradeVO.toString();
		System.out.println(s);
		
		Random rnd = new Random();
		
		
		for (int i = 0 ; i <10 ; i++) {
			gradeVO= new GradeVO(rnd.nextInt()+"");
			s = gradeVO.toString();
			System.out.println(s);
		}
	
		s = gradeVO.toString();
		System.out.println(s);
		
	}

}
