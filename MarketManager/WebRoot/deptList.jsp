<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'deptList.jsp' starting page</title>
  </head>
  
  <body>
  <center>
  	<font color="green" size="10px" >部门列表</font>
  </center><br/><br/><br/>
  <table border=1 cellspacing="0px" cellpadding="0px" align="center">
  	<tr ><th>部门</th><th>描述</th><th>操作</th></tr>
     <c:forEach items="${deptList }" var="dept">
     	<tr >
     	<td width="100px" height="30px" align="center">${dept.deptName }</td>
     	<td width="400px"height="30px">${dept.description }</td>
     	<td width="100px"height="30px" align="center">
    	<a href="${pageContext.request.contextPath }/deptAction.do?flag=ToUpdateFrame&id=${dept.id}">修改</a>
        <a href="${pageContext.request.contextPath }/deptAction.do?flag=DeptDelete&id=${dept.id}">删除</a>
     	</td>
     	</tr>
     </c:forEach>
     <tr >
     <td align="center"> 
     	 <a href="${pageContext.request.contextPath }/deptAction.do?flag=ToAddFrame">新增部门</a>
     </td>
     
     <td>
     <c:forEach begin="1" end="${counts}" var="i">	
     	<a href="${pageContext.request.contextPath }/deptAction.do?flag=DeptList&pageNow=${i}"><${i}></a>
     </c:forEach> 
     </td>
     
      <td align="center">
    	 <a href="${pageContext.request.contextPath }/loginAndOut.do?flag=ToReturn">返回</a>
  	  </td>
     </tr>
   </table> 
  </body>
</html>
