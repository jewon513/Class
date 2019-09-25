package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.util.ScoreIDX;

public class ScoreServiceV1 {

	private Map<String, ScoreVO> scList;
	public ScoreServiceV1() {

		scList = new TreeMap<String, ScoreVO>();
		
	}
	
	public Map<String,ScoreVO> getSCList() {
		return this.scList;
	}

	// scoreFileName 파일을 읽어서 데이터를 생성하여 scList에 추가
	public void read(String scoreFileName) throws Exception {
		
		FileReader fileReader = new FileReader(scoreFileName);
		BufferedReader buffer = new BufferedReader(fileReader);
		String reader = new String();
		
		while(true) {
			reader=buffer.readLine();
			if (reader==null) break;
			
			String[] scoreList = reader.split(":");
			
			ScoreVO scVO = new ScoreVO();
			
			scVO.setNum(scoreList[ScoreIDX.NUM]);
			
			try {
				scVO.setKorScore(Integer.valueOf(scoreList[ScoreIDX.KOR]));
				scVO.setEngScore(Integer.valueOf(scoreList[ScoreIDX.ENG]));
				scVO.setMathScore(Integer.valueOf(scoreList[ScoreIDX.MATH]));
			} catch (Exception e) {
				System.out.println(scoreList[ScoreIDX.NUM]+"번 학생에 오류가 있습니다.");
			}
			
			
			scList.put(scoreList[ScoreIDX.NUM], scVO);
		
		}
		buffer.close();
		fileReader.close();
	
	}
	
	public void total() {
		Set<String> scNum = scList.keySet();
		
		for(String key : scNum) {
			ScoreVO vo = scList.get(key);
			vo.setSumScore(vo.getKorScore()+vo.getEngScore()+vo.getMathScore());
			vo.setAverage(vo.getSumScore()/3);
		}
	}
	
	public void listTotal() {
		Set<String> keys = scList.keySet();
		System.out.println("======================");
		System.out.println("총점리스트");
		System.out.println("======================");
		System.out.println("학번\t총점\t평균");
		System.out.println("======================");
		for(String key : keys) {
			ScoreVO vo = scList.get(key);
			System.out.printf("%5s\t%5d\t%5.1f\n",
					vo.getNum(),
					vo.getSumScore(),
					vo.getAverage());
		}
	}
	
	public void list() {
		
		/*1번 방법
		 * Set<String> scNum = scList.keySet();
		
		System.out.println("======================================================");
		System.out.println("성적표");
		System.out.println("======================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("======================================================");
		for(String key : scNum) {
			ScoreVO vo = scList.get(key);
			System.out.print(vo.getNum()+"\t");
			System.out.print(vo.getKorScore()+"\t");
			System.out.print(vo.getEngScore()+"\t");
			System.out.print(vo.getMathScore()+"\t");
			System.out.print(vo.getSumScore()+"\t");
			System.out.print(vo.getAverage()+"\n");
			
		}
		System.out.println("======================================================");
		 */
		
		/* 2번방법
		 * Collections 자료형의 반복문을 도와주는 class
		 * Iterator를 사용하면 while() 반복문을 사용해서
		 * 리스트를 처리할 수 있다.
		 */
		System.out.println("======================================================");
		System.out.println("성적표");
		System.out.println("======================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("======================================================");
		// key들을 추출한 Set list를 Iterator 형으로 변환
		Iterator<String> _list = scList.keySet().iterator();
		
		//Iterator의 hasNext() method는 
		//Iterator의 리스트에 아직 읽을 데이터가 있는지를 boolean으로 리턴해준다.
		while(_list.hasNext()) {
			
			// 읽을 데이터가 있다면 next() 메서드를 호출하여 값을 읽고
			// 이 값은 scList의 key 값들중 1개가 되고
			// 그 key 값으로 ScoreVO를 추출하여
			// scVO에 담는다.
			ScoreVO scVO = scList.get(_list.next());
			System.out.print(scVO.getNum()+"\t");
			System.out.print(scVO.getKorScore()+"\t");
			System.out.print(scVO.getEngScore()+"\t");
			System.out.print(scVO.getMathScore()+"\t");
			System.out.print(scVO.getSumScore()+"\t");
			System.out.print(scVO.getAverage()+"\n");
		}
		System.out.println("======================================================");
	}
	
	/*
	 * scList를 총점 기준으로 내림차순 정렬한 후 rank 필드에 순서대로 숫자를 추가하여 석차를 표기한다.
	 * 단, 동점자 처리는 무시한다.
	 * 
	 * 데이터가 Map 구조로 저장되어 있는 경우
	 * Map key값으로 정렬하는것은 문제가 없으나
	 * value값으로 정렬하기 위해서는 몇가지 절차가 필요하다.
	 * 
	 * 1. Map의 value 전체를 추출하여 list로 변환
	 * 2. list를 정렬하고 연산을 수행한 다음
	 * 3. 다시 list를 Map에 저장한다.
	 * 
	 */
	public void rank() {
		//1/ Map 데이터에서 value 전체를 추출하여 list(sortList)로 변환
		List<Map.Entry<String, ScoreVO>> sortList = new LinkedList<Map.Entry<String,ScoreVO>>(scList.entrySet());
		
		Collections.sort(sortList, new Comparator<Map.Entry<String, ScoreVO>>(){

			@Override
			public int compare(Entry<String, ScoreVO> o1, Entry<String, ScoreVO> o2) {
				
				return  o2.getValue().getSumScore() - o1.getValue().getSumScore() ;
				 
			}
			
		});
		int rank=0;
		for(Map.Entry<String, ScoreVO> vo : sortList) {
			vo.getValue().setRank(++rank);
			System.out.println(vo.getValue().toString());
		}
	}
	
	
}
