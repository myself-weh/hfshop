package com.weh.hfshop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.weh.hfshop.entity.Sku;
import com.weh.hfshop.entity.SkuVo;

public interface SkuService {

	int add(Sku sku);
	int update(Sku sku);
	int delete(int[] ids);
	
	PageInfo<Sku> list(SkuVo skuvo);
	
	Sku getById(int id);
	// 根据spu 获取sku的集合，同时包含规格详情
	List<Sku> listDetailBySpu(int spuId);
}
