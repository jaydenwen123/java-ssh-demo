<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'addEmpl.jsp' starting page</title>
  </head>
  
  <body>
  	<h2>
  	<font color="green"> 
  		添加雇员界面     <a href="${pageContext.request.contextPath}/login.do?flag=returnMainFrame">返回主界面</a>
  	</font>
  	</h2> 
    <form action="/myssh/showEmployee.do?flag=AddEmployee" method="post">
    <table>
    	<tr><td>雇员名字：</td><td> <input type="text" name="name"/> </td></tr>
    	<tr><td>密码：</td><td> <input  type="text" name="password"/> </td></tr>
    	<tr><td>入职日期：</td><td> <input type="text" name="hireDate"/> </td><td>日期格式为：yyyy-MM-dd</td></tr>
    	<tr><td>邮箱：</td><td> <input type="text" name="email"/> </td></tr>
    	<tr><td>薪水:</td><td> <input type="text" name="salary" /> </td></tr>
    	<tr><td>等级:</td><td> <input type="text" name="grade"/> </td></tr>
    	<tr><td>部门：</td><td>
    	
    	<select  name="deptId">
    	 	<c:forEach items="${department}" var="dept">
    	 	<option value="${dept.id}">${dept.name}</option>
    	 	</c:forEach>
    	 </select>
    	 
    	 </td></tr>
    	<tr><td><input type="submit" value="添加	"/></td><td> <input type="reset" value="重置" /></td></tr>
    </table>
    </form>
  </body>
</html>
