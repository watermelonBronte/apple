/**
 * 盘点action
 */
package com.mars.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.ICheckDetailService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.CheckDetail;
import com.mars.vo.Checked;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/5/10
 */
public class CheckDetailAction extends ActionSupport {

	private ICheckDetailService checkDetailService;
	protected IPage pageInfo = new PageInfo();

	private CheckDetail checkDetail = new CheckDetail();
	private List<Asset> assetList = new ArrayList<Asset>();

	private String result;

	private Integer cid;

	private Integer cdid;
	private Checked checked;
	private Asset asset;
	private Integer cdresult;
	private Date cddate;

	public List<Asset> getAssetList() {
		return assetList;
	}

	public void setAssetList(List<Asset> assetList) {
		this.assetList = assetList;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Integer getCdid() {
		return cdid;
	}

	public void setCdid(Integer cdid) {
		this.cdid = cdid;
	}

	public Checked getChecked() {
		return checked;
	}

	public void setChecked(Checked checked) {
		this.checked = checked;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public Integer getCdresult() {
		return cdresult;
	}

	public void setCdresult(Integer cdresult) {
		this.cdresult = cdresult;
	}

	public Date getCddate() {
		return cddate;
	}

	public void setCddate(Date cddate) {
		this.cddate = cddate;
	}

	public CheckDetail getCheckDetail() {
		return checkDetail;
	}

	public void setCheckDetail(CheckDetail checkDetail) {
		this.checkDetail = checkDetail;
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

	public ICheckDetailService getCheckDetailService() {
		return checkDetailService;
	}

	public void setCheckDetailService(ICheckDetailService checkDetailService) {
		this.checkDetailService = checkDetailService;
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addCheckDetail() {

		assetList = checkDetailService.findAsset();
		return "addCheckDetail";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createCheckDetail() {

		// System.out.println(cid);
		try {
			checkDetail.setAsset(checkDetailService.findAssetById(this
					.getAsset().getAid()));
			checkDetail.setChecked(checkDetailService.findCheckedById(this
					.getCid()));
			checkDetail.setCdresult(this.getCdresult());

			checkDetail.setCddate(this.getCddate());
			checkDetailService.createCheckDetail(checkDetail);
		} catch (Exception e) {
			// TODO: handle exception
		}

		pageCheckDetailByCid();
		return "pageCheckDetailByCid";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteCheckDetail() {
		try {
			checkDetailService.deleteCheckDetail(this.getCdid());
		} catch (Exception e) {
			// TODO: handle exception
		}

		pageCheckDetailByCid();
		return "pageCheckDetailByCid";
	}

	/**
	 * 更新状态
	 * 
	 * @return
	 */
	// public String updateState() {
	// checkDetail = checkDetailService.findCheckDetailById(this.getCid());
	// checkDetail.setRestate(1);
	// checkDetailService.updateCheckDetail(checkDetail);
	//
	// this.setResult("盘点完成");
	// return "successCheckDetail";
	// }

	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	// public String findCheckDetailById() {
	//
	//		 
	//			
	// checkDetail = checkDetailService.findCheckDetailById(this.getCdid());
	// this.setAsset(checkDetail.getAsset());
	// this.setCdresult(checkDetail.getCdresult());
	// this.setCddate(checkDetail.getCddate());
	// this.setChecked(checkDetail.getChecked());
	// return "findCheckDetailById";
	//
	// }

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageCheckDetail() {

		this.getPageInfo().setResult((checkDetailService.findAll(pageInfo)));
		return "pageCheckDetail";
	}

	/**
	 * 根据CID查找清单
	 */
	public String pageCheckDetailByCid() {
		try {
			this.setChecked(checkDetailService.findCheckedById(this.getCid()));
			ActionContext ctx = ActionContext.getContext();
			ctx.getSession().put("cid", this.getCid());
			this.getPageInfo().setResult(
					checkDetailService.findCheckDetailByCid(pageInfo, checked));// 分页

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "pageCheckDetailByCid";
	}
}
