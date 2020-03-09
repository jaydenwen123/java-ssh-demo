/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.wxf.struts.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.wxf.domain.Student;
import com.wxf.service.StudentService;
import com.wxf.struts.form.StudentForm;

/** 
 * MyEclipse Struts
 * Creation date: 07-18-2016
 * 
 * XDoclet definition:
 * @struts.action path="/dealStu" name="studentForm" parameter="flag" scope="request"
 */
public class DealStuAction extends DispatchAction {
	/*
	 * Generated Methods

	 */
	@Resource
	private StudentService studentService;
	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward toManager(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
//		StudentForm studentForm = (StudentForm) form;// TODO Auto-generated method stub
		return mapping.findForward("toStuManager");
	}
	
	public ActionForward toAddStu(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
//		StudentForm studentForm = (StudentForm) form;// TODO Auto-generated method stub
		return mapping.findForward("toAddStu");
	}
	
	public ActionForward addStu(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		StudentForm studentForm = (StudentForm) form;// TODO Auto-generated method stub
		Student student=new Student();
		student.setStuName(studentForm.getStuName());
		student.setStuNo(studentForm.getStuNo());
		student.setStuMail(studentForm.getStuMail());
		student.setAddress(studentForm.getAddress());
		student.setHumanid(studentForm.getHumanid());
		student.setClassName(studentForm.getClassName());
		student.setStuPhone(studentForm.getStuPhone());
		String addmsg="";
		try {
			studentService.AddStudent(student);
			addmsg="���ӳɹ������������";
		} catch (Exception e) {
			// TODO: handle exception
			addmsg="����ʧ�ܣ�����������";
		}
		request.setAttribute("addMsg", addmsg);
		return mapping.findForward("toAddStu");
	}
	
	public ActionForward toUpdateStu(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		String s_id=request.getParameter("id");
		int id=Integer.parseInt(s_id);
		request.getSession().setAttribute("id", id);
		Student student=studentService.findById(id);
		request.setAttribute("student", student);
		return mapping.findForward("toUpdateStu");
	}
	
	public ActionForward updateStu(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		StudentForm studentForm = (StudentForm) form;// TODO Auto-generated method stub
		Student student=new Student();
		student.setStuName(studentForm.getStuName());
		student.setStuNo(studentForm.getStuNo());
		student.setStuMail(studentForm.getStuMail());
		student.setAddress(studentForm.getAddress());
		student.setHumanid(studentForm.getHumanid());
		student.setClassName(studentForm.getClassName());
		student.setStuPhone(studentForm.getStuPhone());
		student.setId((Integer)request.getSession().getAttribute("id"));
		String updatemsg="";
		try {
			studentService.updateStudent(student);
			updatemsg="�޸ĳɹ�";
			request.setAttribute("updateMsg", updatemsg);
			return mapping.findForward("operok");
		} catch (Exception e) {
			// TODO: handle exception
			updatemsg="�޸�ʧ�ܣ��������޸�";
			request.setAttribute("updateMsg", updatemsg);
			return mapping.findForward("opererr");
		}
		
	}
	
	public ActionForward deleteStu(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		String s_id=request.getParameter("id");
		int id=Integer.parseInt(s_id);
		String deleteMsg="";
		try {
			studentService.deleteById(id);
			deleteMsg="ɾ���ɹ����뷵��";
			request.setAttribute("deleteMsg", deleteMsg);
			return mapping.findForward("operok");
		} catch (Exception e) {
			// TODO: handle exception
			deleteMsg="ɾ��ʧ�ܣ�������ɾ��";
			request.setAttribute("deleteMsg", deleteMsg);
			return mapping.findForward("opererr");
		}
		
		
	}

}