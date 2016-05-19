/**
 * 资产移交清单清单dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetTrans;
import com.mars.vo.AssetTransDetail;
import com.mars.vo.User;


/**
 * @author ye
 * @date 2016/5/12
 */
public interface IAssetTransDetailDao {

	/**
	 * 创建资产移交清单
	 * @param assetTrans
	 */
	public void createAssetTransDetail(AssetTransDetail assetTransDetail); 
	
	/**
	 * 删除资产移交清单
	 * @param tdid
	 */
	public void deleteAssetTransDetail(Integer tdid); 
	
	
	
	/**
	 * 更新资产移交清单
	 * @param assetTrans
	 */
	public void updateAssetTransDetail(AssetTransDetail assetTransDetail); 
	
	/**
	 * 查询资产移交清单
	 * @return
	 */
	public List<AssetTransDetail> findAssetTransDetail();

	/**
	 * 分页查找资产移交清单
	 * @param pageInfo
	 * @return
	 */
	public List<AssetTransDetail> findAllAssetTransDetail(IPage pageInfo);
	
	/**
	 * 根据ID查询资产移交清单
	 * @return
	 */
	public AssetTransDetail findAssetTransDetailById(Integer tdid);
	

	/**
	 * 根据ID查询用户
	 * @return
	 */
	public User findUserById(Integer uid);
	
	/**
	 * 根据ID查询资产
	 * @return
	 */
	public Asset findAssetById(Integer aid);
	
	/**
	 * 根据ID查找移交
	 * @param atid
	 * @return
	 */
	public AssetTrans findAssetTransById(Integer atid);
	
	/**
	 * select查找
	 * @return
	 */
	
	public List<AssetTrans> findAssetTrans() ;
	public List<User> findUser() ;
	public List<Asset> findAsset() ;

	public List<AssetTransDetail> findAssetTransDetailByAtid(IPage pageInfo, AssetTrans assetTrans);
}
