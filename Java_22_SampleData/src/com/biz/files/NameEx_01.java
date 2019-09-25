package com.biz.files;

import com.biz.files.service.NameServiceV1;

public class NameEx_01 {

	public static void main(String[] args) {

		/*
		 * 이름리스트.txt와 성씨리스트.txt 파일을 읽어서 리스트를 만들고
		 * 두 리스트의 값들을 임의 조합하여
		 * 3글자의 한국사람 이름을 생성하고
		 * 한국인이름.txt 파일로 저장하시오
		 * 
		 * 단, 성씨는 한자는 제외하고 한글1글자만 사용
		 * 한국인이름 리스트는 100개를 작성하시오.
		 * 
		 * 이름리스트.txt에 나오는 이름순서와
		 * 성씨리스트.txt에 나오는 성씨순서가 일치하면 안됨.
		 * 
		 * Service 클래스를 작성하여 과제를 수행하시오
		 * 
		 */
		
		System.out.printf("시작 : %d\n", System.currentTimeMillis());
		
		NameServiceV1 ns = new NameServiceV1();
		
		String nameFile ="src/com/biz/files/이름리스트.txt";
		String familyNameFile ="src/com/biz/files/성씨리스트.txt";
		String korNameFile ="src/com/biz/files/korNameListFile.txt";
		int length = 1000000;
		
		try {
			ns.nameRead(nameFile);
			ns.familyNameRead(familyNameFile);
			ns.writeNameFile(korNameFile, length);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("끝 : %d", System.currentTimeMillis());
	}

}
