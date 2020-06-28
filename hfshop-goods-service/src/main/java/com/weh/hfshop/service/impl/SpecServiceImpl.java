package com.weh.hfshop.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weh.hfshop.dao.SpecDao;
import com.weh.hfshop.entity.Spec;
import com.weh.hfshop.entity.SpecOption;
import com.weh.hfshop.service.SpecService;

@Service(interfaceClass = SpecService.class)
public class SpecServiceImpl implements SpecService{

	@Autowired
	SpecDao specDao;
	
	@Override
	public int add(Spec spec) {
		//添加主表
		int result = specDao.addSpec(spec);
		//插入字表
		List<SpecOption> options = spec.getOptions();
		for (SpecOption specOption : options) {
			//设置主键
			specOption.setSpecId(spec.getId());
			result += specDao.addOption(specOption);
		}
		return result;
	}

	@Override
	public int delete(int[] ids) {
		//先删除子表
		int i = specDao.delOptions(ids);
		i += specDao.delSpec(ids);
		return i;
	}

	@Override
	public int update(Spec spec) {
		//修改主表
		int i = specDao.update(spec);
		//删除字表
		specDao.delOptions(spec.getId());
		//重新插入子表
		List<SpecOption> options = spec.getOptions();
		for (SpecOption specOption : options) {
			specOption.setSpecId(spec.getId());
			i += specDao.addOption(specOption);
		}
		return i;
	}

	@Override
	public PageInfo<Spec> list(int pageNum, int pageSize, Spec spec) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Spec>(specDao.list(spec));
	}

	@Override
	public Spec getById(int id) {
		// TODO Auto-generated method stub
		return specDao.findById(id);
	}

}
