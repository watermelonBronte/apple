/**
 * 盘点dao层实现类
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

import com.mars.dao.ICheckedDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.CheckDetail;
import com.mars.vo.Checked;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public class CheckedDao extends HibernateDaoSupport implements
		ICheckedDao {

	/*
	 * 创建
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICheckedDao#createChecked(com.mars.vo.Checked)
	 */
	public void createChecked(Checked checked) {
		super.getHibernateTemplate().save(checked);
	}

	/*查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICheckedDao#findChecked()
	 */
	@SuppressWarnings("unchecked")
	public List<Checked> findChecked() {
		return (List<Checked>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<Checked> list = new ArrayList<Checked>();
						try {
							Criteria criteria = session
									.createCriteria(Checked.class);
							list = (List<Checked>) criteria.list();
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
					}
				});
	}

	/*更新
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICheckedDao#updateChecked(com.mars.vo.Checked)
	 */
	public void updateChecked(Checked checked) {
		super.getHibernateTemplate().update(checked);
	}

	/*删除
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICheckedDao#deleteChecked(java.lang.Integer)
	 */
	public void deleteChecked(Integer cid) {
		Checked checked = (Checked) super.getHibernateTemplate().get(
				Checked.class, new Integer(cid));
		super.getHibernateTemplate().delete(checked);

	}

	/*分页查找
	 * (non-Javadoc)
	 * 
	 * @see com.mars.dao.ICheckedDao#findAllChecked(com.mars.tools.IPage)
	 */
	@SuppressWarnings("unchecked")
	public List<Checked> findAllChecked(final IPage pageInfo) {
		return (List<Checked>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<Checked> list = new ArrayList<Checked>();
						try {
							Criteria criteria = session
									.createCriteria(Checked.class);
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

	/*根据ID查找
	 * (non-Javadoc)
	 * @see com.mars.dao.ICheckedDao#findCheckedById(java.lang.Integer)
	 */
	public Checked findCheckedById(Integer cid) {
		Checked checked = (Checked) super.getHibernateTemplate().get(
				Checked.class, new Integer(cid));
		return checked;
	}

	/*
	 * 根据ID查找用户
	 * (non-Javadoc)
	 * @see com.mars.dao.IScrapDao#findUserById(java.lang.Integer)
	 */
	public User findUserById(Integer uid) {
		User user = (User) super.getHibernateTemplate().get(User.class, new Integer(uid));
		return user;
	}

	/*
	 * 根据ID查找资产
	 * (non-Javadoc)
	 * @see com.mars.dao.IScrapDao#findUserById(java.lang.Integer)
	 */
	public Asset findAssetById(Integer aid) {
		Asset asset = (Asset) super.getHibernateTemplate().get(Asset.class, new Integer(aid));
		return asset;
	}

	/*
	 * 根据ID查找明细表
	 * (non-Javadoc)
	 * @see com.mars.dao.ICheckedDao#findCheDetailById(java.lang.Integer)
	 */
	public CheckDetail findCheDetailById(Integer cdid) {
		CheckDetail cd = (CheckDetail) super.getHibernateTemplate().get(CheckDetail.class, new Integer(cdid));
		return cd;
	}

}
