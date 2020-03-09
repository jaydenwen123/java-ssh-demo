<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'mainFrame.jsp' starting page</title>
  </head>
  <body>
  	<center  style="font-size: 20px;color: blue;">超市管理系统</center>
	<table>
		 <tr>
		 	<td><a href="${pageContext.request.contextPath }/deptAction.do?flag=DeptList">部门管理  </a></td>
		 </tr>
		 
		 <tr>
		 	<td><a href="${pageContext.request.contextPath }/">收入管理  </a></td>
		 </tr>
		 <tr>
		 	<td><a href="">供应商管理  </a></td>
		 </tr>
		 <tr>
		 	<td><a href="">账单管理  </a></td>
		 </tr>
		 <tr>
		 	<td><a href="">账单支付  </a></td>
		 </tr>
		 <tr>
		 	<td><a href="">备份  </a></td>
		 </tr>
	</table>
  </body>
</html>
