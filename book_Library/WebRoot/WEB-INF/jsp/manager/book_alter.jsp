<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'book_alter.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
body{ 
	background:#f8f8f8;
	font:13px Trebuchet MS, Arial, Helvetica, Sans-Serif;
	color:#333;
	line-height:160%;
	margin:0;
	padding:0;
	text-align:center;
	}

#container{	
	margin:0 auto;
	background:#fff;
	width:600px;
	padding:20px 40px;
	text-align:left;
	}		
#form1{
	margin:1em 0;
	padding-top:10px;
	background: url(/upload/form_top.gif) no-repeat 0 0;
	}
#form1 fieldset{
	margin:0;
	padding:0;
	border:none;	
	float:left;
	display:inline;
	width:260px;
	margin-left:25px;
	}		
#form1 legend{display:none;}	
#form1 p{margin:.5em 0;}	
#form1 label{display:block;}	
#form1 input, #form1 textarea{		
	width:252px;
	border:1px solid #ddd;
	background:#fff  url(/upload/form_input.gif) repeat-x;
	padding:3px;
	}		
#form1 textarea{
	height:400px;
	width:500px;
	overflow:auto;
	}					
#form1 p.submit{
	clear:both;
	background: url(/upload/form_bottom.gif) no-repeat 0 100%;
	padding:0 25px 20px 25px;
	margin:0;
	text-align:right;
	}	
#form1 button{
	width:150px;
	height:37px;
	line-height:37px;		
	border:none;
	background: url(/upload/form_button.gif) no-repeat 0 0;
	color:#fff;
	cursor:pointer;
	text-align:center;
	}
</style>
</head>

<body>
<div id="container">
<c:forEach items="${alter}" var="book">
<form id="form1" action="alter/manager" method="post" >	
<fieldset><legend>Contact form</legend>
		<p class="first">
			<label for="name">编号：</label>
			<input type="text" name="book_id" value="${book.book_id }"/>
		</p>
		<p>
			<label for="Name">书名:</label>
			<input type="text" name="book_name" value="${book.book_name}"/>
		</p>
		<p>
			<label >作者:</label>
			<input type="text" name="book_author" value="${book.book_author}" />
		</p>
		<p>
			<label >出版社:</label>
			<input type="text" name="book_press" value="${book.book_press }" />
		</p>	
		<p>
			<label >出版日期:</label>
			<input type="text" name="book_date" value="${date}"/>
		</p>
	</fieldset>
	<p class="submit"><button type="submit">确定</button></p>
</form>
</c:forEach>
</div>
</body>
</html>
