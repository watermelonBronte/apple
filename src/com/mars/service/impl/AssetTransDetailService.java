/**
 * 资产移交清单逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IAssetTransDetailDao;
import com.mars.service.IAssetTransDetailService;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetTrans;
import com.mars.vo.AssetTransDetail;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public class AssetTransDetailService implements IAssetTransDetailService {

	private IAssetTransDetailDao assetTransDetailDao;

	public IAssetTransDetailDao getAssetTransDetailDao() {
		return assetTransDetailDao;
	}

	public void setAssetTransDetailDao(IAssetTransDetailDao assetTransDetailDao) {
		this.assetTransDetailDao = assetTransDetailDao;
	}

	/*创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetTransDetailService#createAssetTransDetail()
	 */
	public void createAssetTransDetail(AssetTransDetail assetTransDetail) {
		assetTransDetailDao.createAssetTransDetail(assetTransDetail);

	}

	/*查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetTransDetailService#findAssetTransDetail()
	 */
	public void findAssetTransDetail() {
		List<AssetTransDetail> list = assetTransDetailDao.findAssetTransDetail();
		for (AssetTransDetail assetTransDetail : list) {
			System.out.println(assetTransDetail);
		}

	}

	/*更新
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetTransDetailService#updateAssetTransDetail()
	 */
	public void updateAssetTransDetail(AssetTransDetail assetTransDetail) {
		assetTransDetailDao.updateAssetTransDetail(assetTransDetail);

	}

	/*分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IAssetTransDetailService#findAll(com.mars.tools.IPage)
	 */
	public List<AssetTransDetail> findAll(IPage pageInfo) {
		List<AssetTransDetail> list = assetTransDetailDao.findAllAssetTransDetail(pageInfo);
		return list;
	}

	/*删除
	 * (non-Javadoc)
	 * @see com.mars.service.IAssetTransDetailService#deleteAssetTransDetail(java.lang.Integer)
	 */
	public void deleteAssetTransDetail(Integer tdid) {
		assetTransDetailDao.deleteAssetTransDetail(tdid);

	}

	/*根据ID查找资产移交清单
	 * (non-Javadoc)
	 * @see com.mars.service.IAssetTransDetailService#findAssetTransDetailById(java.lang.Integer)
	 */
	public AssetTransDetail findAssetTransDetailById(Integer tdid) {
		AssetTransDetail assetTransDetail = assetTransDetailDao.findAssetTransDetailById(tdid);
		return assetTransDetail;
	}

	/*根据ID查找用户
	 * (non-Javadoc)
	 * @see com.mars.service.IAssetTransDetailService#findUserById(java.lang.Integer)
	 */
	public User findUserById(Integer uid) {
		User user = assetTransDetailDao.findUserById(uid);
		return user;
	}

	/*根据ID查找资产
	 * (non-Javadoc)
	 * @see com.mars.service.IAssetTransDetailService#findAssetById(java.lang.Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset asset=assetTransDetailDao.findAssetById(aid);
		return asset;
	}

	public List<Asset> findAsset() {
		return assetTransDetailDao.findAsset();
	}

	public List<AssetTrans> findAssetTrans() {
		return assetTransDetailDao.findAssetTrans();
	}

	public List<User> findUser() {
		return assetTransDetailDao.findUser();
	}

	public AssetTrans findAssetTransById(Integer atid) {
		return assetTransDetailDao.findAssetTransById(atid);
	}

	public List<AssetTransDetail> findAssetTransDetailByAtid(IPage pageInfo, AssetTrans assetTrans) {
		return assetTransDetailDao.findAssetTransDetailByAtid(pageInfo,assetTrans);
	}

}
