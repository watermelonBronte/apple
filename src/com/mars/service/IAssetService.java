/**
 * 资产逻辑层
 */
package com.mars.service;

import java.util.List;


import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.Finance;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;

/**
 * @author ye
 * @2016/4/19
 */
public interface IAssetService {

	/**
	 * 增加资产
	 */
	public void createAsset(Asset asset);
	
	/**
	 * 删除资产
	 */
	public void deleteAsset(Integer aid);
	
	/**
	 * 更新资产
	 */
	public void updateAsset(Asset asset);
	
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
	
	public List<Asset> findAllAssetByAC(IPage pageInfo,AssetCategory ac);
	
	/**
	 * 根据ID查找资产类别
	 * @param acid
	 * @return
	 */
	public AssetCategory findAssetCategoryById(Integer acid);
	
	/**
	 * 用户
	 * @param pageInfo
	 * @param u
	 * @return
	 */
	public List<Asset> findAllAssetByUser(IPage pageInfo,User u);
	
	/**
	 * 根据ID查找用户
	 * @param acid
	 * @return
	 */
	public User findUserById(Integer uid);
	
	/**
	 * 财务入账
	 * @param pageInfo
	 * @param f
	 * @return
	 */
	public List<Asset> findAllAssetByFinance(IPage pageInfo,Finance f);
	
	/**
	 * 
	 * @param fid
	 * @return
	 */
	public Finance findFinanceById(Integer fid);
	
	/**
	 * 采购单
	 * @param pageInfo
	 * @param pn
	 * @return
	 */
	public List<Asset> findAllAssetByPurchaseDetail(IPage pageInfo,PurchaseDetail pd);
	
	/**
	 * 
	 * @param pnid
	 * @return
	 */
	public PurchaseDetail findPurchaseDetailById(Integer pdid);
	
	/**
	 * excel
	 */
	
	
	
}
