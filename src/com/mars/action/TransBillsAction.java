/**
 * 调度单action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.ITransBillsService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.Department;
import com.mars.vo.TransBills;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author ye
 * @date 2016/5/6
 */
public class TransBillsAction extends ActionSupport {

	private ITransBillsService transBillsService;
	protected IPage pageInfo = new PageInfo();
	private List<User> userList = new ArrayList<User>();
	private List<Asset> assetList =new ArrayList<Asset>();


	private String result;
	private Integer tbid;
	private User userByInuid;
	private User userByOutuid;
	private Asset asset;
	private Date outdate;
	private String outname;
	private Integer tbstate;
	private Date indate;

	private TransBills transBills = new TransBills();
	private List<TransBills> transBillsList = new ArrayList<TransBills>();

	



	
	
	public ITransBillsService getTransBillsService() {
		return transBillsService;
	}

	public void setTransBillsService(ITransBillsService transBillsService) {
		this.transBillsService = transBillsService;
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

	public Integer getTbid() {
		return tbid;
	}

	public void setTbid(Integer tbid) {
		this.tbid = tbid;
	}

	public User getUserByInuid() {
		return userByInuid;
	}

	public void setUserByInuid(User userByInuid) {
		this.userByInuid = userByInuid;
	}

	public User getUserByOutuid() {
		return userByOutuid;
	}

	public void setUserByOutuid(User userByOutuid) {
		this.userByOutuid = userByOutuid;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Date getOutdate() {
		return outdate;
	}

	public void setOutdate(Date outdate) {
		this.outdate = outdate;
	}

	public String getOutname() {
		return outname;
	}

	public void setOutname(String outname) {
		this.outname = outname;
	}

	public Integer getTbstate() {
		return tbstate;
	}

	public void setTbstate(Integer tbstate) {
		this.tbstate = tbstate;
	}

	public Date getIndate() {
		return indate;
	}

	public void setIndate(Date indate) {
		this.indate = indate;
	}

	public TransBills getTransBills() {
		return transBills;
	}

	public void setTransBills(TransBills transBills) {
		this.transBills = transBills;
	}

	public List<TransBills> getTransBillsList() {
		return transBillsList;
	}

	public void setTransBillsList(List<TransBills> transBillsList) {
		this.transBillsList = transBillsList;
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addTransBills() {
		userList = transBillsService.findUser();
		assetList = transBillsService.findAsset();
		return "addTransBills";
	}

	/**
	 * 
	 * 填写调出单
	 * @return
	 */
	public String createTransBills() {
		transBills.setUserByOutuid(transBillsService.findUserById(this.getUserByOutuid().getUid()));
		transBills.setAsset(transBillsService.findAssetById(this.getAsset().getAid()));
		//状态：0调拨中1确定调入
		transBills.setTbstate(this.getTbstate());
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		transBills.setOutdate(nousedate);
		//调出事由
		transBills.setOutname(this.getOutname());
		transBillsService.createTransBills(transBills);
		this.setResult("创建");
		return "successTransBills";
	}
	

	/**
	 * 填写调入确定
	 * @return
	 */
	public String verifyTransBills() {
		transBills=transBillsService.findTransBillsById(this.getTbid());
		transBills.setUserByInuid(transBillsService.findUserById(this.getUserByInuid().getUid()));
		//状态：0调拨中1确定调入
		transBills.setTbstate(this.getTbstate());
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		transBills.setIndate(nousedate);

		transBillsService.updateTransBills(transBills);
		this.setResult("调入确认");
		return "successTransBills";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteTransBills() {
		transBillsService.deleteTransBills(this.getTbid());
		this.setResult("删除");
		return "successTransBills";
	}



	
	/**
	 * 查找
	 * 
	 * @return
	 */
	public String findTransBills() {
		transBillsService.findTransBills();
		return "findTransBills";
	}

	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findTransBillsById() {

		userList = transBillsService.findUser();
		transBills = transBillsService.findTransBillsById(this.getTbid());

		this.setAsset(transBills.getAsset());
		this.setUserByOutuid(transBills.getUserByOutuid());
		this.setOutdate(transBills.getOutdate());
		this.setOutname(transBills.getOutname());
		this.setTbstate(transBills.getTbstate());
       

		return "findTransBillsById";

	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageTransBills() {
		this.getPageInfo().setResult((transBillsService.findAll(pageInfo)));
	/*	userList = transBillsService.findUser();
		assetList = transBillsService.findAsset();*/
		userList = transBillsService.findUser();
		assetList = transBillsService.findAsset();
		return "pageTransBills";
	}

}
