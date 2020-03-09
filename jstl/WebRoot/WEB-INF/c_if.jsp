<%@page import="com.wen.domain.Rat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'c_if.jsp' starting page</title>
  </head>
  
  <body> 
	<h1>c:if标签的使用</h1>
	<h1>判断字符串</h1>
	<%
		request.setAttribute("ab", "wenxiaofei");
		request.setAttribute("a", "12");
	 %>
	 <c:if test="${ab=='wenxiaofei'}">
		123
	</c:if>
	<c:if test="${ab!='wenxiaof' }">
		不等于文小飞
	</c:if>
	<h1>判断数字</h1>
	<c:if test="${a<34 }">
		${a }值小于34
	</c:if>
	
	<h1>对对象的判断</h1>
	<%
		Rat rat=new Rat();
		rat.setAge(12);
		rat.setName("老鼠");
		request.setAttribute("rat", rat);
	 %>
	<c:if test="${rat.age<1 or rat.age>13 }">
		${rat.name } 的年龄为：${rat.age}  
	</c:if>
	<c:if test="${rat.age>1 and rat.age<13 }">
		${rat.name } 的年龄为：${rat.age}  符合区间
	</c:if>
  </body>
</html>
