package com.weh.hfshop.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.weh.hfshop.dao.BrandDao;
import com.weh.hfshop.entity.Brand;
import com.weh.hfshop.service.BrandService;

@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService{

	@Autowired
	private BrandDao brandDao ;
	
	@Override
	public int addBrand(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBrand(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBrandByIds(int[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageInfo<Brand> list(Brand brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> list() {
		// TODO Auto-generated method stub
		return brandDao.queryAll();
	}

	@Override
	public Brand getById(int id) {
		// TODO Auto-generated method stub
		return brandDao.findById(id);
	}

}
