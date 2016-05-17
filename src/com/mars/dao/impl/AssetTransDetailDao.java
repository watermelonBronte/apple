/**
 * 移交清单dao层实现类
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

import com.mars.dao.IAssetTransDetailDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.AssetTrans;
import com.mars.vo.AssetTransDetail;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public class AssetTransDetailDao extends HibernateDaoSupport implements
		IAssetTransDetailDao {

	/*
	 * 创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetTransDetailDao#createAssetTransDetail(com.mars.vo.AssetTransDetail)
	 */
	public void createAssetTransDetail(AssetTransDetail assetTransDetail) {
		super.getHibernateTemplate().save(assetTransDetail);
	}

	/*查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetTransDetailDao#findAssetTransDetail()
	 */
	@SuppressWarnings({ "unchecked" })
	public List<AssetTransDetail> findAssetTransDetail() {
		return (List<AssetTransDetail>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<AssetTransDetail> list = new ArrayList<AssetTransDetail>();
						try {
							Criteria criteria = session
									.createCriteria(AssetTransDetail.class);
							list = (List<AssetTransDetail>) criteria.list();
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
	 * @see com.mars.dao.IAssetTransDetailDao#updateAssetTransDetail(com.mars.vo.AssetTransDetail)
	 */
	public void updateAssetTransDetail(AssetTransDetail assetTransDetail) {
		super.getHibernateTemplate().update(assetTransDetail);
	}

	/*删除
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetTransDetailDao#deleteAssetTransDetail(java.lang.Integer)
	 */
	public void deleteAssetTransDetail(Integer tdid) {
		AssetTransDetail assetTransDetail = (AssetTransDetail) super.getHibernateTemplate().load(
				AssetTransDetail.class, new Integer(tdid));
		super.getHibernateTemplate().delete(assetTransDetail);

	}

	/*分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetTransDetailDao#findAllAssetTransDetail(com.mars.tools.IPage)
	 */
	@SuppressWarnings({ "unchecked" })
	public List<AssetTransDetail> findAllAssetTransDetail(final IPage pageInfo) {
		return (List<AssetTransDetail>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<AssetTransDetail> list = new ArrayList<AssetTransDetail>();
						try {
							Criteria criteria = session
									.createCriteria(AssetTransDetail.class);
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
	 * @see com.mars.dao.IAssetTransDetailDao#findAssetTransDetailById(java.lang.Integer)
	 */
	public AssetTransDetail findAssetTransDetailById(Integer tdid) {
		AssetTransDetail assetTrans = (AssetTransDetail) super.getHibernateTemplate().get(
				AssetTransDetail.class, new Integer(tdid));
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
	public List<Asset> findAsset() {
		  return (List<Asset>)getHibernateTemplate().find("from Asset");
	}

	@SuppressWarnings("unchecked")
	public List<AssetTrans> findAssetTrans() {
        return (List<AssetTrans>)getHibernateTemplate().find("from AssetTrans");
	}

	@SuppressWarnings("unchecked")
	public List<User> findUser() {
		return (List<User>)getHibernateTemplate().find("from User");
	}

	public AssetTrans findAssetTransById(Integer atid) {
		AssetTrans assetTrans = (AssetTrans) super.getHibernateTemplate().get(
				AssetTrans.class, new Integer(atid));
		return assetTrans;
	}

}
