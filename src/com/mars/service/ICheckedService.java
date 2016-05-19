/**
 * 盘点逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.CheckDetail;
import com.mars.vo.Checked;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public interface ICheckedService {
	/**
	 * 增加盘点
	 */
	public void createChecked(Checked checked);
	
	/**
	 * 删除盘点
	 */
	public void deleteChecked(Integer cid);
	
	/**
	 * 更新盘点
	 */
	public void updateChecked(Checked checked);
	
	/**
	 * 查找盘点
	 */
	public void findChecked();
	
	/**
	 * 分页查找盘点
	 * @param pageInfo
	 * @return
	 */
	public List<Checked> findAll(IPage pageInfo);
	
	/**
	 * 根据ID查找盘点
	 * @param cid
	 * @return
	 */
	public Checked findCheckedById(Integer cid);
	
	/**
	 * 根据ID查找用户
	 * @param uid
	 * @return
	 */
	public User findUserById(Integer uid);
	
	/**
	 * 根据ID查找资产
	 * @param uid
	 * @return
	 */
	public Asset findAssetById(Integer aid);
	
	/**
	 * 根据ID查找详细表
	 * @param cdid
	 * @return
	 */
	public CheckDetail findCheDetailById(Integer cdid);
	
	/**
	 * select查找
	 * @return
	 */

	public List<User> findUser() ;
}
