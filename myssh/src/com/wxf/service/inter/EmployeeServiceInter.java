package com.wxf.service.inter;

import java.util.List;

import javax.xml.registry.infomodel.User;

import com.wxf.domain.Employee;

public interface EmployeeServiceInter extends BaseServiceInter{
	
	public List<Employee> getAllEmployee();
	
	public List<Employee> getAllEmployeeWithPage(int pageSize ,int pageNow);
	
	public Employee chekcEmployee(Employee employee);
	
	public int getPageTotal(int pageSize);
	
}
