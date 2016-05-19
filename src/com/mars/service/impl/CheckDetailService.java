/**
 * 盘点明细表逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import org.hibernate.annotations.Check;

import com.mars.dao.ICheckDetailDao;
import com.mars.service.ICheckDetailService;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.CheckDetail;
import com.mars.vo.Checked;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public class CheckDetailService implements ICheckDetailService {

	private ICheckDetailDao checkDetailDao;

	public ICheckDetailDao getCheckDetailDao() {
		return checkDetailDao;
	}

	public void setCheckDetailDao(ICheckDetailDao checkDetailDao) {
		this.checkDetailDao = checkDetailDao;
	}

	/*创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ICheckDetailService#createCheckDetail()
	 */
	public void createCheckDetail(CheckDetail checkDetail) {
		checkDetailDao.createCheckDetail(checkDetail);

	}

	/*查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ICheckDetailService#findCheckDetail()
	 */
	public void findCheckDetail() {
		List<CheckDetail> list = checkDetailDao.findCheckDetail();
		for (CheckDetail checkDetail : list) {
			System.out.println(checkDetail);
		}

	}

	/*更新
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ICheckDetailService#updateCheckDetail()
	 */
	public void updateCheckDetail(CheckDetail checkDetail) {
		checkDetailDao.updateCheckDetail(checkDetail);

	}

	/*分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ICheckDetailService#findAll(com.mars.tools.IPage)
	 */
	public List<CheckDetail> findAll(IPage pageInfo) {
		List<CheckDetail> list = checkDetailDao.findAllCheckDetail(pageInfo);
		return list;
	}

	/*删除
	 * (non-Javadoc)
	 * @see com.mars.service.ICheckDetailService#deleteCheckDetail(java.lang.Integer)
	 */
	public void deleteCheckDetail(Integer cdid) {
		checkDetailDao.deleteCheckDetail(cdid);

	}

	/*根据ID查找盘点明细表
	 * (non-Javadoc)
	 * @see com.mars.service.ICheckDetailService#findCheckDetailById(java.lang.Integer)
	 */
	public Checked findCheckedById(Integer cid) {
		Checked check = checkDetailDao.findCheckedById(cid);
		return check;
	}

	/*根据ID查找用户
	 * (non-Javadoc)
	 * @see com.mars.service.ICheckDetailService#findUserById(java.lang.Integer)
	 */
	public User findUserById(Integer uid) {
		User user = checkDetailDao.findUserById(uid);
		return user;
	}

	/*根据ID查找资产
	 * (non-Javadoc)
	 * @see com.mars.service.ICheckDetailService#findAssetById(java.lang.Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset asset=checkDetailDao.findAssetById(aid);
		return asset;
	}
	
	/*
	 * 根据	ID查找明细表
	 * (non-Javadoc)
	 * @see com.mars.service.ICheckDetailService#findAssetById(java.lang.Integer)
	 */
	public CheckDetail findCheckDetailById(Integer cdid) {
		CheckDetail cd=checkDetailDao.findCheckDetailById(cdid);
		return cd;
	}

	public List<Asset> findAsset() {
		return checkDetailDao.findAsset();
	}

	public List<CheckDetail> findCheckDetailByCid(IPage pageInfo,
			Checked checked) {
		return checkDetailDao.findCheckDetailByCid(pageInfo,checked);
	}

	

}
