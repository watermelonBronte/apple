/**
 * 
 */
package com.mars.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * dao层实现类
 */
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mars.dao.ICommonDao;
import com.mars.tools.IPage;
import com.mars.vo.Department;

/**
 * @author ye
 * 
 */
public class CommonDaoImpl extends HibernateDaoSupport implements ICommonDao {

	/*
	 * 创建 (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICommonDao#create(java.lang.Object)
	 */
	public <T> void create(T obj) throws Exception {
		super.getHibernateTemplate().save(obj);

	}

	/*
	 * 删除 (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICommonDao#delete(java.lang.Object)
	 */
	public <T> void delete(T obj) throws Exception {
		// Department department = (Department)
		// super.getHibernateTemplate().load(
		// Department.class, new Integer(did));
		// super.getHibernateTemplate().delete(department);
		super.getHibernateTemplate().delete(obj);
		super.getHibernateTemplate().flush();

	}

	/*
	 * 分页查找 (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICommonDao#findAll(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(IPage pageInfo) throws Exception {
		return (List<T>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<T> list = new ArrayList<T>();
						try {
							Criteria criteria = session
									.createCriteria(Department.class);
							list = (List<T>) criteria.list();
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
	 * @see com.mars.dao.ICommonDao#findById(java.lang.Class, java.lang.Integer)
	 */
	@SuppressWarnings("unchecked")
	public <T> T findById(Class<T> cls, Integer id) throws Exception {
		T obj = null;
		obj = (T) super.getHibernateTemplate().get(cls, id);
		return obj;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICommonDao#update(java.lang.Object)
	 */
	public <T> void update(T obj) throws Exception {
		super.getHibernateTemplate().update(obj);

	}

}
