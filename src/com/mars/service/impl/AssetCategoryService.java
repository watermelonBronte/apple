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
	public void createAssetCategory() {
		AssetCategory assetCategory = new AssetCategory();
		// assetCategory.setAcid(1);
		assetCategory.setAccode("88");
		assetCategory.setAcname("123");
		assetCategory.setSupacid(1);
		assetCategory.setSupacname("123");
		assetCategoryDao.createAssetCategory(assetCategory);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetCategoryService#deleteAssetCategory()
	 */
	public void deleteAssetCategory(int acid) {
		AssetCategory assetCategory = new AssetCategory();
		assetCategory.setAcid(acid);
		assetCategoryDao.deleteAssetCategory(assetCategory.getAcid());
	
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetCategoryService#findAssetCategory()
	 */
	public void findAssetCategory() {
		List<AssetCategory> list = assetCategoryDao.findAssetCategory();
		for (AssetCategory assetCategory : list) {
			System.out.println(assetCategory.getAcid() + "  "
					+ assetCategory.getAccode() + "  "
					+ assetCategory.getAcname() + "  "
					+ assetCategory.getSupacid() + "  "
					+ assetCategory.getSupacname());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetCategoryService#updateAssetCategory()
	 */
	public void updateAssetCategory() {
		AssetCategory assetCategory = new AssetCategory();
		assetCategory.setAcid(1);
		assetCategoryDao.updateAssetCategory(assetCategory);
	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.service.IAssetCategoryService#findAll(com.mars.tools.IPage)
	 */
	public List<AssetCategory> findAll(IPage pageInfo) {
		List<AssetCategory> list=assetCategoryDao.findAllAssetCategory(pageInfo);
		return list;
	}

}
