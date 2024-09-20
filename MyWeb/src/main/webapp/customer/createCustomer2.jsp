<%@page import="java.util.Arrays"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer File</title>
<link href="<%= request.getContextPath() %>/style/MyStyle.css" rel="stylesheet"></link>
</head>
<body>	
	<h2>Customer File</h2>
	<%--Start Error Report--%>
	<% LinkedList<String> errors = (LinkedList<String>)request.getAttribute("errors"); %>
	<% if (errors != null){ %>
		<ul style="color: red; font-size: 0.8em">
			<table border="0" style="margin: auto; text-align: Left">
				<% for (String error : errors){ %>
					<tr><td><li><%= error %></li><td></tr>
				<% } %>
			</table>
		</ul>
	<% } %>
	
	
	<form action="createCustomer.do" method="post">
		<input type="hidden" name="action" value="cc2">
		<table border="0" style="margin: auto; text-align: Left">
			<tr>
				<td>生日</td><td><input type="date" name="birth" value="${ param.birth }"></td>
			</tr>
			<tr>
				<td>性別</td>
				<td>
					<% 
					String isMale = "";
					String isFemale = "";
					String gender = request.getParameter("gender");
					if (gender != null){
						if (gender.equals("male")){
							isMale = "checked";
						}else{
							isFemale = "checked";
						}
					}
					%>
					<input type="radio" name="gender" value="female" <%= isFemale %>>女
					<input type="radio" name="gender" value="male" <%= isMale %>>男
				</td>
			</tr>
			<tr>
				<td>嗜好</td>
				<td>
					<% 
					String musicSelected = "";
					String shoppingSelected = "";
					String readingSelected = "";
					String[] habit = request.getParameterValues("habit");
					if (habit != null){
						for (String h : habit){
							if (h.equals("music")){
								musicSelected = "checked";
							}
							else if (h.equals("shopping")){
								shoppingSelected = "checked";
							}
							else if (h.equals("reading")){
								readingSelected = "checked";
							}
						}
					}
					%>
					<input type="checkbox" name="habit" value="music" <%= musicSelected %>>聽音樂
					<input type="checkbox" name="habit" value="shopping" <%= shoppingSelected %>>逛大街
					<input type="checkbox" name="habit" value="reading" <%= readingSelected %>>讀好書
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="reset" value="重設">
					<input type="submit" value="新增">
				</td>
			</tr>
		</table>
	</form>
	<a href="../">Home</a>
</body>
</html>