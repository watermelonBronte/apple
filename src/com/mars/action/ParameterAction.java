/**
 * 测试参数信息action
 */
package com.mars.action;

import com.mars.service.IParameterService;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author ye
 * @date 2016/4/19
 */
public class ParameterAction extends ActionSupport{
	private IParameterService parameterService;

	
	
	public IParameterService getParameterService() {
		return parameterService;
	}

	public void setParameterService(IParameterService parameterService) {
		this.parameterService = parameterService;
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
		parameterService.deleteParameter();
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
