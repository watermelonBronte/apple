/**
 * 资产dao层实现类
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

import com.mars.dao.IAssetDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Asset;

/**
 * @author ye
 * @date 2016/5/2
 */
public class AssetDao extends HibernateDaoSupport implements
		IAssetDao {

	/*
	 * 添加对象
	 * (non-Javadoc)
	 * @see com.mars.dao.IAssetDao#createAsset(com.mars.vo.Asset
	 * )
	 */
	public void createAsset(Asset asset) {
		super.getHibernateTemplate().save(asset);

	}

	/*
	 * 查找对象
	 * (non-Javadoc)
	 * @see com.mars.dao.IAssetDao#findAsset()
	 */
	@SuppressWarnings("unchecked")
	public List<Asset> findAsset() {
		return (List<Asset>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<Asset> list = new ArrayList<Asset>();
						try {
							Criteria criteria = session
									.createCriteria(Asset.class);
							list = (List<Asset>) criteria.list();
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
					}
				});
	}

	/*
	 * 更新对象
	 * (non-Javadoc)
	 * @see com.mars.dao.IAssetDao#updateAsset(com.mars.vo.Asset
	 * )
	 */
	public void updateAsset(Asset asset) {
		super.getHibernateTemplate().update(asset);
	}

	/*
	 * 分页查找对象
	 * (non-Javadoc)
	 * @see com.mars.dao.IAssetDao#findAllAsset(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public List<Asset> findAllAsset(final IPage pageInfo) {
		return (List<Asset>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Asset> list = new ArrayList<Asset>();
						try {
							Criteria criteria = session
									.createCriteria(Asset.class);
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
	 * 根据主键删除对象
	 * (non-Javadoc)
	 * @see com.mars.dao.IAssetDao#deleteAsset(java.lang.Integer)
	 */
	public void deleteAsset(Integer aid) {
		Asset asset = (Asset) super
				.getHibernateTemplate().load(Asset.class,
						new Integer(aid));
		super.getHibernateTemplate().delete(asset);

	}

	/*
	 * 根据主键查找对象并返回对象
	 * (non-Javadoc)
	 * @see com.mars.dao.IAssetDao#findAssetById(java.lang.Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset asset = (Asset) super
				.getHibernateTemplate().get(Asset.class,
						new Integer(aid));
		return asset;
	}

	
}
