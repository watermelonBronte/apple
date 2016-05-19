/**
 * 报废dao层实现类
 */
package com.mars.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mars.dao.IScrapDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Scrap;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/10
 */
public class ScrapDao extends HibernateDaoSupport implements
		IScrapDao {

	/*
	 * 创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IScrapDao#createScrap(com.mars.vo.Scrap)
	 */
	public void createScrap(Scrap scrap) {
		super.getHibernateTemplate().save(scrap);
	}

	/*
	 * 查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IScrapDao#findScrap()
	 */
	@SuppressWarnings("unchecked")
	public List<Scrap> findScrap() {
		return (List<Scrap>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<Scrap> list = new ArrayList<Scrap>();
						try {
							Criteria criteria = session
									.createCriteria(Scrap.class);
							list = (List<Scrap>) criteria.list();
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
					}
				});
	}

	/*
	 * 更新
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IScrapDao#updateScrap(com.mars.vo.Scrap)
	 */
	public void updateScrap(Scrap scrap) {
		super.getHibernateTemplate().update(scrap);
	}

	/*
	 * 删除
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IScrapDao#deleteScrap(java.lang.Integer)
	 */
	public void deleteScrap(Integer scid) {
		Scrap scrap = (Scrap) super.getHibernateTemplate().get(
				Scrap.class, new Integer(scid));
		super.getHibernateTemplate().delete(scrap);

	}

	/*
	 * 分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IScrapDao#findAllScrap(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public List<Scrap> findAllScrap(final IPage pageInfo) {
		return (List<Scrap>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Scrap> list = new ArrayList<Scrap>();
						try {
							Criteria criteria = session
									.createCriteria(Scrap.class);
							IExecute exc = new Execute(pageInfo);
							pages = exc.excute(criteria);
							if (pages != null) {
								list = pages.getResult();
							}
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;

					}
				});
	}

	/*
	 * 根据ID查找报废
	 * (non-Javadoc)
	 * @see com.mars.dao.IScrapDao#findScrapById(java.lang.Integer)
	 */
	public Scrap findScrapById(Integer scid) {
		Scrap scrap = (Scrap) super.getHibernateTemplate().get(
				Scrap.class, new Integer(scid));
		return scrap;
	}

	/*
	 * 根据ID查找用户
	 * (non-Javadoc)
	 * @see com.mars.dao.IScrapDao#findUserById(java.lang.Integer)
	 */
	public User findUserById(Integer uid) {
		User user = (User) super.getHibernateTemplate().get(User.class, new Integer(uid));
		return user;
	}

	/*
	 * 根据ID查找资产
	 * (non-Javadoc)
	 * @see com.mars.dao.IScrapDao#findUserById(java.lang.Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset asset = (Asset) super.getHibernateTemplate().get(Asset.class, new Integer(aid));
		return asset;
	}

	@SuppressWarnings("unchecked")
	public List<Asset> findAsset() {
		return (List<Asset>)getHibernateTemplate().find("from Asset");
	}

	@SuppressWarnings("unchecked")
	public List<User> findUser() {
		return (List<User>)getHibernateTemplate().find("from User");
	}
}
