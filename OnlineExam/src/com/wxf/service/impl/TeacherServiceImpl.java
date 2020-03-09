package com.wxf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.dao.TeacherDao;
import com.wxf.dao.impl.TeacherDaoImpl;
import com.wxf.domain.Teacher;
import com.wxf.service.TeacherService;

public class TeacherServiceImpl implements TeacherService{

	@Resource
	private TeacherDao teacherDao;
	
	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.add(teacher);
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.update(teacher);
	}

	public void deleteTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.delete(teacher);
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		teacherDao.deleteById(Teacher.class, id);
	}

	public Teacher findbyId(Integer id) {
		// TODO Auto-generated method stub
		return (Teacher) teacherDao.findById(Teacher.class, id);
	}

	public List<Teacher> findTeachersWithPage(int pageSize, int pageNow) {
		// TODO Auto-generated method stub
		return teacherDao.findTeachersWithPage(pageSize, pageNow);
	}

	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return teacherDao.findAllTeachers();
	}

	public Teacher validLogin(String username, String password) {
		// TODO Auto-generated method stub
		Teacher teacher= teacherDao.findByName(username);
		if(teacher!=null){
			if(teacher.getPassword().equals(password)){
				return teacher;
			}
		}
		return null;
		
	}

	public boolean registerTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		Teacher teacher1= teacherDao.findByName(teacher.getUsername());
		if(teacher1!=null){
			return false;
		}else {
			teacherDao.add(teacher);
			return true;
		}
		
	}
	
/*public static void main(String[] args) {
		
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherService teacherService=(TeacherService) act.getBean("teacherService");
		Teacher teacher=teacherService.validLogin("wen", "wen");
		if(teacher!=null){
			System.out.println(teacher.getId());	
			System.out.println(teacher.getPassword());
		}else {
			System.out.println("null");
		}
	}*/
	
}
