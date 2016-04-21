/**
 * 测试参数信息action
 */
package com.mars.action;

import com.mars.service.IParameterService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author ye
 * @date 2016/4/19
 */
public class ParameterAction extends ActionSupport{
	private IParameterService parameterService;

	protected IPage pageInfo = new PageInfo();   
	
	private int pid;
	
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

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * 创建
	 * @return
	 */
	public String createParameter() {
		parameterService.createParameter();
		return "createParameter";
	}
	
	/**
	 * 删除
	 * @return
	 */
	public String deleteParameter() {
		parameterService.deleteParameter(this.getPid());
		return "deleteParameter";
	}
	
	/**
	 * 更新
	 * @return
	 */
	public String updateParameter() {
		parameterService.updateParameter();
		return "updateParameter";
	}
	
	/**
	 * 查找
	 * @return
	 */
	public String findParameter() {
		parameterService.findParameter();
		return "findParameter";
	}
	
}
