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

	/* (non-Javadoc)
	 * @see com.mars.service.IDepartmentService#createDepartment()
	 */
	public void createDepartment() {
		Department department = new Department();
		department.setDname("dfg");
		departmentDao.createDepartment(department);

	}

	/* (non-Javadoc)
	 * @see com.mars.service.IDepartmentService#deleteDepartment()
	 */
	public void deleteDepartment(int did) {
		Department department = new Department();
		department.setDid(did);
		departmentDao.deleteDepartment(department.getDid());
	

	}

	/* (non-Javadoc)
	 * @see com.mars.service.IDepartmentService#findDepartment()
	 */
	public void findDepartment() {
		List<Department> list=departmentDao.findDepartment();
		for(Department department:list){
			System.out.println(department.getDid()+"  "+department.getDname());
		}

	}

	/* (non-Javadoc)
	 * @see com.mars.service.IDepartmentService#updateDepartment()
	 */
	public void updateDepartment() {
		// TODO Auto-generated method stub

	}

	public List<Department> findAll(IPage pageInfo) {
		List<Department> list=departmentDao.findAllDepartment(pageInfo);
		return list;
	}

}
