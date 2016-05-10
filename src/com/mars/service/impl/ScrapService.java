/**
 * 报废逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IScrapDao;
import com.mars.service.IScrapService;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Scrap;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/10
 */
public class ScrapService implements IScrapService {

	private IScrapDao scrapDao;

	public IScrapDao getScrapDao() {
		return scrapDao;
	}

	public void setScrapDao(IScrapDao scrapDao) {
		this.scrapDao = scrapDao;
	}

	/*创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IScrapService#createScrap()
	 */
	public void createScrap(Scrap scrap) {
		scrapDao.createScrap(scrap);

	}

	/*查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IScrapService#findScrap()
	 */
	public void findScrap() {
		List<Scrap> list = scrapDao.findScrap();
		for (Scrap scrap : list) {
			System.out.println(scrap.getAsset());
		}

	}

	/*更新
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IScrapService#updateScrap()
	 */
	public void updateScrap(Scrap scrap) {
		scrapDao.updateScrap(scrap);

	}

	/*分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IScrapService#findAll(com.mars.tools.IPage)
	 */
	public List<Scrap> findAll(IPage pageInfo) {
		List<Scrap> list = scrapDao.findAllScrap(pageInfo);
		return list;
	}

	/*删除
	 * (non-Javadoc)
	 * @see com.mars.service.IScrapService#deleteScrap(java.lang.Integer)
	 */
	public void deleteScrap(Integer scid) {
		scrapDao.deleteScrap(scid);

	}

	/*根据ID查找报废
	 * (non-Javadoc)
	 * @see com.mars.service.IScrapService#findScrapById(java.lang.Integer)
	 */
	public Scrap findScrapById(Integer scid) {
		Scrap scrap = scrapDao.findScrapById(scid);
		return scrap;
	}

	/*根据ID查找用户
	 * (non-Javadoc)
	 * @see com.mars.service.IScrapService#findUserById(java.lang.Integer)
	 */
	public User findUserById(Integer uid) {
		User user = scrapDao.findUserById(uid);
		return user;
	}

	/*根据ID查找资产
	 * (non-Javadoc)
	 * @see com.mars.service.IScrapService#findAssetById(java.lang.Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset asset=scrapDao.findAssetById(aid);
		return asset;
	}

}
