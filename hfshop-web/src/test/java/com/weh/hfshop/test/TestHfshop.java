package com.weh.hfshop.test;

import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.PageInfo;
import com.weh.hfshop.controller.ElSearchUtil;
import com.weh.hfshop.entity.Spu;
import com.weh.hfshop.entity.SpuVo;
import com.weh.hfshop.pojo.EsSpu;
import com.weh.hfshop.service.SpuService;

@ContextConfiguration("classpath:test-consumer.xml")
@RunWith(SpringRunner.class)
public class TestHfshop {

	@Reference
	SpuService spuService;
	
	@Autowired
	ElSearchUtil<EsSpu> esUtil;
	
	@Test
	public void createIndex() {
		
		SpuVo spuVo = new SpuVo();
		
		spuVo.setPageSize(100);
		// 从数据库中获取数据
		PageInfo<Spu> pageInfo = spuService.list(spuVo);
		pageInfo.getList().forEach(spu->{
			//
			EsSpu esSpu = new EsSpu(spu);
			// 调用工具类保存到ES当中
			
			esUtil.saveObject(esSpu.getId().toString(), esSpu);
		});
		
	}

}
