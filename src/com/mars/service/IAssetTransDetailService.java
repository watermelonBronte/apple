/**
 * 移交逻辑层
 */
package com.mars.service;

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
public interface IAssetTransDetailService {
	/**
	 * 增加移交
	 */
	public void createAssetTransDetail(AssetTransDetail assetTransDetail);
	
	/**
	 * 删除移交
	 */
	public void deleteAssetTransDetail(Integer tdid);
	
	/**
	 * 更新移交
	 */
	public void updateAssetTransDetail(AssetTransDetail assetTransDetail);
	
	/**
	 * 查找移交
	 */
	public void findAssetTransDetail();
	
	/**
	 * 分页查找移交
	 * @param pageInfo
	 * @return
	 */
	public List<AssetTransDetail> findAll(IPage pageInfo);
	
	/**
	 * 根据ID查找移交
	 * @param atid
	 * @return
	 */
	public AssetTransDetail findAssetTransDetailById(Integer tdid);
	
	/**
	 * 根据ID查找移交
	 * @param atid
	 * @return
	 */
	public AssetTrans findAssetTransById(Integer atid);
	
	/**
	 * 根据ID查找用户
	 * @param uid
	 * @return
	 */
	public User findUserById(Integer uid);
	
	/**
	 * 根据ID查找资产
	 * @param uid
	 * @return
	 */
	public Asset findAssetById(Integer aid);
	
	/**
	 * select查找
	 * @return
	 */
	
	public List<AssetTrans> findAssetTrans() ;
	public List<User> findUser() ;
	public List<Asset> findAsset() ;

	public List<AssetTransDetail> findAssetTransDetailByAtid(IPage pageInfo, AssetTrans assetTrans);
}
