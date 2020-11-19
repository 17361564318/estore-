package com.briup.service.impl;

import java.sql.Timestamp;
import java.util.List;

import com.briup.bean.Customer;
import com.briup.bean.Order;
import com.briup.bean.OrderLine;
import com.briup.bean.ShopCar;
import com.briup.dao.OrderDao;
import com.briup.dao.OrderLineDao;
import com.briup.dao.ShopCarDao;
import com.briup.service.IOrderService;
import com.briup.util.BriupUtil;

public class OrderServiceImpl implements IOrderService {

	OrderDao dao = BriupUtil.getMapper(OrderDao.class);
	OrderLineDao oldao = BriupUtil.getMapper(OrderLineDao.class);
	ShopCarDao shopcardao = BriupUtil.getMapper(ShopCarDao.class);

	public void saveOrder(Order order, List<ShopCar> cars) {
		// 提交订单，先生成一条订单记录
		int orderId = dao.saveOrder(order);
		// 查询已经存在的订单，然后用于关联订单项
		// 从购物车中获取书本信息和数量：从session容器中获取，然后生成订单项
		/*
		 * 由于order.getOrderDate()查询不到，需要转成timesatamp类型 Timestamp ts =
		 * Timestamp.valueOf(new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(order.getOrderDate()));
		 * Integer orderId = dao.findByDate(ts);
		 */

		for (ShopCar shopCar : cars) {
			OrderLine orderLine = new OrderLine(shopCar.getNum(), shopCar.getBook(), new Order(orderId));
			oldao.saveOrderLine(orderLine);
		}

		// 清空购物车列表
		shopcardao.clearShopCarByCustomer(order.getCustomer());

	}

	public List<Order> findByCustomer(Customer customer) {
		List<Order> orders = dao.findByCustomer(customer);

		return orders;
	}

}
