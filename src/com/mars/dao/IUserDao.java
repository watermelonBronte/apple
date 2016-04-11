/**
 * 用户dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.User;


/**
 * @author ye
 * @date 2016/4/18
 */
public interface IUserDao {

	/**
	 * 创建用户
	 * @param user
	 */
	public void createUser(User user); 
	
	/**
	 * 删除用户
	 * @param uid
	 */
	public void deleteUser(Integer uid); 
	
	
	
	/**
	 * 更新用户
	 * @param user
	 */
	public void updateUser(User user); 
	
	/**
	 * 查询用户
	 * @return
	 */
	public List<User> findUser();

	/**
	 * 分页查找用户
	 * @param pageInfo
	 * @return
	 */
	public List<User> findAllUser(IPage pageInfo);
	
	/**
	 * 根据ID查询用户
	 * @return
	 */
	public User findUserById(Integer uid);
}
