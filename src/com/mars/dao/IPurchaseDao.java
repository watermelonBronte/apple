/**
 * 
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Department;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;

/**
 *@author 杨铮
 *@data 2016/5/1
 */
public interface IPurchaseDao {

	/**
	 * 创建采购单
	 *@param purchasenote 采购单对象
	 */
	public void createPurchase(PurchaseNote purchasenote);
	
	/**
	 * 更新采购单
	 *@param purchasenote 采购单对象
	 */
	public void updatePurchase(PurchaseNote purchasenote);
	/**
	 * 根据采购单id查询
	 *@param pnid 采购单id
	 */
	public PurchaseNote findPurchaseById(int pnid);
	
	/**
	 * 根据部门id查询
	 *@param pndid 部门pndid
	 */
	public Department findPurchaseByDid(int pndid);
	/**
	 * 根据经办人id查询
	 *@param pnagent 经办人id
	 */
	public User findPurchaseByPid(int pnagent);
	
	/**
	 * 根据采购详细id查询
	 *@param pnagent 经办人id
	 */
	public PurchaseDetail findPurchaseByDeid(int purchaseDetail);
	
	/**
	 * 根据采购单id删除
	 *@param pnid 采购单id
	 */
	public void deletPurchase(int pnid);
	
	/**
	 * 查找全部采购单，分页方式
	 *@return 
	 */
	
	//public List<PurchaseNote> findAlldeletPurchase();
	public List<PurchaseNote> findPurchase(IPage pageInfo);//分页
}
