/**
 * 资产逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IAssetDao;
import com.mars.service.IAssetService;
import com.mars.tools.IPage;
import com.mars.vo.Asset;

/**
 * @author ye
 * @date 2016/4/19
 */
public class AssetService implements IAssetService {

	private IAssetDao assetDao;

	public IAssetDao getAssetDao() {
		return assetDao;
	}

	public void setAssetDao(IAssetDao assetDao) {
		this.assetDao = assetDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#createAsset()
	 */
	public void createAsset(Asset asset) {
		assetDao.createAsset(asset);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#deleteAsset()
	 */
	public void deleteAsset(Integer aid) {
		assetDao.deleteAsset(aid);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#findAsset()
	 */
	public void findAsset() {
		List<Asset> list = assetDao.findAsset();
		for (Asset asset : list) {
			System.out.println(asset);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#updateAsset()
	 */
	public void updateAsset(Asset asset) {
		assetDao.updateAsset(asset);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#findAll(com.mars.tools.IPage)
	 */
	public List<Asset> findAll(IPage pageInfo) {
		List<Asset> list = assetDao.findAllAsset(pageInfo);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#findAssetById(java.lang .Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset Asset = assetDao.findAssetById(aid);
		return Asset;

	}

}
