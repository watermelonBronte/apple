/**
 * 
 */
package com.mars.action;

import java.util.Date;

import com.mars.service.impl.PurchaseService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Department;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Lab411
 *
 */
public class PurchaseAction extends ActionSupport {
private PurchaseService purchaseservice;
protected IPage pageInfo = new PageInfo();
public IPage getPageInfo() {
	return pageInfo;
}
public void setPageInfo(IPage pageInfo) {
	this.pageInfo = pageInfo;
}
private PurchaseNote purchase=new PurchaseNote();
public PurchaseNote getPurchase() {
	return purchase;
}
public void setPurchase(PurchaseNote purchase) {
	this.purchase = purchase;
}
private int pnid;

public PurchaseService getPurchaseservice() {
	return purchaseservice;
}
public void setPurchaseservice(PurchaseService purchaseservice) {
	this.purchaseservice = purchaseservice;
}
public int getPnid() {
	return pnid;
}
public void setPnid(int pnid) {
	this.pnid = pnid;
}

public Date getPndate() {
	return pndate;
}
public void setPndate(Date pndate) {
	this.pndate = pndate;
}
public String getPnuse() {
	return pnuse;
}
public void setPnuse(String pnuse) {
	this.pnuse = pnuse;
}
public int getPnstate() {
	return pnstate;
}
public void setPnstate(int pnstate) {
	this.pnstate = pnstate;
}

private User user;

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
private Department department;

private Date pndate;
private String pnuse;
private int pnstate;



public String queryPurchase(){//显示所有信息
		 
this.getPageInfo().setResult(purchaseservice.findPurchase(pageInfo));//分页

	  return SUCCESS;
 }
public String deletePurchase(){//删除
	purchaseservice.deletPurchase(pnid);
		  
		  return SUCCESS;
	  }


public String createPurchase(){//增加信息
	  PurchaseNote p=new PurchaseNote();
 p.setPndate(purchase.getPndate());
  p.setPnid(purchase.getPnid());
  p.setPnstate(purchase.getPnstate());
	  p.setPnuse(purchase.getPnuse());
 	 p.setUser(purchaseservice.findPurchaseByPid(purchase.getUser().getUid()));
	
	 purchaseservice.createPurchase(p);//保存接收到的数据到数据库中
	  return SUCCESS;
	  
}


public String selectPurchaseById(){//显示当前用户		
	purchase = purchaseservice.findPurchaseById(this.getPnid());
this.setPnid(purchase.getPnid());
this.setPndate(purchase.getPndate());
this.setPnuse(purchase.getPnuse());
this.setPnstate(purchase.getPnstate());

this.setUser(purchase.getUser());


return SUCCESS;
}


public String updatePurchase(){//更新用户
	purchase.setPnid(this.getPnid());
	purchase.setPndate(this.getPndate());
	purchase.setPnstate(this.getPnstate());
	purchase.setPnuse(this.getPnuse());
	purchase.setUser(purchaseservice.findPurchaseByPid(this.getUser().getUid()));
	  //不允许为空
	
	purchaseservice.updatePurchase(purchase);
	  
	  return SUCCESS;

  }

}
