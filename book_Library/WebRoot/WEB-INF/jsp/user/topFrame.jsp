<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'topFrame.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
*{margin:0; padding:0; font-size:14px;}
a{color:#333;text-decoration:none; font-family:"楷体"; font-weight:bold; font-size:18px}
.nav{list-style:none; height:30px; border-bottom:10px solid #F60; margin-top:80px; padding-left:25%;}
.nav li{float:left}
.nav li a{display:block; height:30px;text-align:center; line-height:30px; width:80px; background:#efefef; margin-left:1px;}
.nav li a.on, .nav li a:hover{background:#F60;color:#fff; }
</style>
</head>
<body>
<ul class="nav">
    <li><a class="on" href="homepage" target="mainFrame">首　　页</a></li>
    <li><a href="user/find" target="mainFrame">图书信息</a></li>
    <li><a href="borrow/user" target="mainFrame">借阅信息</a></li>
    <li><a href="myself/user" target="mainFrame">我的信息</a></li>
    <li><a href="" target="mainFrame">联系我们</a></li>
  </ul>
</body>
</html>