package com.weh.hfshop.service;

import com.github.pagehelper.PageInfo;
import com.weh.hfshop.entity.Spu;
import com.weh.hfshop.entity.SpuVo;

public interface SpuService {

	int add(Spu spu);
	int update(Spu spu);
	int delete(int[] ids);
	
	PageInfo<Spu> list(SpuVo spuvo);
	
	Spu getById(int id);
}
