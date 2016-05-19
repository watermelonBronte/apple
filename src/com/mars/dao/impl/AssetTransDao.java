/**
 * 移交dao层实现类
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

import com.mars.dao.IAssetTransDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetTrans;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public class AssetTransDao extends HibernateDaoSupport implements
		IAssetTransDao {

	/*
	 * 创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetTransDao#createAssetTrans(com.mars.vo.AssetTrans)
	 */
	public void createAssetTrans(AssetTrans assetTrans) {
		super.getHibernateTemplate().save(assetTrans);
	}

	/*查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetTransDao#findAssetTrans()
	 */
	@SuppressWarnings({ "unchecked" })
	public List<AssetTrans> findAssetTrans() {
		return (List<AssetTrans>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<AssetTrans> list = new ArrayList<AssetTrans>();
						try {
							Criteria criteria = session
									.createCriteria(AssetTrans.class);
							list = (List<AssetTrans>) criteria.list();
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
	 * @see com.mars.dao.IAssetTransDao#updateAssetTrans(com.mars.vo.AssetTrans)
	 */
	public void updateAssetTrans(AssetTrans assetTrans) {
		super.getHibernateTemplate().update(assetTrans);
	}

	/*删除
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetTransDao#deleteAssetTrans(java.lang.Integer)
	 */
	public void deleteAssetTrans(Integer atid) {
		AssetTrans assetTrans = (AssetTrans) super.getHibernateTemplate().load(
				AssetTrans.class, new Integer(atid));
		super.getHibernateTemplate().delete(assetTrans);

	}

	/*分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetTransDao#findAllAssetTrans(com.mars.tools.IPage)
	 */
	@SuppressWarnings({ "unchecked" })
	public List<AssetTrans> findAllAssetTrans(final IPage pageInfo) {
		return (List<AssetTrans>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<AssetTrans> list = new ArrayList<AssetTrans>();
						try {
							Criteria criteria = session
									.createCriteria(AssetTrans.class);
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
	 * @see com.mars.dao.IAssetTransDao#findAssetTransById(java.lang.Integer)
	 */
	public AssetTrans findAssetTransById(Integer atid) {
		AssetTrans assetTrans = (AssetTrans) super.getHibernateTemplate().get(
				AssetTrans.class, new Integer(atid));
		return assetTrans;
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
	public List<User> findUser() {
		return (List<User>)getHibernateTemplate().find("from User");
	}

}
