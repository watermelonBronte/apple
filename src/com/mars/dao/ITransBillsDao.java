/**
 * 调拨单dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.TransBills;
import com.mars.vo.User;


/**
 * @author ye
 * @date 2016/4/18
 */
public interface ITransBillsDao {

	/**
	 * 创建调拨单
	 * @param transBills
	 */
	public void createTransBills(TransBills transBills); 
	
	/**
	 * 删除调拨单
	 * @param tbid
	 */
	public void deleteTransBills(Integer tbid); 
	
	
	
	/**
	 * 更新调拨单
	 * @param transBills
	 */
	public void updateTransBills(TransBills transBills); 
	
	/**
	 * 查询调拨单
	 * @return
	 */
	public List<TransBills> findTransBills();

	/**
	 * 分页查找调拨单
	 * @param pageInfo
	 * @return
	 */
	public List<TransBills> findAllTransBills(IPage pageInfo);
	
	/**
	 * 根据ID查询调拨单
	 * @return
	 */
	public TransBills findTransBillsById(Integer tbid);
	
	/**
	 * 根据ID查询用户
	 * @return
	 */
	public User findUserById(Integer uid);
	
	/**
	 * 根据ID查询资产
	 * @return
	 */
	public Asset findAssetById(Integer aid);
}
