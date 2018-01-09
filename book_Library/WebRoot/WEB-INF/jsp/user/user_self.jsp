<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user_self.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <div >
  <c:forEach items="${self}" var="me">
  ----姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：<c:out value="${me.username }"></c:out><br/>
  ----密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<c:out value="${me.password}"></c:out><br/>
  ----真实姓名：<c:out value="${me.realname }"></c:out><br/>
  ----电话号码：<c:out value="${me.telephone }"></c:out><br/>
  ----性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别：<c:out value="${me.sex}"></c:out><br/>
  ----身份证号：<c:out value="${me.idCard}"></c:out><br/>
  
  </c:forEach>
  </div>
  
  </body>
</html>
