/**
 * 部门dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.vo.Department;


/**
 * @author ye
 * @date 2016/4/18
 */
public interface IDepartmentDao {

	/**
	 * 创建部门
	 * @param department
	 */
	public void createDepartment(Department department); 
	
	/**
	 * 删除部门
	 * @param department
	 */
	public void deleteDepartment(Department department); 
	
	/**
	 * 更新部门
	 * @param department
	 */
	public void updateDepartment(Department department); 
	
	/**
	 * 查询部门
	 * @return
	 */
	public List<Department> findDepartment();
	
}
