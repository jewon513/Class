package com.biz.grade.service;

import java.util.List;

import com.biz.grade.model.GradeVO;

public interface ScoreService {

	public void input(int count);
	
	public void list();
	
	public void total();
	
	public void rank();
	
	public void totalSort();
	
	public void numSort();
	
	public List<GradeVO> getList();
	
	
	
	
}
