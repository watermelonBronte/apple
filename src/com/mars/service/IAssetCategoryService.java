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
	public void createAssetCategory(AssetCategory assetCategory);
	
	/**
	 * 删除资产类别
	 */
	public void deleteAssetCategory(Integer acid);
	
	/**
	 * 更新资产类别
	 */
	public void updateAssetCategory(AssetCategory assetCategory);
	
	/**
	 * 查找资产类别
	 */
	public AssetCategory findAssetCategory();
	
	/**
	 * 分页查找资产类别
	 * @param pageInfo
	 * @return
	 */
	public List<AssetCategory> findAll(IPage pageInfo);

	/**
	 * 根据ID查找资产类别
	 * @param acid
	 * @return
	 */
	public AssetCategory findAssetCategoryById(Integer acid);
}
