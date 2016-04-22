/**
 * 部门dao层实现类
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

import com.mars.dao.IDepartmentDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Department;

/**
 * @author ye
 * @date 2016/4/18
 */
public class DepartmentDao extends HibernateDaoSupport implements
		IDepartmentDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IDepartmentDao#createDepartment(com.mars.vo.Department)
	 */
	public void createDepartment(Department department) {
		super.getHibernateTemplate().save(department);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IDepartmentDao#findDepartment()
	 */
	@SuppressWarnings("unchecked")
	public List<Department> findDepartment() {
		return (List<Department>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<Department> list = new ArrayList<Department>();
						try {
							Criteria criteria = session
									.createCriteria(Department.class);
							list = (List<Department>) criteria.list();
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
	 * @see com.mars.dao.IDepartmentDao#updateDepartment(com.mars.vo.Department)
	 */
	public void updateDepartment(Department department) {
		super.getHibernateTemplate().update(department);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IDepartmentDao#deleteDepartment(java.lang.Integer)
	 */
	public void deleteDepartment(Integer did) {
		Department department = (Department) super.getHibernateTemplate().load(
				Department.class, new Integer(did));
		super.getHibernateTemplate().delete(department);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.IDepartmentDao#findAllDepartment(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public List<Department> findAllDepartment(final IPage pageInfo) {
		return (List<Department>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Department> list = new ArrayList<Department>();
						try {
							Criteria criteria = session
									.createCriteria(Department.class);
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
	 * @see com.mars.dao.IDepartmentDao#findDepartmentById(java.lang.Integer)
	 */
	public Department findDepartmentById(Integer did) {
		Department department = (Department) super.getHibernateTemplate().get(
				Department.class, new Integer(did));
		return department;
	}

}
