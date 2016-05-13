/**
 * 资产类别逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IAssetCategoryDao;
import com.mars.service.IAssetCategoryService;
import com.mars.tools.IPage;
import com.mars.vo.AssetCategory;

/**
 * @author ye
 * @date 2016/4/19
 */
public class AssetCategoryService implements IAssetCategoryService {

	private IAssetCategoryDao assetCategoryDao;

	public IAssetCategoryDao getAssetCategoryDao() {
		return assetCategoryDao;
	}

	public void setAssetCategoryDao(IAssetCategoryDao assetCategoryDao) {
		this.assetCategoryDao = assetCategoryDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetCategoryService#createAssetCategory()
	 */
	public void createAssetCategory(AssetCategory assetCategory) {
		assetCategoryDao.createAssetCategory(assetCategory);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetCategoryService#deleteAssetCategory()
	 */
	public void deleteAssetCategory(Integer acid) {
		assetCategoryDao.deleteAssetCategory(acid);

	}

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetCategoryService#updateAssetCategory()
	 */
	public void updateAssetCategory(AssetCategory assetCategory) {
		assetCategoryDao.updateAssetCategory(assetCategory);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetCategoryService#findAll(com.mars.tools.IPage)
	 */
	public List<AssetCategory> findAll(IPage pageInfo) {
		List<AssetCategory> list = assetCategoryDao
				.findAllAssetCategory(pageInfo);
//		System.out.println(pageInfo);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mars.service.IAssetCategoryService#findAssetCategoryById(java.lang
	 * .Integer)
	 */
	public AssetCategory findAssetCategoryById(Integer acid) {
		AssetCategory assetCategory = assetCategoryDao
				.findAssetCategoryById(acid);
		return assetCategory;

	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.service.IAssetCategoryService#findAssetCategory()
	 */
	public void findAssetCategory() {
		List<AssetCategory> list = assetCategoryDao.findAssetCategory();
		for (AssetCategory department : list) {
			System.out.println(department.getAccode()+ "  "
					+ department.getAcname());
		
	}
	}
}
