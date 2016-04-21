/**
 * 参数信息逻辑层
 */
package com.mars.service;

/**
 * @author ye
 * @2016/4/19
 */
public interface IParameterService {

	/**
	 * 增加参数信息
	 */
	public void createParameter();
	
	/**
	 * 删除参数信息
	 */
	public void deleteParameter();
	
	/**
	 * 更新参数信息
	 */
	public void updateParameter();
	
	/**
	 * 查找参数信息
	 */
	public void findParameter();
}
