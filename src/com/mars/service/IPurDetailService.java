/**
 * 
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;

/**
 *@author 杨铮
 *@data 2016/5/1
 */
public interface IPurDetailService {
	/**
	 * 创建采购单明细
	 *@param purdetail 采购单明细对象
	 */
	public void createPurDetail(PurchaseDetail purdetail);
	
	/**
	 * 更新采购单明细
	 *@param purdetail 采购单明细对象
	 */
	public void updatePurDetail(PurchaseDetail purdetail);
	/**
	 * 根据采购单明细id查询
	 *@param pdid 采购单明细id
	 */
	public PurchaseDetail findPurDetailById(int pdid);
	
//	/**
//	 * 根据采购单id查询
//	 *@param pnid 采购单id
//	 */
//	public PurchaseNote findPurDetailByPid(int pnid);
//	
	/**
	 * 根据保管人id查询
	 *@param uid 保管人id
	 */
	public User findPurDetailByUid(int uid);
	
	/**
	 * 根据采购单明细id删除
	 *@param pdid 采购单明细id
	 */
	public void deletPurDetail(int pdid);
	
	/**
	 * 查找全部采购单明细，分页方式
	 *@return 
	 */
	
	public List<PurchaseDetail> findPurDetail(IPage pageInfo);//分页
}
