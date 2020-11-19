package com.briup.service.impl;

import com.briup.bean.Customer;
import com.briup.dao.CustomerDao;
import com.briup.service.ICustomerService;
import com.briup.util.BriupUtil;

public class CustomerServiceImpl implements ICustomerService {
	CustomerDao dao = BriupUtil.getMapper(CustomerDao.class);

	public Customer findByUsername(String username, String password) throws Exception {
		Customer cus = dao.findByUsername(username);
		if (cus == null) {
			throw new Exception("用户名不存在");
		}
		if (!cus.getPassword().equals(password)) {
			throw new Exception("密码错误");
		}
		return cus;
	}

	public void saveCustomer(Customer customer) throws Exception {
		Customer cus = dao.findByUsername(customer.getUsername());
		if (cus != null) {
			throw new RuntimeException("用户名已经存在");
		} else {
			dao.saveCustomer(customer);
		}

	}

	public void updateCustomer(Customer customer) {
		dao.updateCustomer(customer);
	}

}
