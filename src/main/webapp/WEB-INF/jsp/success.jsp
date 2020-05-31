<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>登录成功</h1>

<table border="1">
		<tr>
			<th>用户名</th>
			<th>年龄</th>
			<th>生日</th>
			<th>性别</th>
		</tr>
		<tr>
			<td>${user.name }</td>
			<td>${user.age }</td>
			<td>${user.birthday }</td>
			<td>${user.sex }</td>
		</tr>
	</table>

</body>
</html>