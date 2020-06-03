<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="js/lib/jquery-3.4.1.min.js"
	charset="UTF-8"></script>

<script src="//apps.bdimg.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script type="text/javascript" src="js/index.js" charset="UTF-8"></script>
<title>Insert title here</title>
</head>
<body ng-app="myApp" ng-controller="successController">
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
	
	<table>
		<thead>
			<tr>
				<th>书名</th>
				<th>借阅人</th>
				<th>到期时间</th>
			</tr>
		</thead>
		<div>所借阅的图书如下：</div>
		<tbody>
			<tr ng-repeat="userBook in userBookList">
				<td>{{userBook.bookName}}</td>
				<td>{{userBook.userName}}</td>
				<td>{{userBook.expireDate}}</td>
			</tr>
		</tbody>
	</table>

	<div data-ng-init="load()" ></div>  
 <script>
			  	var method = '<%=request.getAttribute("method")%>';
			  	if(method == 1){
			  		$(".pageTD").attr(colspan,14);
			  	}
			</script>
</body>
</html>