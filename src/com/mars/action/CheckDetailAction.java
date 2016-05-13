/**
 * 盘点action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.ICheckDetailService;
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
public class CheckDetailAction extends ActionSupport {

	private ICheckDetailService checkDetailService;
	protected IPage pageInfo = new PageInfo();

	private CheckDetail checkDetail = new CheckDetail();
	private List<CheckDetail> checkDetailList = new ArrayList<CheckDetail>();

	private String result;
	
	
	

	private Integer cdid;
	private Checked checked;
	private Asset asset;
	private Integer cdresult;
	private Date cddate;
	

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

	

	public List<CheckDetail> getCheckDetailList() {
		return checkDetailList;
	}

	public void setCheckDetailList(List<CheckDetail> checkDetailList) {
		this.checkDetailList = checkDetailList;
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addCheckDetail() {

		return "addCheckDetail";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createCheckDetail() {

		checkDetail.setAsset(checkDetailService.findAssetById(this.getAsset().getAid()));
		checkDetail.setChecked(checkDetailService.findCheckedById(this.getChecked().getCid()));
		checkDetail.setCdresult(this.getCdresult());
		
	
		Date date = new Date();
		Timestamp nousedate = new Timestamp(date.getTime());
		checkDetail.setCddate(nousedate);
		checkDetailService.createCheckDetail(checkDetail);
		this.setResult("创建");
		return "successCheckDetail";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteCheckDetail() {
		checkDetailService.deleteCheckDetail(this.getCdid());
		this.setResult("删除");
		return "successCheckDetail";
	}

	/**
	 * 更新状态
	 * 
	 * @return
	 */
//	public String updateState() {
//		checkDetail = checkDetailService.findCheckDetailById(this.getCid());
//		checkDetail.setRestate(1);
//		checkDetailService.updateCheckDetail(checkDetail);
//
//		this.setResult("盘点完成");
//		return "successCheckDetail";
//	}

	/**
	 * 查找
	 * 
	 * @return
	 */
	public String findCheckDetail() {
		checkDetailService.findCheckDetail();
		return "findCheckDetail";
	}

	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findCheckDetailById() {

		checkDetail = checkDetailService.findCheckDetailById(this.getCdid());
		this.setAsset(checkDetail.getAsset());
		this.setCdresult(checkDetail.getCdresult());
		this.setCddate(checkDetail.getCddate());
		this.setChecked(checkDetail.getChecked());
		return "findCheckDetailById";

	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageCheckDetail() {
		this.getPageInfo().setResult((checkDetailService.findAll(pageInfo)));
		return "pageCheckDetail";
	}

}
