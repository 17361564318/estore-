package com.briup.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.bean.Address;
import com.briup.bean.Customer;
import com.briup.service.IAddressService;
import com.briup.service.impl.AddressServiceImpl;

@WebServlet("/confirm")
public class ConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			HttpSession session = request.getSession();
			Customer customer = (Customer)session.getAttribute("customer");

			//根据当前会话环境中的customer获取到其相对应的收货地址信息
			IAddressService addressService = new AddressServiceImpl();
			//每个顾客可能不止一个收货地址信息
			List<Address> address = addressService.findByCustomer(customer.getId());
			
			session.setAttribute("address", address);
			response.sendRedirect(request.getContextPath()+"/confirm.jsp");
	}
}
