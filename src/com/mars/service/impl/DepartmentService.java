/**
 * 部门逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IDepartmentDao;
import com.mars.service.IDepartmentService;
import com.mars.tools.IPage;
import com.mars.vo.Department;

/**
 * @author ye
 * @date 2016/4/21
 */
public class DepartmentService implements IDepartmentService {

	private IDepartmentDao departmentDao;

	public IDepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(IDepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IDepartmentService#createDepartment()
	 */
	public void createDepartment(Department department) {
		departmentDao.createDepartment(department);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IDepartmentService#findDepartment()
	 */
	public void findDepartment() {
		List<Department> list = departmentDao.findDepartment();
		for (Department department : list) {
			System.out.println(department.getDid() + "  "
					+ department.getDname());
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IDepartmentService#updateDepartment()
	 */
	public void updateDepartment(Department department) {
		departmentDao.updateDepartment(department);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IDepartmentService#findAll(com.mars.tools.IPage)
	 */
	public List<Department> findAll(IPage pageInfo) {
		List<Department> list = departmentDao.findAllDepartment(pageInfo);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.service.IDepartmentService#deleteDepartment(java.lang.Integer)
	 */
	public void deleteDepartment(Integer did) {
		departmentDao.deleteDepartment(did);

	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.service.IDepartmentService#findDepartmentById(java.lang.Integer)
	 */
	public Department findDepartmentById(Integer did) {
		Department department = departmentDao.findDepartmentById(did);
		return department;
	}

}
