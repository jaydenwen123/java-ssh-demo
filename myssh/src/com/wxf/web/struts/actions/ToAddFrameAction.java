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

public class ToAddFrameAction extends Action {
	
	@Resource
	private DepartmentServiceInter departmentServiceimpl;
	
	public DepartmentServiceInter getDepartmentServiceimpl() {
		return departmentServiceimpl;
	}

	public void setDepartmentServiceimpl(
			DepartmentServiceInter departmentServiceimpl) {
		this.departmentServiceimpl = departmentServiceimpl;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
//		Employee employee=(Employee)request.getSession().getAttribute("employeeInfo");
		List<Department> list=departmentServiceimpl.getDepartment();
		request.setAttribute("department", list);
		System.out.println(list.get(0).getName());
		return mapping.findForward("toAdd");
	}
}
