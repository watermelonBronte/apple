/**
 * 部门逻辑层
 */
package com.mars.service;

/**
 * @author ye
 * @date 2016/4/20
 */
public interface IDepartmentService {
	/**
	 * 增加部门
	 */
	public void createDepartment();
	
	/**
	 * 删除部门
	 */
	public void deleteDepartment();
	
	/**
	 * 更新部门
	 */
	public void updateDepartment();
	
	/**
	 * 查找部门
	 */
	public void findDepartment();
}
