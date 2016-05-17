/**
 * 移交逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetTrans;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public interface IAssetTransService {
	/**
	 * 增加移交
	 */
	public void createAssetTrans(AssetTrans assetTrans);
	
	/**
	 * 删除移交
	 */
	public void deleteAssetTrans(Integer atid);
	
	/**
	 * 更新移交
	 */
	public void updateAssetTrans(AssetTrans assetTrans);
	
	/**
	 * 查找移交
	 */
	public void findAssetTrans();
	
	/**
	 * 分页查找移交
	 * @param pageInfo
	 * @return
	 */
	public List<AssetTrans> findAll(IPage pageInfo);
	
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

	public List<User> findUser() ;
}
