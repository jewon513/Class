package com.biz.grade.service;

import java.util.List;

import com.biz.grade.model.StudentVO;

public interface StudentService {

	public void input(int count);
		
		
	public void list();

	public List<StudentVO> getList();
	
}
