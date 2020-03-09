<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'AddFrame.jsp' starting page</title>
  </head>
  
  <body>
	<form action="${pageContext.request.contextPath }/deptAction.do?flag=DeptUpdate" method="post">
		<table>
			<caption align="top" >修改部门界面</caption>
			<tr><td>部门名称</td> <td><input type="text" name="deptName" value="${dept.deptName }"/></td></tr>
			<tr><td>部门描述</td> <td><input type="text" name="description" value="${dept.description }"/></td></tr>
			<tr><td><input type="submit" value="修改"/></td><td><input type="reset" value="取消"/></td>
				<td><a href="${pageContext.request.contextPath }/deptAction.do?flag=DeptList">返回</a></td>
			</tr>
		</table>
	</form>
  </body>
</html>
