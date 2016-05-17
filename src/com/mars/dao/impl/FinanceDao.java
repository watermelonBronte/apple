/**
 * 财务入账dao层实现类
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

import com.mars.dao.IFinanceDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Finance;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/4/18
 */
public class FinanceDao extends HibernateDaoSupport implements
		IFinanceDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IFinanceDao#createFinance(com.mars.vo.Finance)
	 */
	public void createFinance(Finance finance) {
		super.getHibernateTemplate().save(finance);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IFinanceDao#findFinance()
	 */
	@SuppressWarnings("unchecked")
	public List<Finance> findFinance() {
		return (List<Finance>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<Finance> list = new ArrayList<Finance>();
						try {
							Criteria criteria = session
									.createCriteria(Finance.class);
							list = (List<Finance>) criteria.list();
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
	 * @see com.mars.dao.IFinanceDao#updateFinance(com.mars.vo.Finance)
	 */
	public void updateFinance(Finance finance) {
		super.getHibernateTemplate().update(finance);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IFinanceDao#deleteFinance(java.lang.Integer)
	 */
	public void deleteFinance(Integer fid) {
		Finance finance = (Finance) super.getHibernateTemplate().get(
				Finance.class, new Integer(fid));
		super.getHibernateTemplate().delete(finance);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IFinanceDao#findAllFinance(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public List<Finance> findAllFinance(final IPage pageInfo) {
		return (List<Finance>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Finance> list = new ArrayList<Finance>();
						try {
							Criteria criteria = session
									.createCriteria(Finance.class);
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
	 * @see com.mars.dao.IFinanceDao#findFinanceById(java.lang.Integer)
	 */
	public Finance findFinanceById(Integer fid) {
		Finance finance = (Finance) super.getHibernateTemplate().get(
				Finance.class, new Integer(fid));
		return finance;
	}

	public User findUserById(Integer uid) {
		User user = (User) super.getHibernateTemplate().get(User.class, new Integer(uid));
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<User> findUser() {
		return (List<User>)getHibernateTemplate().find("from User");
		
	}

}
