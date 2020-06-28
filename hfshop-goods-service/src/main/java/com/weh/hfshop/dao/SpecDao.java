package com.weh.hfshop.dao;

import java.util.List;

import com.weh.hfshop.entity.Spec;
import com.weh.hfshop.entity.SpecOption;

public interface SpecDao {

	int addSpec(Spec spec);

	int delOptions(int ...ids);

	int delSpec(int[] ids);

	int update(Spec spec);

	int addOption(SpecOption specOption);

	List<Spec> list(Spec spec);

	Spec findById(int id);
}
