/**
 * 
 */
package com.mars.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;


import com.mars.dao.impl.UserDao;
import com.mars.service.IUserService;
import com.mars.tools.IPage;
import com.mars.vo.Department;
import com.mars.vo.Role;
import com.mars.vo.User;

/**
 *@author 杨铮
 *@data 2016/4/21

 */
@Service("userService")
public class UserService implements IUserService {
	
	
	private UserDao userDao;
	//提供UserDao 对象的注入通道
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
//添加用户


	public void createUser(User user) {
		
		//如果id不存在则添加用户
		userDao.createUser(user);
			
		
	}
	
	public void deletUser(int uid) {
		if(userDao.findUserById(uid)!=null){//如果存在id，则删除用户
		userDao.deletUser(uid);
		}
	}
	
	public List<User> findAllUser() {
		return userDao.findAllUser();
	}
//按用户id查询用户
	
	public User findUserById(int uid) {
	
			return userDao.findUserById(uid);
	
	}
//按部门id查询
	
	public Department findDepartmentById(int did) {
	
			return userDao.findDepartmentById(did);
	
	}
//按角色id查询
	
	public Role findRoleById(int rid) {
	
			return userDao.findRoleById(rid);
	
	}
//按用户名查询
	
	public User findUserByName(String uname) {

		return userDao.findUserByName(uname);
	}
//更新用户
	
	public void updateUser(User user) {
//		if(userDao.findUserById(user.getUid())!=null){
			userDao.updateUser(user);
			
//		}
		
	}


	public List<User> findAll(IPage pageInfo) {
	
			List<User> list = userDao.findUser(pageInfo);
			return list;
		}

	

}
