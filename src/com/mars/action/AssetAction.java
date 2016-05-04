/**
 * 测试资产action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.IAssetCategoryService;
import com.mars.service.IAssetService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.Department;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/4/19
 */
public class AssetAction extends ActionSupport {

	private IAssetService assetService;

	private IAssetCategoryService assetCategoryService;
	protected IPage pageInfo = new PageInfo();

	private String result;

	private Asset asset = new Asset();
	private List<AssetCategory> assetCategoryList = new ArrayList<AssetCategory>();
	
	
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

	private Integer aid;
	private User userByUserid;
	private AssetCategory assetCategoryBySupacid;
	private AssetCategory assetCategoryByAcid;
	private User userByUid;
	private PurchaseNote purchaseNote;
	private User userByFaccountid;
	private Department department;
	private String cid;
	private Integer astate;
	private Integer fifaccount;
	private String specificat;
	private Integer ausestate;
	private String aname;
	private Integer pdepartment;
	private Timestamp fdate;
	private String fcode;
	private String acode;
	private String amaker;
	private String aprovider;
	private Date adate;
	private String aunit;
	private Integer acount;
	private String anote;
	private Float aprice;
	private Integer tprint;
	private String onepath;
	private String twopath;
	private String barcode;
	
	
	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public User getUserByUserid() {
		return userByUserid;
	}

	public void setUserByUserid(User userByUserid) {
		this.userByUserid = userByUserid;
	}

	public AssetCategory getAssetCategoryBySupacid() {
		return assetCategoryBySupacid;
	}

	public void setAssetCategoryBySupacid(AssetCategory assetCategoryBySupacid) {
		this.assetCategoryBySupacid = assetCategoryBySupacid;
	}

	public AssetCategory getAssetCategoryByAcid() {
		return assetCategoryByAcid;
	}

	public void setAssetCategoryByAcid(AssetCategory assetCategoryByAcid) {
		this.assetCategoryByAcid = assetCategoryByAcid;
	}

	public User getUserByUid() {
		return userByUid;
	}

	public void setUserByUid(User userByUid) {
		this.userByUid = userByUid;
	}

	public PurchaseNote getPurchaseNote() {
		return purchaseNote;
	}

	public void setPurchaseNote(PurchaseNote purchaseNote) {
		this.purchaseNote = purchaseNote;
	}

	public User getUserByFaccountid() {
		return userByFaccountid;
	}

	public void setUserByFaccountid(User userByFaccountid) {
		this.userByFaccountid = userByFaccountid;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public Integer getAstate() {
		return astate;
	}

	public void setAstate(Integer astate) {
		this.astate = astate;
	}

	public Integer getFifaccount() {
		return fifaccount;
	}

	public void setFifaccount(Integer fifaccount) {
		this.fifaccount = fifaccount;
	}

	public String getSpecificat() {
		return specificat;
	}

	public void setSpecificat(String specificat) {
		this.specificat = specificat;
	}

	public Integer getAusestate() {
		return ausestate;
	}

	public void setAusestate(Integer ausestate) {
		this.ausestate = ausestate;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Integer getPdepartment() {
		return pdepartment;
	}

	public void setPdepartment(Integer pdepartment) {
		this.pdepartment = pdepartment;
	}

	public Timestamp getFdate() {
		return fdate;
	}

	public void setFdate(Timestamp fdate) {
		this.fdate = fdate;
	}

	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getAcode() {
		return acode;
	}

	public void setAcode(String acode) {
		this.acode = acode;
	}

	public String getAmaker() {
		return amaker;
	}

	public void setAmaker(String amaker) {
		this.amaker = amaker;
	}

	public String getAprovider() {
		return aprovider;
	}

	public void setAprovider(String aprovider) {
		this.aprovider = aprovider;
	}

	public Date getAdate() {
		return adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}

	public String getAunit() {
		return aunit;
	}

	public void setAunit(String aunit) {
		this.aunit = aunit;
	}

	public Integer getAcount() {
		return acount;
	}

	public void setAcount(Integer acount) {
		this.acount = acount;
	}

	public String getAnote() {
		return anote;
	}

	public void setAnote(String anote) {
		this.anote = anote;
	}

	public Float getAprice() {
		return aprice;
	}

	public void setAprice(Float aprice) {
		this.aprice = aprice;
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

	public String addAsset()
	{
//		this.getPageInfo().setResult(assetCategoryService.findAll());
	//	this.setAssetCategory(assetCategoryService.findAssetCategory());
		assetCategoryService.findAssetCategory();
		
		// System.out.println(Asset.getAccode());
//        this.setAssetCategoryList(assetCategoryList);
		return "addAsset";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createAsset() {
		// Asset.setAccode(getAccode());

		assetService.createAsset(asset);
		this.setResult("创建");
		return "successAsset";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteAsset() {
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
		// System.out.println(Asset.getAccode());
        this.setAsset(asset);
		// this.setAccode(Asset.getAccode());
		// this.setAcname(Asset.getAcname());
		// this.setSupacid(Asset.getSupacid());
		// this.setSupacname(Asset.getSupacname());
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
