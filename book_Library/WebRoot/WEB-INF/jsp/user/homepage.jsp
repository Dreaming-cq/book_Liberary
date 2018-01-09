<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'homepage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
html,body{
    margin:0px;
    height:100%;
}
.log
{
	height: 500px;
	width: 400px;
	position: absolute;
	top: 20%;
	left: 10%;
	background: url(/upload/log11.png) center center no-repeat;
}

.mainframe
{
	position:absolute;
	top:10%;
	bottom:10%;
	height:80%;
	width:100%;
	background: url(/upload/301041.jpg) center center;
	
}
</style>
</head>

<body>
<div class="mainframe">
<div class="log" align="center">

</div>

<div class="login-info">
</div>
</div>
</body>
</html>