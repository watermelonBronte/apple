/**
 * 
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IReturnDao;
import com.mars.dao.impl.ReturnDao;
import com.mars.service.IReturnService;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetReturn;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;


/**
 *@author 杨铮
 *@data 2016/5/6
 */
public class ReturnService implements IReturnService {
private ReturnDao returnDao=new ReturnDao();
	public ReturnDao getReturnDao() {
	return returnDao;
}

public void setReturnDao(ReturnDao returnDao) {
	this.returnDao = returnDao;
}
//添加
	public void createReturn(AssetReturn assetReturn) {
		// TODO Auto-generated method stub
		returnDao.createReturn(assetReturn);
	}
//删除
	public void deletReturn(int arid) {
		// TODO Auto-generated method stub
		if(returnDao.findReturnById(arid)!=null){
			returnDao.deletReturn(arid);
			
		}
	}
//
	public List<AssetReturn> findAllReturn() {
		// TODO Auto-generated method stub
		return null;
	}
//分页
	public List<AssetReturn> findReturn(IPage pageInfo) {
		// TODO Auto-generated method stub
		List<AssetReturn> list = returnDao.findReturn(pageInfo);
		return list;
	}
//按资产id查询
	public Asset findReturnByAid(int aid) {
		// TODO Auto-generated method stub
	return returnDao.findReturnByAid(aid);
	}
//按领用人id查询
	public User findReturnByGid(int guid) {
		// TODO Auto-generated method stub
		return returnDao.findReturnByGid(guid);
	}
//按领用归还id查询
	public AssetReturn findReturnById(int arid) {
		// TODO Auto-generated method stub
		return returnDao.findReturnById(arid);
	}
//按归还人id查询
	public User findReturnByRid(int ruid) {
		// TODO Auto-generated method stub
		return returnDao.findReturnByRid(ruid);
	}
//更新
	public void updateReturn(AssetReturn assetReturn) {
		// TODO Auto-generated method stub
		returnDao.updateReturn(assetReturn);
	}

}
