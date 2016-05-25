/**
 * 
 */
package com.mars.action;

import java.util.ArrayList;
import java.util.List;

import com.mars.service.impl.PurDetailService;
import com.mars.service.impl.PurchaseService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.AssetCategory;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionContext;

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

	private PurDetailService purdetailservice;
	private PurchaseDetail purDetail = new PurchaseDetail();
	private AssetCategory assetCategory;
	private Integer pdid;
	private User user;
	private PurchaseNote purchaseNote;
	private String aname;
	private String atype;
	private Integer pdcount;
	private String pdmarker;
	private String pdprovider;
	private String pdunit;
	private Float pdprice;

	public AssetCategory getAssetCategory() {
		return assetCategory;
	}

	public void setAssetCategory(AssetCategory assetCategory) {
		this.assetCategory = assetCategory;
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

	public PurchaseNote getPurchaseNote() {
		return purchaseNote;
	}

	public void setPurchaseNote(PurchaseNote purchaseNote) {
		this.purchaseNote = purchaseNote;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
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

	// public String searchPurDetail(){//根据采购单查找
	//		 
	// this.getPageInfo().setResult(purdetailservice.findPurDetailByPnid(pageInfo,this.getPnid()));//分页
	//
	// return "success";
	// }
	private Integer pnid;

	public Integer getPnid() {
		return pnid;
	}

	public void setPnid(Integer pnid) {
		this.pnid = pnid;
	}

	public String queryPurDetail() {// 显示所有信息

		this.getPageInfo().setResult(purdetailservice.findPurDetail(pageInfo));// 分页

		return "success";
	}
	private List<AssetCategory> assetCategoryList =new ArrayList<AssetCategory>();
	
	public List<AssetCategory> getAssetCategoryList() {
		return assetCategoryList;
	}

	public void setAssetCategoryList(List<AssetCategory> assetCategoryList) {
		this.assetCategoryList = assetCategoryList;
	}

	/**
	 * 添加界面
	 * @return
	 */
	public String addPurDetail(){
		assetCategoryList = purdetailservice.findAssetCategory();
		return "success";
	}
	public String queryPurDetailByPnid() {// 显示所有信息
		this.setPurchaseNote(purdetailservice.findPurchaseNoteByPid(pnid));
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("pnid", pnid);
		this.getPageInfo().setResult(
				purdetailservice.findPurDetailByPnid(pageInfo, purchaseNote));// 分页

		return "success";
	}

	public String deletePurDetail() {// 删除
		purdetailservice.deletPurDetail(pdid);

		return "success";
	}

	// public String addPurDetail()
	// {
	// this.setPnid(pnid);
	// return "addPurDetail";
	//	
	// }
	public String createPurDetail() {// 增加信息
		System.out.println(pnid);
		PurchaseDetail p = new PurchaseDetail();
		p.setAname(purDetail.getAname());
		p.setAtype(purDetail.getAtype());
		p.setPdcount(purDetail.getPdcount());
		p.setPdid(purDetail.getPdid());
		p.setAssetCategory(purdetailservice.findAssetCategoryById(this
				.getAssetCategory().getAcid()));
		// p.setPurchaseNote(purdetailservice.findPurchaseNoteByPid(getPurchaseNote().getPnid()));
		p.setPurchaseNote(purdetailservice.findPurchaseNoteByPid(pnid));
		p.setPdmarker(purDetail.getPdmarker());
		p.setPdprice(purDetail.getPdprice());
		p.setPdprovider(purDetail.getPdprovider());
		p.setPdunit(purDetail.getPdunit());
		// p.setUser(purdetailservice.findPurDetailByUid(purDetail.getUser().getUid()));
		p.setUser(purdetailservice.findPurDetailByUid((Integer) ActionContext
				.getContext().getSession().get("loginUid")));
		purdetailservice.createPurDetail(p);// 保存接收到的数据到数据库中
		return "success";

	}

	public String selectPurdetailById() {// 显示当前
		purDetail = purdetailservice.findPurDetailById(this.getPdid());
		this.setAtype(purDetail.getAtype());
		this.setPdcount(purDetail.getPdcount());
		this.setPdid(purDetail.getPdid());
		this.setAssetCategory(purDetail.getAssetCategory());
		// this.setPnid(this.getPnid());
		this.setPdmarker(purDetail.getPdmarker());
		this.setPdprice(purDetail.getPdprice());
		this.setPdprovider(purDetail.getPdprovider());
		this.setPdunit(purDetail.getPdunit());
		this.setUser(purDetail.getUser());
		this.setAname(purDetail.getAname());
		this.setPurchaseNote(purDetail.getPurchaseNote());

		return "success";
	}

	public String updatePurDetail() {// 更新

		purDetail.setPdid(this.getPdid());
		purDetail.setAtype(this.getAtype());
		purDetail.setPdcount(this.getPdcount());
		purDetail.setPdid(this.getPdid());
		purDetail.setPdmarker(this.getPdmarker());
		purDetail.setPdprice(this.getPdprice());
		purDetail.setPdprovider(this.getPdprovider());
		purDetail.setPdunit(this.getPdunit());
		purDetail.setAname(this.getAname());
		purDetail.setAssetCategory(purdetailservice.findAssetCategoryById(this
				.getAssetCategory().getAcid()));
		purDetail.setPurchaseNote(purdetailservice.findPurchaseNoteByPid(this
				.getPurchaseNote().getPnid()));
		purDetail.setUser(purdetailservice.findPurDetailByUid(this.getUser()
				.getUid()));
		// 不允许为空

		// purDetail.setPnid(this.getPnid());
		// purchase.setDepartment(purchaseservice.findPurchaseByDid(this.getDepartment().getDid()));
		// purchase.setPndate(this.getPndate());
		// purchase.setPnstate(this.getPnstate());
		// purchase.setPnuse(this.getPnuse());
		// purchase.setUser(purchaseservice.findPurchaseByPid(this.getUser().getUid()));
		// purchase.setPurchaseDetail(purchaseservice.findPurchaseByDeid(this.getPurchaseDetail().getPdid()));

		purdetailservice.updatePurDetail(purDetail);

		return "success";

	}

}
