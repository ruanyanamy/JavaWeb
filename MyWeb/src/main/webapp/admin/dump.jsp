<%@page import="java.util.Date"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dump JSP</title>
<link href="<%= request.getContextPath() %>/style/MyStyle.css" rel="stylesheet"></link>
</head>
<body>
	<h2>Dump JSP</h2>
	<a href="../">Home</a><br/>
	<%= session.isNew() %><br/>
	<%= session.getId() %><br/>
	<%= new Date(session.getLastAccessedTime()) %><br/>
	<%= new Date(session.getCreationTime()) %><br/>
	<%= session.getMaxInactiveInterval() %><br/>
	<img src="../image/link.jpg" width="20%"><br/>
	<table border="1" style="margin: auto; border-collapse: collapse;">
		<tbody>
			<% for (int i=1;i<10;i++){ %>
				<tr>
				<% for (int j=1;j<10;j++){ %>
					<td><%= i %>*<%= j %>=</td><td><%= i*j %></td>
				<% } %>
				</tr>
			<% } %>
		</tbody>
	</table>
	<br/>
	<% Enumeration<String> headerNames = request.getHeaderNames(); %>
	<table border="1" style="margin: auto; border-collapse: collapse; text-align: center">
		<thead>
			<tr><th>HeaderName</th><th>HeaderValue</th></tr>
		</thead>
		<tbody>
			<% while (headerNames.hasMoreElements()){
				String headername = headerNames.nextElement();
				String headervalue = request.getHeader(headername);
				out.println("<tr><td>"+headername+"</td><td>"+headervalue+"</td></tr>");
			}
			%>
		</tbody>
	</table>
	<% session.invalidate(); %>
</body>
</html>