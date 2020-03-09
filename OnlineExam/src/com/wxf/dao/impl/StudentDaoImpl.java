package com.wxf.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.hql.ast.tree.FromClause;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.transaction.annotation.Transactional;

import com.wxf.dao.StudentDao;
import com.wxf.domain.Student;

@Transactional
public class StudentDaoImpl extends BaseDaoImpl implements StudentDao {

	public List<Student> findallStudents() {
		// TODO Auto-generated method stub
		return this.findAll("from Student");
	}

	public List<Student> findStudentsWithPage(int pageSize, int pageNow) {
		// TODO Auto-generated method stu
		return this.findAllWithPage("from Student order by stuNo", null, pageSize, pageNow);
	}

	public Student findByName(String username) {
		// TODO Auto-generated method stub
		List<Student> list=this.getHibernateTemplate().find("from Student where stuName=?",username);
		if(list.size()==1){
			return list.get(0);
		}
		return null;
	}

	public Integer getPageCount(int pageSize) {
		// TODO Auto-generated method stub
		Object count=this.getHibernateTemplate().execute(new HibernateCallback() {
			
			public Object doInHibernate(Session arg0) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				return arg0.createQuery("select count(*) from Student").uniqueResult();
			}
		});
		Integer counts=Integer.parseInt(count.toString());
		return (counts-1)/pageSize+1;
		
	}
	
	/*public static void main(String[] args) {
		
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao studentDao=(StudentDao) act.getBean("studentDao");
		List<Student> list=studentDao.findStudentsWithPage(3, 1);
//		List<Student> list=studentDao.findallStudents();
		System.out.println(list.size());
	}*/


}
