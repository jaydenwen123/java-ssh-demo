<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title>My JSP 'exam.jsp' starting page</title>
    
  </head>
  
  <body>
    <h2 style="color: orange;">欢迎${student.stuName }同学前来参加考试，考试时间为120分钟， 
    	倒计时已经开始，请速速答卷</h2>
    	<span id="showTime"></span>
     <script type="text/javascript" language="javascript">
    	<!--
    	function  getCurrentTime(){
    		var currentDate=new Date().toLocaleString();
    		showTime.innerText="当前时间"+currentDate;
    	}
    	setInterval("getCurrentTime()", 1000);
    	function clerify (){
    		window.confirm("还有十分钟就到时间了，请仔细检查一下");
    	}
    	setTimeout("clerify()",6*1000);
    	//-->	
    </script>
    
    
    <!-- <form method="post" action="###"> -->
   		<table>
   		<c:forEach items="${questionList }" var="question">
   			<tr><td>(<span style="color:red;">${question.score}分</span>，难度系数<span style="color: red;">${question.hard}</span>)
   				<span style="color:orange;"><span style="color: green;">第${question.quNo }题</span>.${question.qutitle }</span></td></tr>
   			<tr><td>A.${question.optionA }</td></tr>
   			<tr><td>B.${question.optionB }</td></tr>
   			<tr><td>C.${question.optionC }</td></tr>
   			<tr><td>D.${question.optionD }</td></tr>
   			<tr><td><input type="hidden" value="${question.answer}" name="${question.quNo }" id="${question.quNo }"/></td></tr>
   			<tr>
   				<td>答案：
   					A<input  type="radio" name="selectAnswer${question.quNo }"  value="A" onclick="test(this)"/>
   					B<input  type="radio" name="selectAnswer${question.quNo }" value="B" onclick="test(this)"/>
   					C<input  type="radio" name="selectAnswer${question.quNo }" value=C onclick="test(this)"/>
   					D<input  type="radio" name="selectAnswer${question.quNo }" value="D" onclick="test(this)"/>
   				</td>
   			</tr>
   			</c:forEach>
   		</table> 
   		<input type="button" value="提交答卷" onclick="return showScore();"/>
    <!-- </form> -->
     <script type="text/javascript" language="javascript">
    	var selects=document.getElementsByTagName("input");
    	//window.alert(selects.length);
    	var answers=new Array();
    	//window.alert(answers.length);
    	for(var i=0;i<20;i++){
    		answers[i]=selects[i*5];
    	}
    	//取得了全部的正确答案answers
    	/* for(var key in answers){
    		window.alert(answers[key].value);
    	}  */
    	
    	//var answer=document.getElementById("${question.quNo}");
    	//window.alert(answer.value);
    	
    	
    	
    	//获取到全部选择的答案，selectAnswers
    	var selectAnswers=new Array();
    	function test(obj){
    		//window.alert(obj.value);
    		//selectAnswers.push(obj.value);
    		var i=obj.name.substring(obj.name.length-2,obj.name.length);
    		if(isNaN(i)){
    		var j=i.substring(1,2);
    		selectAnswers[j-1]=obj.value;
    		}else
    		{
    			selectAnswers[i-1]=obj.value;
    		}
    	}
    	
    	function showScore(){
				var Yes_No=window.confirm("确定要提交吗，提交后可以直接可以看到自己的成绩");
	    		if(Yes_No){
		    		var counts=0;
			    	for(var i=0;i<selectAnswers.length;i++){
			    	//window.alert("standard answer:"+answers[i].value);
			    	//window.alert("seledct answer :"+selectAnswers[i]);
			    		if(answers[i].value==selectAnswers[i]){
			    			counts++;
			    		}
			    	}
			    	window.alert("你的分数是："+counts*5+"分.\r\n"+"答对了"+counts+"道题");
	    			return Yes_No;
	    		}else {
	    					return  Yes_No;
	    		}
	    		
    	}
    </script>
  </body>
</html>
