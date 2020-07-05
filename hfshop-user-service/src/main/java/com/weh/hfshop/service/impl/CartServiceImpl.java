package com.weh.hfshop.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.weh.hfshop.dao.CartDao;
import com.weh.hfshop.dao.OrderDao;
import com.weh.hfshop.pojo.Cart;
import com.weh.hfshop.pojo.OrderDetail;
import com.weh.hfshop.pojo.Orderz;
import com.weh.hfshop.service.CartService;
@Service(interfaceClass = CartService.class)
public class CartServiceImpl implements CartService {

	@Autowired
	CartDao cartDao;
	
	@Autowired
	OrderDao orderDao;
	
	@Override
	public int add(Cart cart) {
		// TODO Auto-generated method stub
		return  cartDao.add(cart);
	}

	@Override
	public int delete(int[] ids) {
		// TODO Auto-generated method stub
		return cartDao.delete(ids);
	}

	@Override
	public List<Cart> list(int uid) {
		// TODO Auto-generated method stub
		return cartDao.list(uid);
	}

	@Override
	public List<Cart> ListByIds(int[] ids) {
		// TODO Auto-generated method stub
		return  cartDao.lists(ids);
	}

	@Override
	public int createOrder(int[] cartIds, String address, Integer uid) {
		//得到购物和商品的车的数据 
		List<Cart> lists = cartDao.lists(cartIds);
				
		// 订单明细
		List<OrderDetail> dList=  new ArrayList<OrderDetail>();
				
		//整个订单的价格
		BigDecimal orderTotal = new BigDecimal(0);
				
		int result = 0;
				
		//组织明细数据的集合
		for (Cart crt : lists) {
				OrderDetail detail = new OrderDetail();
				//购买数量
				detail.setPnum(crt.getPnum());
				//
				detail.setSkuid(crt.getSku().getId());
				// 计算单项总价格  这里就是乘法
				detail.setTotal(crt.getSku().getPrice().multiply(new BigDecimal(crt.getPnum()) ));					
				dList.add(detail);					
				//订单价格的累计
				orderTotal=orderTotal.add(detail.getTotal());
					
			}				
				// 生成订单
				Orderz orderz = new Orderz();
				orderz.setSumtotal(orderTotal);
				orderz.setAddress(address);
				orderz.setUid(uid);
				
				//将主表插入数据库  自动生成主键
				result += orderDao.inert(orderz);
				
				//插入明细
				for (OrderDetail orderDetail : dList) {
					orderDetail.setOid(orderz.getOid());
					result += orderDao.insertDetail(orderDetail);
				}
				
				//删除购物车中的看数据
				result += cartDao.delete(cartIds);
				return result;
	}

}
