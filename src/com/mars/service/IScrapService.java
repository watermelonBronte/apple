/**
 * 报废逻辑层
 */
package com.mars.service;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Scrap;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/5/10
 */
public interface IScrapService {
	/**
	 * 增加报废
	 */
	public void createScrap(Scrap scrap);
	
	/**
	 * 删除报废
	 */
	public void deleteScrap(Integer scid);
	
	/**
	 * 更新报废
	 */
	public void updateScrap(Scrap scrap);
	
	/**
	 * 查找报废
	 */
	public void findScrap();
	
	/**
	 * 分页查找报废
	 * @param pageInfo
	 * @return
	 */
	public List<Scrap> findAll(IPage pageInfo);
	
	/**
	 * 根据ID查找报废
	 * @param scid
	 * @return
	 */
	public Scrap findScrapById(Integer scid);
	
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
}
