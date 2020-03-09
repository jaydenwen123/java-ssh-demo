<%@page import="com.wen.domain.Rat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'c_choose.jsp' starting page</title>
  </head>
  
  <body> 
  
  <%
  	Rat rat=new Rat();
  	rat.setAge(0);
  	request.setAttribute("rat", rat);
  	   %>
	<c:choose>
		<c:when test="${rat.age<1 }">
			<font color="red">老鼠太小，不能吃</font>
		</c:when>
		<c:when test="${rat.age>1 &&  rat.age<12}">
			<font color="blue">老鼠很好吃</font>
		</c:when>
		<c:otherwise>
			<font color="green">老鼠太老，不好吃</font>
		</c:otherwise>
	</c:choose>
  </body>
</html>
