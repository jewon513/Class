package com.biz.iolist.exec;

import com.biz.iolist.service.IoListService;
import com.biz.iolist.service.IoListServiceImpV1;

public class IoListEx_01 {

	public static void main(String[] args) {

		IoListService ioService = new IoListServiceImpV1();
		
		ioService.input(10);
		ioService.total();
		ioService.list();
		
		
		
	}

}
