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


	private String result;
	private Integer tbid;
//	private Department departmentByIndid;
	private User userByInuid;
	private User userByOutuid;
	private Asset asset;
//	private Department departmentByOutdid;
	private Date outdate;
	private String outname;
	private Integer tbstate;
	private Date indate;

	private TransBills transBills = new TransBills();
	private List<TransBills> transBillsList = new ArrayList<TransBills>();

	



	
	public TransBills getTransBills() {
		return transBills;
	}

	public void setTransBills(TransBills transBills) {
		this.transBills = transBills;
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

	public ITransBillsService getTransBillsService() {
		return transBillsService;
	}

	public void setTransBillsService(ITransBillsService transBillsService) {
		this.transBillsService = transBillsService;
	}

	
	public Integer getTbid() {
		return tbid;
	}

	public void setTbid(Integer tbid) {
		this.tbid = tbid;
	}

//	public Department getDepartmentByIndid() {
//		return departmentByIndid;
//	}
//
//	public void setDepartmentByIndid(Department departmentByIndid) {
//		this.departmentByIndid = departmentByIndid;
//	}

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

//	public Department getDepartmentByOutdid() {
//		return departmentByOutdid;
//	}
//
//	public void setDepartmentByOutdid(Department departmentByOutdid) {
//		this.departmentByOutdid = departmentByOutdid;
//	}

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
		// this.getPageInfo().setResult(transBillsService.findAll());
		// this.setTransBills(transBillsService.findTransBills());
		// transBillsService.findTransBills();

		// System.out.println(TransBills.getAccode());
		// this.setTransBillsList(transBillsList);
		return "addTransBills";
	}

	/**
	 * 
	 * 填写调入单
	 * @return
	 */
	public String createTransInBills() {
		transBills.setUserByInuid(transBillsService.findUserById(this.getUserByInuid().getUid()));
		transBills.setAsset(transBillsService.findAssetById(this.getAsset().getAid()));
		//状态：1调入2调出
		transBills.setTbstate(1);
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		transBills.setIndate(nousedate);
		
		transBillsService.createTransBills(transBills);
		this.setResult("创建调入单");
		return "successTransBills";
	}
	
	/**
	 * 填写调出单
	 * @return
	 */
	public String createTransOutBills() {
		transBills=transBillsService.findTransBillsById(this.getTbid());
		transBills.setUserByOutuid(transBillsService.findUserById(this.getUserByOutuid().getUid()));
		transBills.setOutname(this.getOutname());
		//状态：1调入2调出
		transBills.setTbstate(2);
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		transBills.setOutdate(nousedate);

		transBillsService.createTransBills(transBills);
		this.setResult("创建调出单");
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

		transBills = transBillsService.findTransBillsById(this.getTbid());
//		this.setFcode(transBills.getFcode());
//		this.setFdate(transBills.getFdate());
//		this.setFenter(transBills.getFenter());
//		this.setUser(transBills.getUser());
        this.setTbid(transBills.getTbid());
        this.setOutdate(transBills.getOutdate());
     
        //调出还没写完
		return "findTransBillsById";

	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageTransBills() {
		this.getPageInfo().setResult((transBillsService.findAll(pageInfo)));
		return "pageTransBills";
	}

}
