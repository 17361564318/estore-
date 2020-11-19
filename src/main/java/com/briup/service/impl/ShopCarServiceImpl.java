package com.briup.service.impl;

import java.util.List;

import com.briup.bean.Book;
import com.briup.bean.Customer;
import com.briup.bean.ShopCar;
import com.briup.dao.BookDao;
import com.briup.dao.ShopCarDao;
import com.briup.service.IShopCarService;
import com.briup.util.BriupUtil;

public class ShopCarServiceImpl implements IShopCarService {

	ShopCarDao dao = BriupUtil.getMapper(ShopCarDao.class);
	BookDao bookdao = BriupUtil.getMapper(BookDao.class);

	public List<ShopCar> findByCustomer(Customer customer) {
		//顾客已经存放进数据库中的购物车信息
		List<ShopCar> shopcar = (List<ShopCar>) dao.findByCustomer(customer);
		return shopcar;
	}

	public void saveShopCar(ShopCar shopCar) {
//		dao.saveShopCar(shopCar);
	}

	
	public void saveShopCar(List<ShopCar> cars, Integer bookId, Customer customer,int paranum) {
		// 遍历购物车集合，如果书已存在，num+paranum；否则插入
		for (ShopCar shopCar : cars) {
				if(bookId.equals(shopCar.getBook().getId())) {
					//获取已经存在的书籍的数量
					Integer num = shopCar.getNum();
					//重新赋值，这里的新值指的是原有的数量加上传入进来的书本数
					shopCar.setNum(num+paranum);
					dao.updateShopCar(shopCar);
					//用来打断遍历
					return;
				}
		}
		//如果不存在的话，直接进行插入操作
		Book book = bookdao.findBookById(bookId);
		dao.saveShopCar(new ShopCar(customer, book, paranum));
	}

	@Override
	public void updateShopCar(ShopCar shopCar) {
		dao.updateShopCar(shopCar);
	}

}
