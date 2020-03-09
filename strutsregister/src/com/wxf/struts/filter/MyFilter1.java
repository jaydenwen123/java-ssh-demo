package com.wxf.struts.filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class MyFilter1 extends HttpServlet implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6803388080076036122L;
	
	private String encoding="";

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String username=arg0.getParameter("username");
		String userid=arg0.getParameter("userid");
		String email=arg0.getParameter("email");
		System.out.println("第二个过滤器：拦截的名字为："+username+","+userid+","+email);
		arg0.setCharacterEncoding(encoding);
		System.out.println("第一个拦截器，用来处理中文乱码:");
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		encoding=arg0.getInitParameter("encoding");
	}
}
