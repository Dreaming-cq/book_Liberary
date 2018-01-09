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
    
    <title>My JSP 'borrow_list.jsp' starting page</title>
    
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
    <td >编号</td>
    <td >名称</td>
    <td>作者</td>
    <td>出版设</td>
    <td>出版日期</td>
    <td>借书时间</td>
    <td>还书时间</td>
  </tr>
  <c:forEach items="${borrow_info}" var="book">
   <tr>
    <td ><c:out value="${book.book_id }"></c:out></td>
    <td><c:out value="${book.book_name }"></c:out></td>
    <td><c:out value="${book.book_author }"></c:out></td>
    <td><c:out value="${book.book_press }"></c:out></td>
    <td class="back"><c:out value="${book.book_date }"></c:out></td>
    <td class="back"><c:out value="${book.borrow_date }"></c:out></td>
    <td class="back"><c:out value="${book.return_date}"></c:out></td>
  </tr>
  </c:forEach>
  </table>
  </body>
</html>
