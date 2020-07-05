package com.weh.hfshop.dao;

import java.util.List;

import com.weh.hfshop.pojo.OrderDetail;
import com.weh.hfshop.pojo.Orderz;

public interface OrderDao {

	int inert(Orderz orderz);

	int insertDetail(OrderDetail orderDetail);
	
	List<Orderz> list(int uid);
	
	List<OrderDetail> listDetail(int oid);

}
