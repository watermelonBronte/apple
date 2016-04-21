/**
 * 参数信息dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.vo.Parameter;


/**
 * @author ye
 * @date 2016/4/19
 */
public interface IParameterDao {
	/**
	 * 创建参数信息
	 * @param assetcategory
	 */
	public void createParameter(Parameter parameter); 
	
	/**
	 * 删除参数信息
	 * @param assetcategory
	 */
	public void deleteParameter(Parameter parameter); 
	
	/**
	 * 更新参数信息
	 * @param assetcategory
	 */
	public void updateParameter(Parameter parameter); 
	
	/**
	 * 查询参数信息
	 * @return
	 */
	public List<Parameter> findParameter();
	
}
