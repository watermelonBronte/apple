/**
 * 
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.impl.RoleDao;
import com.mars.service.IRoleService;
import com.mars.tools.IPage;
import com.mars.vo.Role;
import com.mars.vo.User;

/**
 *@author 杨铮
 *@data 2016/4/22

 */
public class RoleService  implements IRoleService{

	
	private RoleDao roleDao;
	//提供RoleDao 对象的注入通道
	
	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

	public void createRole(Role role) {
		// TODO Auto-generated method stub
//		if(roleDao.findRoleById(role.getRid())==null){//如果id不存在则添加角色
			roleDao.createRole(role);
				
//			}
	}

	public List<Role> findAllRole() {
		// TODO Auto-generated method stub
		return roleDao.findAllRole();
	}

	public Role findRoleById(int rid) {
		// TODO Auto-generated method stub
		return roleDao.findRoleById(rid);
	}

	public Role findRoleByName(String rname) {
		// TODO Auto-generated method stub
		return roleDao.findRoleByName(rname);
	}

	public void updateRole(Role role) {
//		if(roleDao.findRoleById(role.getRid())!=null){
			roleDao.updateRole(role);
			
//		}

	}

	public void deletRole(int rid) {
		// TODO Auto-generated method stub
		if(roleDao.findRoleById(rid)!=null){//如果存在id，则删除角色
			roleDao.deletRole(rid);
		}
	}
	public List<Role> findAll(IPage pageInfo) {
		
		List<Role> list = roleDao.findRole(pageInfo);
		return list;
	}

}
