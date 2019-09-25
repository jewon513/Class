package com.biz.list.exec;

import com.biz.list.service.IoListServiceImp;

public class IoListEx_01 {

	public static void main(String[] args) {

		IoListServiceImp ioService = new IoListServiceImp();
		
		ioService.input(5);
		ioService.list();
		
	}

}
