package com.wxf.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.wxf.domain.Employee;
import com.wxf.service.inter.EmployeeServiceInter;

public class EmployeeServiceimpl extends BaseServiceImpl implements EmployeeServiceInter {

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		String hql="from Employee order by id" ;
		List<Employee> list=this.ExecuteQuery(hql, null);
		return list;
	}

	public List<Employee> getAllEmployeeWithPage(int pageSize ,int pageNow){
		String hql="from Employee order by id";
		List<Employee> list=this.ExecuteQuery(hql, null, pageSize, pageNow);
		return list;
	}
	public Employee chekcEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String hql="from Employee where id=? and password=?";
		Object []parameters={employee.getId(),employee.getPassword()};
		List<Employee> list=this.ExecuteQuery(hql, parameters);
		if(list.size()==1){
			return list.get(0);
		}else {
			return null;
		}
	}

	public int getPageTotal(int pageSize) {
		// TODO Auto-generated method stub
		//获取总行数
		String hql="select count(*) from Employee";
		int rowCount= this.getPageCount(hql, null, pageSize);
		return (rowCount-1)/pageSize+1;
	}
	

}
