<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="js/lib/jquery-3.4.1.min.js"
	charset="UTF-8"></script>

<script src="//apps.bdimg.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script type="text/javascript" src="js/angularTest.js" charset="UTF-8"></script>

</head>
<body ng-app="myApp">

<form ng-submit="submitForm()" ng-controller="carController">
    汽车品牌:<input type="text" ng-model="car.brand"/> <br/>
    汽车颜色:<input type="text" ng-model="car.color"/> <br/>
    <button type="submit">submit</button>
</form>

</body>
</html>