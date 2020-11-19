<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup电子商务-首页</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/style.css" />
<link rel="stylesheet" href="css/icons.css" />
<link rel="stylesheet" href="css/table.css" />
<link rel="stylesheet" type="text/css" href="css/swiper.min.css">
<link rel="stylesheet" href="css/floatView.css" />
</head>
<body>
	<!--顶部-->
	<div class="top">
		<div class="top_center">

			<ul class="top_bars">

				<ul class="top_lr">
					<c:if test="${not empty sessionScope.customer }">
						<li><a>欢迎登录 ${sessionScope.customer.username} </a>|</li>
						<li><a href="exit"> 退出 </a> |</li>
					</c:if>
					<c:if test="${empty sessionScope.customer }">
						<li><a href="login.jsp">亲，请您登录</a>|</li>
						<li><a href="register.jsp">免费注册</a>|</li>
					</c:if>
				</ul>
				<li><a href="showOrder">我的订单<span class="jt_down"></span></a>|</li>


				<li><a href="#">关注杰普<span class="jt_down"></span></a>|</li>
				<li><a href="#">网站导航<span class="jt_down"></span></a></li>
			</ul>
		</div>
	</div>
	<!--头部-->

	<div class="header3">
		<a href="index.jsp"><img src="images/logo.png"></a>
		<div class="h3_center">
			<div class="search_box">
				<input type="text" id="keyword" name="keyword" /> <span
					style="cursor: pointer;" onclick="search()">搜索</span>
			</div>
			<p>
				<c:forEach items="${list }" var="list">
					<a href="list.html">${list.name }</a>|
				</c:forEach>
			</p>
		</div>
		<div class="h3_right">

			<c:if test="${not empty customer }">
				<div class="myyy" style="">
					<a href="user/userinfo.jsp">个人信息</a> <span class="sj_down"></span>
				</div>
				<div class="tsc" style="">
					<a href="shopCart.jsp">去购物车结算</a> <span class="sj_right"> </span>
				</div>
			</c:if>

		</div>
	</div>
	<!--头部导航-->
	<div class="nav_top">
		<div class="nav_top_center">
			<div>全部图书分类</div>
			<ul>
				<li><c:forEach items="${applicationScope.list}" var="list">
						<a href="#">${list.name } |</a>
					</c:forEach></li>
			</ul>
		</div>
	</div>

	<div class="container3">
		<div class="c3_b1">
			<div class="c3_b1_left">
				<dl>
					<c:forEach items="${applicationScope.list }" var="list">
						<dd>
							<h1>${list.name }</h1>
							 <p>
								<c:forEach items="${list.cates }" var="cates">
									<a href="#">${cates.name }</a>
								</c:forEach>
							</p>
						</dd>
					</c:forEach>
				</dl>
			</div>
			<div class="c3_b1_center">
				<div class="bannerBox">
					<div class="swiper-container" id="swiper1">
						<div class="swiper-wrapper swiper-no-swiping">
							<div class="swiper-slide color-red">
								<img src="images/index/index1.jpg">
							</div>
							<div class="swiper-slide color-blue">
								<img src="images/index/index2.jpg">
							</div>
							<div class="swiper-slide color-yellow">
								<img src="images/index/index3.jpg">
							</div>
							<div class="swiper-slide color-green">
								<img src="images/index/index4.jpg">
							</div>
							<div class="swiper-slide color-pink">
								<img src="images/index/index5.jpg">
							</div>
							<div class="swiper-slide color-pink">
								<img src="images/index/index6.jpg">
							</div>
							<div class="swiper-slide color-pink">
								<img src="images/index/index7.jpg">
							</div>
							<div class="swiper-slide color-pink">
								<img src="images/index/index8.jpg">
							</div>
							<div class="swiper-slide color-pink">
								<img src="images/index/index9.jpg">
							</div>
							<div class="swiper-slide color-pink">
								<img src="images/index/index10.jpg">
							</div>
							<div class="swiper-slide color-pink">
								<img src="images/index/index11.jpg">
							</div>
						</div>
					</div>

					<div class="left">
						<img src="images/index/bannerL.png">
					</div>
					<div class="right">
						<img src="images/index/bannerR.png">
					</div>
				</div>

				<div class="c3_b1_c_bottom">
					<ul>
						<li><a href="viewBook.html"><img
								src="images/index/index_bottom1.jpg" /></a> <a href="viewBook.jsp">区块链开发指南</a></li>
						<li><a href="viewBook.html"><img
								src="images/index/index_bottom2.jpg" /></a> <a href="viewBook.jsp">Python程序设计</a></li>
						<li><a href="viewBook.html"><img
								src="images/index/index_bottom3.jpg" /></a> <a href="viewBook.jsp">Java从入门到精通</a></li>
					</ul>
				</div>
			</div>
			<div class="c3_b1_right">
				<h1>
					杰普快报<a href="#">更多</a>
				</h1>
				<ul>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
					<li><a href="#">〈加措〉相信这一切都是对我们最好的安排 </a></li>
				</ul>
			</div>
			<div style="clear: both"></div>
		</div>
		<div class="c3_b2">
			<ul>

				<c:forEach items="${applicationScope.books }" var="book">
					<li>
						<div class="c3_b2_txt">
							<a href="showViewBook?bookid=${book.id }"> <img alt="图片走丢了"
								src="images/book_index/${book.image }">
								<h1>${book.name}</h1>
								<h2>分类：${book.category.name }</h2>
								<h2>价格：${book.price}</h2>
								<h2>畅销书籍</h2>
								<h2>覆盖java基础及全新内容</h2>
								<p>
									<a href="showViewBook?bookid=${book.id }">更多精彩，点击进入</a>
								</p>
							</a>
						</div>
					</li>
				</c:forEach>



			</ul>
		</div>
	</div>
	<div class="c20"></div>
	<!--脚部-->

	<div class="footer3">
		<div class="f3_top">
			<div class="f3_center">
				<div class="ts1">品目繁多 愉悦购物</div>
				<div class="ts2">正品保障 天天低价</div>
				<div class="ts3">极速物流 特色定制</div>
				<div class="ts4">优质服务 以客为尊</div>
			</div>
		</div>
		<div class="f3_middle">
			<ul class="f3_center">
				<li class="f3_mi_li01">
					<h1>购物指南</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>配送方式</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>支付方式</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>售后服务</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li01">
					<h1>服务保障</h1>
					<p>常见问题</p>
					<p>找回密码</p>
					<p>会员介绍</p>
					<p>购物演示</p>
				</li>
				<li class="f3_mi_li06">
					<h1>客服中心</h1> <img src="images/qrcode_jprj.jpg" width="80px"
					height="80px">
					<p>抢红包、疑问咨询、优惠活动</p>
				</li>
			</ul>
		</div>
		<div class="f3_bottom">
			<p class="f3_links">
				<a href="#">关于我们</a>| <a href="#">联系我们</a>| <a href="#">友情链接</a>| <a
					href="#">供货商入驻</a>
			</p>
			<p>沪ICP备14033591号-8 杰普briup.com版权所有 杰普软件科技有限公司</p>
			<img src="images/police.png">
		</div>
	</div>

	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script src="js/swiper.min.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/floatView.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/search.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>
