package com.biz.list.exec;

import com.biz.list.service.IoListServiceImp;

public class IoListEx_02 {

	public static void main(String[] args) {
		IoListServiceImp ioService = new IoListServiceImp();
		
		ioService.input(10);
		ioService.total();
		
		ioService.list();
		
		
	}
	
	
	
	
	
}
