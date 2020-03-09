<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'regTeacher.jsp' starting page</title>
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath }/regTeacher.do?flag=register" method="post">
    
    	<table>
    		<tr><td>用户名</td> <td><input type="text" name="username"/></td></tr>
    		<tr><td>密 码</td> <td><input type="password" name="password"/></td></tr>
    		<tr><td><input type="submit" value="注册"/></td> <td><input type="reset" value="取消"/></td>
    		
    		<td><a href="${pageContext.request.contextPath }/">返回</a></td></rs></tr>
    	</table>
    		${regMsg }<br/>
    
    </form>
  </body>
</html>
