package com.briup.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.briup.bean.Customer;
import com.briup.bean.ShopCar;

public interface ShopCarDao {
	
	//根据顾客查询其对应的所有购物车
	List<ShopCar> findByCustomer(Customer customer);
	//保存一个购物车
	void saveShopCar(ShopCar shopCar);
	//更新购物车
	void updateShopCar(ShopCar shopCar);
	//清空购物车
	void clearShopCarByCustomer(Customer customer);

}
