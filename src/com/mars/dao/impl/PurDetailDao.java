/**
 * 
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

import com.mars.dao.IPurDetailDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;


/**
 * @author Lab411
 *
 */
public class PurDetailDao extends HibernateDaoSupport implements IPurDetailDao {

	public void createPurDetail(PurchaseDetail purdetail) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(purdetail);//增加采购单明细
	}
//按明细id删除
	public void deletPurDetail(int pdid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(findPurDetailById(pdid));
	}
	@SuppressWarnings("unchecked")//分页显示
	public List<PurchaseDetail> findPurDetail(final IPage pageInfo) {
		// TODO Auto-generated method stub
		return (List<PurchaseDetail>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<PurchaseDetail> list = new ArrayList<PurchaseDetail>();
						try {
				      Criteria criteria = session.createCriteria(PurchaseDetail.class);
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
//按采购单明细id查询
	public PurchaseDetail findPurDetailById(int pdid) {
		// TODO Auto-generated method stub
		PurchaseDetail purdetail=(PurchaseDetail)this.getHibernateTemplate().get(PurchaseDetail.class, pdid);
		return purdetail;
	}
//	//按采购单id查询
//	public PurchaseNote findPurDetailByPid(int pnid) {
//		// TODO Auto-generated method stub
//		PurchaseNote purnote=(PurchaseNote)this.getHibernateTemplate().get(PurchaseNote.class, pnid);
//		return purnote;
//	}
	//按保管人id查询
	public User findPurDetailByUid(int uid) {
		// TODO Auto-generated method stub
		User user=(User)this.getHibernateTemplate().get(User.class, uid);
		return user;
	}
//更新
	public void updatePurDetail(PurchaseDetail purdetail) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(purdetail);
	}
	@SuppressWarnings("unchecked")
	public List<PurchaseDetail> findPurDetailByPnid(final IPage pageInfo, Integer pnid) {
		return (List<PurchaseDetail>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<PurchaseDetail> list = new ArrayList<PurchaseDetail>();
						try {
				      Criteria criteria = session.createCriteria(PurchaseDetail.class).add(Restrictions.eq("pnid","pnid")) ;;
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
