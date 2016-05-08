/**
 * 
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Role;
/**
 *@author 杨铮
 *@data 2016/4/22
 */
public interface IRoleDao {
	/**
	 * 创建角色
	 *@param role 角色对象
	 */
	public void createRole(Role role);
	
	/**
	 * 更新角色
	 *@param role 角色对象
	 */
	public void updateRole(Role role);
	/**
	 * 根据用户id查询角色
	 *@param rid 角色
	 */
	public Role findRoleById(int rid);
	
	/**
	 * 根据角色名称查询
	 *@param rname 角色名
	 */
	public Role findRoleByName(String rname);
	
	/**
	 * 根据角色id删除角色
	 *@param rid 角色id
	 */
	public void deletRole(int rid);
	
	/**
	 * 查找全部角色
	 *@return 
	 */
	
	public List<Role> findAllRole();
	public List<Role> findRole(IPage pageInfo);//分页
}
