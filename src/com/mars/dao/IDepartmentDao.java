/**
 * 部门dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
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
	 * @param did
	 */
	public void deleteDepartment(Integer did); 
	
	
	
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

	/**
	 * 分页查找部门
	 * @param pageInfo
	 * @return
	 */
	public List<Department> findAllDepartment(IPage pageInfo);
	
	/**
	 * 根据ID查询部门
	 * @return
	 */
	public Department findDepartmentById(Integer did);
}
