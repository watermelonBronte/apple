/**
 * 用户逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.dao.IDepartmentDao;
import com.mars.tools.IPage;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/4/20
 */
public interface IUserService {

	/**
	 * 增加用户
	 */
	public void createUser(User user);
	
	/**
	 * 删除用户
	 */
	public void deleteUser(Integer uid);
	
	/**
	 * 更新用户
	 */
	public void updateUser(User user);
	
	/**
	 * 查找用户
	 */
	public void findUser();
	
	/**
	 * 分页查找用户
	 * @param pageInfo
	 * @return
	 */
	public List<User> findAll(IPage pageInfo);
	
	/**
	 * 根据ID查找用户
	 * @param uid
	 * @return
	 */
	public User findUserById(Integer uid);
}
