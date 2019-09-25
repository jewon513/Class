package com.biz.array.exec.member;

import com.biz.array.model.MemberVO;
import com.biz.array.service.MemberService;

public class MemberEx_01 {

	public static void main(String[] args) {

		MemberService ms = new MemberService();
		
		MemberVO[] mVOs = ms.getMemberVO();
		for(int i = 0 ; i< mVOs.length; i++) {
			System.out.println(mVOs[i].strName);
		}
	}

}
