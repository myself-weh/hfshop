package com.weh.hfshop.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weh.hfshop.dao.SpuDao;
import com.weh.hfshop.entity.Spu;
import com.weh.hfshop.entity.SpuVo;
import com.weh.hfshop.service.SpuService;


@Service(interfaceClass = SpuService.class)
public class SpuServiceImpl implements SpuService{

	@Autowired
	SpuDao spuDao;

	@Autowired
	KafkaTemplate<String , String> kaTemplate;
	
	@Override
	public int add(Spu spu) {
		int r= spuDao.add(spu);
		if(r>0) {
			int spuId= spu.getId();
			// 
			Spu spu2 = spuDao.findById(spuId);
			String spuJson = JSON.toJSONString(spu2);
			kaTemplate.send("hfshopSpu", "addspu",spuJson);
		}
		return r;
	}

	@Override
	public int update(Spu spu) {
		// TODO Auto-generated method stub
		return spuDao.update(spu);
	}

	@Override
	public int delete(int[] ids) {
		int n =  spuDao.delete(ids);
		if(n>0) {
			
			String delIdsStr = JSON.toJSONString(ids);
			kaTemplate.send("hfshopSpu", "delspu",delIdsStr);
		}
		return n;
	}

	@Override
	public PageInfo<Spu> list(SpuVo spuvo) {
		
		PageHelper.startPage(spuvo.getPageNum(), spuvo.getPageSize());
		return new PageInfo<Spu>(spuDao.list(spuvo));
	}

	@Override
	public Spu getById(int id) {
		// TODO Auto-generated method stub
		return spuDao.findById(id);
	}
}
