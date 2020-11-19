package com.briup.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.bean.Customer;
import com.briup.service.ICustomerService;
import com.briup.service.impl.CustomerServiceImpl;

@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ICustomerService cusservice= new CustomerServiceImpl();
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		String zip = req.getParameter("zip");
		String address = req.getParameter("address");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");

		Customer customer = new Customer(name, password, zip, address, phone, email);
		try {
			cusservice.saveCustomer(customer);
			req.setAttribute("msg", "注册成功，请登录");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		} catch (Exception e) {
			req.setAttribute("msg", e.getMessage());
			req.getRequestDispatcher("register.jsp").forward(req, resp);
		}
	}

}
