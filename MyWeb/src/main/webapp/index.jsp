<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link href="style/MyStyle.css" rel="stylesheet"></link>
</head>
<body>
	<h1>Welcome To my Java EE Playground!!</h1>
	<p>Current Time is : <%= SimpleDateFormat.getInstance().format(new Date()) %> </p>
	<p><a href="admin/hello.aspx">Hello Servlet</a></p>
	<p><a href="admin/Dump.view">Hello Dump</a></p>
	<p><a href="customer/createCustomer.jsp">Create Customer</a></p>
</body>
</html>