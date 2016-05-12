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
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/5/10
 */
public class CheDetailAction extends ActionSupport {

	private ICheckedService checkedService;
	protected IPage pageInfo = new PageInfo();

	private Checked checked = new Checked();
	private List<Checked> checkedList = new ArrayList<Checked>();

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

	/**
	 * 返回主界面
	 * 
	 * @return
	 */
	public String home() {
		return "home";
	}

	public List<Checked> getCheckedList() {
		return checkedList;
	}

	public void setCheckedList(List<Checked> checkedList) {
		this.checkedList = checkedList;
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addChecked() {

		return "addChecked";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createChecked() {

		checked.setUser(checkedService.findUserById(this.getUser().getUid()));
		checked.setCstate(this.getCstate());
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		checked.setCdate(nousedate);
		checkedService.createChecked(checked);
		this.setResult("创建");
		return "successChecked";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteChecked() {
		checkedService.deleteChecked(this.getCid());
		this.setResult("删除");
		return "successChecked";
	}

	/**
	 * 更新状态
	 * 
	 * @return
	 */
//	public String updateState() {
//		checked = checkedService.findCheckedById(this.getCid());
//		checked.setRestate(1);
//		checkedService.updateChecked(checked);
//
//		this.setResult("盘点完成");
//		return "successChecked";
//	}

	/**
	 * 查找
	 * 
	 * @return
	 */
	public String findChecked() {
		checkedService.findChecked();
		return "findChecked";
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
		return "pageChecked";
	}

}
