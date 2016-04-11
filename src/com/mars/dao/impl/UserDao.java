/**
 * 用户dao层实现类
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

import com.mars.dao.IUserDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/4/18
 */
public class UserDao extends HibernateDaoSupport implements
		IUserDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IUserDao#createUser(com.mars.vo.User)
	 */
	public void createUser(User user) {
		super.getHibernateTemplate().save(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IUserDao#findUser()
	 */
	@SuppressWarnings("unchecked")
	public List<User> findUser() {
		return (List<User>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<User> list = new ArrayList<User>();
						try {
							Criteria criteria = session
									.createCriteria(User.class);
							list = (List<User>) criteria.list();
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
	 * @see com.mars.dao.IUserDao#updateUser(com.mars.vo.User)
	 */
	public void updateUser(User user) {
		super.getHibernateTemplate().update(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IUserDao#deleteUser(java.lang.Integer)
	 */
	public void deleteUser(Integer uid) {
		User user = (User) super.getHibernateTemplate().load(
				User.class, new Integer(uid));
		super.getHibernateTemplate().delete(user);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IUserDao#findAllUser(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public List<User> findAllUser(final IPage pageInfo) {
		return (List<User>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<User> list = new ArrayList<User>();
						try {
							Criteria criteria = session
									.createCriteria(User.class);
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
	 * @see com.mars.dao.IUserDao#findUserById(java.lang.Integer)
	 */
	public User findUserById(Integer uid) {
		User user = (User) super.getHibernateTemplate().get(
				User.class, new Integer(uid));
		return user;
	}

}
