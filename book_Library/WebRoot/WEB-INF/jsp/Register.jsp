<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书管理系统</title>
    
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
	height: 600px;
	width: 400px;
	position: absolute;
	top: 10%;
	left: 10%;
	background: url(/upload/log11.png) center center no-repeat;
}
.login {
	background-color: #f5f8fb;
	height: 600px;
	width: 400px;
	position: absolute;
	top: 10%;
	right: 10%;
	filter:alpha(opacity=80);-moz-opacity:0.8; opacity:0.8;

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
.login-info{
	width:380px; 
	height:35px;
	margin-left:auto;
	margin-right:auto; 
	background:#ffffff;
	border: 2px solid #f0f7fb;
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	border-radius: 5px; 
	margin-top:20px;
}
.login-info span.user{
	float:left;
	width:65px; 
	height:30px;
	margin:5px auto 5px auto; 
	background: url(/upload/icon-user.gif) no-repeat center center; 
	border-right:1px solid #a9a9a9
}
.login-info span.pwd{
	float:left;
	width:65px; 
	height:30px;
	margin:5px auto 5px auto; 
	background: url(/upload/icon-pwd.png) no-repeat center center; 
	border-right:1px solid #a9a9a9
}
.login-input{
	width:300px; 
	height:30px;
	line-height:40px;
	background:#ffffff;
	border:none;
	margin:0;
	padding:0;
	padding-left:20px;
}
.login-oper{
	width:400px; 
	height:40px;
	line-height:40px;
	margin-left:auto;
	margin-right:auto; 
	margin-top:20px;
}
.login-btn{
	width:170px;
	height:30px;
	border:none;
	background:#056daa;
	color:#ffffff;
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	border-radius: 5px;
	margin-right:5px;
}
.login-reset{
	width:170px;
	height:30px;
	border:none;
	background:#7c7777;
	color:#ffffff;
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	border-radius: 5px;
}

</style>
</head>

<body>
<div class="mainframe">
<div class="log">

</div>
<div class="login">
<div class="login-info">
<h3 style=" font-family:'楷体'; font-size:30px; margin-top:10px; margin-left:35%">注册 界面</h3>
</div>
<form action="register/user" method="post" id="login-form" name="login-form">
    <div class="login-info">
<span class="user">&nbsp;</span>
	<input name="username" id="username" type="text" class="login-input"/>
	</div>
    <div class="login-info">
	<span class="pwd">&nbsp;</span>
	<input name="password" id="password" type="password"  class="login-input"/>
	</div>
    
    <div class="login-info">
   Realname:
     <input name="realname"  type="text" class="login-input" />
    </div> 
   <div class="login-info">
   Telephone:<input name="telephone" type="text" class="login-input"/>
   </div>
    <div class="login-info">
   &nbsp; &nbsp;&nbsp;IDCard:<input name="idcard"type="text" class="login-input"/>
   </div>
     <div  align="center" class="login-oper">
	<input name="type" type="radio" value="consumer" checked="checked" />用户
    <input name="type" type="radio" value="manager"  />管理员
	</div>
   <div  align="center" class="login-info">
   <input name="sex" type="radio" value="boy" checked="checked" />男 
    <input name="sex" type="radio" value="girl"  />女
   </div>
  	<div class="login-oper" align="center">
	<input type="submit" value="注 册" class="login-btn"/>
	
	</div>
    <div class="login-info" style="text-align:right">
    <a href="toLogin" style="text-decoration:none; font-weight:500">&lt;返&nbsp;回&gt;</a>
    </div>
    </form>
  </div>
</div>
</body>
</html>