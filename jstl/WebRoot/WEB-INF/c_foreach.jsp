<%@page import="com.wen.domain.Rat"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'MyJsp.jsp' starting page</title>
  </head>
  
  <body>
  	<%
  		Rat  rat1=new Rat();
  		rat1.setName("name1");
  		rat1.setAge(2);
  		Rat  rat2=new Rat();
  		rat2.setName("name2");
  		rat2.setAge(4);
  		Rat  rat3=new Rat();
  		rat3.setName("name3");
  		rat3.setAge(6);
  		List<Rat> list=new ArrayList<Rat> ();
  		list.add(rat1);
  		list.add(rat2);
  		list.add(rat3);
  		request.setAttribute("allrats", list);
  		request.setAttribute("rat", new Rat());
  	 %>
  	 <h1>
  	 	<font color="red">常规方法</font>
  	 </h1>
  	 <%
  	 	List<Rat> list1=(List<Rat>)request.getAttribute("allrats");
  	 	for(Rat r:list1){
  	 		out.println(r.getName()+","+r.getAge());
  	 	}
  	  %>
  	<h1>
  		<font color="blue">
  			采用foreach标签 
  		</font>
  	</h1>
	
	<c:forEach items="${allrats}" var="rat">
		<c:out value="${rat.name}"></c:out><br/>
		<c:out value="${rat.age}"></c:out><br/>
	</c:forEach>
	<h1>
		<font color="green">
			迭代标签的使用1
		</font>
	</h1>
	<c:forEach var="i" begin="1" end="10">
	
		<c:out value="${i }"></c:out>-->
	</c:forEach>
	<h1>
		<font color="green">
			迭代标签的使用2
		</font>
	</h1>
	
	<c:forEach var="i"  begin="1" end="10" step="2">
		<c:out value="${i}"></c:out>
	</c:forEach>
  </body>
</html>
