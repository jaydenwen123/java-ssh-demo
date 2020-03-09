package com.wxf.service.inter;

import java.util.List;

import com.wxf.domain.Department;

public interface DepartmentServiceInter extends BaseServiceInter{
	
	public List getDepartmentName();
	public List<Department> getDepartment();
}
