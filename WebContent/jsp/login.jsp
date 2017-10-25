<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>login</title>
			<link rel="stylesheet" href="jsp/css/bootstrap.min.css">
			<link rel="stylesheet" href="jsp/css/bootstrap-theme.min.css">
			<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
			<script src="jsp/js/bootstrap.min.js"></script>
	</head>
	<body>	
		<div class="container-fluid">			
			<div class="row-fluid">
				<div class="col-md-12 text-center">
					<img width="900" src="jsp/img/login.jpg" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="col-md-12 text-center">
					<form action="Login.action" method="post">
						<fieldset>
							<legend>登录</legend> 
							<label>用户</label><input type="text" name="userName"/><br />
							<label>密码</label><input type="text" name="password"/><br /> 
							<button class="btn" type="submit">确定</button>
						</fieldset>
					</form>
				</div>
			</div>
		</div>

</html>