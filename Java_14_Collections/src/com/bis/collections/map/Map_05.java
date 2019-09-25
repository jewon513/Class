package com.bis.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.bis.collections.model.GradeVO;

public class Map_05 {

	public static void main(String[] args) {

		/*
		 * Map 데이터 구조
		 * 데이터를 저장할때 key, value의 쌍으로 put을 하면
		 * 데이터를 조회할때 key값으로 찾는다.
		 * 데이터가 어떤 위치에 있는지는 몰라도 내용으로 검색하는 연상검색 기능을 구현한다.
		 */
		
		Map<String, GradeVO> grades = new HashMap<String, GradeVO>();
		
		GradeVO vo = new GradeVO();
		
		vo.setStrName("홍길동");
		vo.setIntKor(90);
		vo.setIntEng(95);
		vo.setIntMath(70);
		
		grades.put("홍길동", vo);
		
		vo = new GradeVO();
		vo.setStrName("이몽룡");
		vo.setIntKor(10);
		vo.setIntEng(20);
		vo.setIntMath(30);
		grades.put("이몽룡", vo);
		
		vo = new GradeVO();
		vo.setStrName("성춘향");
		vo.setIntKor(80);
		vo.setIntEng(80);
		vo.setIntMath(80);
		grades.put("성춘향", vo);
		
		// Map에 저장된 데이터 전체를 조회하고자 할때 기본적으로 Map은 저장된 리스트를 조회하는데 불편한 부분이 있다.
		// 1. Map 데이터에 저장된 key만 따로 떼어서 Set에 담는다.
		// 2. key를 for 반복문으로 처리하여 각 항목을 get(key) 메서드를 이용하여 값을 읽어들인다
		
		Set<String> gradeKeys = grades.keySet();
		for(String s : gradeKeys) {
			
			GradeVO b = grades.get(s);
			System.out.println(b.toString());
		}
		
		
	}

}
