package com.wxf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.taglibs.bsf.scriptlet;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wxf.domain.Department;
import com.wxf.service.inter.DepartmentServiceInter;

public class DepartmentServiceImpl extends BaseServiceImpl implements DepartmentServiceInter {

	public List getDepartmentName() {
		// TODO Auto-generated method stub
		System.out.println(this.getSessionFactory());
		String hql="select name from Department";
		List list=this.ExecuteQuery(hql, null);
		return list;
	}
	public List<Department> getDepartment(){
		String hql="from Department";
		List<Department> list= this.ExecuteQuery(hql, null);
		return list;
	}
}
