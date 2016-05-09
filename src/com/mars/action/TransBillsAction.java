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
	private Department departmentByIndid;
	private User userByInuid;
	private User userByOutuid;
	private Asset asset;
	private Department departmentByOutdid;
	private Date outdate;
	private String outname;
	private Integer tbstate;
	private Date indate;

	private TransBills transBills = new TransBills();
	private List<TransBills> transBillsList = new ArrayList<TransBills>();

	

	public Integer getFid() {
		return tbid;
	}

	public void setFid(Integer tbid) {
		this.tbid = tbid;
	}

	
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

	public Department getDepartmentByIndid() {
		return departmentByIndid;
	}

	public void setDepartmentByIndid(Department departmentByIndid) {
		this.departmentByIndid = departmentByIndid;
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

	public Department getDepartmentByOutdid() {
		return departmentByOutdid;
	}

	public void setDepartmentByOutdid(Department departmentByOutdid) {
		this.departmentByOutdid = departmentByOutdid;
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
	 * 创建
	 * 
	 * @return
	 */
	public String createTransBills() {
		// TransBills.setAccode(getAccode());
//		transBills.setUserByOutuid(transBills.this.getUserByOutuid().getUid());
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		transBills.setOutdate(nousedate);

		// System.out.println(this.getUser().getUid()+"=====");
		// 将方法写入同一个Service
//		transBills.setUser(transBillsService.findUserById(this.getUser().getUid()));

//		transBills.setFenter(this.getFenter());
		transBillsService.createTransBills(transBills);
		this.setResult("创建");
		return "successTransBills";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteTransBills() {
		transBillsService.deleteTransBills(this.getFid());
		this.setResult("删除");
		return "successTransBills";
	}

	/**
	 * 更新
	 * 
	 * @return
	 */
	public String updateTransBills() {

//		transBills.setFid(getFid());
//		transBills.setFcode(getFcode());
//		Date date = new Date();
//		Timestamp nousedate = new Timestamp(date.getTime());
//		transBills.setFdate(nousedate);
//		transBills.setFenter(getFenter());
//		transBills.setUser(transBillsService.findUserById(this.getUser().getUid()));
		transBillsService.updateTransBills(transBills);

		this.setResult("更新");
		return "successTransBills";
	}

	public String updateEnter() {
		transBills = transBillsService.findTransBillsById(this.getFid());
//		transBills.setFid(getFid());
	    
//		transBills.setFenter(1);
	
		transBillsService.updateTransBills(transBills);
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

		transBills = transBillsService.findTransBillsById(this.getFid());
//		this.setFcode(transBills.getFcode());
//		this.setFdate(transBills.getFdate());
//		this.setFenter(transBills.getFenter());
//		this.setUser(transBills.getUser());

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
