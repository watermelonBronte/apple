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
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mars.dao.IReturnDao;
import com.mars.tools.Execute;
import com.mars.tools.IExecute;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetReturn;
import com.mars.vo.User;


/**
 *@author 杨铮
 *@data 2016/5/6
 */
public class ReturnDao extends HibernateDaoSupport implements IReturnDao {

	public void createReturn(AssetReturn assetReturn) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(assetReturn);//增加资产归还
	}

	public void deletReturn(int arid) {
		// TODO Auto-generated method stub
		//按id删除资产归还信息
		this.getHibernateTemplate().delete(findReturnById(arid));
	}

	public List<AssetReturn> findAllReturn() {
		// TODO Auto-generated method stub
		return null;
	}
//分页显示
	@SuppressWarnings("unchecked")//分页显示
	public List<AssetReturn> findReturn(final IPage pageInfo) {
		// TODO Auto-generated method stub
		return (List<AssetReturn>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {

						IPage pages = null;
						List<AssetReturn> list = new ArrayList<AssetReturn>();
						try {
				      Criteria criteria = session.createCriteria(AssetReturn.class);
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
//按资产id查询
	public Asset findReturnByAid(int aid) {
		// TODO Auto-generated method stub
		Asset asset=(Asset)this.getHibernateTemplate().get(Asset.class, aid);
		return asset;
	}
//按领用人id查询
	public User findReturnByGid(int guid) {
		// TODO Auto-generated method stub
		User user=(User)this.getHibernateTemplate().get(User.class, guid);
		return user;
	}
//按归还人id查询
	public User findReturnByRid(int ruid) {
		// TODO Auto-generated method stub
	
		User user=(User)this.getHibernateTemplate().get(User.class, ruid);
		return user;
	}
//按照资产归还id来查询
	public AssetReturn findReturnById(int arid) {
		// TODO Auto-generated method stub
		AssetReturn assetreturn=(AssetReturn)this.getHibernateTemplate().get(AssetReturn.class, arid);
		return assetreturn;
	}

	public void updateReturn(AssetReturn assetReturn) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(assetReturn);//更新
	}

}
