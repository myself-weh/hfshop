package com.weh.hfshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.weh.hfshop.entity.Sku;
import com.weh.hfshop.entity.SkuVo;
import com.weh.hfshop.entity.SpecOption;

public interface SkuDao {

	int insert(Sku sku);
	int insertSpecOption(@Param("skuId")  int id, @Param("opt") SpecOption specOption);
	

	int delete(int[] ids);
	int deleteSpecOption(int ...id);

	int update(Sku sku);	

	Sku findById(int id);
	List<Sku> list(SkuVo skuvo);
	
	// 用于显示商品详情使用
	List<Sku> ListBySpuId(int spuId);
}
