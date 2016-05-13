/**
 * 盘点明细逻辑层
 */
package com.mars.service;

import java.util.List;

import org.hibernate.annotations.Check;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.CheckDetail;
import com.mars.vo.Checked;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/12
 */
public interface ICheckDetailService {
	/**
	 * 增加盘点明细
	 */
	public void createCheckDetail(CheckDetail checkDetail);
	
	/**
	 * 删除盘点明细
	 */
	public void deleteCheckDetail(Integer cdid);
	
	/**
	 * 更新盘点明细
	 */
	public void updateCheckDetail(CheckDetail checkDetail);
	
	/**
	 * 查找盘点明细
	 */
	public void findCheckDetail();
	
	/**
	 * 分页查找盘点明细
	 * @param pageInfo
	 * @return
	 */
	public List<CheckDetail> findAll(IPage pageInfo);
	
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
	public CheckDetail findCheckDetailById(Integer cdid);
}
