/**
 * 资产逻辑实现类
 */
package com.mars.service.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import jxl.write.WriteException;

import com.mars.dao.IAssetDao;
import com.mars.service.IAssetService;
import com.mars.tools.ExcelOperator;
import com.mars.tools.IPage;
import com.mars.util.ExcelAsset;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.Finance;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;

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
	public void excelOutAsset() {
		List<Asset> list = assetDao.findAsset();
//		for (Asset asset : list) {
//			System.out.println(asset);
//		}
		ExcelAsset excel = new ExcelAsset();
		try {
			excel.outExcel(list, "D:/asset.xls");
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * 导入Excel
	 */
	public void excelInAsset() {
		ExcelAsset excel = new ExcelAsset();
		excel.inExcel("C:/Users/ye/Desktop/testAsset.xls");
		
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

	public List<Asset> findAllAssetByAC(IPage pageInfo,AssetCategory ac) {
		List<Asset> list = assetDao.findAllAssetByAC(pageInfo,ac);
		return list;
	}

	public AssetCategory findAssetCategoryById(Integer acid) {
		AssetCategory assetCategory = assetDao.findAssetCategoryById(acid);
		return assetCategory;
	}

	public List<Asset> findAllAssetByUser(IPage pageInfo, User u) {
		List<Asset> list = assetDao.findAllAssetByUser(pageInfo,u);
		return list;
	}

	public User findUserById(Integer uid) {
		User user = assetDao.findUserById(uid);
		return user;
	}

	public List<Asset> findAllAssetByFinance(IPage pageInfo, Finance f) {
		List<Asset> list = assetDao.findAllAssetByFinance(pageInfo,f);
		return list;
	}

	public Finance findFinanceById(Integer fid) {
		Finance finance = assetDao.findFinanceById(fid);
		return finance;
	}
	public List<Asset> findAllAssetByPurchaseDetail(IPage pageInfo, PurchaseDetail pd) {
		List<Asset> list = assetDao.findAllAssetByPurchaseDetail(pageInfo,pd);
		return list;
	}

	public PurchaseDetail findPurchaseDetailById(Integer pdid) {
		PurchaseDetail pd = assetDao.findPurchaseDetailById(pdid);
		return pd;
	}

	public List<AssetCategory> findAssetCategory() {
		
		return assetDao.findAssetCategory();
	}

	public List<Finance> findFinance() {
		return assetDao.findFinance();
	}

	public List<PurchaseDetail> findPurchaseDetail() {
		return assetDao.findPurchaseDetail();
	}

	public List<User> findUser() {
		return assetDao.findUser();
	}

	public List<Asset> findAllAssetByAttr(IPage pageInfo, Finance finance, User user,
			PurchaseDetail purchaseDetail) {
		return assetDao.findAllAssetByAttr(pageInfo, finance, user, purchaseDetail);
	}
	
	


	
}
