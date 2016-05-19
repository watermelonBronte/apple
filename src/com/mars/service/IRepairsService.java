/**
 * 维修逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Repairs;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/10
 */
public interface IRepairsService {
	/**
	 * 增加维修
	 */
	public void createRepairs(Repairs repairs);
	
	/**
	 * 删除维修
	 */
	public void deleteRepairs(Integer reid);
	
	/**
	 * 更新维修
	 */
	public void updateRepairs(Repairs repairs);
	
	/**
	 * 查找维修
	 */
	public void findRepairs();
	
	/**
	 * 分页查找维修
	 * @param pageInfo
	 * @return
	 */
	public List<Repairs> findAll(IPage pageInfo);
	
	/**
	 * 根据ID查找维修
	 * @param reid
	 * @return
	 */
	public Repairs findRepairsById(Integer reid);
	
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
	 * select
	 */
	public List<User> findUser() ;
	public List<Asset> findAsset() ;
}
