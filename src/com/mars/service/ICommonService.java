/**
 * 逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;

/**
 * @author ye
 * @date 2016/5/9
 */
public interface ICommonService {

	/**
	 * 添加
	 * 
	 * @param <T>
	 * @param obj
	 * @throws Exception
	 */
	public <T> Boolean create(T obj) throws Exception;

	/**
	 * 删除
	 * 
	 * @param <T>
	 * @param obj
	 * @throws Exception
	 */
	public <T> Boolean delete(T obj) throws Exception;

	/**
	 * 更新
	 * @param <T>
	 * @param obj
	 * @throws Exception
	 */
	public <T> Boolean updateDepartment(T obj) throws Exception;


	/**
	 * 分页查找
	 * 返回List
	 * @param <T>
	 * @param pageInfo
	 * @return
	 */
	public <T> List<T> findAll(IPage pageInfo) throws Exception;

	/**
	 * 根据ID查找
	 * 返回对象
	 * @param <T>
	 * @param cls
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public <T> T findById(Class<T> cls,Integer id) throws Exception;
}
