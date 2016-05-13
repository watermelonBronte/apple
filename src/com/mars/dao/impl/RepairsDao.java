/**
 * 维修dao层实现类
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

import com.mars.dao.IRepairsDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Repairs;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/10
 */
public class RepairsDao extends HibernateDaoSupport implements
		IRepairsDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IRepairsDao#createRepairs(com.mars.vo.Repairs)
	 */
	public void createRepairs(Repairs repairs) {
		super.getHibernateTemplate().save(repairs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IRepairsDao#findRepairs()
	 */
	@SuppressWarnings("unchecked")
	public List<Repairs> findRepairs() {
		return (List<Repairs>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<Repairs> list = new ArrayList<Repairs>();
						try {
							Criteria criteria = session
									.createCriteria(Repairs.class);
							list = (List<Repairs>) criteria.list();
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
					}
				});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IRepairsDao#updateRepairs(com.mars.vo.Repairs)
	 */
	public void updateRepairs(Repairs repairs) {
		super.getHibernateTemplate().update(repairs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IRepairsDao#deleteRepairs(java.lang.Integer)
	 */
	public void deleteRepairs(Integer reid) {
		Repairs repairs = (Repairs) super.getHibernateTemplate().get(
				Repairs.class, new Integer(reid));
		super.getHibernateTemplate().delete(repairs);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IRepairsDao#findAllRepairs(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public List<Repairs> findAllRepairs(final IPage pageInfo) {
		return (List<Repairs>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Repairs> list = new ArrayList<Repairs>();
						try {
							Criteria criteria = session
									.createCriteria(Repairs.class);
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
	 * (non-Javadoc)
	 * @see com.mars.dao.IRepairsDao#findRepairsById(java.lang.Integer)
	 */
	public Repairs findRepairsById(Integer reid) {
		Repairs repairs = (Repairs) super.getHibernateTemplate().get(
				Repairs.class, new Integer(reid));
		return repairs;
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

}
