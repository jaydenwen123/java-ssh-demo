<%@page import="com.wen.domain.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	 "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'MyJsp.jsp' starting page</title>
  </head>
  
  <body>
    hellowerfdfdfsd. <br/>
    <% 
    	request.setAttribute("abc", "hello world");
    	application.setAttribute("abc", "helloworld1");
    	pageContext.setAttribute("abc", "hellowrold2");
    	session.setAttribute("abc", "hellowrold3");
     %>
     <%
     	User user=new User();
     	user.setUsername("username");
     	user.setPassword("passowrd");
     	request.setAttribute("user", user);
      %>
    <c:out value="abcdefg"></c:out><br/>
    <c:out value="${abc }" default="no value"></c:out><br />
    <c:out value="${user.username }"></c:out>++<c:out value="${user.password}"></c:out><br />
    <h1>我是文小飞</h1>
    <h2>我是文小飞</h2>
    <h3>我是文小飞</h3>
    <h4>我是文小飞</h4>
    <h5>我是文小飞</h5>
    <h6>我是文小飞</h6>
  </body>
</html>
