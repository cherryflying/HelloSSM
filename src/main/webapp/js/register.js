$(document).ready(
		function() {
			var serverip = document.location.hostname;
			var serverport = document.location.port;
			var serverAddress = "http://" + serverip + ":" + serverport;
			$("#sendTo").click(
					function() {
						var userName = $("#userName").val();
						var password = $("#password").val();
						var name = $("#name").val();
						var age = parseInt($("#age").val());
						var sex = parseInt($('input[type="radio"][name="sex"]:checked').val());
						var birthday = $("#birthday").val();
						var date=new Date(Date.parse(birthday.replace(/-/g,  "/"))); 
						var data = {
							"userName" : userName,
							"password" : password,
							"name" : name,
							"age" : age,
							"sex" : sex,
							"birthday" : date
						};
						console.log(data);
						$.ajax({
							url : "registerIndex.do",
							type : "post",
							// 注意序列化的值一定要放在最前面,并且不需要头部变量,不然获取的值得格式会有问题
							data : data,
							dataType : "text",
							async : false, // 同步
							success : function(data) {
								if (data == "success") {
									alert("registe success,please login");
									window.location.href = serverAddress
											+ "/HelloSSM2/login";
								} else {
									alert("The username is exist,please register again!");
									window.location.href = serverAddress
											+ "/HelloSSM2/register";
								}

							},
							error : function(arg1) {

								alert(345);

							}

						})
					});
		});