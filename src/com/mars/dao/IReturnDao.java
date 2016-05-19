/**
 * 
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetReturn;
import com.mars.vo.User;


/**
 *@author 杨铮
 *@data 2016/5/7
 */
public interface IReturnDao {
	/**
	 * 创建资产归还
	 *@param assetReturn 资产归还对象
	 */
	public void createReturn(AssetReturn assetReturn);
	
	/**
	 * 更新资产归还
	 *@param assetReturn 资产归还对象
	 */
	public void updateReturn(AssetReturn assetReturn);
	/**
	 * 根据资产归还id查询
	 *@param arid 资产归还id
	 */
	public AssetReturn findReturnById(int arid);
	

	/**
	 * 根据资产id查询
	 *@param aid 资产id
	 */
	public Asset findReturnByAid(int aid);
	
	/**
	 * 根据领用人id查询
	 *@param guid 领用人id
	 */
	public User findReturnByGid(int guid);
	
	/**
	 * 根据归还人id查询
	 *@param ruid 归还人id
	 */
	public User findReturnByRid(int ruid);
	
	
	
	/**
	 * 根据资产归还d删除
	 *@param arid 资产归还id
	 */
	public void deletReturn(int arid);
	
	/**
	 * 查找全部角色
	 *@return 
	 */
	
	public List<AssetReturn> findAllReturn();
	public List<AssetReturn> findReturn(IPage pageInfo);//分页
	

}
