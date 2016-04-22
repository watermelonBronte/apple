/**
 * 部门逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Department;

/**
 * @author ye
 * @date 2016/4/20
 */
public interface IDepartmentService {
	/**
	 * 增加部门
	 */
	public void createDepartment(Department department);
	
	/**
	 * 删除部门
	 */
	public void deleteDepartment(Integer did);
	
	/**
	 * 更新部门
	 */
	public void updateDepartment(Department department);
	
	/**
	 * 查找部门
	 */
	public void findDepartment();
	
	/**
	 * 分页查找部门
	 * @param pageInfo
	 * @return
	 */
	public List<Department> findAll(IPage pageInfo);
	
	/**
	 * 根据ID查找部门
	 * @param did
	 * @return
	 */
	public Department findDepartmentById(Integer did);
}
