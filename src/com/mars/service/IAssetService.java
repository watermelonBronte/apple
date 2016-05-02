/**
 * 资产逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;

/**
 * @author ye
 * @2016/4/19
 */
public interface IAssetService {

	/**
	 * 增加资产
	 */
	public void createAsset(Asset Asset);
	
	/**
	 * 删除资产
	 */
	public void deleteAsset(Integer aid);
	
	/**
	 * 更新资产
	 */
	public void updateAsset(Asset Asset);
	
	/**
	 * 查找资产
	 */
	public void findAsset();
	
	/**
	 * 分页查找资产
	 * @param pageInfo
	 * @return
	 */
	public List<Asset> findAll(IPage pageInfo);

	/**
	 * 根据ID查找资产
	 * @param aid
	 * @return
	 */
	public Asset findAssetById(Integer aid);
}
