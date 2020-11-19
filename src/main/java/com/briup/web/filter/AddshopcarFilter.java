package com.briup.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@WebFilter("/addshopcar")
public class AddshopcarFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//类型转换
			HttpServletRequest req = (HttpServletRequest)request;
			HttpSession session = req.getSession();
			//获取session中的customer对象
			Object customer = session.getAttribute("customer");
			//进行判空处理，如果为空？先登录：放行
			if(customer==null) {
				request.setAttribute("msg", "请登录之后使用购物车");
				req.getRequestDispatcher("login.jsp").forward(req, response);
			}else {
				chain.doFilter(req, response);
			}
			
	}

	@Override
	public void destroy() {
		
	}

}
