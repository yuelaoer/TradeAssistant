<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<title>main</title>
			<link rel="stylesheet" href="jsp/css/bootstrap.min.css">
			<link rel="stylesheet" href="jsp/css/bootstrap-theme.min.css">
			<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
			<script src="jsp/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="col-md-12 text-center">
					<img src="jsp/img/header.png" />
				</div>
			</div>
			<div class="row-fluid">
				<div class="col-md-4 text-center">
					<ol>
						<li>
							客户管理
						</li>
						<li>
							产品管理
						</li>
						<li>
							销售管理
						</li>						
					</ol>
					<ol>
						<s:iterator value="list" id="s">
							<li><s:property value="s" /></li>						
						</s:iterator>					
					</ol>
					
				</div>
				<div class="col-md-8 text-center">					
					<iframe>
					</iframe>
					
				</div>
			</div>
		</div>	
	</body>	
	
</html>