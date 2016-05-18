/**
 * 盘点dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.CheckDetail;
import com.mars.vo.Checked;
import com.mars.vo.Finance;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.User;


/**
 * @author ye
 * @date 2016/5/12
 */
public interface ICheckedDao {

	/**
	 * 创建盘点
	 * @param checked
	 */
	public void createChecked(Checked checked); 
	
	/**
	 * 删除盘点
	 * @param cid
	 */
	public void deleteChecked(Integer cid); 
	
	
	
	/**
	 * 更新盘点
	 * @param checked
	 */
	public void updateChecked(Checked checked); 
	
	/**
	 * 查询盘点
	 * @return
	 */
	public List<Checked> findChecked();

	/**
	 * 分页查找盘点
	 * @param pageInfo
	 * @return
	 */
	public List<Checked> findAllChecked(IPage pageInfo);
	
	/**
	 * 根据ID查询盘点
	 * @return
	 */
	public Checked findCheckedById(Integer cid);
	

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
	 * 根据ID查询盘点明细表
	 * @return
	 */
	public CheckDetail findCheDetailById(Integer cdid);
	
	/**
	 * select查找
	 * @return
	 */

	public List<User> findUser() ;
}
