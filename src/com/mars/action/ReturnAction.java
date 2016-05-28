/**
 * 
 */
package com.mars.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.impl.ReturnService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.AssetReturn;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionContext;

/**
 *@author 杨铮
 *@data 2016/5/6
 */
public class ReturnAction {
	private AssetReturn assetReturn = new AssetReturn();
	protected IPage pageInfo = new PageInfo();
	private List<Asset> assetList = new ArrayList<Asset>();

	public AssetReturn getAssetReturn() {
		return assetReturn;
	}

	public void setAssetReturn(AssetReturn assetReturn) {
		this.assetReturn = assetReturn;
	}

	public List<Asset> getAssetList() {
		return assetList;
	}

	public void setAssetList(List<Asset> assetList) {
		this.assetList = assetList;
	}

	public IPage getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(IPage pageInfo) {
		this.pageInfo = pageInfo;
	}

	private ReturnService returnService = new ReturnService();

	public ReturnService getReturnService() {
		return returnService;
	}

	public void setReturnService(ReturnService returnService) {
		this.returnService = returnService;
	}

	private Integer arid;
	private User userByGuid;

	public Integer getArid() {
		return arid;
	}

	public void setArid(Integer arid) {
		this.arid = arid;
	}

	public User getUserByGuid() {
		return userByGuid;
	}

	public void setUserByGuid(User userByGuid) {
		this.userByGuid = userByGuid;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public User getUserByRuid() {
		return userByRuid;
	}

	public void setUserByRuid(User userByRuid) {
		this.userByRuid = userByRuid;
	}

	public Date getArgdate() {
		return argdate;
	}

	public void setArgdate(Date argdate) {
		this.argdate = argdate;
	}

	public Date getArrdate() {
		return arrdate;
	}

	public void setArrdate(Date arrdate) {
		this.arrdate = arrdate;
	}

	public Integer getArstate() {
		return arstate;
	}

	public void setArstate(Integer arstate) {
		this.arstate = arstate;
	}

	private Asset asset;
	private User userByRuid;
	private Date argdate;
	private Date arrdate;
	private Integer arstate;

	public String queryReturn() {// 显示所有信息

		assetList = returnService.findAsset();
		this.getPageInfo().setResult(returnService.findReturn(pageInfo));// 分页

		return "success";
	}

	public String deleteReturn() {// 删除
		try {
			returnService.deletReturn(arid);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

		return "success";
	}

	
	public String createRerutn() {// 增加信息
//		try {
			AssetReturn a = new AssetReturn();
			a.setArgdate(this.getArgdate());
			a.setArid(this.getArid());
			// a.setArrdate(this.getArrdate());
			a.setArstate(this.getArstate());

			a.setUserByGuid(returnService.findReturnByGid((Integer) ActionContext
					.getContext().getSession().get("loginUid")));
			// a.setUserByRuid(returnService.findReturnByRid(this.getUserByRuid().getUid()));
			a.setAsset(returnService.findReturnByAid(this.getAsset().getAid()));
			returnService.createReturn(a);// 保存接收到的数据到数据库中
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

		return "success";

	}

	public String selectReturnById() {// 显示当前用户
		try {
			assetReturn = returnService.findReturnById(this.getArid());

			this.setArgdate(assetReturn.getArgdate());
			this.setArid(assetReturn.getArid());
			// this.setArrdate(assetReturn.getArrdate());
			this.setArstate(assetReturn.getArstate());
			this.setAsset(assetReturn.getAsset());
			this.setUserByGuid(assetReturn.getUserByGuid());
		} catch (Exception e) {
			// TODO: handle exception
		}

		// this.setUserByRuid(assetReturn.getUserByRuid());

		return "success";
	}

	public String updateRerutn() {// 更新
		try {
			assetReturn.setArgdate(this.getArgdate());
			assetReturn.setArid(this.getArid());
			assetReturn.setArrdate(this.getArrdate());
			assetReturn.setArstate(this.getArstate());

			assetReturn.setUserByGuid(returnService.findReturnByGid(this
					.getUserByGuid().getUid()));

			assetReturn.setAsset(returnService.findReturnByAid(this.getAsset()
					.getAid()));
			assetReturn.setUserByRuid(returnService.findReturnByRid(this
					.getUserByRuid().getUid()));
			returnService.updateReturn(assetReturn);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return "success";

	}

}
