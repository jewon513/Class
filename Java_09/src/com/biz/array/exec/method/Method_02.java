package com.biz.array.exec.method;

import com.biz.array.model.MemberVO;

public class Method_02 {

	public static void main(String[] args) {

		MemberVO mVO = new MemberVO();

		mVO.strName = "홍길동";
		mVO.strTel = "010-111-1234";
		mVO.setIntAge(33);

		System.out.printf("이름 : %s \n", mVO.strName);
		System.out.printf("전화번호 : %s \n", mVO.strTel);
		System.out.printf("나이 : %d \n ", mVO.getIntAge());
	}

}
