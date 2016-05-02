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

	private IAssetDao AssetDao;

	public IAssetDao getAssetDao() {
		return AssetDao;
	}

	public void setAssetDao(IAssetDao AssetDao) {
		this.AssetDao = AssetDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#createAsset()
	 */
	public void createAsset(Asset Asset) {
		AssetDao.createAsset(Asset);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#deleteAsset()
	 */
	public void deleteAsset(Integer aid) {
		AssetDao.deleteAsset(aid);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#findAsset()
	 */
	public void findAsset() {
		List<Asset> list = AssetDao.findAsset();
		for (Asset Asset : list) {
			System.out.println(Asset);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#updateAsset()
	 */
	public void updateAsset(Asset Asset) {
		AssetDao.updateAsset(Asset);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#findAll(com.mars.tools.IPage)
	 */
	public List<Asset> findAll(IPage pageInfo) {
		List<Asset> list = AssetDao.findAllAsset(pageInfo);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetService#findAssetById(java.lang .Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset Asset = AssetDao.findAssetById(aid);
		return Asset;

	}

}
