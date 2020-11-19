package com.briup.dao;

import java.sql.Timestamp;
import java.util.List;

import com.briup.bean.Customer;
import com.briup.bean.Order;

public interface OrderDao {

	List<Order> findAllOrders();

	List<Order> findByCustomer(Customer customer);

	//返回的是order的id
	int saveOrder(Order order);

	// 根据订单生成时间去查询订单id，查询订单id用于关联 相关的订单项
	Integer findByDate(Timestamp date);
}
