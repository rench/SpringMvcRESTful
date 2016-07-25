<%@page import="com.lowang.book.model.MoliBookInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>moliBook</title>
</head>
<body>
	<% MoliBookInfo bookinfo = (MoliBookInfo)request.getAttribute("molibookinfo"); %>
	bookid:<%=bookinfo.getBookid() %>
	bookname:<%=bookinfo.getBookname()%>
	bookpage:<%=bookinfo.getBookpage()%>
	bookprice:<%=bookinfo.getBookprice()%>
</body>
</html>