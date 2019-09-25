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

public class ScoreServiceV2 {

	private Map<String, ScoreVO> scList;
	public ScoreServiceV2() {

		scList = new TreeMap<String, ScoreVO>();
		
	}
	
	public Map<String,ScoreVO> getSCList() {
		return this.scList;
	}

	
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
		
		System.out.println("======================================================");
		System.out.println("성적표");
		System.out.println("======================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("======================================================");

		Iterator<String> _list = scList.keySet().iterator();
	
		while(_list.hasNext()) {
			
			
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
	
	
	public void rank() {
		//1 Map 데이터에서 value 전체를 추출하여 list(sortList)로 변환
		
		//Map<String,ScoreVO> type으로 데이터를 가지고 있는 scList값을 list type인 srotList로 변환하는 방법
		//List<제네릭> : list가 어떤 type의 데이터들을 가지고 있을 것인가를 명시
		
		//Map 형태를 List로 변환시킬때는
		//List<Map.Entry<>> 형태로 선언을 해주어야 한다.
		List<Map.Entry<String, ScoreVO>> sortList = new LinkedList<Map.Entry<String,ScoreVO>>(scList.entrySet());
		
		Collections.sort(sortList, new Comparator<Map.Entry<String, ScoreVO>>(){

			@Override
			public int compare(Entry<String, ScoreVO> o1, Entry<String, ScoreVO> o2) {
				
				return  o2.getValue().getSumScore() - o1.getValue().getSumScore() ;
				//o2.getValue()
				//list 형태로 바뀐 Map에서 VO를 추출하는 method
				 
			}
			
		});
		
		int rank=0;
		for(Map.Entry<String, ScoreVO> vo : sortList) {
			vo.getValue().setRank(++rank);
			System.out.println(vo.getValue().toString());
		}
	}
	
	
}
