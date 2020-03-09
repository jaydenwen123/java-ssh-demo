package com.wxf.dao;

import java.util.List;

import com.sun.istack.internal.FinalArrayList;
import com.wxf.domain.Teacher;

public interface TeacherDao extends BaseDao{
	
	public Teacher findByName( final String username);

	public  List<Teacher> findAllTeachers();
	
	public  List<Teacher> findTeachersWithPage(int pageSize,int pageNow);
}
