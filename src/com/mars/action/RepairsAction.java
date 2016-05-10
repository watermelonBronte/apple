/**
 * 维修action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.IRepairsService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.Repairs;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/5/10
 */
public class RepairsAction extends ActionSupport {

	private IRepairsService repairsService;
	protected IPage pageInfo = new PageInfo();

	private Repairs repairs = new Repairs();
	private List<Repairs> repairsList = new ArrayList<Repairs>();

	private String result;
	private Integer reid;
	private Asset asset;
	private User user;
	private String recondition;
	private Float reprice;
	private Integer restate;

	public Integer getReid() {
		return reid;
	}

	public void setReid(Integer reid) {
		this.reid = reid;
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

	public String getRecondition() {
		return recondition;
	}

	public void setRecondition(String recondition) {
		this.recondition = recondition;
	}

	public Float getReprice() {
		return reprice;
	}

	public void setReprice(Float reprice) {
		this.reprice = reprice;
	}

	public Integer getRestate() {
		return restate;
	}

	public void setRestate(Integer restate) {
		this.restate = restate;
	}

	public Repairs getRepairs() {
		return repairs;
	}

	public void setRepairs(Repairs repairs) {
		this.repairs = repairs;
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

	public IRepairsService getRepairsService() {
		return repairsService;
	}

	public void setRepairsService(IRepairsService repairsService) {
		this.repairsService = repairsService;
	}

	/**
	 * 返回主界面
	 * 
	 * @return
	 */
	public String home() {
		return "home";
	}

	public List<Repairs> getRepairsList() {
		return repairsList;
	}

	public void setRepairsList(List<Repairs> repairsList) {
		this.repairsList = repairsList;
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addRepairs() {

		return "addRepairs";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createRepairs() {

		repairs.setAsset(repairsService.findAssetById(this.getAsset().getAid()));
		repairs.setUser(repairsService.findUserById(this.getUser().getUid()));
		repairs.setRecondition(this.getRecondition());
		repairs.setReprice(this.getReprice());
		repairs.setRestate(this.getRestate());
		repairsService.createRepairs(repairs);
		this.setResult("创建");
		return "successRepairs";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteRepairs() {
		repairsService.deleteRepairs(this.getReid());
		this.setResult("删除");
		return "successRepairs";
	}

	/**
	 * 更新状态
	 * 
	 * @return
	 */
	public String updateState() {
		repairs = repairsService.findRepairsById(this.getReid());
		repairs.setRestate(1);
		repairsService.updateRepairs(repairs);

		this.setResult("维修完成");
		return "successRepairs";
	}

	/**
	 * 查找
	 * 
	 * @return
	 */
	public String findRepairs() {
		repairsService.findRepairs();
		return "findRepairs";
	}

	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findRepairsById() {

		repairs = repairsService.findRepairsById(this.getReid());
		this.setUser(repairs.getUser());
		this.setAsset(repairs.getAsset());
		this.setRecondition(repairs.getRecondition());
		this.setReprice(repairs.getReprice());
		this.setRestate(repairs.getRestate());
		return "findRepairsById";

	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageRepairs() {
		this.getPageInfo().setResult((repairsService.findAll(pageInfo)));
		return "pageRepairs";
	}

}
