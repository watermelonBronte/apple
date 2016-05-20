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
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mars.dao.IUserDao;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Department;
import com.mars.vo.Role;
import com.mars.vo.User;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
/**
 *@author 杨铮
 *@data 2016/4/21
 */
public class UserDao extends HibernateDaoSupport implements IUserDao {
//	QueryRunner qr = new QueryRunner();
	
	
	//添加用户
	public void createUser(User user){
			this.getHibernateTemplate().save(user);
	}
	
	//更新用户
	public void updateUser(User user){
		super.getHibernateTemplate().update(user);
		
	
//		try {
//		this.getHibernateTemplate().update(user);
//		this.getHibernateTemplate().flush();
//
//		} catch (Exception e) {
//		e.printStackTrace();
//		} finally {
//		this.getHibernateTemplate().clear();
//		}

		
	}
	//查找全部用户
	@SuppressWarnings("unchecked")
	public List<User> findAllUser() {
		//String queryString="from user";
		//List<User> list=this.getHibernateTemplate().find(queryString);
		

		
		return (List<User>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<User> list = new ArrayList<User>();
						try {
							Criteria criteria = session.createCriteria(User.class);
							list = (List<User>) criteria.list();
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
					}
				});

	
	}
	//按用户id查找用户
	public User findUserById(int uid) {
		User user=(User)this.getHibernateTemplate().get(User.class, uid);
		return user;
	}
	//按部门id查找
	public Department findDepartmentById(int did) {
		Department department=(Department)this.getHibernateTemplate().get(Department.class, did);
		return department;
	}
	//按角色id查找
	public Role findRoleById(int rid) {
		Role rore=(Role)this.getHibernateTemplate().get(Role.class, rid);
		return rore;
	}
	//根据用户名称查询用户
	public User findUserByName(String uname){
		String hsql="from user where uname='"+uname+"'";
		User result=(User)((Query)this.getHibernateTemplate().find(hsql)).uniqueResult();
		return result;

	}
	//删除用户
	public void deletUser(int uid){
		
		this.getHibernateTemplate().delete(findUserById(uid));
		
	}
	/*
	 * 分页查找对象
	 * (non-Javadoc)
	
	 */

	@SuppressWarnings("unchecked")
	public List<User> findUser(final IPage pageInfo) {//分页查找
		return (List<User>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<User> list = new ArrayList<User>();
						try {
				      Criteria criteria = session.createCriteria(User.class);
				      
				      
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

	public List<User> findUserByAttr(IPage pageInfo, User u) {
		// TODO Auto-generated method stub
		return null;
	}


	}
	
	
	

	
	

