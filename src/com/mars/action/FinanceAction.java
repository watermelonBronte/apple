/**
 * 测试财务入账action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.IFinanceService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.Finance;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/5/6
 */
public class FinanceAction extends ActionSupport {
	private String sdate;
	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	private IFinanceService financeService;
	protected IPage pageInfo = new PageInfo();
	private List<User> userList = new ArrayList<User>();
	
	private String result;
	private Integer fid;
	private User user;
	private String fcode;
	private Integer fenter;
	private Date fdate;

	private Finance finance = new Finance();
	
	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFcode() {
		return fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public Integer getFenter() {
		return fenter;
	}

	public void setFenter(Integer fenter) {
		this.fenter = fenter;
	}

	public Date getFdate() {
		return fdate;
	}

	public void setFdate(Date fdate) {
		this.fdate = fdate;
	}

	public Finance getFinance() {
		return finance;
	}

	public void setFinance(Finance finance) {
		this.finance = finance;
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

	public IFinanceService getFinanceService() {
		return financeService;
	}

	public void setFinanceService(IFinanceService financeService) {
		this.financeService = financeService;
	}



	

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addFinance() {
		userList = financeService.findUser();
		return "addFinance";
	}
	private Integer uid;
	private Date date;
	private Integer enter;
	

	
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getEnter() {
		return enter;
	}

	public void setEnter(Integer enter) {
		this.enter = enter;
	}

	/**
	 * 根据属性查找
	 * @return
	 */
	public String SearchFinance() {
		if(this.getUid()!= null)
    		user = financeService.findUserById(this.getUid());
		financeService.findAllFinanceByAttr(pageInfo,user,enter,date);
		return "pageFinance";
	}
	private Asset asset = new Asset();
	
	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createFinance() {
		
		//创建财务入账
		finance.setFcode(this.getFcode());
		// 将方法写入同一个Service
		finance.setUser(financeService.findUserById(this.getUser().getUid()));
		finance.setFenter(this.getFenter());
		finance.setFdate(this.getFdate());
		financeService.createFinance(finance);
		
		//更新资产表fid
		asset.setFinance(finance);
		financeService.updateAsset(asset);
		
		this.setResult("创建");
		return "successFinance";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteFinance() {
		financeService.deleteFinance(this.getFid());
		this.setResult("删除");
		return "successFinance";
	}

	/**
	 * 更新
	 * 
	 * @return
	 */
	public String updateFinance() {

		finance.setFid(getFid());
		finance.setFcode(getFcode());
//		Date date = new Date();
//		Timestamp nousedate = new Timestamp(date.getTime());
//		finance.setFdate(nousedate);
		finance.setFdate(this.getFdate());
		finance.setFenter(getFenter());
		finance.setUser(financeService.findUserById(this.getUser().getUid()));
		financeService.updateFinance(finance);

		this.setResult("更新");
		return "successFinance";
	}

	public String updateEnter() {
		finance = financeService.findFinanceById(this.getFid());
		// finance.setFid(getFid());

		finance.setFenter(1);

		financeService.updateFinance(finance);
		return "successFinance";
	}

	/**
	 * 查找
	 * 
	 * @return
	 */
	public String findFinance() {
		financeService.findFinance();
		return "findFinance";
	}

	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findFinanceById() {

		finance = financeService.findFinanceById(this.getFid());
		this.setFcode(finance.getFcode());
		
		this.setFdate(finance.getFdate());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdate=sdf.format(fdate);
		this.setFenter(finance.getFenter());
		this.setUser(finance.getUser());

		return "findFinanceById";

	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageFinance() {
		userList = financeService.findUser();
		this.getPageInfo().setResult((financeService.findAll(pageInfo)));
		return "pageFinance";
	}

}
