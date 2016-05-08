/**
 * 
 */
package com.mars.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mars.dao.IRoleDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Role;




/**
 * @author Lab411
 *
 */
public class RoleDao extends HibernateDaoSupport implements IRoleDao {
//增加角色
	public void createRole(Role role) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(role);
	}
//查找所有的角色
	@SuppressWarnings("unchecked")
	public List<Role> findAllRole() {
		// TODO Auto-generated method stub
		return (List<Role>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<Role> list = new ArrayList<Role>();
						try {
							Criteria criteria = session.createCriteria(Role.class);
							list = (List<Role>) criteria.list();
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
					}
				});
	}
//按角色id查找
	public Role findRoleById(int rid) {
		// TODO Auto-generated method stub
		Role role=(Role)this.getHibernateTemplate().get(Role.class, rid);
		return role;
	}
//按角色名称查找
	public Role findRoleByName(String rname) {
		// TODO Auto-generated method stub
		String hsql="from role where rname='"+rname+"'";
		Role result=(Role)((Query)this.getHibernateTemplate().find(hsql)).uniqueResult();
		return result;
	}

	public void updateRole(Role role) {//更新角色
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(role);
		
	}
	public void deletRole(int rid) {//删除角色
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(findRoleById(rid));
	}
@SuppressWarnings("unchecked")//分页
	public List<Role> findRole(final IPage pageInfo) {
		return (List<Role>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Role> list = new ArrayList<Role>();
						try {
				      Criteria criteria = session.createCriteria(Role.class);
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
