/**
 * 参数信息逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Parameter;

/**
 * @author ye
 * @2016/4/19
 */
public interface IParameterService {

	/**
	 * 增加参数信息
	 */
	public void createParameter(Parameter parameter);
	
	/**
	 * 删除参数信息
	 */
	public void deleteParameter(Integer pid);
	
	/**
	 * 更新参数信息
	 */
	public void updateParameter(Parameter parameter);
	
	/**
	 * 查找参数信息
	 */
	public void findParameter();
	
	/**
	 * 分页查找部门
	 * @param pageInfo
	 * @return
	 */
	public List<Parameter> findAll(IPage pageInfo);
	
	/**
	 * 根据ID查找参数信息
	 * @param pid
	 * @return
	 */
	public Parameter findParameterById(Integer pid);
}
