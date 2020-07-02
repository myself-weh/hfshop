package com.weh.hfshop.dao;

import com.weh.hfshop.pojo.User;

public interface UserDao {

	User findUserById(Integer uid);

	int add(User user);

	User findUser(User user);

	User findByName(String name);
}
