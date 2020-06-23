package com.weh.hfshop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.weh.hfshop.entity.Brand;

/**
 * 品牌管理
 * @author Mr.Wu
 *
 */
public interface BrandService {

	/**
	 * 添加方法
	 * @param brand
	 * @return
	 */
	int addBrand(Brand brand);
	/**
	 * 修改方法
	 * @param brand
	 * @return
	 */
	int updateBrand(Brand brand);
	/**
	 * 依据id删除或者批量删除
	 * @param ids
	 * @return
	 */
	int deleteBrandByIds(int[] ids);
	/**
	 * 分页列表
	 * @param brand
	 * @return
	 */
	PageInfo<Brand> list(Brand brand);
	/**
	 * 获取单纯的列表
	 * @return
	 */
	List<Brand> list();
	/**
	 * 依据id获取对应的对象信息
	 * @param id
	 * @return
	 */
	Brand getById(int id);
}
