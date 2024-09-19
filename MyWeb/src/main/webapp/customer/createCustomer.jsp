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
	<form action="../admin/Dump.view" method="post">
		<table border="0" style="margin: auto; text-align: Left">
			<tr>
				<td>姓名</td><td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>電子郵件</td><td><input type="text" name="mail"></td>
			</tr>
			<tr>
				<td>電話</td><td><input type="text" name="telephone"></td>
			</tr>
			<tr>
				<td>地址</td><td><input type="text" name="address" size=60></td>
			</tr>
			<tr>
				<td>生日</td><td><input type="date" name="birth"></td>
			</tr>
			<tr>
				<td>性別</td>
				<td>
					<input type="radio" name="gender" value="female">女
					<input type="radio" name="gender" value="male">男
				</td>
			</tr>
			<tr>
				<td>嗜好</td>
				<td>
					<input type="checkbox" name="habit" value="music">聽音樂
					<input type="checkbox" name="habit" value="shopping">逛大街
					<input type="checkbox" name="habit" value="reading">讀好書
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