/**
 * 
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Department;
import com.mars.vo.Role;
import com.mars.vo.User;

/**
 *@author 杨铮
 *@data 2016/4/21
 */
public interface IUserService {
	
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
	 * 根据用户名称查询用户
	 *@param uname 用户name
	 */
	public User findUserByName(String uname);
	/**
	 * 根据id查询部门
	 *@param did 部门id
	 */
	
	public Department findDepartmentById(int did);
	/**
	 * 根据角色id查询
	 *@param rid 角色id
	 */
	public Role findRoleById(int rid);
	/**
	 * 查找全部用户
	 *@return 
	 */
	
	public List<User> findAllUser();
	
	/**
	 * 分页查找资产类别
	 * @param pageInfo
	 * @return
	 */
	public List<User> findAll(IPage pageInfo);
	public List<User> findUserByAttr(final IPage pageInfo, final User u) ;
	public List<Role> findRole();
	public List<Department> findDepartment();
}
