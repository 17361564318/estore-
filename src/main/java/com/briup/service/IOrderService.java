package com.briup.service;

import java.util.List;

import com.briup.bean.Customer;
import com.briup.bean.Order;
import com.briup.bean.ShopCar;

public interface IOrderService {

//	Order saveOrder(Order order);

	void saveOrder(Order order, List<ShopCar> cars);

	List<Order> findByCustomer(Customer customer);

}
