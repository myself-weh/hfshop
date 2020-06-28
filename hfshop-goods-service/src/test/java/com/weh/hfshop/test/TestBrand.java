package com.weh.hfshop.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.weh.hfshop.entity.Brand;
import com.weh.hfshop.service.BrandService;

public class TestBrand extends TestBase{

	@Autowired
	BrandService bs;
	
	@Test
	public void testGet() {
		
		Brand brand = bs.getById(3);
		System.out.println("brand 实体对象： " + brand);
		
	}
}
