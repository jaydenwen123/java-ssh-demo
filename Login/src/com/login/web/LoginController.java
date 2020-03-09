package com.login.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class LoginController extends  AbstractController
{
	private String successView;
	private String failView;
	@Override
	protected  ModelAndView handleRequestInternal(HttpServletRequest request, 
			HttpServletResponse response) throws  Exception
	{
		
		String  userId=request.getParameter("userId");
		String  password=request.getParameter("password");
		Login login= getLogin(userId,password);
		Map<String,Object> model=new HashMap<String ,Object>();
		if(login !=null)
			
		{
			model.put("login", login);
			return  new ModelAndView(this.getSuccessView(),model);
		}
		else
		{
			model.put("error", "用户名或密码输入错误！");
			return  new ModelAndView(this.getFailView(),model);
		}
	}
	
	public String getSuccessView() {
		return successView;
	}

	public void setSuccessView(String successView) {
		this.successView = successView;
	}

	public String getFailView() {
		return failView;
	}

	public void setFailView(String failView) {
		this.failView = failView;
	}

	public Login getLogin(String userId,String password)
	{
		if(userId.equals("www") && password.equals("111"))
		{
			Login login =new Login();
			login.setUserId(userId);
			login.setPassword("密码不能告诉别人哦");
			login.setSalary(10000);
			return login;
		}
		else
		{
			return null;
		}
		
	}
}
