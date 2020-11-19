package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Customer;
import com.briup.bean.ShopCar;
import com.briup.service.IShopCarService;
import com.briup.service.impl.ShopCarServiceImpl;

@WebServlet("/addshopcar")
public class AddShopCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取到页面传过来的需要添加进shopcar的书籍的id和插入的数量
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		int num = Integer.parseInt(request.getParameter("num"));
		//
		HttpSession session = request.getSession();
		//获取当前会话session中的customer和购物车信息
		Customer cus = (Customer) session.getAttribute("customer");
		List<ShopCar> shopcar = (List<ShopCar>) session.getAttribute("shopcar");
		IShopCarService shopcarservice = new ShopCarServiceImpl();
		//调用service层的方法保存购物车，如果要加进来的书籍已经存在于购物车中，便是更新操作，否则是插入操作
		shopcarservice.saveShopCar(shopcar, bookid, cus, num);
		//进行完插入或者更新操作之后，重新查询数据库中的购物车，放入session中
		List<ShopCar> shopcar2 = shopcarservice.findByCustomer(cus);
		session.setAttribute("shopcar", shopcar2);
		request.getRequestDispatcher("shopCart.jsp").forward(request, response);

	}
}
