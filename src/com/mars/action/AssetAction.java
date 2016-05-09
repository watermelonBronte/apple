/**
 * 测试资产action
 */
package com.mars.action;
import java.sql.Timestamp;
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
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;

/***
 * @author ye
 * @date 2016/5/6
 */
public class AssetAction extends ActionSupport {

	

	private IAssetService assetService;

	private IAssetCategoryService assetCategoryService;
	protected IPage pageInfo = new PageInfo();

	private String result;

	private Asset asset = new Asset();
	private List<AssetCategory> assetCategoryList = new ArrayList<AssetCategory>();
	private Integer aid;
	private User user;
	private Finance finance;
	private AssetCategory assetCategory;
	private PurchaseNote purchaseNote;
	private String cid;
	private Integer usestate;
	private Date adate;
	private Integer astate;
	private Integer tprint;
	private String onepath;
	private String twopath;
	private String barcode;
	private String anote;

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

	public IAssetCategoryService getAssetCategoryService() {
		return assetCategoryService;
	}

	public void setAssetCategoryService(
			IAssetCategoryService assetCategoryService) {
		this.assetCategoryService = assetCategoryService;
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

	public AssetCategory getAssetCategory() {
		return assetCategory;
	}

	public void setAssetCategory(AssetCategory assetCategory) {
		this.assetCategory = assetCategory;
	}

	public PurchaseNote getPurchaseNote() {
		return purchaseNote;
	}

	public void setPurchaseNote(PurchaseNote purchaseNote) {
		this.purchaseNote = purchaseNote;
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
	 * 返回主界面
	 * 
	 * @return
	 */
	public String home() {
		return "home";
	}

	public List<AssetCategory> getAssetCategoryList() {
		return assetCategoryList;
	}

	public void setAssetCategoryList(List<AssetCategory> assetCategoryList) {
		this.assetCategoryList = assetCategoryList;
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addAsset() {
		// this.getPageInfo().setResult(assetCategoryService.findAll());
		// this.setAssetCategory(assetCategoryService.findAssetCategory());
		assetCategoryService.findAssetCategory();
		asset.setAnote(this.getAnote());

		// System.out.println(Asset.getAccode());
		// this.setAssetCategoryList(assetCategoryList);
		return "addAsset";
	}

	/**
	 * 创建
	 * 
	 * @return
	 * @throws Exception 
	 */
	public String createAsset() throws Exception {
		// Asset.setAccode(getAccode());

		assetService.createAsset(asset);
		
		this.setResult("创建");
		return "successAsset";
	}

	/**
	 * 删除
	 * 
	 * @return
	 * @throws Exception 
	 */
	public String deleteAsset() throws Exception {
		
		assetService.deleteAsset(this.getAid());
		this.setResult("删除");
		return "successAsset";
	}

	/**
	 * 更新
	 * 
	 * @return
	 */
	public String updateAsset() {

		// System.out.println(this.getAccode()+this.getAcname()+this.getSupacname()+this.getSupacid()+this.getAcid());
		// Asset.setAccode(getAccode());

		assetService.updateAsset(asset);

		this.setResult("更新");
		return "successAsset";
	}

	/**
	 * 查找
	 * 
	 * @return
	 */
	public String findAsset() {
		assetService.findAsset();
		return "findAsset";
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
	     this.setAssetCategory(asset.getAssetCategory());
	     this.setUser(asset.getUser());
	     this.setFinance(asset.getFinance());
	     this.setAdate(asset.getAdate());
	     this.setAstate(asset.getAstate());
	     this.setPurchaseNote(asset.getPurchaseNote());
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

}
