/**
 * 参数信息dao层实现类
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

import com.mars.dao.IParameterDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Parameter;

/**
 * @author ye
 * @date 2016/4/19
 */
public class ParameterDao extends HibernateDaoSupport implements IParameterDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IParameterDao#createParameter(com.mars.vo.Parameter)
	 */
	public void createParameter(Parameter parameter) {
		super.getHibernateTemplate().save(parameter);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IParameterDao#deleteParameter(com.mars.vo.Parameter)
	 */
	public void deleteParameter(Integer pid) {
		Parameter parameter = (Parameter) super.getHibernateTemplate().get(
				Parameter.class, new Integer(pid));
		super.getHibernateTemplate().delete(parameter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IParameterDao#findParameter()
	 */
	@SuppressWarnings("unchecked")
	public List<Parameter> findParameter() {
		return (List<Parameter>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<Parameter> list = new ArrayList<Parameter>();
						try {
							Criteria criteria = session
									.createCriteria(Parameter.class);
							list = (List<Parameter>) criteria.list();
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
	 * @see com.mars.dao.IParameterDao#updateParameter(com.mars.vo.Parameter)
	 */
	public void updateParameter(Parameter parameter) {
		super.getHibernateTemplate().update(parameter);
	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.dao.IParameterDao#findParameterById(java.lang.Integer)
	 */
	public Parameter findParameterById(Integer did) {
		Parameter parameter = (Parameter) super.getHibernateTemplate().get(
				Parameter.class, new Integer(did));
		return parameter;
	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.dao.IParameterDao#findAllParameter(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public List<Parameter> findAllParameter(final IPage pageInfo) {
		return (List<Parameter>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Parameter> list = new ArrayList<Parameter>();
						try {
							Criteria criteria = session
									.createCriteria(Parameter.class);
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
