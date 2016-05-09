/**
 * dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;


/**
 * @author ye
 * @date 2016/5/9
 */
public interface ICommonDao {

	/**
	 * 创建
	 * @param <T>
	 * @param department
	 */
	public <T> void create(T obj) throws Exception; 
	
	/**
	 * 删除
	 * @param <T>
	 * @param obj
	 * @throws Exception
	 */
	public <T> void delete(T obj) throws Exception; 
	
	
	
	/**
	 * 更新
	 * @param <T>
	 * @param obj
	 * @throws Exception
	 */
	public <T> void update(T obj) throws Exception; 
	


	/**
	 * 分页查找
	 * 返回List
	 * @param <T>
	 * @param pageInfo
	 * @return
	 * @throws Exception
	 */
	public <T> List<T> findAll(IPage pageInfo) throws Exception;
	
	/**
	 * 根据ID查询
	 * 返回对象
	 * @param <T>
	 * @return
	 */
	public <T> T findById(Class<T> cls,Integer id) throws Exception;
}
