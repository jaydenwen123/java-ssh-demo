package com.wxf.service;

import java.util.List;

import com.wxf.domain.Examtype;

public interface ExamtypeService {
	
	public void  addExamtype(Examtype examtype);
	
	public  void  updateExamtype(Examtype examtype);
	
	public  void  deleteById(Integer id);
	
//	public  void  deleteByName(String name);
	
	public  List<Examtype> findAllWithPage(int pageSize,int pageNow);
}
