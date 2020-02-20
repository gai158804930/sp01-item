package cn.tedu.sp01.service;


import cn.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * 获取指定id订单数据
	 * @param orderId
	 * @return
	 */
	Order getOrder(String orderId);
	
	/**
	 * 添加订单数据
	 * @param order
	 */
	void addOrder(Order order);
}
