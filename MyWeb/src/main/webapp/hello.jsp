<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error/error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! int a = 100; %>
	<% int a = 500; %>
	a = <%= a/0 %><br/>
	Current Time is : <%= SimpleDateFormat.getInstance().format(new Date()) %>
	<!-- Html Comment -->
	<%// Java single line comment %>
	<%-- JSP Comment --%><br/>
	User-Agent1: <%= request.getHeader("User-Agent") %><br/>
	User-Agent2: <% out.println(request.getHeader("User-Agent")); %><br/>
	<!-- Extension Language(EL)的語法 -->
	<!-- User-Agent3的會變成[header.User]減掉[Agent]所以等於0 -->
	User-Agent3: ${ header.User-Agent }<br/>
	User-Agent4: ${ header["User-Agent"] }<br/>
	User-Agent5: \${ header["User-Agent"] } => ${ header["User-Agent"] }<br/>
</body>
</html>