package com.weh.hfshop.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.weh.hfshop.entity.Spec;
import com.weh.hfshop.service.SpecService;

public class TestSpec extends TestBase{

	@Autowired
	SpecService ss;
	
	@Test
	public void testList() {
		PageInfo<Spec> pageInfo = ss.list(1, 3, new Spec());
		pageInfo.getList().forEach(x->{System.out.println("列表对象 ： " + x);});
		
	}
}
