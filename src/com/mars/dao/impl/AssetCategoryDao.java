/**
 * 资产类别dao层实现类
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

import com.mars.dao.IAssetCategoryDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.AssetCategory;

/**
 * @author ye
 * @date 2016/4/19
 */
public class AssetCategoryDao extends HibernateDaoSupport implements
		IAssetCategoryDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mars.dao.IAssetCategoryDao#createAssetCategory(com.mars.vo.AssetCategory
	 * )
	 */
	public void createAssetCategory(AssetCategory assetCategory) {
		super.getHibernateTemplate().save(assetCategory);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetCategoryDao#findAssetCategory()
	 */
	@SuppressWarnings("unchecked")
	public List<AssetCategory> findAssetCategory() {
		return (List<AssetCategory>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<AssetCategory> list = new ArrayList<AssetCategory>();
						try {
							Criteria criteria = session
									.createCriteria(AssetCategory.class);
							list = (List<AssetCategory>) criteria.list();
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
	 * @see
	 * com.mars.dao.IAssetCategoryDao#updateAssetCategory(com.mars.vo.AssetCategory
	 * )
	 */
	public void updateAssetCategory(AssetCategory assetCategory) {

		super.getHibernateTemplate().update(assetCategory);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mars.dao.IAssetCategoryDao#findAllAssetCategory(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public List<AssetCategory> findAllAssetCategory(final IPage pageInfo) {
		return (List<AssetCategory>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<AssetCategory> list = new ArrayList<AssetCategory>();
						try {
							Criteria criteria = session
									.createCriteria(AssetCategory.class);
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
	 * 
	 * @see
	 * com.mars.dao.IAssetCategoryDao#deleteAssetCategory(java.lang.Integer)
	 */
	public void deleteAssetCategory(Integer acid) {
		AssetCategory assetCategory = (AssetCategory) super
				.getHibernateTemplate().load(AssetCategory.class,
						new Integer(acid));
		super.getHibernateTemplate().delete(assetCategory);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mars.dao.IAssetCategoryDao#findAssetCategoryById(java.lang.Integer)
	 */
	public AssetCategory findAssetCategoryById(Integer acid) {
		AssetCategory assetCategory = (AssetCategory) super
		.getHibernateTemplate().load(AssetCategory.class,
				new Integer(acid));
		return assetCategory;
	}
}
