/**
 * 报废dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Scrap;
import com.mars.vo.User;


/**
 * @author ye
 * @date 2016/5/10
 */
public interface IScrapDao {

	/**
	 * 创建报废
	 * @param scrap
	 */
	public void createScrap(Scrap scrap); 
	
	/**
	 * 删除报废
	 * @param scid
	 */
	public void deleteScrap(Integer scid); 
	
	
	
	/**
	 * 更新报废
	 * @param scrap
	 */
	public void updateScrap(Scrap scrap); 
	
	/**
	 * 查询报废
	 * @return
	 */
	public List<Scrap> findScrap();

	/**
	 * 分页查找报废
	 * @param pageInfo
	 * @return
	 */
	public List<Scrap> findAllScrap(IPage pageInfo);
	
	/**
	 * 根据ID查询报废
	 * @return
	 */
	public Scrap findScrapById(Integer scid);
	

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
