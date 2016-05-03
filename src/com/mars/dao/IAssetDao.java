/**
 * 资产dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;



/**
 * @author ye
 * @date 2016/4/19
 */
public interface IAssetDao {
	/**
	 * 创建资产
	 * @param Asset
	 */
	public void createAsset(Asset asset); 
	
	/**
	 * 删除资产
	 * @param Asset
	 */
	public void deleteAsset(Integer acid); 
	
	
	/**
	 * 更新资产
	 * @param Asset
	 */
	public void updateAsset(Asset asset); 
	
	/**
	 * 查询资产
	 * @return
	 */
	public List<Asset> findAsset();
	
	/**
	 * 分页查询资产
	 * @return
	 */
	public List<Asset> findAllAsset(IPage pageInfo);
	
	/**
	 * 根据ID查询资产
	 * @return
	 */
	public Asset findAssetById(Integer acid);
	
}
