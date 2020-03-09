package com.wxf.web.struts.actions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.wxf.domain.Department;
import com.wxf.domain.Employee;
import com.wxf.service.inter.DepartmentServiceInter;
import com.wxf.service.inter.EmployeeServiceInter;
import com.wxf.web.struts.forms.EmployeeInfoForm;
import com.wxf.web.struts.forms.EmployeeLoginForm;


public class DealEmployeeAction extends DispatchAction {

	@Resource
	private EmployeeServiceInter  employeeServiceimpl;
	@Resource
	private DepartmentServiceInter departmentServiceimpl;
	
	public EmployeeServiceInter getEmployeeServiceimpl() {
		return employeeServiceimpl;
	}

	public void setEmployeeServiceimpl(EmployeeServiceInter employeeServiceimpl) {
		this.employeeServiceimpl = employeeServiceimpl;
	}
	

	public DepartmentServiceInter getDepartmentServiceimpl() {
		return departmentServiceimpl;
	}

	public void setDepartmentServiceimpl(
			DepartmentServiceInter departmentServiceimpl) {
		this.departmentServiceimpl = departmentServiceimpl;
	}

	public ActionForward ShowEmployee(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int page=1;
		String s_pageNow=request.getParameter("page");
		if(s_pageNow!=null){
			page=Integer.parseInt(s_pageNow);
		}
		List<Employee> list=employeeServiceimpl.getAllEmployeeWithPage(3, page);
		request.setAttribute("employees", list);
		int pageCount=employeeServiceimpl.getPageTotal(3);
		request.setAttribute("pageCount", pageCount);
		Integer grade=((Employee)request.getSession().getAttribute("employeeInfo")).getGrade();
		if(grade==1){
			return mapping.findForward("showVip");
		}else {
			return mapping.findForward("showOther");
		}
		
	}
	
	public ActionForward AddEmployee(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		// TODO Auto-generated method stub
		EmployeeInfoForm empInfo=(EmployeeInfoForm) form;
		Department department=(Department) departmentServiceimpl.FindById(Department.class, 
				Integer.parseInt(empInfo.getDeptId()));
		//日期转换函数
		String hireDate=empInfo.getHireDate();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date hd=format.parse(hireDate);
		
		Employee e=new Employee(empInfo.getName(), empInfo.getPassword(),
				empInfo.getEmail(), hd, empInfo.getSalary()
				, empInfo.getGrade(), department);
		try {
//			departmentServiceimpl.add(department);
			employeeServiceimpl.add(e);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
			return mapping.findForward("opererr");
		}
		
		return mapping.findForward("operok");
	}
	
	public ActionForward UpdateEmployee(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		EmployeeInfoForm empInfo=(EmployeeInfoForm) form;
		System.out.println(empInfo.getDeptId());
		Department department=(Department) departmentServiceimpl.FindById(Department.class,
				Integer.parseInt(empInfo.getDeptId()));
		//日期转换函数
		String hireDate=empInfo.getHireDate();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date hd=format.parse(hireDate);
		Employee e=new Employee(Integer.parseInt(empInfo.getId()),empInfo.getName(), empInfo.getPassword(),
				empInfo.getEmail(), hd, empInfo.getSalary()
				, empInfo.getGrade(), department);
//		e.setId(Integer.parseInt(empInfo.getId()));
		try {
			departmentServiceimpl.add(department);
			employeeServiceimpl.update(e);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		return mapping.findForward("opererr");
		}
		
		return mapping.findForward("operok");
	}
	
	
	public ActionForward DeleteEmployee(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		String s_id=request.getParameter("id");
		try {
			employeeServiceimpl.delete(Employee.class, Integer.parseInt(s_id));
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
			return mapping.findForward("opererr");
		}
		
		return mapping.findForward("operok");
	}
}
