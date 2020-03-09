/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.wxf.struts.action;

import javax.annotation.Resource;
import javax.management.loading.PrivateMLet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.scripting.RequestToVariableFilter;

import com.wxf.domain.Teacher;
import com.wxf.service.TeacherService;
import com.wxf.struts.form.RegTeacherForm;

/** 
 * MyEclipse Struts
 * Creation date: 07-18-2016
 * 
 * XDoclet definition:
 * @struts.action path="/regTeacher" name="regTeacherForm" input="/WEB-INF/regTeacher.jsp" parameter="flag" scope="request"
 */
public class RegTeacherAction extends DispatchAction {
	/*
	 * Generated Methods
	 */
	@Resource
	private TeacherService teacherService;
	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward toReg(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		return mapping.findForward("toregister");
	}
	
	public ActionForward register(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RegTeacherForm regTeacherForm = (RegTeacherForm) form;// TODO Auto-generated method stub
		Teacher teacher=new Teacher();
		teacher.setUsername(regTeacherForm.getUsername());
		teacher.setPassword(regTeacherForm.getPassword());
		String regMsg="";
		try {
			teacherService.registerTeacher(teacher);
			regMsg+="ע��ɹ������¼";
			request.setAttribute("regMsg", regMsg);
			return mapping.findForward("tologin");
		} catch (Exception e) {
			// TODO: handle exception
			regMsg+="ע��ʧ�ܣ������½���ע��";
			request.setAttribute("regMsg", regMsg);
			return mapping.findForward("regfail");
		}
	}
}