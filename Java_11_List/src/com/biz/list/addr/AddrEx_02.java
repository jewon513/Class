package com.biz.list.addr;

import com.biz.list.service.AddrService;
import com.biz.list.service.AddrServiceImpV2;

public class AddrEx_02 {

	public static void main(String[] args) {

		AddrService addr1 = new AddrServiceImpV2();
		
		addr1.input();
		addr1.list();
		addr1.view(2);
	}

}
