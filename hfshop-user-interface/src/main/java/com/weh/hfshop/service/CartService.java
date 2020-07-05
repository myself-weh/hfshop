package com.weh.hfshop.service;

import java.util.List;

import com.weh.hfshop.pojo.Cart;

public interface CartService {

	int add(Cart cart);
	
	int delete(int[] ids);
	
	List<Cart> list(int uid);
	
	List<Cart> ListByIds(int[] ids);

	/**
	 * 根据购物车id 生成订单
	 * @param cartIds
	 * @param uid
	 * @return
	 */
	int createOrder(int[] cartIds, String address ,Integer uid);
}
