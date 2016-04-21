/**
 * 资产类别逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.AssetCategory;

/**
 * @author ye
 * @2016/4/19
 */
public interface IAssetCategoryService {

	/**
	 * 增加资产类别
	 */
	public void createAssetCategory();
	
	/**
	 * 删除资产类别
	 */
	public void deleteAssetCategory(int acid);
	
	/**
	 * 更新资产类别
	 */
	public void updateAssetCategory();
	
	/**
	 * 查找资产类别
	 */
	public void findAssetCategory();
	
	/**
	 * 分页查找资产类别
	 * @param pageInfo
	 * @return
	 */
	public List<AssetCategory> findAll(IPage pageInfo);
}
