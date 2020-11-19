package com.briup.dao;

import com.briup.bean.Customer;

public interface CustomerDao {
	
	Customer findByUsername(String username);
	
	void saveCustomer(Customer customer);
	
	void updateCustomer(Customer customer);

}
