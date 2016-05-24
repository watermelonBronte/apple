package com.mars.service.impl;

import java.util.List;

import com.mars.dao.impl.PurchaseDao;
import com.mars.service.IPurchaseService;
import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.Department;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;



/**
 *@author 杨铮
 *@data 2016/4/22

 */
public class PurchaseService implements IPurchaseService {
private PurchaseDao purchasedao;
	public PurchaseDao getPurchasedao() {
	return purchasedao;
}

public void setPurchasedao(PurchaseDao purchasedao) {
	this.purchasedao = purchasedao;
}
//添加
	public void createPurchase(PurchaseNote purchasenote) {
		// TODO Auto-generated method stub
		purchasedao.createPurchase(purchasenote);
	}
//删除
	public void deletPurchase(int pnid) {
		// TODO Auto-generated method stub
		if(purchasedao.findPurchaseById(pnid)!=null){
			purchasedao.deletPurchase(pnid);
			
		}
	}
//分页查询
	public List<PurchaseNote> findPurchase(IPage pageInfo) {
		// TODO Auto-generated method stub

		List<PurchaseNote> list = purchasedao.findPurchase(pageInfo);
		return list;
	}
//按id查询
	public PurchaseNote findPurchaseById(int pnid) {
		// TODO Auto-generated method stub
	return purchasedao.findPurchaseById(pnid);
	}
//更新
	public void updatePurchase(PurchaseNote purchasenote) {
		// TODO Auto-generated method stub
		purchasedao.updatePurchase(purchasenote);
	}
//根据部门id查询
	public Department findPurchaseByDid(int pndid) {
		// TODO Auto-generated method stub
		return purchasedao.findPurchaseByDid(pndid);
	}
//根据经办人id查询
	public User findPurchaseByPid(int pnagent) {
		// TODO Auto-generated method stub
		return purchasedao.findPurchaseByPid(pnagent);
	}

	public PurchaseDetail findPurchaseByDeid(int purchaseDetail) {
		// TODO Auto-generated method stub
		return purchasedao.findPurchaseByDeid(purchaseDetail);
	}

	public Integer findPDCountByPnid(Integer pnid) {
		return purchasedao.findPDCountByPnid(pnid);
	}

	public void findPurchaseDetailByPnid(Integer pnid) {
//		return purchasedao.findPurchaseDetailByPnid(pnid);
		List<PurchaseDetail> list = purchasedao.findPurchaseDetailByPnid(pnid);
		for (PurchaseDetail purchaseDetail : list) {
//			System.out.println(purchaseDetail);
			
			int count = purchaseDetail.getPdcount();
			for(int i=0;i<count;i++)
			{
				purchaseDetail.getPdid();
				//悲剧了。。估计要改数据库了。。
				
			}
		}
	}

}
