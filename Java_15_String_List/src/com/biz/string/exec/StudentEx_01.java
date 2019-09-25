package com.biz.string.exec;

import com.biz.string.domain.StudentVO;
import com.biz.string.service.StringService;
import com.biz.string.service.StudentServiceV1;

public class StudentEx_01 {

	public static void main(String[] args) {

			StringService stService = new StudentServiceV1();
			
			stService.input();
			stService.list();
			
			
			//StudentsService 클래스에
			//StringService 인터페이스에 정의되지 않은
			//search() method가 있는데,
			//그 search() method를 사용하기 위해서
			//stService를 잠시 StudentServiceV1인 것처럼 바꾸는 것
			StudentVO stdVO = ((StudentServiceV1)stService).search("00001");
			
			if(stdVO==null) {
				System.out.println("찾는데이터 없음!!");
			}else {
				System.out.println(stdVO.toString());
			}
			
			//search() method를 호출하면서 학번 00001을 매개변수로 전달하였고
			//만약 해당 학번의 데이터가 있으면
			//stdVO에는 학생정보가 담겨있을 것이다.
			
			//혹시 데이터를 찾지 못하였으면 stdVO에는 null값이 담겨있을 것이다.
			
	}

}
