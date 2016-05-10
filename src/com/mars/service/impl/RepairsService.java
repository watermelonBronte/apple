/**
 * 维修逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IRepairsDao;
import com.mars.service.IRepairsService;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Repairs;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/10
 */
public class RepairsService implements IRepairsService {

	private IRepairsDao repairsDao;

	public IRepairsDao getRepairsDao() {
		return repairsDao;
	}

	public void setRepairsDao(IRepairsDao repairsDao) {
		this.repairsDao = repairsDao;
	}

	/*创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IRepairsService#createRepairs()
	 */
	public void createRepairs(Repairs repairs) {
		repairsDao.createRepairs(repairs);

	}

	/*查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IRepairsService#findRepairs()
	 */
	public void findRepairs() {
		List<Repairs> list = repairsDao.findRepairs();
		for (Repairs repairs : list) {
			System.out.println(repairs.getRecondition());
		}

	}

	/*更新
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IRepairsService#updateRepairs()
	 */
	public void updateRepairs(Repairs repairs) {
		repairsDao.updateRepairs(repairs);

	}

	/*分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IRepairsService#findAll(com.mars.tools.IPage)
	 */
	public List<Repairs> findAll(IPage pageInfo) {
		List<Repairs> list = repairsDao.findAllRepairs(pageInfo);
		return list;
	}

	/*删除
	 * (non-Javadoc)
	 * @see com.mars.service.IRepairsService#deleteRepairs(java.lang.Integer)
	 */
	public void deleteRepairs(Integer reid) {
		repairsDao.deleteRepairs(reid);

	}

	/*根据ID查找维修
	 * (non-Javadoc)
	 * @see com.mars.service.IRepairsService#findRepairsById(java.lang.Integer)
	 */
	public Repairs findRepairsById(Integer reid) {
		Repairs repairs = repairsDao.findRepairsById(reid);
		return repairs;
	}

	/*根据ID查找用户
	 * (non-Javadoc)
	 * @see com.mars.service.IRepairsService#findUserById(java.lang.Integer)
	 */
	public User findUserById(Integer uid) {
		User user = repairsDao.findUserById(uid);
		return user;
	}

	/*根据ID查找资产
	 * (non-Javadoc)
	 * @see com.mars.service.IRepairsService#findAssetById(java.lang.Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset asset=repairsDao.findAssetById(aid);
		return asset;
	}

}
