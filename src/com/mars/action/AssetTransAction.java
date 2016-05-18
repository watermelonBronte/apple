/**
 * 移交action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.IAssetTransService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.CheckDetail;
import com.mars.vo.AssetTrans;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/5/10
 */
public class AssetTransAction extends ActionSupport {

	private IAssetTransService assetTransService;
	protected IPage pageInfo = new PageInfo();

	private AssetTrans assetTrans = new AssetTrans();
	private List<AssetTrans> assetTransList = new ArrayList<AssetTrans>();

	private String result;

	private List<User> userList = new ArrayList<User>();

	private Integer atid;
	private User user;
	private Date atrdate;
	private Date atfdate;
	private Integer attype;
	private Integer atstate;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public Integer getAtid() {
		return atid;
	}

	public void setAtid(Integer atid) {
		this.atid = atid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getAtrdate() {
		return atrdate;
	}

	public void setAtrdate(Date atrdate) {
		this.atrdate = atrdate;
	}

	public Date getAtfdate() {
		return atfdate;
	}

	public void setAtfdate(Date atfdate) {
		this.atfdate = atfdate;
	}

	public Integer getAttype() {
		return attype;
	}

	public void setAttype(Integer attype) {
		this.attype = attype;
	}

	public Integer getAtstate() {
		return atstate;
	}

	public void setAtstate(Integer atstate) {
		this.atstate = atstate;
	}

	public AssetTrans getAssetTrans() {
		return assetTrans;
	}

	public void setAssetTrans(AssetTrans assetTrans) {
		this.assetTrans = assetTrans;
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

	public IAssetTransService getAssetTransService() {
		return assetTransService;
	}

	public void setAssetTransService(IAssetTransService assetTransService) {
		this.assetTransService = assetTransService;
	}

	public List<AssetTrans> getAssetTransList() {
		return assetTransList;
	}

	public void setAssetTransList(List<AssetTrans> assetTransList) {
		this.assetTransList = assetTransList;
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addAssetTrans() {

		userList = assetTransService.findUser();
		return "addAssetTrans";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createAssetTrans() {

		assetTrans.setUser(assetTransService.findUserById(this.getUser()
				.getUid()));
		assetTrans.setAtrdate(this.getAtrdate());
		assetTrans.setAttype(this.getAttype());
		assetTrans.setAtstate(this.getAtstate());

		assetTransService.createAssetTrans(assetTrans);
//		this.setResult("创建");
//		return "successAssetTrans";
		pageAssetTrans();
		return "pageAssetTrans";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteAssetTrans() {
		assetTransService.deleteAssetTrans(this.getAtid());

		pageAssetTrans();
		return "pageAssetTrans";
	}

	/**
	 * 移交完成
	 * 
	 * @return
	 */
	public String updateState() {
		assetTrans = assetTransService.findAssetTransById(this.getAtid());
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		assetTrans.setAtfdate(nousedate);
		assetTrans.setAtstate(1);

		assetTransService.updateAssetTrans(assetTrans);

		pageAssetTrans();
		return "pageAssetTrans";
	}

	

	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findAssetTransById() {

		assetTrans = assetTransService.findAssetTransById(this.getAtid());
		this.setUser(assetTrans.getUser());
		this.setAtrdate(assetTrans.getAtrdate());
		this.setAtfdate(assetTrans.getAtfdate());
		this.setAttype(assetTrans.getAttype());
		this.setAtstate(assetTrans.getAtstate());
		return "findAssetTransById";

	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageAssetTrans() {
		this.getPageInfo().setResult((assetTransService.findAll(pageInfo)));
		return "pageAssetTrans";
	}

}
