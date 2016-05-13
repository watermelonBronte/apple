/**
 * 
 */
package com.mars.action;

import com.mars.service.impl.PurDetailService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;

/**
 * @author Lab411
 *
 */
public class PurDetailAction {
	protected IPage pageInfo = new PageInfo();
	public IPage getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(IPage pageInfo) {
		this.pageInfo = pageInfo;
	}

	private Integer pdid;
	private User user;
	private PurchaseNote purchaseNote;
	private Integer pnid;
	
	private String atype;
	private Integer pdcount;
	private String pdmarker;
	private String pdprovider;
	private String pdunit;
	public Integer getPdid() {
		return pdid;
	}
	public void setPdid(Integer pdid) {
		this.pdid = pdid;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	public Integer getPdcount() {
		return pdcount;
	}
	public void setPdcount(Integer pdcount) {
		this.pdcount = pdcount;
	}
	public String getPdmarker() {
		return pdmarker;
	}
	public void setPdmarker(String pdmarker) {
		this.pdmarker = pdmarker;
	}
	public String getPdprovider() {
		return pdprovider;
	}
	public void setPdprovider(String pdprovider) {
		this.pdprovider = pdprovider;
	}
	public String getPdunit() {
		return pdunit;
	}
	public void setPdunit(String pdunit) {
		this.pdunit = pdunit;
	}
	public Float getPdprice() {
		return pdprice;
	}
	public void setPdprice(Float pdprice) {
		this.pdprice = pdprice;
	}
	public PurDetailService getPurdetailservice() {
		return purdetailservice;
	}
	public void setPurdetailservice(PurDetailService purdetailservice) {
		this.purdetailservice = purdetailservice;
	}
	public PurchaseDetail getPurDetail() {
		return purDetail;
	}
	public void setPurDetail(PurchaseDetail purDetail) {
		this.purDetail = purDetail;
	}
	
	public PurchaseNote getPurchaseNote() {
		return purchaseNote;
	}
	public void setPurchaseNote(PurchaseNote purchaseNote) {
		this.purchaseNote = purchaseNote;
	}
	private Float pdprice;
	private PurDetailService purdetailservice;
	private PurchaseDetail purDetail=new PurchaseDetail();

	public Integer getPnid() {
		return pnid;
	}
	public void setPnid(Integer pnid) {
		this.pnid = pnid;
	}
	public String searchPurDetail(){//根据采购单查找
		 
		this.getPageInfo().setResult(purdetailservice.findPurDetailByPnid(pageInfo,this.getPnid()));//分页

			  return "success";
		 }
	
	public String queryPurDetail(){//显示所有信息
		 
		this.getPageInfo().setResult(purdetailservice.findPurDetail(pageInfo));//分页

			  return "success";
		 }
		public String deletePurDetail(){//删除
			purdetailservice.deletPurDetail(pdid);
				  
				  return "success";
			  }


public String createPurDetail(){//增加信息
			PurchaseDetail p=new PurchaseDetail();
			p.setAtype(purDetail.getAtype());
			p.setPdcount(purDetail.getPdcount());
			p.setPdid(purDetail.getPdid());
			p.setPdmarker(purDetail.getPdmarker());
			p.setPdprice(purDetail.getPdprice());
			p.setPdprovider(purDetail.getPdprovider());
			p.setPdunit(purDetail.getPdunit());
			p.setUser(purdetailservice.findPurDetailByUid(purDetail.getUser().getUid()));
		
			purdetailservice.createPurDetail(p);//保存接收到的数据到数据库中
			  return "success";
			  
		}
public String selectPurdetailById(){//显示当前	
	purDetail = purdetailservice.findPurDetailById(this.getPdid());
	this.setAtype(purDetail.getAtype());
	this.setPdcount(purDetail.getPdcount());
	this.setPdid(purDetail.getPdid());
	this.setPdmarker(purDetail.getPdmarker());
	this.setPdprice(purDetail.getPdprice());
	this.setPdprovider(purDetail.getPdprovider());
	this.setPdunit(purDetail.getPdunit());
	this.setUser(purDetail.getUser());
	

return "success";
}

public String updatePurDetail(){//更新
	
	
	purDetail.setPdid(this.getPdid());
	purDetail.setAtype(this.getAtype());
	purDetail.setPdcount(this.getPdcount());
	purDetail.setPdid(this.getPdid());
	purDetail.setPdmarker(this.getPdmarker());
	purDetail.setPdprice(this.getPdprice());
	purDetail.setPdprovider(this.getPdprovider());
	purDetail.setPdunit(this.getPdunit());
	purDetail.setUser(purdetailservice.findPurDetailByUid(purDetail.getUser().getUid()));
	  //不允许为空
	
//	purDetail.setPnid(this.getPnid());
//	purchase.setDepartment(purchaseservice.findPurchaseByDid(this.getDepartment().getDid()));
//	purchase.setPndate(this.getPndate());
//	purchase.setPnstate(this.getPnstate());
//	purchase.setPnuse(this.getPnuse());
//	purchase.setUser(purchaseservice.findPurchaseByPid(this.getUser().getUid()));
//	purchase.setPurchaseDetail(purchaseservice.findPurchaseByDeid(this.getPurchaseDetail().getPdid()));
  
	
	purdetailservice.updatePurDetail(purDetail);
	  
	  return "success";

  }

}
