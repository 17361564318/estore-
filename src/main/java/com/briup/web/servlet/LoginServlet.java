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
import com.briup.service.ICustomerService;
import com.briup.service.IShopCarService;
import com.briup.service.impl.CustomerServiceImpl;
import com.briup.service.impl.ShopCarServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private ICustomerService cusservice;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		cusservice = new CustomerServiceImpl();
		IShopCarService shopcarservice = new ShopCarServiceImpl();
		HttpSession session = req.getSession();
		try {
			Customer customer = cusservice.findByUsername(name, password);
			//查询顾客的购物车，并且放入会话环境中，以便后续直接去购物车结算
			List<ShopCar> shopcar = shopcarservice.findByCustomer(customer);
			session.setAttribute("customer", customer);
			session.setAttribute("shopcar", shopcar);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} catch (Exception e) {
			req.setAttribute("msg", e.getMessage());
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
	}

}
