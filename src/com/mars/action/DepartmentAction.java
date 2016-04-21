/**
 * 测试部门action
 */
package com.mars.action;

import com.mars.service.IDepartmentService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author ye
 * @date 2016/4/19
 */
public class DepartmentAction extends ActionSupport{
	private IDepartmentService departmentService;

	protected IPage pageInfo = new PageInfo();   
	
	private int did;
	
	public IDepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	
	public IPage getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(IPage pageInfo) {
		this.pageInfo = pageInfo;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	/**
	 * 创建
	 * @return
	 */
	public String createDepartment() {
		departmentService.createDepartment();
		return "createDepartment";
	}
	
	/**
	 * 删除
	 * @return
	 */
	public String deleteDepartment() {
		departmentService.deleteDepartment(this.getDid());
		return "deleteDepartment";
	}
	
	/**
	 * 更新
	 * @return
	 */
	public String updateDepartment() {
		departmentService.updateDepartment();
		return "updateDepartment";
	}
	
	/**
	 * 查找
	 * @return
	 */
	public String findDepartment() {
		departmentService.findDepartment();
		return "findDepartment";
	}
	
}
