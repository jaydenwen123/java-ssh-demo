package com.wxf.web.struts.actions;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wxf.domain.Employee;
import com.wxf.service.inter.EmployeeServiceInter;
import com.wxf.web.struts.forms.EmployeeLoginForm;

public class EmployeeLoginAction extends DispatchAction {
	
	@Resource
	private EmployeeServiceInter employeeServiceimpl;
	
	public EmployeeServiceInter getEmployeeServiceimpl() {
		return employeeServiceimpl;
	}

	public void setEmployeeServiceimpl(EmployeeServiceInter employeeServiceimpl) {
		this.employeeServiceimpl = employeeServiceimpl;
	}



	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		EmployeeLoginForm loginForm=(EmployeeLoginForm) form;
		String id=loginForm.getId();
		String password=loginForm.getPassword();
		
		//web容器中获取application.xml文件的实例
		/*WebApplicationContext wat=WebApplicationContextUtils.getWebApplicationContext(
						this.getServlet().getServletContext());
		EmployeeServiceInter eServiceInter=(EmployeeServiceInter) wat.getBean("employeeServiceimpl");*/
		
		Employee e=new Employee();
		e.setId(Integer.parseInt(id));
		e.setPassword(password);
		e=employeeServiceimpl.chekcEmployee(e);
		if(null!=e){
			request.getSession().setAttribute("employeeInfo", e);
			return mapping.findForward("ok");
		}else {
			request.setAttribute("errorMessage","提示信息：输入的用户名或者密码错误,请重新输入！");
			return mapping.findForward("toBack");
		}
	}
	
	
	public ActionForward returnMainFrame(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		if(request.getSession().getAttribute("employeeInfo")!=null){
			
			return mapping.findForward("ok");
		}else {
			return mapping.findForward("unknownError");
		}
	}
	
	public ActionForward ExitLogin(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
			request.getSession().invalidate();
			return mapping.findForward("toBack");
		}
}
