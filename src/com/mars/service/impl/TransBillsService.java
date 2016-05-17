/**
 * 调度单逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.ITransBillsDao;
import com.mars.service.ITransBillsService;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.TransBills;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/9
 */
public class TransBillsService implements ITransBillsService {

	private ITransBillsDao transBillsDao;

	public ITransBillsDao getTransBillsDao() {
		return transBillsDao;
	}

	public void setTransBillsDao(ITransBillsDao transBillsDao) {
		this.transBillsDao = transBillsDao;
	}

	/*
	 * 创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ITransBillsService#createTransBills()
	 */
	public void createTransBills(TransBills transBills) {
		transBillsDao.createTransBills(transBills);

	}

	/*
	 * 查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ITransBillsService#findTransBills()
	 */
	public void findTransBills() {
		List<TransBills> list = transBillsDao.findTransBills();
		for (TransBills transBills : list) {
			System.out.println(transBills.getTbid());
		}

	}

	/*
	 * 更新
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ITransBillsService#updateTransBills()
	 */
	public void updateTransBills(TransBills transBills) {
		transBillsDao.updateTransBills(transBills);

	}

	/*
	 * 查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ITransBillsService#findAll(com.mars.tools.IPage)
	 */
	public List<TransBills> findAll(IPage pageInfo) {
		List<TransBills> list = transBillsDao.findAllTransBills(pageInfo);
		return list;
	}

	/*
	 * 删除
	 * (non-Javadoc)
	 * @see com.mars.service.ITransBillsService#deleteTransBills(java.lang.Integer)
	 */
	public void deleteTransBills(Integer tbid) {
		transBillsDao.deleteTransBills(tbid);

	}

	/*
	 * 根据ID查找
	 * (non-Javadoc)
	 * @see com.mars.service.ITransBillsService#findTransBillsById(java.lang.Integer)
	 */
	public TransBills findTransBillsById(Integer tbid) {
		TransBills transBills = transBillsDao.findTransBillsById(tbid);
		return transBills;
	}

	public Asset findAssetById(Integer aid) {
		Asset asset = transBillsDao.findAssetById(aid);
		return asset;
	}

	public User findUserById(Integer uid) {
		User user = transBillsDao.findUserById(uid);
		return user;
	}

	public List<Asset> findAsset() {
		return transBillsDao.findAsset();
	}

	public List<User> findUser() {
		return transBillsDao.findUser();
	}

}
