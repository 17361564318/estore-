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
<link rel="stylesheet"
	href="http://at.alicdn.com/t/font_1368649_u8tq75swzoi.css" />
<link rel="stylesheet"
	href="font-awesome-4.7.0/css/font-awesome.min.css">

<script type="text/javascript">
	function addShopCart(bookname) {
	if(${sessionScope.customer!=null}){
		alert(bookname + "  加入购物车成功!");
		}
		var num = document.getElementById("num");
		num = parseInt(num.value);
		window.location.href = "addshopcar?bookid="+${requestScope.book.id}+"&num="+num;
	}
	function numAdd() {
		var num = document.getElementById("num");
		num.value = parseInt(num.value) + 1;
	}
	function numRuduce() {
		//获取当前标签对象
		var num = document.getElementById("num");
		if (num.value > 1) {
			num.value = parseInt(num.value) - 1;
		}
	}
</script>
<style>
* {
	margin: 0;
	padding: 0;
}

#small-box {
	position: relative;
	z-index: 1;
	cursor: move;
}

#float-box {
	display: none;
	width: 160px;
	height: 120px;
	position: absolute;
	background: #ffffcc;
	border: 1px solid #ccc;
	filter: alpha(opacity = 50);
	opacity: 0.5;
}

#mark {
	position: absolute;
	display: block;
	width: 350px;
	height: 350px;
	background-color: #fff;
	filter: alpha(opacity = 0);
	opacity: 0;
	z-index: 10;
}

#big-box {
	display: none;
	position: absolute;
	top: 250px;
	left: 390px;
	width: 350px;
	height: 350px;
	overflow: hidden;
	border: 1px solid #ccc;
	z-index: 1;
}

#big-box img {
	position: absolute;
	z-index: 5;
}

.iconfont {
	font-family: "iconfont" !important;
	font-size: 16px;
	font-style: normal;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
}

.icon-shoucang:before {
	content: "\e637";
}
</style>
<script>
	//页面加载完毕后执行
	window.onload = function() {

		var objDemo = document.getElementById("demo");
		var objSmallBox = document.getElementById("small-box");
		var objMark = document.getElementById("mark");
		var objFloatBox = document.getElementById("float-box");
		var objBigBox = document.getElementById("big-box");
		var objBigBoxImage = objBigBox.getElementsByTagName("img")[0];

		objMark.onmouseover = function() {
			objFloatBox.style.display = "block"
			objBigBox.style.display = "block"
		}

		objMark.onmouseout = function() {
			objFloatBox.style.display = "none"
			objBigBox.style.display = "none"
		}

		objMark.onmousemove = function(ev) {

			var _event = ev || window.event; //兼容多个浏览器的event参数模式

			var left = _event.clientX - objDemo.offsetLeft
					- objSmallBox.offsetLeft - objFloatBox.offsetWidth / 2;
			var top = _event.clientY - objDemo.offsetTop
					- objSmallBox.offsetTop - objFloatBox.offsetHeight / 2;
			top = top + 390;
			//设置边界处理，防止移出小图片
			if (left < 0) {
				left = 0;
			} else if (left > (objMark.offsetWidth - objFloatBox.offsetWidth)) {
				left = objMark.offsetWidth - objFloatBox.offsetWidth;
			}

			if (top < 0) {
				top = 0;
			} else if (top > (objMark.offsetHeight - objFloatBox.offsetHeight)) {
				top = objMark.offsetHeight - objFloatBox.offsetHeight;

			}

			objFloatBox.style.left = left + "px"; //oSmall.offsetLeft的值是相对什么而言
			objFloatBox.style.top = top + "px";

			//求其比值
			var percentX = left
					/ (objMark.offsetWidth - objFloatBox.offsetWidth);
			var percentY = top
					/ (objMark.offsetHeight - objFloatBox.offsetHeight);

			//方向相反，小图片鼠标移动方向与大图片相反，故而是负值
			objBigBoxImage.style.left = -percentX
					* (objBigBoxImage.offsetWidth - objBigBox.offsetWidth)
					+ "px";
			objBigBoxImage.style.top = -percentY
					* (objBigBoxImage.offsetHeight - objBigBox.offsetHeight)
					+ "px";
		}
	}
</script>
</head>
<body>
	<!--顶部-->
	<div class="top">
		<div class="top_center">
			<ul class="top_bars">
				<c:if test="${sessionScope.customer != null}">
					<li><a href="exit">退出</a>|</li>
					<li><a href="orders.html">我的订单<span class="jt_down"></span></a>|</li>
				</c:if>
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
				<input type="text" /> <span>搜索</span>
			</div>
			<p>
				<c:forEach items="${list }" var="list">
					<a href="list.html">${list.name}</a>|</c:forEach>
			</p>
		</div>
		<c:if test="${session.customer!=null }">
			<div class="h3_right">
				<div class="myyy">
					<a href="user/userinfo.jsp">个人信息</a> <span class="sj_down"></span>
				</div>
				<div class="tsc">
					<a href="shopCart.html">去购物车结算</a> <span class="sj_right"></span>
				</div>
			</div>
		</c:if>
	</div>
	<!--头部导航-->
	<div class="nav_top">
		<div class="nav_top_center">
			<div>全部图书分类</div>
			<ul>
				<li><c:forEach items="${list }" var="list">
						<a href="list.html">${list.name }</a>
					</c:forEach></li>
			</ul>
		</div>
	</div>

	<div class="container5">
		<div class="cn5_top">
			<div class="cn5_top_x center01">
				<a class="font20" href="#">书籍</a> > <a href="#">计算机类</a>
			</div>
			<div class="cn5_top_y center01">
				<div id="demo" class="cn5topy_1">
					<div id="small-box" class="cn5topy_imgview">
						<div id="mark"></div>
						<div id="float-box"></div>
						<img src="images/book_view/${requestScope.book.image }" />
						<ul class="cn5topy_imglist">
							<li><a href="#"><img
									src="images/book_view/${requestScope.book.image }"></a></li>
							<li class="current"><a href="#"><img
									src="images/book_view/${requestScope.book.image }"></a></li>
							<li><a href="#"><img
									src="images/book_view/${requestScope.book.image }"></a></li>
							<li><a href="#"><img
									src="images/book_view/${requestScope.book.image }"></a></li>
							<li><a href="#"><img
									src="images/book_view/${requestScope.book.image }"></a></li>
						</ul>
					</div>
					<div id="big-box">
						<img src="images/book_view/${requestScope.book.image }" />
					</div>
				</div>
				<div class="cn5topy_2">
					<h1 class="pro_title font15">${requestScope.book.name }</h1>
					<div class="pro_price">
						<div class="pro_price_x">
							<p>
								briup价：<b>￥ ${requestScope.book.price }</b> <a href="#">(降价通知)</a>
							</p>
						</div>

					</div>
					<div class="pro_ship">
						<div>
							<div class="pro_key fl">服&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;务：</div>
							<ul class="pro_service f1">
								<li class="service_fq">分期付款</li>
								<li class="service_myf">免运费</li>
								<li class="service_zt">自提</li>
								<li class="service_th">7天无理由退换货</li>
							</ul>
						</div>
					</div>
					<div class="pro_selects">
						<div class="pro_select">
							<div class="pro_key pro_key_vertical fl">选择版本：</div>
							<ul class="pro_select_vals">
								<li>精装版</li>
								<li>简装版</li>
								<li>收藏版</li>
							</ul>
						</div>
					</div>

					<div class="pro_buy">
						<div class="pro_buy_nums">
							<input id="num" type="text" value="1" />
							<dl>
								<dd onclick="numAdd()">+</dd>
								<dd onclick="numRuduce()">-</dd>
							</dl>
						</div>
						<div class="pro_addshop">
							<a href="javascript:void(0)"
								onclick="addShopCart('${requestScope.book.name}')">加入购物车 </a> <img
								id="icon-shoucang"></img>


						</div>
					</div>

				</div>
			</div>
		</div>
		<div class="c5_b2">

			<div class="c5_b2_right">
				<!--选项卡-->
				<ul class="c5_b2_tabs">
					<li>商品介绍</li>
					<li class="current">规格参数</li>
					<li>包装清单</li>
					<li>商品评价</li>
				</ul>
				<!--内容-->
				<div class="c5_b2_right_1 box">
					<div class="introduce_item">
						<ul>
							<li>商品名称：${requestScope.book.name }</li>
							<li>商品编号：${requestScope.book.id +1000 }</li>
							<li class="fr"><a class="color_link1" href="#">更多参数>></a></li>
						</ul>
					</div>
				</div>
				<div class="intro_pics">
					<img class="intro_pic"
						src="images/book_view/${requestScope.book.image }">
				</div>
			</div>


			<div class="c5_b2_right">
				<div class="c5_b2_right_2">
					<h1>正品行货</h1>
					<p>briup网上商城向您保证所售商品均为正品，briup自营商品开具机打发票或电子发票。</p>

					<h1>全国联保</h1>
					<p>凭质保证书及briup网上商城发票，可享受全国联保服务，与您亲临商场选购的商品享受相同的质量保证。briup网上商城还为您提供具有竞争力的商品价格和运费政策，请您放心购买！</p>

					<h1>正品行货</h1>
					<p>briup网上商城向您保证所售商品均为正品，briup自营商品开具机打发票或电子发票。</p>

					<h1>全国联保</h1>
					<p>凭质保证书及briup网上商城发票，可享受全国联保服务，与您亲临商场选购的商品享受相同的质量保证。briup网上商城还为您提供具有竞争力的商品价格和运费政策，请您放心购买！</p>

				</div>
			</div>

			<!--左侧栏-->
			<div class="c5_b2_left_container">
				<div class="c5_b2_left box">
					<h1>服务时间 早9：00~凌晨1：00</h1>
					<p>
						<a href="#"> <img class="callmebyqq"
							src="images/icon_qq_03.png" />
						</a>
					</p>
				</div>

				<div class="c5_b2_left box">
					<h1>其他种类</h1>
					<dl>
						<dd>文学类</dd>
						<dd>漫画类</dd>
						<dd>通书类</dd>
					</dl>
					<dl>
						<dd>文学类</dd>
						<dd>漫画类</dd>
						<dd>通书类</dd>
					</dl>
				</div>
			</div>
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

</body>
</html>
