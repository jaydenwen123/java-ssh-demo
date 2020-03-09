package com.wxf.struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.wxf.domain.User;
import com.wxf.struts.form.Register;

public class LoginAndRegisterAction extends BaseDispatchAction {
	
	public ActionForward Login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		Register loginForm=(Register) form;
		String username=loginForm.getUsername();
		String password=loginForm.getPassword();
		User user=messageManager.ValidLogin(username, password);
		if(user!=null){
			request.getSession().setAttribute("user", user);
			return mapping.findForward("success");
		}else {
			request.setAttribute("errMsg", "用户名或者密码不对，请重新登录");
			return mapping.findForward("toback");
		}
	}
	public ActionForward Register(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		Register register=(com.wxf.struts.form.Register) form;
		User user=new User();
		user.setUsername(register.getUsername());
		System.out.println(register.getUsername());
		user.setPassword(register.getPassword());
		user.setEmail(register.getEmail());
		try {
			messageManager.registerUser(user);
			request.setAttribute("registerok", "注册成功，请登录");
			return mapping.findForward("toback");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("reqistererr", "注册失败，请重新注册");
			return mapping.findForward("registererr");
		}
	}
	public ActionForward ToRegister(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		return mapping.findForward("toregister");
	}
	public ActionForward Exit(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		request.getSession().invalidate();
		return mapping.findForward("toback");
	}
	public ActionForward ToMainFrame(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		if(request.getSession().getAttribute("user")!=null){
			return mapping.findForward("success");
		}else {
			return mapping.findForward("error");
		}
		
	}
}
