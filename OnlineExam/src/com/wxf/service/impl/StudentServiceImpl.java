package com.wxf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.wxf.dao.StudentDao;
import com.wxf.domain.Student;
import com.wxf.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentDao studentDao;
	
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void AddStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.add(student);
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.update(student);
	}
	

	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		studentDao.delete(student);
		
	}
	

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		studentDao.deleteById(Student.class, id);
	}

	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return (Student) studentDao.findById(Student.class, id);
	}

	public List<Student> findStudentsWithPage(int pageSize, int pageNow) {
		// TODO Auto-generated method stub
		return studentDao.findStudentsWithPage(pageSize, pageNow);
	}

	public Student validStudent(String username, String password) {
		// TODO Auto-generated method stub
		Student student=studentDao.findByName(username);
		if(student.getStuNo().equals(password)){
			return student;
		}else {
			return null;
		}
	}

	public Integer getStudentCounts(int pageSize) {
		// TODO Auto-generated method stub
		return studentDao.getPageCount(pageSize);
	}

}
