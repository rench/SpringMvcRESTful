<%@page import="com.lowang.order.model.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here laownag love moli</title>
</head>
<body>
	haha tody is sunday <%=request.getAttribute("time") %><br/>
	<% UserInfo user = (UserInfo)request.getAttribute("userinfo"); %>
	moli:<%=user.getUsername() %>
	moli:<%=user.getPassword()%>
</body>
</html>