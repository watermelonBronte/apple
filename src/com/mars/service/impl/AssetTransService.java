/**
 * 资产移交逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IAssetTransDao;
import com.mars.service.IAssetTransService;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetTrans;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public class AssetTransService implements IAssetTransService {

	private IAssetTransDao assetTransDao;

	public IAssetTransDao getAssetTransDao() {
		return assetTransDao;
	}

	public void setAssetTransDao(IAssetTransDao assetTransDao) {
		this.assetTransDao = assetTransDao;
	}

	/*创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetTransService#createAssetTrans()
	 */
	public void createAssetTrans(AssetTrans assetTrans) {
		assetTransDao.createAssetTrans(assetTrans);

	}

	/*查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetTransService#findAssetTrans()
	 */
	public void findAssetTrans() {
		List<AssetTrans> list = assetTransDao.findAssetTrans();
		for (AssetTrans assetTrans : list) {
			System.out.println(assetTrans);
		}

	}

	/*更新
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetTransService#updateAssetTrans()
	 */
	public void updateAssetTrans(AssetTrans assetTrans) {
		assetTransDao.updateAssetTrans(assetTrans);

	}

	/*分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetTransService#findAll(com.mars.tools.IPage)
	 */
	public List<AssetTrans> findAll(IPage pageInfo) {
		List<AssetTrans> list = assetTransDao.findAllAssetTrans(pageInfo);
		return list;
	}

	/*删除
	 * (non-Javadoc)
	 * @see com.mars.service.IAssetTransService#deleteAssetTrans(java.lang.Integer)
	 */
	public void deleteAssetTrans(Integer atid) {
		assetTransDao.deleteAssetTrans(atid);

	}

	/*根据ID查找资产移交
	 * (non-Javadoc)
	 * @see com.mars.service.IAssetTransService#findAssetTransById(java.lang.Integer)
	 */
	public AssetTrans findAssetTransById(Integer atid) {
		AssetTrans assetTrans = assetTransDao.findAssetTransById(atid);
		return assetTrans;
	}

	/*根据ID查找用户
	 * (non-Javadoc)
	 * @see com.mars.service.IAssetTransService#findUserById(java.lang.Integer)
	 */
	public User findUserById(Integer uid) {
		User user = assetTransDao.findUserById(uid);
		return user;
	}

	/*根据ID查找资产
	 * (non-Javadoc)
	 * @see com.mars.service.IAssetTransService#findAssetById(java.lang.Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset asset=assetTransDao.findAssetById(aid);
		return asset;
	}

	public List<User> findUser() {
		return assetTransDao.findUser();
	}

}
