package com.wxf.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.transaction.annotation.Transactional;

import com.sun.istack.internal.FinalArrayList;
import com.wxf.dao.TeacherDao;
import com.wxf.domain.Teacher;

@Transactional
public class TeacherDaoImpl extends BaseDaoImpl implements TeacherDao {

	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return this.findAll("from Teacher");
	}

	public  List<Teacher> findTeachersWithPage(int pageSize, int pageNow) {
		// TODO Auto-generated method stub
		return this.findAllWithPage("from Teacher ", null, pageSize, pageNow);
	}

	public Teacher findByName(final String username) {
		//两种方法均可以，取出数据
		// TODO Auto-generated method stub
		/*@SuppressWarnings("unchecked")
		List<Teacher>  list=this.getHibernateTemplate().executeFind(new HibernateCallback() {
			
			public Object doInHibernate(Session arg0) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				List<Teacher> result=arg0.createQuery("from Teacher where username=?").setString(0, username).list();
				System.out.println(result.size());
				return result;
			}
		});
		if(list.size()==1){
			return list.get(0);
		}
		return null;*/
		
		List<Teacher> list=this.getHibernateTemplate().find("from Teacher where username=?", username);
		if(list.size()==1){
			return list.get(0);
		}else {
			return null;
		}
		
	}

	/*public static void main(String[] args) {
		
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		TeacherDao teacherDaoImpl=(TeacherDao) act.getBean("teacherDao");
		List<Teacher> list=teacherDaoImpl.findAllTeachers();
		System.out.println(list.size());
		Teacher teacher=teacherDaoImpl.findByName("wen");
		if(teacher!=null){
			System.out.println(teacher.getId());	
			System.out.println(teacher.getPassword());
		}else {
			System.out.println("null");
		}
	}
	*/
	
}
