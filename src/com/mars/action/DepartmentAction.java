/**
 * 测试部门action
 */
package com.mars.action;



import com.mars.service.IDepartmentService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Department;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author ye
 * @date 2016/4/19
 */
public class DepartmentAction extends ActionSupport{
	private IDepartmentService departmentService;

	protected IPage pageInfo = new PageInfo();   
	
	private Integer did;
	private String dname;
	private Department department = new Department();
	
	private String result;
	
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

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

	

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getDid() {
		return did;
	}

	/**
	 * 添加界面
	 * @return
	 */
	public String addDepartment()
	{
		return "addDepartment";
	}
	/**
	 * 创建
	 * @return
	 */
	public String createDepartment() {
		department.setDname(this.getDname());
		departmentService.createDepartment(department);
//		this.setResult("创建");
//		return "successDepartment";
		pageDepartment();
		return "pageDepartment";
	}
	
	/**
	 * 删除
	 * @return
	 */
	public String deleteDepartment() {
		departmentService.deleteDepartment(this.getDid());
//		this.setResult("删除");
//		return "successDepartment";
		pageDepartment();
		return "pageDepartment";
	}
	
	/**
	 * 更新
	 * @return
	 */
	public String updateDepartment() {
		department.setDid(this.getDid());
		department.setDname(this.getDname());
		departmentService.updateDepartment(department);
//		this.setResult("更新");
//		return "successDepartment";
		pageDepartment();
		return "pageDepartment";
	}
	
	
	
	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findDepartmentById() {

		department = departmentService.findDepartmentById(this
				.getDid());
		
		this.setDid(department.getDid());
		this.setDname(department.getDname());
		return "findDepartmentById";
	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageDepartment() {
		this.getPageInfo().setResult((departmentService.findAll(pageInfo)));

		return "pageDepartment";
	}
}
