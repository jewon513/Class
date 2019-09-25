package com.biz.iolist.exec;

import com.biz.iolist.service.IoListService;
import com.biz.iolist.service.IoListServiceImpV2;

public class IoListEx_02 {

	public static void main(String[] args) {

		IoListService ioService = new IoListServiceImpV2();
		
		ioService.input(10);
		ioService.total();
		ioService.list();
		
		
	}

}
