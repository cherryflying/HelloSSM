<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <script type="text/javascript" src="js/lib/jquery-3.4.1.min.js"  charset="gb2312" ></script>
<script type="text/javascript" src="js/register.js"  charset="gb2312" ></script>
<title>Insert title here</title>
</head>
<body>
	<form>
		用户名:<input type="text" name="userName" id="userName" />
		<p>
			密码:<input type="password" name="password" id="password" /> <p>  
    姓名:<input
				type="text" name="name" id="name" /> <p> 
    年龄:
		<input type="number" name="age"
				id="age" /> <p> 
    性别:
		<label><input type="radio" name="sex" id="man" value="2" />
				男 </label> <label><input type="radio" name="sex" id="women" value="1"/> 女 </label> <p>出生日期:
		<input
				type="date" name="birthday" id="birthday" />
		
		<p>  
    <input type="button" value="submit" id="sendTo" />  

	</form> 
</body>

</html>