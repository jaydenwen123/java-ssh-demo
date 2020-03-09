package com.wxf.text;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

import com.wxf.dao.BaseDao;
import com.wxf.dao.QuestionDao;
import com.wxf.dao.TeacherDao;
import com.wxf.dao.impl.BaseDaoImpl;
import com.wxf.dao.impl.TeacherDaoImpl;
import com.wxf.domain.Question;
import com.wxf.domain.Teacher;
import com.wxf.service.TeacherService;

public class testMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		/*TeacherDao teacherDao=(TeacherDao) ctx.getBean("teacherDao");
		System.out.println(teacherDao);
		TeacherService teacherService=(TeacherService) ctx.getBean("teacherService");
		System.out.println(teacherService);
		
		List<Teacher> list=teacherService.findTeachersWithPage(3, 1);
		System.out.println(list.size());
//		System.out.println(list.get(1).getUsername());
		Teacher teacher=teacherService.findbyId(1);
		System.out.println(teacher.getUsername()+","+teacher.getPassword());
		list=teacherService.findAll();		*/
		QuestionDao questionDao=(QuestionDao) ctx.getBean("questionDao");
		List<Question> list=questionDao.findAllQuestions();
		System.out.println(list.size());
		
	}

}
