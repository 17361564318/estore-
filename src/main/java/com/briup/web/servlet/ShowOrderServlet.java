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
import com.briup.bean.Order;
import com.briup.service.IOrderService;
import com.briup.service.impl.OrderServiceImpl;

@WebServlet("/showOrder")
public class ShowOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		Customer customer = (Customer)session.getAttribute("customer");
		IOrderService service = new OrderServiceImpl();
		List<Order> list = service.findByCustomer(customer);		
		session.setAttribute("orders", list);
		response.sendRedirect("orders.jsp");
	}
}
