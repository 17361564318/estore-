<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup电子商务-登录页</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="header1">
		<a href="index.jsp"> <img src="images/logo.png">
		</a>
	</div>
	<div class="content1">
		<!--背景颜色-->
		<div class="c1_box1">
			<!--背景图片-->
			<div class="login_box">
				<!--登录框-->
				<div class="center1">
					<form action="login" method="post">
						<h1>账号登录</h1>
						<c:if test="${not empty requestScope.msg}">
							<h2><font style="color:red">${requestScope.msg}</font></h2>
						</c:if>
						<c:if test="${empty requestScope.msg}">
							<h2>公共场所请不要泄露您的密码，以防止账号丢失</h2>
						</c:if>
						<div class="si_box">
							<span class="usr_icon"></span> <input type="text" name="name"
								placeholder="邮箱/用户名/已验证手机号" />
						</div>
						<!--分割条-->
						<div class="c10"></div>
						<div class="si_box">
							<span class="pwd_icon"></span> <input type="password"
								name="password" placeholder="请输入密码" />
						</div>
						<div class="fg_box">
							<a class="fg" href="#">忘记登录密码？</a> <a class="treg"
								href="register.jsp">立即注册</a>
						</div>
						<div class="sub_box">
							<input type="submit" value="登录" />
						</div>
					</form>
					<div>请使用合作网站账号登录杰普电子商务网：</div>
					<div class="com_box">
						<span class="tencent"></span>

					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="footer1">
		<div class="links">
			<a href="#">关于我们</a>| <a href="#">联系我们</a>| <a href="#">友情链接</a>| <a
				href="#">关于我们</a>| <a href="#">联系我们</a>| <a href="#">友情链接</a>
		</div>
		<div>沪ICP备1928832 杰普软件briup.com版权所有。</div>

		<img src="images/police.png">

	</div>
</body>
</html>