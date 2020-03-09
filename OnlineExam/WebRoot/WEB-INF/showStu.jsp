<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'showStu.jsp' starting page</title>
  </head>
  
  <body>
  	<h2>
  		<font color="orange">学生列表</font>
  	</h2>
	<table cellpadding="0" cellspacing="0" border="1px">
		<tr><th>学号</th><th>姓名</th><th>班级</th><th>邮箱</th><th>电话</th><th>地址</th><th colspan="2">操作</th></tr>
		<c:forEach items="${studentList }" var="student">
		<tr>
		<td width="100px" height="25px">${student.stuNo }</td>
		<td width="150px" height="25px">${student.stuName }</td>
		<td width="150px" height="25px">${student.className }</td>
		<td width="200px" height="25px">${student.stuMail }</td>
		<td width="100px" height="25px">${student.stuPhone }</td>
		<td width="300px" height="25px">${student.address }</td>
		<td width="50px" height="25px"><a href="${pageContext.request.contextPath }/dealStu.do?flag=toUpdateStu&id=${student.id}">修改</a></td>
		<td width="50px" height="25px"><a href="${pageContext.request.contextPath }/dealStu.do?flag=deleteStu&id=${student.id}">删除</a></td>
		</tr>
		</c:forEach>
		<tr>
				<td colspan="3">
					<form action="${pageContext.request.contextPath}/show.do?flag=showStu" method="post">
						<input type="text" name="size" value="每页显示条数"/>
						<input type="submit" value="确定"/>
					</form>
				</td>
				<td colspan="5" align="center">
					第${pageNo }页　共${studentCounts }页 　
					<a href="${pageContext.request.contextPath }/show.do?flag=showStu&pageNow=1&pageSize=${pageSize}">首页</a>　
									<c:if test="${pageNo>1 }">
					<a href="${pageContext.request.contextPath }/show.do?flag=showStu&pageNow=${pageNo-1}&pageSize=${pageSize}">
					</c:if>
						上一页
					<c:if test="${pageNo>1 }">
					</a>　
					</c:if>
					<c:if test="${pageNo< studentCounts}">
						<a href="${pageContext.request.contextPath }/show.do?flag=showStu&pageNow=${pageNo+1}&pageSize=${pageSize}">
					</c:if>
					下一页
					<c:if test="${pageNo<studentCounts }">
					</a>　
					</c:if>
					<a href="${pageContext.request.contextPath }/show.do?flag=showStu&pageNow=${studentCounts}&pageSize=${pageSize}">尾页</a>　
					<a href="${pageContext.request.contextPath }/dealStu.do?flag=toManager">返回
					</a>　
				</td>
			</tr>
	</table>

  </body>
</html>
