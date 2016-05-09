/**
 * 调度单dao层实现类
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

import com.mars.dao.ITransBillsDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.TransBills;

/**
 * @author ye
 * @date 2016/5/9
 */
public class TransBillsDao extends HibernateDaoSupport implements
		ITransBillsDao {

	/*
	 * 创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ITransBillsDao#createTransBills(com.mars.vo.TransBills)
	 */
	public void createTransBills(TransBills transBills) {
		super.getHibernateTemplate().save(transBills);
	}

	/*
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ITransBillsDao#findTransBills()
	 */
	@SuppressWarnings("unchecked")
	public List<TransBills> findTransBills() {
		return (List<TransBills>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<TransBills> list = new ArrayList<TransBills>();
						try {
							Criteria criteria = session
									.createCriteria(TransBills.class);
							list = (List<TransBills>) criteria.list();
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
	 * @see com.mars.dao.ITransBillsDao#updateTransBills(com.mars.vo.TransBills)
	 */
	public void updateTransBills(TransBills transBills) {
		super.getHibernateTemplate().update(transBills);
	}

	/*
	 * 删除
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ITransBillsDao#deleteTransBills(java.lang.Integer)
	 */
	public void deleteTransBills(Integer tbid) {
		try {
			TransBills transBills = (TransBills) super.getHibernateTemplate().load(
					TransBills.class, new Integer(tbid));
			super.getHibernateTemplate().delete(transBills);
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

	/*
	 * 分页查询
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ITransBillsDao#findAllTransBills(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public List<TransBills> findAllTransBills(final IPage pageInfo) {
		return (List<TransBills>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<TransBills> list = new ArrayList<TransBills>();
						try {
							Criteria criteria = session
									.createCriteria(TransBills.class);
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
	 * 根据ID查找
	 * (non-Javadoc)
	 * @see com.mars.dao.ITransBillsDao#findTransBillsById(java.lang.Integer)
	 */
	public TransBills findTransBillsById(Integer tbid) {
		TransBills transBills = (TransBills) super.getHibernateTemplate().get(
				TransBills.class, new Integer(tbid));
		return transBills;
	}

}
