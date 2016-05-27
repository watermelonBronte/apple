/**
 * 报表资产dao层实现类
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
import com.mars.dao.IChartDao;
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
 * @date 2016/5/27
 */
public class ChartDao extends HibernateDaoSupport implements IChartDao {

	@SuppressWarnings("unchecked")
	public List<PurchaseDetail> findPurchaseDetail() {
		return (List<PurchaseDetail>) getHibernateTemplate().find("from PurchaseDetail");
	}
	
	/*
	 * 查找类别(non-Javadoc)
	 * 
	 * @see com.mars.dao.IAssetDao#findAsset()
	 */
	@SuppressWarnings("unchecked")
	public List<AssetCategory> findAssetCategory() {
		return (List<AssetCategory>) getHibernateTemplate().find("from AssetCategory");
	}
	

}
