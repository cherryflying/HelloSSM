$(document)
		.ready(
				function() {
					var serverip=document.location.hostname;
					var serverport=document.location.port;
					var serverAddress="http://"+serverip+":"+serverport;
					$("#sendTo")
							.click(
									function() {
										var userName = $("#userName").val();
										var password = $("#password").val();
										var data = {
											"userName" : userName,
											"password" : password
										};
										$
												.ajax({
													url : "index.do",
													type : "post",
													// 注意序列化的值一定要放在最前面,并且不需要头部变量,不然获取的值得格式会有问题
													data : data,
													// contentType:
													// "application/json",
													dataType : "text",
													async : false, // 同步
													success : function(data) {
														if (data == "success") {
															window.location.href =serverAddress+ "/HelloSSM2/success";
														} else {
															window.location.href = serverAddress+"/HelloSSM2/error";
														}

													},
													error : function(arg1) {

														alert(345);

													}

												})
									});
				});