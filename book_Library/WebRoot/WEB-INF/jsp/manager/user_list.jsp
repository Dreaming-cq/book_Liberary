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
    
    <title>My JSP 'user_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
table {
	position: absolute;
	height: auto;
	width: 1000px;
	text-align: center;
	border-top-color: #CF0;
	border-right-color: #CF0;
	border-bottom-color: #CF0;
	border-left-color: #CF0;
}

td
{
	font-family: "楷体";
	font-style: normal;
	color: #000;
	text-align: left;
	height: 35px;
	width: 150px;
}
.back {
	background-color: #FCF;
}
</style>
  </head>
  
  <body>
  <table width="600" border="1">
  <tr>
    <td >用户名</td>
    <td >密码</td>
    <td>姓名</td>
    <td>电话</td>
    <td>性别</td>
    <td>身份证</td>
    <td>操作</td>
  </tr>
  <c:forEach items="${users}" var="user">
 <tr>
    <td ><c:out value="${user.username }"></c:out></td>
    <td><c:out value="${user.password }"></c:out></td>
    <td><c:out value="${user.realname }"></c:out></td>
    <td><c:out value="${user.telephone }"></c:out></td>
    <td ><c:out value="${user.sex}"></c:out></td>
    <td><c:out value="${user.idCard }"></c:out></td>
    <td><a href="${user.username }/delete">删除</a></td>
  </tr>
  </c:forEach>
  </table>
    
  </body>
</html>