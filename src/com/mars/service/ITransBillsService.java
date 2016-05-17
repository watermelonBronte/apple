/**
 * 调度单逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.TransBills;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/9
 */
public interface ITransBillsService {
	/**
	 * 增加调度单
	 */
	public void createTransBills(TransBills transBills);
	
	/**
	 * 删除调度单
	 */
	public void deleteTransBills(Integer tbid);
	
	/**
	 * 更新调度单
	 */
	public void updateTransBills(TransBills transBills);
	
	/**
	 * 查找调度单
	 */
	public void findTransBills();
	
	/**
	 * 分页查找调度单
	 * @param pageInfo
	 * @return
	 */
	public List<TransBills> findAll(IPage pageInfo);
	
	/**
	 * 根据ID查找调度单
	 * @param tbid
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
	/**
	 * select
	 */
	public List<User> findUser() ;
	public List<Asset> findAsset() ;
}
