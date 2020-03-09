package com.wxf.service;

import java.util.List;

import com.wxf.domain.Teacher;

public interface TeacherService {

	public  void  addTeacher(Teacher teacher);
	
	public  void  updateTeacher(Teacher teacher);
	
	public  void  deleteTeacher(Teacher teacher);
	
	public  void  deleteById(Integer id);
	
	public  Teacher  findbyId(Integer id);
	
	public  List<Teacher> findAll();
	
	public  List<Teacher>  findTeachersWithPage(int pageSize,int pageNow);
	
	public  Teacher  validLogin(String username,String password);
	
	public  boolean  registerTeacher(Teacher teacher);
	
}
