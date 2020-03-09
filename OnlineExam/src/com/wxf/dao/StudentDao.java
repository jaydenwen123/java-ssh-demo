package com.wxf.dao;

import java.util.List;

import com.wxf.domain.Student;

public interface StudentDao extends BaseDao{
	
	public Student findByName(String username);

	public List<Student> findallStudents();
	
	public List<Student> findStudentsWithPage(int pageSize, int pageNow);
	
	public Integer getPageCount(int pageSize);
	
}
