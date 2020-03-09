package com.wxf.service;

import java.util.List;

import com.wxf.domain.Student;

public interface StudentService {

	public void  AddStudent(Student student);
	
	public  void  updateStudent(Student student);
	
	public  void  deleteStudent(Student  student);
	
	public  void  deleteById(Integer id);

	public  Student  findById(Integer id);
	
	public  List<Student> findStudentsWithPage(int pageSize, int pageNow);
	
	public  Student  validStudent(String username,String password);
	
	public Integer getStudentCounts(int pageSize);
}
