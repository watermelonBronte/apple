/**
 * 
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.impl.PurDetailDao;
import com.mars.service.IPurDetailService;
import com.mars.tools.IPage;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;


/**
 *@author 杨铮
 *@data 2016/4/22

 */
public class PurDetailService  implements IPurDetailService{
private PurDetailDao purdetaildao;
	public PurDetailDao getPurdetaildao() {
	return purdetaildao;
}

public void setPurdetaildao(PurDetailDao purdetaildao) {
	this.purdetaildao = purdetaildao;
}
//增加
	public void createPurDetail(PurchaseDetail purdetail) {
		// TODO Auto-generated method stub
		purdetaildao.createPurDetail(purdetail);
	}
//删除
	public void deletPurDetail(int pdid) {
		// TODO Auto-generated method stub
		if(purdetaildao.findPurDetailById(pdid)!=null){
			purdetaildao.deletPurDetail(pdid);
			
			
		}
	}
//分页显示
	public List<PurchaseDetail> findPurDetail(IPage pageInfo) {
		// TODO Auto-generated method stub
		List<PurchaseDetail> list = purdetaildao.findPurDetail(pageInfo);
		return list;
	}
//按明细id查找
	public PurchaseDetail findPurDetailById(int pdid) {
		// TODO Auto-generated method stub
	return purdetaildao.findPurDetailById(pdid);
	}
////按采购id查找
//public PurchaseNote findPurDetailByPid(int pnid) {
//		// TODO Auto-generated method stub
//	return purdetaildao.findPurDetailByPid(pnid);
//	}
//按保管人id查找
	public User findPurDetailByUid(int uid) {
		// TODO Auto-generated method stub
		return  purdetaildao.findPurDetailByUid(uid);
	}
//更新
	public void updatePurDetail(PurchaseDetail purdetail) {
		// TODO Auto-generated method stub
		purdetaildao.updatePurDetail(purdetail);
	}

	public List<PurchaseDetail> findPurDetailByPnid(IPage pageInfo, Integer pnid) {
		
		return purdetaildao.findPurDetailByPnid(pageInfo,pnid);
	}



}
