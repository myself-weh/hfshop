package com.weh.hfshop.service;

import java.util.List;

import com.weh.hfshop.entity.Category;

public interface CategoryService {

	public int add(Category category);
	
	public int udpate(Category category);
	
	public int del(int id);
	
	public List<Category> list(int parentId);
}
