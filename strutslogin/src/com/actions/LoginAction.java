package com.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.domain.Users;
import com.forms.UserForm;
import com.service.UserService;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UserForm userForm=(UserForm) form;
		Users user=new Users();
		user.setUsername(userForm.getUsername());
		user.setPassword(userForm.getPassword());
		UserService userService=new UserService();
		if(userService.check(user)!=null){
			return mapping.findForward("ok");
		}else {
			return mapping.findForward("err");
		}
		// TODO Auto-generated method stub
//		UserForm userForm=(UserForm) form;
//		System.out.println(userForm.getPassword());
//		request.setAttribute("username", userForm.getUsername());
/*		if("123".equals(userForm.getPassword())){
			return  mapping.findForward("ok");
		}else {
			return mapping.findForward("err");
		}*/
	}

}
