package com.briup.web.servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Customer;
import com.briup.bean.Order;
import com.briup.bean.ShopCar;
import com.briup.service.IOrderService;
import com.briup.service.IShopCarService;
import com.briup.service.impl.OrderServiceImpl;
import com.briup.service.impl.ShopCarServiceImpl;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<ShopCar> shopcar = (List<ShopCar>) session.getAttribute("shopcar");
		Customer customer = (Customer) session.getAttribute("customer");
		//总价钱
		double total = Double.parseDouble(request.getParameter("total"));
		
		//生成订单、订单项，清空购物车
		IOrderService service = new OrderServiceImpl();
		Order order = new Order(total,new Timestamp(System.currentTimeMillis()),customer);
		service.saveOrder(order, shopcar);

		//更新购物车中的信息
		IShopCarService scservice = new ShopCarServiceImpl();
		List<ShopCar> cars = scservice.findByCustomer(customer);
		session.setAttribute("shopcar", cars);
		//更新session中的订单
		List<Order> orders = service.findByCustomer(customer);
		session.setAttribute("orders", orders);
		session.setAttribute("order", order);
		session.setAttribute("total", total);
		response.sendRedirect(request.getContextPath() + "/confirmSuc.jsp");
	}
}
