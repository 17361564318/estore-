package com.briup.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Customer;
import com.briup.service.ICustomerService;
import com.briup.service.impl.CustomerServiceImpl;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICustomerService cusservice ; 

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		cusservice = new CustomerServiceImpl();
		//获取session是为了获取到当前会话中的顾客，然后在其基础之上做更新操作。
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		
		customer = new Customer(request.getParameter("username"),request.getParameter("password"),request.getParameter("zip"),request.getParameter("address"),request.getParameter("phone"),request.getParameter("email"));
		cusservice.updateCustomer(customer);
		
		
		session.setAttribute("customer", customer);
		request.setAttribute("msg", "修改成功");
//		response.sendRedirect(request.getContextPath()+"/user/userinfo.jsp");
		request.getRequestDispatcher("user/userinfo.jsp").forward(request, response);
	}
}
