/**
 * 盘点明细dao层
 */
package com.mars.dao;

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
public interface ICheckDetailDao {

	/**
	 * 创建盘点明细
	 * @param checked
	 */
	public void createCheckDetail(CheckDetail checked); 
	
	/**
	 * 删除盘点明细
	 * @param cid
	 */
	public void deleteCheckDetail(Integer cdid); 
	
	
	
	/**
	 * 更新盘点明细
	 * @param checked
	 */
	public void updateCheckDetail(CheckDetail cd); 
	
	/**
	 * 查询盘点明细
	 * @return
	 */
	public List<CheckDetail> findCheckDetail();

	/**
	 * 分页查找盘点明细
	 * @param pageInfo
	 * @return
	 */
	public List<CheckDetail> findAllCheckDetail(IPage pageInfo);
	
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
	 * 根据ID查询盘点明细明细表
	 * @return
	 */
	public CheckDetail findCheckDetailById(Integer cdid);
}
