/**
 * 资产移交dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetTrans;
import com.mars.vo.User;


/**
 * @author ye
 * @date 2016/5/12
 */
public interface IAssetTransDao {

	/**
	 * 创建资产移交
	 * @param assetTrans
	 */
	public void createAssetTrans(AssetTrans assetTrans); 
	
	/**
	 * 删除资产移交
	 * @param atid
	 */
	public void deleteAssetTrans(Integer atid); 
	
	
	
	/**
	 * 更新资产移交
	 * @param assetTrans
	 */
	public void updateAssetTrans(AssetTrans assetTrans); 
	
	/**
	 * 查询资产移交
	 * @return
	 */
	public List<AssetTrans> findAssetTrans();

	/**
	 * 分页查找资产移交
	 * @param pageInfo
	 * @return
	 */
	public List<AssetTrans> findAllAssetTrans(IPage pageInfo);
	
	/**
	 * 根据ID查询资产移交
	 * @return
	 */
	public AssetTrans findAssetTransById(Integer atid);
	

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
}
