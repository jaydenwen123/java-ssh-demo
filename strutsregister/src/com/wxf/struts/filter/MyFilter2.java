package com.wxf.struts.filter;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class MyFilter2 extends HttpServlet implements Filter {

	private String []keywords;
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String username=arg0.getParameter("username");
		String userid=arg0.getParameter("userid");
		String email=arg0.getParameter("email");
		System.out.println("第二个过滤器：拦截的名字为："+username+","+userid+","+email);
		arg0.setAttribute("name", username);
		if(username!=null){
			for(String name:keywords){
				if(username.equals(name)){
					arg0.getRequestDispatcher("/WEB-INF/error1.jsp").forward(arg0, arg1);
					return ;
				}
			}
		}
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		keywords=arg0.getInitParameter("keywords").split(";");
	}

}
