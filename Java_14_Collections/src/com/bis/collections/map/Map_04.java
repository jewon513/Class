package com.bis.collections.map;

import java.util.HashMap;
import java.util.Map;

import com.bis.collections.model.GradeVO;

public class Map_04 {

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
		
		vo.setStrName("이몽룡");
		vo.setIntKor(10);
		vo.setIntEng(20);
		vo.setIntMath(30);
		grades.put("이몽룡", vo);
		
		vo.setStrName("성춘향");
		vo.setIntKor(80);
		vo.setIntEng(80);
		vo.setIntMath(80);
		grades.put("성춘향", vo);
		
		System.out.println("성춘향의 성적 :" + grades.get("성춘향").toString());
		
	}

}
