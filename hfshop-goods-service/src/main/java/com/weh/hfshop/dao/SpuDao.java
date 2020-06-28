package com.weh.hfshop.dao;

import java.util.List;

import com.weh.hfshop.entity.Spu;
import com.weh.hfshop.entity.SpuVo;

public interface SpuDao {

	int add(Spu spu);

	int update(Spu spu);

	int delete(int[] ids);

	List<Spu> list(SpuVo spuvo);

	Spu findById(int id);
}
