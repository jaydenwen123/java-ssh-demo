<%@page import="com.wen.domain.Rat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'c_foreach2.jsp' starting page</title>
  </head>
  
  <body>
    <%
    	Map map=new HashMap();
    	map.put("11", new Rat("123",12));
    	map.put("22", new Rat("345",34));
    	request.setAttribute("nn", map);
    	
    	Set set=new HashSet();
    	set.add(new Rat("123",12));
    	set.add(new Rat("345",34));
    	request.setAttribute("mm", set);
     %>
     <h1>map集合取值</h1>
	<c:forEach items="${nn }" var="temp">
		key=${temp.key}-->value=${temp.value.name }------>age=${temp.value.age } <br/>
	</c:forEach>     
	<h1>set集合取值举例</h1>
	<c:forEach items="${mm }" var="temp">
		${temp.name }---->${temp.age }  <br/>
		</c:forEach>
		<c:if test="${empty nn }">
			<font color="green">没有值</font>
		</c:if>	
		
		<c:if test="${!empty nn }">
			<font color="red">有值</font>
		</c:if>	
		
  </body>
</html>
