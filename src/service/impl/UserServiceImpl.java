package service.impl;

import service.UserService;
import dao.UserDao;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	public void regist() {
		userDao.selectByUsername();
		userDao.insert();
	}

}
