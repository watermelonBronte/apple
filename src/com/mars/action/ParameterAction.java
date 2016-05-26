/**
 * 测试参数信息action
 */
package com.mars.action;

import com.mars.service.IParameterService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Parameter;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author ye
 * @date 2016/4/19
 */
public class ParameterAction extends ActionSupport{
	private IParameterService parameterService;

	protected IPage pageInfo = new PageInfo();   
	
	private String result;
	private Integer pid;
	private String pname;
	private String pnum;
	private Integer ptypeid;
	private String ptypename;
	private Parameter parameter= new Parameter(); 
	
	
	public IParameterService getParameterService() {
		return parameterService;
	}

	public void setParameterService(IParameterService parameterService) {
		this.parameterService = parameterService;
	}

	
	public IPage getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(IPage pageInfo) {
		this.pageInfo = pageInfo;
	}

	
    
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public Integer getPtypeid() {
		return ptypeid;
	}

	public void setPtypeid(Integer ptypeid) {
		this.ptypeid = ptypeid;
	}

	public String getPtypename() {
		return ptypename;
	}

	public void setPtypename(String ptypename) {
		this.ptypename = ptypename;
	}

	public Parameter getParameter() {
		return parameter;
	}

	public void setParameter(Parameter parameter) {
		this.parameter = parameter;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * 添加界面
	 * @return
	 */
	public String addParameter()
	{
		return "addParameter";
	}
	/**
	 * 创建
	 * @return
	 */
	public String createParameter() {
		try {
			parameter.setPname(this.getPname());
			parameter.setPnum(this.getPnum());
			parameter.setPtypeid(this.getPtypeid());
			parameter.setPtypename(this.getPtypename());

			parameterService.createParameter(parameter);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		pageParameter();
		return "pageParameter";
	}
	
	/**
	 * 删除
	 * @return
	 */
	public String deleteParameter() {
		try {
			parameterService.deleteParameter(this.getPid());
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		pageParameter();
		return "pageParameter";
	}
	
	/**
	 * 更新
	 * @return
	 */
	public String updateParameter() {
		try {
			parameter.setPid(this.getPid());
			parameter.setPname(this.getPname());
			parameter.setPnum(this.getPnum());
			parameter.setPtypeid(this.getPtypeid());
			parameter.setPtypename(this.getPtypename());
			parameterService.updateParameter(parameter);
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		pageParameter();
		return "pageParameter";
	}
	

	
	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findParameterById() {

		try {
			parameter = parameterService.findParameterById(this
					.getPid());
			

			this.setPid(parameter.getPid());
			this.setPname(parameter.getPname());
			this.setPnum(parameter.getPnum());
			this.setPtypeid(parameter.getPtypeid());
			this.setPtypename(parameter.getPtypename());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "findParameterById";
	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageParameter() {
		this.getPageInfo().setResult((parameterService.findAll(pageInfo)));

		return "pageParameter";
	}
}
