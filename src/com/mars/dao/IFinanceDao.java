/**
 * 财务入账dao层
 */
package com.mars.dao;

import java.util.Date;
import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Finance;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.User;


/**
 * @author ye
 * @date 2016/4/18
 */
public interface IFinanceDao {

	/**
	 * 创建财务入账
	 * @param finance
	 */
	public void createFinance(Finance finance); 
	
	/**
	 * 删除财务入账
	 * @param fid
	 */
	public void deleteFinance(Integer fid); 
	
	
	
	/**
	 * 更新财务入账
	 * @param finance
	 */
	public void updateFinance(Finance finance); 
	
	/**
	 * 查询财务入账
	 * @return
	 */
	public List<Finance> findFinance();

	/**
	 * 分页查找财务入账
	 * @param pageInfo
	 * @return
	 */
	public List<Finance> findAllFinance(IPage pageInfo);
	
	/**
	 * 根据ID查询财务入账
	 * @return
	 */
	public Finance findFinanceById(Integer fid);
	

	/**
	 * 根据ID查询用户
	 * @return
	 */
	public User findUserById(Integer uid);
	
	/**
	 * select查找
	 * @return
	 */

	public List<User> findUser() ;

	public List<Finance> findAllFinanceByAttr(IPage pageInfo, User user,Integer enter,
			Date date);

	public void updateAsset(Asset asset);
}
