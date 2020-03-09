<%@page import="com.wxf.domain.Cat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'bean.jsp' starting page</title>
  </head>
  
  <body>
  <%
  	//request.setAttribute("abc", "hello");
  	Cat cat1=new Cat();
  	cat1.setName("cat1");
  	cat1.setAge(12);
  	request.setAttribute("cat1", cat1);
   %>
  <h1>
  	<font color="red">
  		jstl的c:out标签和struts的bean：write标签比较
  	</font>
  </h1>
  <h2>jstl的c:out标签</h2>
   <c:out value="${cat1.name}" ></c:out>
   ${cat1.age }<br/>
   <c:out value="${abc }" default="no value"></c:out>
  <h2>struts的bean：write标签</h2>
  	<bean:write name="cat1" property="name"/><br/>
  	<bean:write name="cat1" property="age"/><br/>
  <h2>struts的bean：message标签</h2>
  <bean:message key="key1" arg0="noone"/><br/>
  <bean:message key="key2" arg1="文小飞"/>
  </body>
</html>
