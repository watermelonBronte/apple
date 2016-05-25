/**
 * 报废action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.IScrapService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.Scrap;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author ye
 * @date 2016/5/6
 */
public class ScrapAction extends ActionSupport {

	private IScrapService scrapService;
	protected IPage pageInfo = new PageInfo();


	private String result;
	private Integer scid;
	private Asset asset;
	private User userByUid;
	private User userByCuid;
	private Date scdate;
	private Date cdate;
	private Integer scstate;
	private Scrap scrap = new Scrap();
	
	private List<User> userList = new ArrayList<User>();
	private List<Asset> assetList =new ArrayList<Asset>();



	

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

	public Integer getScid() {
		return scid;
	}

	public void setScid(Integer scid) {
		this.scid = scid;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public User getUserByUid() {
		return userByUid;
	}

	public void setUserByUid(User userByUid) {
		this.userByUid = userByUid;
	}

	public User getUserByCuid() {
		return userByCuid;
	}

	public void setUserByCuid(User userByCuid) {
		this.userByCuid = userByCuid;
	}

	public Date getScdate() {
		return scdate;
	}

	public void setScdate(Date scdate) {
		this.scdate = scdate;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Integer getScstate() {
		return scstate;
	}

	public void setScstate(Integer scstate) {
		this.scstate = scstate;
	}

	public Scrap getScrap() {
		return scrap;
	}

	public void setScrap(Scrap scrap) {
		this.scrap = scrap;
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

	public IScrapService getScrapService() {
		return scrapService;
	}

	public void setScrapService(IScrapService scrapService) {
		this.scrapService = scrapService;
	}

	


	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addScrap() {

		userList = scrapService.findUser();
		assetList = scrapService.findAsset();
		return "addScrap";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createScrap() {

		scrap.setAsset(scrapService.findAssetById(this.getAsset().getAid()));
		scrap.setUserByUid(scrapService.findUserById((Integer) ActionContext.getContext().getSession().get("loginUid")));
		
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		scrap.setScdate(nousedate);
		
		scrap.setScstate(this.getScstate());
		scrapService.createScrap(scrap);
//		this.setResult("创建");
//		return "successScrap";
		pageScrap();
		return "pageScrap";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteScrap() {
		scrapService.deleteScrap(this.getScid());
//		this.setResult("删除");
//		return "successScrap";
		pageScrap();
		return "pageScrap";
	}

	/**
	 * 更新
	 * 
	 * @return
	 */
	public String examinScrap() {
		scrap = scrapService.findScrapById(this.getScid());
		scrap.setUserByCuid(scrapService.findUserById(this.getUserByCuid().getUid()));
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		scrap.setCdate(nousedate);
		scrap.setScstate(this.getScstate());
        scrapService.updateScrap(scrap);

//		this.setResult("审核");
//		return "successScrap";
		pageScrap();
		return "pageScrap";
		
	}

	


	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findScrapById() {

		userList = scrapService.findUser();
		
		scrap = scrapService.findScrapById(this.getScid());
		this.setAsset(scrap.getAsset());
		this.setUserByUid(scrap.getUserByUid());
		this.setScdate(scrap.getScdate());
		this.setScstate(scrap.getScstate());


		return "findScrapById";

	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageScrap() {
		
		this.getPageInfo().setResult((scrapService.findAll(pageInfo)));
		userList = scrapService.findUser();
		assetList = scrapService.findAsset();
		
		return "pageScrap";
	}

}
