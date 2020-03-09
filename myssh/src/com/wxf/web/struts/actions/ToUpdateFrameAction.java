package com.wxf.web.struts.actions;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.wxf.domain.Department;
import com.wxf.domain.Employee;
import com.wxf.service.inter.DepartmentServiceInter;
import com.wxf.service.inter.EmployeeServiceInter;

public class ToUpdateFrameAction extends Action {
	
	@Resource
	private EmployeeServiceInter employeeServiceimpl;
	@Resource
	private DepartmentServiceInter departmentServiceimpl;
	
	
	public DepartmentServiceInter getDepartmentServiceimpl() {
		return departmentServiceimpl;
	}

	public void setDepartmentServiceimpl(
			DepartmentServiceInter departmentServiceimpl) {
		this.departmentServiceimpl = departmentServiceimpl;
	}

	public EmployeeServiceInter getEmployeeServiceimpl() {
		return employeeServiceimpl;
	}

	public void setEmployeeServiceimpl(EmployeeServiceInter employeeServiceimpl) {
		this.employeeServiceimpl = employeeServiceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		String s_id=request.getParameter("id");
		List<Department> list=departmentServiceimpl.getDepartment();
		request.setAttribute("department",list);
		Employee e=(Employee) employeeServiceimpl.FindById(Employee.class, Integer.parseInt(s_id));
		request.setAttribute("employee", e);
		return mapping.findForward("toUpdate");
	}
}
