/**
 * 资产dao层
 */
package com.mars.dao;

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
	 * 根据资产类别分页查询资产
	 * @return
	 */
	public List<Asset> findAllAssetByAC(IPage pageInfo,AssetCategory ac);
	
	/**
	 * 根据使用人/入账人分页查询资产
	 * @return
	 */
	public List<Asset> findAllAssetByUser(IPage pageInfo,User u);
	

	/**
	 * 根据ID查询资产
	 * @return
	 */
	public Asset findAssetById(Integer acid);
	
	/**
	 * 根据ID查询用户
	 * @return
	 */
	public User findUserById(Integer uid);
	/**
	 * 根据ID查询资产类别
	 * @return
	 */
	public AssetCategory findAssetCategoryById(Integer acid);
	
	/**
	 * 根据ID查询财务入账
	 * @return
	 */
	public Finance findFinanceById(Integer fid);
	/**
	 * 
	 * @return
	 */
	public List<Asset> findAllAssetByFinance(IPage pageInfo,Finance f);
	
	/**
	 * 根据ID查询采购单
	 * @return
	 */
	public PurchaseDetail findPurchaseDetailById(Integer pdid);
	/**
	 * 
	 * @return
	 */
	public List<Asset> findAllAssetByPurchaseDetail(IPage pageInfo,PurchaseDetail pd);
	
	/**
	 * select查找
	 * @return
	 */
	public List<Finance> findFinance() ;
	public List<PurchaseDetail> findPurchaseDetail() ;
	public List<User> findUser() ;
	public List<AssetCategory> findAssetCategory() ;
	
	public List<Asset> findAllAssetByAttr(IPage pageInfo,Finance finance,User user,PurchaseDetail purchaseDetail);
	
	
}
