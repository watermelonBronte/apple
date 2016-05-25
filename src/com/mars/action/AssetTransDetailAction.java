/**
 * 移交清单action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.IAssetTransDetailService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.AssetTrans;
import com.mars.vo.CheckDetail;
import com.mars.vo.AssetTransDetail;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/5/10
 */
public class AssetTransDetailAction extends ActionSupport {

	private IAssetTransDetailService assetTransDetailService;
	protected IPage pageInfo = new PageInfo();

	private List<User> userList = new ArrayList<User>();
	private List<Asset> assetList =new ArrayList<Asset>();
	private List<AssetTrans> assetTransList =new ArrayList<AssetTrans>();
	
	
	private AssetTransDetail assetTransDetail = new AssetTransDetail();
	
	private String result;
	
	
	private Integer tdid;
	private AssetTrans assetTrans;
	private Asset asset;
	private User user;
	private Integer tdresult;
	private Date tddate;
	
	private Integer atid;
	
	

	public Integer getAtid() {
		return atid;
	}

	public void setAtid(Integer atid) {
		this.atid = atid;
	}

	public Integer getTdid() {
		return tdid;
	}

	public void setTdid(Integer tdid) {
		this.tdid = tdid;
	}

	public AssetTrans getAssetTrans() {
		return assetTrans;
	}

	public void setAssetTrans(AssetTrans assetTrans) {
		this.assetTrans = assetTrans;
	}

	public List<AssetTrans> getAssetTransList() {
		return assetTransList;
	}

	public void setAssetTransList(List<AssetTrans> assetTransList) {
		this.assetTransList = assetTransList;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getTdresult() {
		return tdresult;
	}

	public void setTdresult(Integer tdresult) {
		this.tdresult = tdresult;
	}

	public Date getTddate() {
		return tddate;
	}

	public void setTddate(Date tddate) {
		this.tddate = tddate;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<Asset> getAssetList() {
		return assetList;
	}

	public void setAssetList(List<Asset> assetList) {
		this.assetList = assetList;
	}

	public AssetTransDetail getAssetTransDetail() {
		return assetTransDetail;
	}

	public void setAssetTransDetail(AssetTransDetail assetTransDetail) {
		this.assetTransDetail = assetTransDetail;
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

	public IAssetTransDetailService getAssetTransDetailService() {
		return assetTransDetailService;
	}

	public void setAssetTransDetailService(IAssetTransDetailService assetTransDetailService) {
		this.assetTransDetailService = assetTransDetailService;
	}


	
	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addAssetTransDetail() {

		userList = assetTransDetailService.findUser();
		assetList =assetTransDetailService.findAsset();
		assetTransList = assetTransDetailService.findAssetTrans();
		return "addAssetTransDetail";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createAssetTransDetail() {


	
		assetTransDetail.setAsset(assetTransDetailService.findAssetById(this.getAsset().getAid()));
		assetTransDetail.setUser(assetTransDetailService.findUserById((Integer) ActionContext.getContext().getSession().get("loginUid")));
		assetTransDetail.setAssetTrans(assetTransDetailService.findAssetTransById(this.getAtid()));
		assetTransDetail.setTdresult(this.getTdresult());
		assetTransDetail.setTddate(this.getTddate());
		
		assetTransDetailService.createAssetTransDetail(assetTransDetail);
//		this.setResult("创建");
//		return "successAssetTransDetail";
		pageAssetTransDetailByAtid();
		return "pageAssetTransDetailByAtid";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteAssetTransDetail() {
		assetTransDetailService.deleteAssetTransDetail(this.getTdid());
		
		pageAssetTransDetailByAtid();
		return "pageAssetTransDetailByAtid";
	}

	/**
	 * 移交清单(接收）
	 * 
	 * @return
	 */
//	public String updateState() {
//		assetTransDetail = assetTransDetailService.findAssetTransDetailById(this.getTdid());
//		assetTransDetail.setAsset(assetTransDetailService.findAssetById(this.getAsset().getAid()));
//		assetTransDetail.setUser(assetTransDetailService.findUserById(this.getUser().getUid()));
//		assetTransDetail.setAssetTrans(assetTransDetailService.findAssetTransById(this.getAssetTrans().getAtid()));
//		assetTransDetail.setTdresult(this.getTdresult());
//		assetTransDetail.setTddate(this.getTddate());
//		
//		
//		assetTransDetailService.updateAssetTransDetail(assetTransDetail);
//
////		this.setResult("修改移交清单");
//		pageAssetTransDetailByAtid();
//		return "pageAssetTransDetailByAtid";
//	}
	
	


	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
//	public String findAssetTransDetailById() {
//
//		assetTransDetail = assetTransDetailService.findAssetTransDetailById(this.getTdid());
//		this.setUser(assetTransDetail.getUser());
//		this.setAsset(assetTransDetail.getAsset());
//		this.setAssetTrans(assetTransDetail.getAssetTrans());
//		this.setTdresult(assetTransDetail.getTdresult());
//		this.setTddate(assetTransDetail.getTddate());
//		return "findAssetTransDetailById";
//
//	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageAssetTransDetail() {
		this.getPageInfo().setResult((assetTransDetailService.findAll(pageInfo)));
		return "pageAssetTransDetail";
	}
	
	/**
	 * 根据ATID分页查找
	 * 
	 * @return
	 */
	public String pageAssetTransDetailByAtid() {
		this.setAssetTrans(assetTransDetailService.findAssetTransById(this.getAtid()));
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("atid",this.getAtid());
		this.getPageInfo().setResult((assetTransDetailService.findAssetTransDetailByAtid(pageInfo,assetTrans)));
		return "pageAssetTransDetailByAtid";
	}

}
