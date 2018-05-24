package dao.impl;

import dao.UserDao;

public class UserDaoImpl implements UserDao {

	public void insert() {
		System.out.println("保存一个用户");
	}

	public void selectByUsername() {
		System.out.println("根据用户名查询一个用户");
	}

}
