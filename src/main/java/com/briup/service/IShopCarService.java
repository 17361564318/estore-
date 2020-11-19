package com.briup.service;

import java.util.List;

import com.briup.bean.Customer;
import com.briup.bean.ShopCar;

public interface IShopCarService {

	List<ShopCar> findByCustomer(Customer customer);
	
	void saveShopCar(ShopCar shopCar);
	
	void saveShopCar(List<ShopCar> cars, Integer bookId, Customer customer,int num);
	
	void updateShopCar(ShopCar shopCar);
}
