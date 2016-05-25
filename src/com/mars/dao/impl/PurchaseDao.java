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

import com.mars.dao.IPurchaseDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Department;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;


/**
 * @author Lab411
 *
 */
public class PurchaseDao extends HibernateDaoSupport implements IPurchaseDao {

	public void createPurchase(PurchaseNote purchasenote) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(purchasenote);//增加采购单
	}

	public void deletPurchase(int pnid) {
		// TODO Auto-generated method stub
		//按id删除采购单
		this.getHibernateTemplate().delete(findPurchaseById(pnid));
	}
	@SuppressWarnings("unchecked")//分页显示
	public List<PurchaseNote> findPurchase(final IPage pageInfo) {
		// TODO Auto-generated method stub
		return (List<PurchaseNote>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<PurchaseNote> list = new ArrayList<PurchaseNote>();
						try {
				      Criteria criteria = session.createCriteria(PurchaseNote.class);
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


	public PurchaseNote findPurchaseById(int pnid) {
		// TODO Auto-generated method stub
		//按照采购id来查询采购单
		PurchaseNote purchasenote=(PurchaseNote)this.getHibernateTemplate().get(PurchaseNote.class, pnid);
		return purchasenote;
	}

	public void updatePurchase(PurchaseNote purchasenote) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(purchasenote);//更新采购单
	}
//根据部门id查询
	public Department findPurchaseByDid(int pndid) {
		// TODO Auto-generated method stub
		Department department=(Department)this.getHibernateTemplate().get(Department.class, pndid);
		return department;
	}
//根据经办人id查询
	public User findPurchaseByPid(int pnagent) {
		// TODO Auto-generated method stub
		User user=(User)this.getHibernateTemplate().get(User.class, pnagent);
		return user;
	}
//查询详细信息
	public PurchaseDetail findPurchaseByDeid(int purchaseDetail) {
		// TODO Auto-generated method stub
		PurchaseDetail purchaseetail=(PurchaseDetail)this.getHibernateTemplate().get(PurchaseDetail.class, purchaseDetail);
		return purchaseetail;
	}

	public Integer findPDCountByPnid(Integer pnid) {
		  String hqlString = "select count(*) from purchaseDetail as p where p.pnid ="+pnid+"";  
		    Query query = this.getSession().createQuery(hqlString);  
		          
		    return (Integer) ((Number)query.uniqueResult()); 
		
	}
	
	@SuppressWarnings("unchecked")
	public List<PurchaseDetail> findPurchaseDetailByPnid(final Integer pnid) {
		return (List<PurchaseDetail>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<PurchaseDetail> list = new ArrayList<PurchaseDetail>();
						try {
							Criteria criteria = session
									.createCriteria(PurchaseDetail.class).add(Restrictions.eq("pnid",pnid)) ;
							list = (List<PurchaseDetail>) criteria.list();
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
					}
				});
	}

	public void createAsset(Asset asset) {
		super.getHibernateTemplate().save(asset);
		
	}

}
