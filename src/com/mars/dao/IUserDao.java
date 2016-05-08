/**
 * 
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Department;
import com.mars.vo.Role;
import com.mars.vo.User;

/**
 *@author 杨铮
 *@data 2016/4/21
 */
public interface IUserDao {
	/**
	 * 创建用户
	 *@param user 用户对象
	 */
	public void createUser(User user);
	/**
	 * 根据用户id删除用户
	 *@param uid 用户id
	 */
	public void deletUser(int uid);
	/**
	 * 更新用户
	 *@param user 用户对象
	 */
	public void updateUser(User user);
	/**
	 * 根据用户id查询用户
	 *@param uid 用户id
	 */
	public User findUserById(int uid);
	/**
	 * 根据部门id查询
	 *@param did部门 id
	 */
	public Department findDepartmentById(int did) ;
	/**
	 * 根据角色id查询
	 *@param rid 角色id
	 */
	public Role findRoleById(int rid);
	
	/**
	 * 根据用户名称查询用户
	 *@param uname 用户name
	 */
	public User findUserByName(String uname);
	
	/**
	 * 查找全部用户
	 *@return 
	 */
	
	public List<User> findAllUser();
	
	/**
	 * 分页查询资产类别
	 * @return
	 */
	public List<User> findUser(IPage pageInfo);
}
