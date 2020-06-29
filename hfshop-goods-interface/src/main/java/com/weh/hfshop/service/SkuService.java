package com.weh.hfshop.service;

import com.github.pagehelper.PageInfo;
import com.weh.hfshop.entity.Sku;
import com.weh.hfshop.entity.SkuVo;

public interface SkuService {

	int add(Sku sku);
	int update(Sku sku);
	int delete(int[] ids);
	
	PageInfo<Sku> list(SkuVo skuvo);
	
	Sku getById(int id);
}
