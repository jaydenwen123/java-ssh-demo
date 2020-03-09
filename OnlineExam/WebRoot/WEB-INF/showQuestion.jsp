<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'showQuestion.jsp' starting page</title>
 <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
  </head>
  
  <body>
  
  
  <h1>显示试题页面</h1>
	<table cellpadding="0" cellspacing="0" border="1px"  style="text-align: center;">
    	<tr><th>题号</th><th>题目</th><th width="60px;">分值</th><th width="60px;">难度</th><th width="100px">正确答案</th><th width="200px">相关操作</th></tr>
    	<c:forEach items="${questions }" var="question">
    	<tr><td>${question.id }</td><td><a href="${pageContext.request.contextPath }/dealQuestion.do?flag=everyQuestion&id=${question.id}">${question.qutitle }</a></td>
    	<td>${question.quscore }</td><td>${question.quhard }</td>
    	<td>${question.quAnswer }</td>
    	<td>
    	<a href="${pageContext.request.contextPath }/dealQuestion.do?flag=toUpdateQuestion&id=${question.id }">修改</a>
    		<a href="${pageContext.request.contextPath }/dealQuestion.do?flag=deleteQuestion&id=${question.id}">删除</a>
    	</td>
    	</tr>
    	</c:forEach>
		<tr>
				<td colspan="2">
					<form action="${pageContext.request.contextPath}/show.do?flag=showQuestion" method="post">
						<input type="text" name="size" value="每页显示条数"/>
						<input type="submit" value="确定"/>
					</form>
				</td>
				<td colspan="5" align="center">
					第${pageNo }页　共${questionCounts }页 　
					<a href="${pageContext.request.contextPath }/show.do?flag=showQuestion&pageNow=1&pageSize=${pageSize}">首页</a>　
									<c:if test="${pageNo>1 }">
					<a href="${pageContext.request.contextPath }/show.do?flag=showQuestion&pageNow=${pageNo-1}&pageSize=${pageSize}">
					</c:if>
						上一页
					<c:if test="${pageNo>1 }">
					</a>　
					</c:if>
					<c:if test="${pageNo< questionCounts}">
						<a href="${pageContext.request.contextPath }/show.do?flag=showQuestion&pageNow=${pageNo+1}&pageSize=${pageSize}">
					</c:if>
					下一页
					<c:if test="${pageNo<questionCounts }">
					</a>　
					</c:if>
					<a href="${pageContext.request.contextPath }/show.do?flag=showQuestion&pageNow=${questionCounts}&pageSize=${pageSize}">尾页</a>　
					<a href="${pageContext.request.contextPath }/dealQuestion.do?flag=toQuestionManager">返回
					</a>　
				</td>
			</tr>
	</table>
  
  
  </body>
</html>
