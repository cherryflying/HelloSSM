<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="js/lib/jquery-3.4.1.min.js"
	charset="UTF-8"></script>

<script src="//apps.bdimg.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script type="text/javascript" src="js/register.js" charset="UTF-8"></script>

</head>
<body ng-app="myApp">
	<form ng-submit="submitForm()" ng-controller="userController">
		用户名:<input type="text" name="userName" id="userName" ng-model="user.userName"/>
		<p>
			密码:<input type="password" name="password" id="password" ng-model="user.password"/> <p>  
    姓名:<input
				type="text" name="name" id="name" ng-model="user.name"/> <p> 
    年龄:
		<input type="number" name="age"
				id="age" ng-model="user.age"/> <p> 
    性别:
		<label><input type="radio" name="sex" id="man" value="2" ng-model="user.sex"/>
				男 </label> <label><input type="radio" name="sex" id="women" value="1" ng-model="user.sex"/> 女 </label> <p>出生日期:
		<input
				type="date" name="birthday" id="birthday" ng-model="user.birthday"/>
		
		<p>  
    <button type="submit">submit</button>

	</form> 
</body>

</html>