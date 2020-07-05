package com.weh.hfshop.dao;

import java.util.List;

import com.weh.hfshop.pojo.Cart;

public interface CartDao {

	int add(Cart cart);

	int delete(int[] ids);

	List<Cart> list(int uid);

	List<Cart> lists(int[] ids);

}
