package cn.tedu.sp01.service;


import cn.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * ��ȡָ��id��������
	 * @param orderId
	 * @return
	 */
	Order getOrder(String orderId);
	
	/**
	 * ��Ӷ�������
	 * @param order
	 */
	void addOrder(Order order);
}
