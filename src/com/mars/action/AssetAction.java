/**
 * 测试资产action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.dao.ICommonDao;
import com.mars.service.IAssetCategoryService;
import com.mars.service.IAssetService;
import com.mars.service.ICommonService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.Department;
import com.mars.vo.Finance;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

/***
 * @author ye
 * @date 2016/5/6
 */
public class AssetAction extends ActionSupport {
private Date fdate;
private String sfdate;

private String sdate;
	public String getSdate() {
	return sdate;
}

public void setSdate(String sdate) {
	this.sdate = sdate;
}

	public Date getFdate() {
	return fdate;
}

public void setFdate(Date fdate) {
	this.fdate = fdate;
}

public String getSfdate() {
	return sfdate;
}

public void setSfdate(String sfdate) {
	this.sfdate = sfdate;
}

	private IAssetService assetService;

	private List<User> userList = new ArrayList<User>();
	private List<AssetCategory> assetCategoryList =new ArrayList<AssetCategory>();
	private List<Finance> financeList = new ArrayList<Finance>();
	private List<PurchaseDetail> purchaseDetailList = new ArrayList<PurchaseDetail>();
	
	protected IPage pageInfo = new PageInfo();
	protected String attr;
	protected Integer value;

	public List<AssetCategory> getAssetCategoryList() {
		return assetCategoryList;
	}

	public void setAssetCategoryList(List<AssetCategory> assetCategoryList) {
		this.assetCategoryList = assetCategoryList;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<Finance> getFinanceList() {
		return financeList;
	}

	public void setFinanceList(List<Finance> financeList) {
		this.financeList = financeList;
	}

	public List<PurchaseDetail> getPurchaseDetailList() {
		return purchaseDetailList;
	}

	public void setPurchaseDetailList(List<PurchaseDetail> purchaseDetailList) {
		this.purchaseDetailList = purchaseDetailList;
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	private String result;

	private Asset asset = new Asset();

	private Integer aid;
	private User user;
	private Finance finance;
//	private AssetCategory assetCategory;
	private PurchaseDetail purchaseDetail;
	private String cid;
	private Integer usestate;
	private Date adate;
	private Integer astate;
	private Integer tprint;
	private String onepath;
	private String twopath;
	private String barcode;
	private String anote;

	private Integer acid;
	private Integer uid;
	private Integer pdid;
	private Integer fid;
	
	
	public Integer getAcid() {
		return acid;
	}

	public void setAcid(Integer acid) {
		this.acid = acid;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getPdid() {
		return pdid;
	}

	public void setPdid(Integer pdid) {
		this.pdid = pdid;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public IAssetService getAssetService() {
		return assetService;
	}

	public void setAssetService(IAssetService assetService) {
		this.assetService = assetService;
	}

	public IPage getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(IPage pageInfo) {
		this.pageInfo = pageInfo;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Finance getFinance() {
		return finance;
	}

	public void setFinance(Finance finance) {
		this.finance = finance;
	}

//	public AssetCategory getAssetCategory() {
//		return assetCategory;
//	}
//
//	public void setAssetCategory(AssetCategory assetCategory) {
//		this.assetCategory = assetCategory;
//	}

	

	public PurchaseDetail getPurchaseDetail() {
		return purchaseDetail;
	}

	public void setPurchaseDetail(PurchaseDetail purchaseDetail) {
		this.purchaseDetail = purchaseDetail;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public Integer getUsestate() {
		return usestate;
	}

	public void setUsestate(Integer usestate) {
		this.usestate = usestate;
	}

	public Date getAdate() {
		return adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}

	public Integer getAstate() {
		return astate;
	}

	public void setAstate(Integer astate) {
		this.astate = astate;
	}

	public Integer getTprint() {
		return tprint;
	}

	public void setTprint(Integer tprint) {
		this.tprint = tprint;
	}

	public String getOnepath() {
		return onepath;
	}

	public void setOnepath(String onepath) {
		this.onepath = onepath;
	}

	public String getTwopath() {
		return twopath;
	}

	public void setTwopath(String twopath) {
		this.twopath = twopath;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getAnote() {
		return anote;
	}

	public void setAnote(String anote) {
		this.anote = anote;
	}


	/**
	 * 根据属性查找
	 * @return
	 */
	public String SearchAsset() {
//		if(this.getAttr().equals("ac"))
//		{
//		assetCategory = assetService.findAssetCategoryById(this.getValue());
//		this.getPageInfo().setResult(
//				(assetService.findAllAssetByAC(pageInfo, assetCategory)));
//		}
//		else if(this.getAttr().equals("u")){
//			user = assetService.findUserById(this.getValue());
//			this.getPageInfo().setResult(
//					(assetService.findAllAssetByUser(pageInfo, user)));
//
//			return "pageAsset";
//		}
//		else if(this.getAttr().equals("f")){
//			finance = assetService.findFinanceById(this.getValue());
//			this.getPageInfo().setResult(
//					(assetService.findAllAssetByFinance(pageInfo, finance)));
//
//			return "pageAsset";
//		}
//		else {
//			purchaseDetail = assetService.findPurchaseDetailById(this.getValue());
//			this.getPageInfo().setResult(
//					(assetService.findAllAssetByPurchaseDetail(pageInfo, purchaseDetail)));
//
//			return "pageAsset";
//		}
//		if(this.getAcid()!= null)
//	    	assetCategory = assetService.findAssetCategoryById(this.getAcid());
		if(this.getUid()!= null)
    		user = assetService.findUserById(this.getUid());
		if(this.getFid()!=null)
	    	finance = assetService.findFinanceById(this.getFid());
		if(this.getPdid()!=null)
	    	purchaseDetail = assetService.findPurchaseDetailById(this.getPdid());
//		assetService.findAllAssetByAttr(pageInfo,finance,assetCategory,user,purchaseDetail);
		return "pageAsset";
	}

	

	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addAsset() {
		
		assetCategoryList = assetService.findAssetCategory();
		financeList = assetService.findFinance();
		userList = assetService.findUser();
		purchaseDetailList = assetService.findPurchaseDetail();
		return "addAsset";
	}


	
	/**
	 * 创建
	 * 
	 * @return
	 * @throws Exception
	 */
	public String createAsset(){
		// Asset.setAccode(getAccode());

		asset.setCid(getCid());
//		asset.setAssetCategory(assetService.findAssetCategoryById(this.getAssetCategory().getAcid()));
		asset.setUser(assetService.findUserById(this.getUser().getUid()));
//		asset.setFinance(assetService.findFinanceById(this.getFinance().getFid()));
		asset.setAstate(this.getAstate());
//		Date date = new Date();
//		Timestamp nousedate = new Timestamp(date.getTime());
//		asset.setAdate(nousedate);
		asset.setAdate(this.getAdate());
//		asset.setPurchaseDetail(assetService.findPurchaseDetailById(this.getPurchaseDetail().getPdid()));
		asset.setTprint(this.getTprint());
		asset.setOnepath(this.getOnepath());
		asset.setTwopath(this.getTwopath());
		asset.setBarcode(this.getBarcode());
		asset.setAnote(this.getAnote());
		
		assetService.createAsset(asset);

//		this.setResult("创建");
//		return "successAsset";
		pageAsset();
		return "pageAsset";
	}

	/**
	 * 删除
	 * 
	 * @return
	 * @throws Exception
	 */
	public String deleteAsset(){

	    System.out.println(this.getAid());
		assetService.deleteAsset(this.getAid());
//		this.setResult("删除");
//		return "successAsset";
		pageAsset();
		return "pageAsset";
	}

	
	/**
	 * 更新
	 * 
	 * @return
	 */
	public String updateAsset() {

	
        asset = assetService.findAssetById(this.getAid());
        asset.setCid(getCid());
//		asset.setAssetCategory(assetService.findAssetCategoryById(this.getAssetCategory().getAcid()));
		asset.setUser(assetService.findUserById(this.getUser().getUid()));
		asset.setFinance(assetService.findFinanceById(this.getFinance().getFid()));
		asset.setAstate(this.getAstate());

		asset.setAdate(this.getAdate());
		asset.setPurchaseDetail(assetService.findPurchaseDetailById(this.getPurchaseDetail().getPdid()));
		asset.setTprint(this.getTprint());
		asset.setOnepath(this.getOnepath());
		asset.setTwopath(this.getTwopath());
		asset.setBarcode(this.getBarcode());
		asset.setAnote(this.getAnote());
		
		assetService.updateAsset(asset);

//		this.setResult("更新");
//		return "successAsset";
		pageAsset();
		return "pageAsset";
	}



	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findAssetById() {

		asset = assetService.findAssetById(this.getAid());
		this.setAid(asset.getAid());
		this.setCid(asset.getCid());
//		this.setAssetCategory(asset.getAssetCategory());
		this.setUser(asset.getUser());
		this.setFdate(asset.getFinance().getFdate());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sfdate=sdf.format(fdate);
		
		this.setFinance(asset.getFinance());
		
		this.setAdate(asset.getAdate());
		
		sdate=sdf.format(adate);
		
		
		this.setAstate(asset.getAstate());
		this.setPurchaseDetail(asset.getPurchaseDetail());
		this.setTprint(asset.getTprint());
		this.setOnepath(asset.getOnepath());
		this.setTwopath(asset.getTwopath());
		this.setBarcode(asset.getBarcode());
		this.setAnote(asset.getAnote());
		return "findAssetById";
	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageAsset() {
		this.getPageInfo().setResult((assetService.findAll(pageInfo)));
          

		return "pageAsset";
	}

	
	//excel
}
