package com.weh.hfshop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.weh.hfshop.pojo.OrderDetail;
import com.weh.hfshop.pojo.Orderz;
import com.weh.hfshop.pojo.User;

public interface UserService {

		// 注册
		User register(User user);
		
		// 登录
		User login(User user);
		
		// 根据用户名查找用户是否存在，  注册时候的唯一性验证使用
		User getUserByName(String name);
		
		PageInfo<Orderz> listOrderz(Integer uid, int page);

		List<OrderDetail> listOrderDetail(int oid);

}
