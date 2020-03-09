<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'showEmpl2.jsp' starting page</title>
  </head>
  
  <body>
    <table>
  		<tr><td>name</td><td>id</td><td>salary</td><td>department</td></tr>
  		<c:forEach items="${employees }" var="employee">
  			<tr><td>${employee.name}</td><td>${employee.id }</td><td>${employee.salary}</td>
  				<td>${employee.department.name }</td></tr>
  		</c:forEach>
  		</table>
  		<c:forEach var="i" begin="1" end="${pageCount }">
  			<a href="${pageContext.servletContext.contextPath}/showEmployee.do?flag=ShowEmployee&page=${i}">第${i}页</a>
  		</c:forEach>
  		<a href="${pageContext.request.contextPath }/login.do?flag=returnMainFrame">返回主界面</a>
  </body>
</html>
