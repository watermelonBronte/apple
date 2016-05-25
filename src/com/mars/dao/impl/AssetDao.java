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
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mars.dao.IAssetDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.Finance;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.User;

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

	/*
	 * 根据资产类别分页查询
	 * (non-Javadoc)
	 * @see com.mars.dao.IAssetDao#findAllAssetByAttr(com.mars.tools.IPage, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Asset> findAllAssetByAc(final IPage pageInfo, final Integer acid) {
		return (List<Asset>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Asset> list = new ArrayList<Asset>();
						try {
							Criteria criteria = session
									.createCriteria(Asset.class).add(Restrictions.eq("acid",acid)) ;
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
	 * 根据用户ID分页查询
	 * (non-Javadoc)
	 * @see com.mars.dao.IAssetDao#findAllAssetByAttr(com.mars.tools.IPage, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Asset> findAllAssetByUser(final IPage pageInfo, final Integer uid) {
		return (List<Asset>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Asset> list = new ArrayList<Asset>();
						try {
							Criteria criteria = session
									.createCriteria(Asset.class).add(Restrictions.eq("uid",uid)) ;
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

	@SuppressWarnings("unchecked")
	public List<Asset> findAllAssetByAC(final IPage pageInfo, final AssetCategory ac) {
		return (List<Asset>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Asset> list = new ArrayList<Asset>();
						try {
							Criteria criteria = session
									.createCriteria(Asset.class).add(Restrictions.eq("assetCategory",ac)) ;
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
	 * @see com.mars.dao.IAssetDao#findAssetCategoryById(java.lang.Integer)
	 */
	public AssetCategory findAssetCategoryById(Integer acid) {
		AssetCategory assetCategory = (AssetCategory) super
		.getHibernateTemplate().get(AssetCategory.class,
				new Integer(acid));
         return assetCategory;
	}

	
	public User findUserById(Integer uid) {
		User user = (User) super
		.getHibernateTemplate().get(User.class,
				new Integer(uid));
         return user;
	}

	@SuppressWarnings("unchecked")
	public List<Asset> findAllAssetByUser(final IPage pageInfo, final User u) {
		return (List<Asset>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Asset> list = new ArrayList<Asset>();
						try {
							Criteria criteria = session
									.createCriteria(Asset.class).add(Restrictions.eq("user",u)) ;
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
	
	@SuppressWarnings("unchecked")
	public List<Asset> findAllAssetByPurchaseDetail(final IPage pageInfo, final PurchaseDetail pd) {
		return (List<Asset>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Asset> list = new ArrayList<Asset>();
						try {
							Criteria criteria = session
									.createCriteria(Asset.class).add(Restrictions.eq("purchaseDetail",pd)) ;
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
	@SuppressWarnings("unchecked")
	public List<Asset> findAllAssetByFinance(final IPage pageInfo, final Finance f) {
		return (List<Asset>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Asset> list = new ArrayList<Asset>();
						try {
							Criteria criteria = session
									.createCriteria(Asset.class).add(Restrictions.eq("finance",f)) ;
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
	
	public Finance findFinanceById(Integer fid) {
		Finance finance = (Finance) super
		.getHibernateTemplate().get(Finance.class,
				new Integer(fid));
         return finance;
	}
	public PurchaseDetail findPurchaseDetailById(Integer pdid) {
		PurchaseDetail pd = (PurchaseDetail) super
		.getHibernateTemplate().get(PurchaseDetail.class,
				new Integer(pdid));
         return pd;
	}
	
	/**
	 * select
	 */
	@SuppressWarnings("unchecked")
	public List<AssetCategory> findAssetCategory() {
         return (List<AssetCategory>)getHibernateTemplate().find("from AssetCategory");
	}

	@SuppressWarnings("unchecked")
	public List<Finance> findFinance() {
		 return (List<Finance>)getHibernateTemplate().find("from Finance");
			
	}

	@SuppressWarnings("unchecked")
	public List<PurchaseDetail> findPurchaseDetail() {
		return (List<PurchaseDetail>)getHibernateTemplate().find("from PurchaseDetail");
	}

	@SuppressWarnings("unchecked")
	public List<User> findUser() {
		return (List<User>)getHibernateTemplate().find("from User");
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Asset> findAllAssetByAttr(final IPage pageInfo, final Finance finance,final AssetCategory assetCategory,final User user,final PurchaseDetail purchaseDetail) {
		return (List<Asset>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Asset> list = new ArrayList<Asset>();
						try {
							Criteria criteria = session
							.createCriteria(Asset.class);
							if(finance!=null)
								criteria.add(Restrictions.eq("finance",finance));
							if(assetCategory!=null)
								criteria.add(Restrictions.eq("assetCategory",assetCategory));
							if(user!=null)
								criteria.add(Restrictions.eq("user",user));
							if(purchaseDetail!=null)
								criteria.add(Restrictions.eq("purchaseDetail",purchaseDetail));
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
