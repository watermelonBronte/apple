/**
 * 盘点逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.ICheckedDao;
import com.mars.service.ICheckedService;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.CheckDetail;
import com.mars.vo.Checked;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public class CheckedService implements ICheckedService {

	private ICheckedDao checkedDao;

	public ICheckedDao getCheckedDao() {
		return checkedDao;
	}

	public void setCheckedDao(ICheckedDao checkedDao) {
		this.checkedDao = checkedDao;
	}

	/*创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ICheckedService#createChecked()
	 */
	public void createChecked(Checked checked) {
		checkedDao.createChecked(checked);

	}

	/*查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ICheckedService#findChecked()
	 */
	public void findChecked() {
		List<Checked> list = checkedDao.findChecked();
		for (Checked checked : list) {
			System.out.println(checked.getCdate());
		}

	}

	/*更新
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ICheckedService#updateChecked()
	 */
	public void updateChecked(Checked checked) {
		checkedDao.updateChecked(checked);

	}

	/*分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.ICheckedService#findAll(com.mars.tools.IPage)
	 */
	public List<Checked> findAll(IPage pageInfo) {
		List<Checked> list = checkedDao.findAllChecked(pageInfo);
		return list;
	}

	/*删除
	 * (non-Javadoc)
	 * @see com.mars.service.ICheckedService#deleteChecked(java.lang.Integer)
	 */
	public void deleteChecked(Integer cid) {
		checkedDao.deleteChecked(cid);

	}

	/*根据ID查找盘点
	 * (non-Javadoc)
	 * @see com.mars.service.ICheckedService#findCheckedById(java.lang.Integer)
	 */
	public Checked findCheckedById(Integer cid) {
		Checked checked = checkedDao.findCheckedById(cid);
		return checked;
	}

	/*根据ID查找用户
	 * (non-Javadoc)
	 * @see com.mars.service.ICheckedService#findUserById(java.lang.Integer)
	 */
	public User findUserById(Integer uid) {
		User user = checkedDao.findUserById(uid);
		return user;
	}

	/*根据ID查找资产
	 * (non-Javadoc)
	 * @see com.mars.service.ICheckedService#findAssetById(java.lang.Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset asset=checkedDao.findAssetById(aid);
		return asset;
	}
	
	/*
	 * 根据	ID查找明细表
	 * (non-Javadoc)
	 * @see com.mars.service.ICheckedService#findAssetById(java.lang.Integer)
	 */
	public CheckDetail findCheDetailById(Integer cdid) {
		CheckDetail cd=checkedDao.findCheDetailById(cdid);
		return cd;
	}

}
