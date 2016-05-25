/**
 * 盘点action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.ICheckedService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.CheckDetail;
import com.mars.vo.Checked;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/5/10
 */
public class CheckedAction extends ActionSupport {

	private ICheckedService checkedService;
	protected IPage pageInfo = new PageInfo();

	private Checked checked = new Checked();
	private List<User> userList = new ArrayList<User>();

	private String result;
	
	private Integer cid;
	private User user;
	private Date cdate;
	private Integer cstate;

	

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Integer getCstate() {
		return cstate;
	}

	public void setCstate(Integer cstate) {
		this.cstate = cstate;
	}

	public Checked getChecked() {
		return checked;
	}

	public void setChecked(Checked checked) {
		this.checked = checked;
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

	public ICheckedService getCheckedService() {
		return checkedService;
	}

	public void setCheckedService(ICheckedService checkedService) {
		this.checkedService = checkedService;
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

	public String addChecked() {

		userList = checkedService.findUser();
		return "addChecked";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createChecked() {

		checked.setUser(checkedService.findUserById((Integer) ActionContext.getContext().getSession().get("loginUid")));
		checked.setCstate(this.getCstate());
				checked.setCdate(this.getCdate());
		checkedService.createChecked(checked);
//		this.setResult("创建");
		pageChecked();
		return "pageChecked";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteChecked() {
		checkedService.deleteChecked(this.getCid());
//		this.setResult("删除");
		pageChecked();
		return "pageChecked";
	}

	/**
	 * 更新状态(盘点完成）
	 * 
	 * @return
	 */
	public String updateState() {
		checked = checkedService.findCheckedById(this.getCid());
		checked.setCstate(1);
		checkedService.updateChecked(checked);

//		this.setResult("盘点完成");
		pageChecked();
		return "pageChecked";
	}



	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findCheckedById() {

		checked = checkedService.findCheckedById(this.getCid());
		this.setUser(checked.getUser());
		this.setCstate(checked.getCstate());
		this.setCdate(checked.getCdate());
		return "findCheckedById";

	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageChecked() {
		this.getPageInfo().setResult((checkedService.findAll(pageInfo)));
		userList = checkedService.findUser();
		return "pageChecked";
	}

}
