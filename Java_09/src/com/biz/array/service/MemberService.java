package com.biz.array.service;

import com.biz.array.model.MemberVO;

public class MemberService {
	
		private MemberVO[] mVO;
		
		public MemberService() {
			
			mVO= new MemberVO[10];
			
			for (int i = 0 ; i<mVO.length ; i++) {
				mVO[i] = new MemberVO();
				mVO[i].strName = String.format("K0%03d", i);
			}
		}
		
		public MemberService(int length) {
			mVO = new MemberVO[length];
			
			for(int i = 0 ; i <mVO.length; i++) {
				mVO[i]=new MemberVO();
				mVO[i].strName=String.format("K-%05d", i);
				mVO[i].strTel=String.format("010-%04d-%04d", i+1,i+1);
				
			}
		}
		
		public MemberVO[] getMemberVO() {
			return mVO;
		}
		
		public void memberListView() {
			System.out.println("=====================================");
			System.out.println("이름\t전화번호");
			System.out.println("=====================================");
			
			for (int i = 0 ; i<mVO.length; i++) {
				System.out.printf("%s\t%s\n", mVO[i].strName , mVO[i].strTel);	
			}
			
		}
}
