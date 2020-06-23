package com.weh.hfshop.dao;

import java.util.List;

import com.weh.hfshop.entity.Brand;

public interface BrandDao {

	List<Brand> queryAll();

	Brand findById(int id);
}
