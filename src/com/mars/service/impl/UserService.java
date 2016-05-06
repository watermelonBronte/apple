/**
 * 用户逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IUserDao;
import com.mars.service.IUserService;
import com.mars.service.IUserService;
import com.mars.tools.IPage;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/4/21
 */
public class UserService implements IUserService {

	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IUserService#createUser()
	 */
	public void createUser(User user) {
		userDao.createUser(user);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IUserService#findUser()
	 */
	public void findUser() {
		List<User> list = userDao.findUser();
		for (User user : list) {
			System.out.println(user.getUname());
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IUserService#updateUser()
	 */
	public void updateUser(User user) {
		userDao.updateUser(user);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IUserService#findAll(com.mars.tools.IPage)
	 */
	public List<User> findAll(IPage pageInfo) {
		List<User> list = userDao.findAllUser(pageInfo);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.service.IUserService#deleteUser(java.lang.Integer)
	 */
	public void deleteUser(Integer uid) {
		userDao.deleteUser(uid);

	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.service.IUserService#findUserById(java.lang.Integer)
	 */
	public User findUserById(Integer uid) {
		User user = userDao.findUserById(uid);
	
		return user;
	}

}
