/**
 * 盘点详情dao层实现类
 */
package com.mars.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mars.dao.ICheckDetailDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.CheckDetail;
import com.mars.vo.Checked;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public class CheckDetailDao extends HibernateDaoSupport implements
		ICheckDetailDao {

	/*
	 * 创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICheckDetailDao#createCheckDetail(com.mars.vo.CheckDetail)
	 */
	public void createCheckDetail(CheckDetail checkDetail) {
		super.getHibernateTemplate().save(checkDetail);
	}

	/*查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICheckDetailDao#findCheckDetail()
	 */

	@SuppressWarnings("unchecked")
	public List<CheckDetail> findCheckDetail() {
		return (List<CheckDetail>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<CheckDetail> list = new ArrayList<CheckDetail>();
						try {
							Criteria criteria = session
									.createCriteria(CheckDetail.class);
							list = (List<CheckDetail>) criteria.list();
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
					}
				});
	}

	/*更新
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICheckDetailDao#updateCheckDetail(com.mars.vo.CheckDetail)
	 */
	public void updateCheckDetail(CheckDetail checkDetail) {
		super.getHibernateTemplate().update(checkDetail);
	}

	/*删除
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICheckDetailDao#deleteCheckDetail(java.lang.Integer)
	 */
	public void deleteCheckDetail(Integer cdid) {
		CheckDetail checkDetail = (CheckDetail) super.getHibernateTemplate().get(
				CheckDetail.class, new Integer(cdid));
		super.getHibernateTemplate().delete(checkDetail);

	}

	/*分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICheckDetailDao#findAllCheckDetail(com.mars.tools.IPage)
	 */
	
	@SuppressWarnings("unchecked")
	public List<CheckDetail> findAllCheckDetail(final IPage pageInfo) {
		return (List<CheckDetail>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<CheckDetail> list = new ArrayList<CheckDetail>();
						try {
							Criteria criteria = session
									.createCriteria(CheckDetail.class);
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

	/*根据ID查找
	 * (non-Javadoc)
	 * @see com.mars.dao.ICheckDetailDao#findCheckDetailById(java.lang.Integer)
	 */
	public Checked findCheckedById(Integer cid) {
		Checked check = (Checked) super.getHibernateTemplate().get(
				Checked.class, new Integer(cid));
		return check;
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

	/*
	 * 根据ID查找明细表
	 * (non-Javadoc)
	 * @see com.mars.dao.ICheckDetailDao#findCheDetailById(java.lang.Integer)
	 */
	public CheckDetail findCheckDetailById(Integer cdid) {
		CheckDetail cd = (CheckDetail) super.getHibernateTemplate().get(CheckDetail.class, new Integer(cdid));
		return cd;
	}

	@SuppressWarnings("unchecked")
	public List<Asset> findAsset() {
		return (List<Asset>)getHibernateTemplate().find("from Asset");
	}

	@SuppressWarnings("unchecked")
	public List<CheckDetail> findCheckDetailByCid(final IPage pageInfo,
			final Checked checked) {
		return (List<CheckDetail>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<CheckDetail> list = new ArrayList<CheckDetail>();
						try {
							Criteria criteria = session
									.createCriteria(CheckDetail.class).add(Restrictions.eq("checked",checked));
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

}
