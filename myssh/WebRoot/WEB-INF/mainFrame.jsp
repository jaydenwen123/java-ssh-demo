<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'loginok.jsp' starting page</title>
  </head>
  
  <body>
    <h2> 
   	<font color="red">
   	欢迎 ${employeeInfo.name } 您所在的部门为： ${employeeInfo.department.name}
   	</font>
   	</h2>
  		<h2> 请选择您的操作</h2>
    	<a href="${pageContext.request.contextPath }/toAdd.do">添加雇员</a><br/>
    	<a href="${pageContext.request.contextPath }/showEmployee.do?flag=ShowEmployee">显示雇员</a><br/>
    	<a href="###">查询雇员</a><br/>
  		<a href="${pageContext.request.contextPath}/login.do?flag=ExitLogin">退出系统</a><br/>
  </body>
</html>
