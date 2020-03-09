package com.wxf.service;

import java.util.List;

import com.wxf.domain.Dept;

public interface DeptService {

	public  void  addDept(Dept dept);
	
	public  void  updateDept(Dept dept);
	
	public  void  deleteDept(Dept dept);
	
	public  void  deleteById(java.io.Serializable id);
	
	public  Dept  getById(java.io.Serializable id);
	
	public  List<Dept>  getAllDept();
		
	public  List<Dept>  getAllDeptWithPage(int pageNow,int pageSize);
	
	public Integer  getPageCounts(int pageSize);
	
}
