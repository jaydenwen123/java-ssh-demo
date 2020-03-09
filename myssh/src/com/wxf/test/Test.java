package com.wxf.test;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.faces.application.Application;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.domain.Department;
import com.wxf.domain.Employee;
import com.wxf.service.impl.DepartmentServiceImpl;
import com.wxf.service.inter.DepartmentServiceInter;
import com.wxf.service.inter.EmployeeServiceInter;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Service service=(Service) ctx.getBean("service");
		System.out.println(service.getName());
//		add1();
/*//		add2();
		String hql="from Employee";
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) ac.getBean("sessionFactory");
		List<Employee> list=sessionFactory.openSession().createQuery(hql).list();
		System.out.println(list.size());*/
		
		
	}

	/*private static void add2() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeServiceInter employeeServiceInter=(EmployeeServiceInter) ac.getBean("employeeServiceimpl");		
		DepartmentServiceInter departmentServiceInter=(DepartmentServiceInter) ac.getBean("departmentServiceimpl");
		Department department =new Department("财务部");
		departmentServiceInter.addDepartment(department);
		Employee employee1=new Employee("小文", "123","234342@qq.com" , new Date(), 30000.0, 1,department);
		Employee employee2=new Employee("小飞", "123","234342@qq.com" , new Date(), 30000.0, 1,department);
		Employee employee3=new Employee("小王", "123","234342@qq.com" , new Date(), 30000.0, 1,department);
		
		employeeServiceInter.addEmployee(employee1);
		employeeServiceInter.addEmployee(employee2);
		employeeServiceInter.addEmployee(employee3);
		Set<Employee> set=new HashSet<Employee>();
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		Department department =new Department("财务部", set);
		departmentServiceInter.addDepartment(department);
	}*/

	private static void add1() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sessionFactory=(SessionFactory) ac.getBean("sessionFactory");
		Session session=null;
		Transaction tx=null;
		try {
			session=sessionFactory.openSession();
			tx=session.beginTransaction();
			/*Employee employee1=new Employee("小文", "123","2282186474@qq.com", new Date(), 30000.0,1);
			Employee employee2=new Employee("小王", "123","223432424@qq.com", new Date(), 34543.12,2);
			Employee employee3=new Employee("小张", "234","sfsdfsd@sohu.com", new Date(), 234.9,2);
			Employee employee4=new Employee("小红", "234","we2332e23@163.com", new Date(), 12323.0,1);
			session.save(employee1);
			session.save(employee2);
			session.save(employee3);
			session.save(employee4);*/
			Department department1 =new Department("总部");
			Department department2 =new Department("后勤部");
			Department department3=new Department("技术部");
			session.save(department1);
			session.save(department2);
			session.save(department3);
		/*	String hql="select name from Department";
			List list=session.createQuery(hql).list();
			System.out.println(list.size());*/
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			
			if(session!=null && session.isOpen()){
				session.close();
			}
			
		}
	}

}
