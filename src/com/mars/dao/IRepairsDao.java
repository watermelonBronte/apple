/**
 * 维修dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.Repairs;
import com.mars.vo.User;


/**
 * @author ye
 * @date 2016/5/10
 */
public interface IRepairsDao {

	/**
	 * 创建维修
	 * @param repairs
	 */
	public void createRepairs(Repairs repairs); 
	
	/**
	 * 删除维修
	 * @param reid
	 */
	public void deleteRepairs(Integer reid); 
	
	
	
	/**
	 * 更新维修
	 * @param repairs
	 */
	public void updateRepairs(Repairs repairs); 
	
	/**
	 * 查询维修
	 * @return
	 */
	public List<Repairs> findRepairs();

	/**
	 * 分页查找维修
	 * @param pageInfo
	 * @return
	 */
	public List<Repairs> findAllRepairs(IPage pageInfo);
	
	/**
	 * 根据ID查询维修
	 * @return
	 */
	public Repairs findRepairsById(Integer reid);
	

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
