/**
 * 测试资产类别action
 */
package com.mars.action;

import com.mars.service.IAssetCategoryService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.opensymphony.xwork2.ActionSupport;



/**
 * @author ye
 * @date 2016/4/19
 */
public class AssetCategoryAction extends ActionSupport{
	
	private IAssetCategoryService assetCategoryService;

	protected IPage pageInfo = new PageInfo();   
	
	private int acid;
	
	public IAssetCategoryService getAssetCategoryService() {
		return assetCategoryService;
	}

	public void setAssetCategoryService(IAssetCategoryService assetCategoryService) {
		this.assetCategoryService = assetCategoryService;
	}
	
	public IPage getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(IPage pageInfo) {
		this.pageInfo = pageInfo;
	}

	public int getAcid() {
		return acid;
	}

	public void setAcid(int acid) {
		this.acid = acid;
	}

	/**
	 * 创建
	 * @return
	 */
	public String createAssetCategory() {
		assetCategoryService.createAssetCategory();
		return "createAssetCategory";
	}
	
	/**
	 * 删除
	 * @return
	 */
	public String deleteAssetCategory() {
		assetCategoryService.deleteAssetCategory(this.getAcid());
		return "deleteAssetCategory";
	}
	
	/**
	 * 更新
	 * @return
	 */
	public String updateAssetCategory() {
		assetCategoryService.updateAssetCategory();
		return "updateAssetCategory";
	}
	
	/**
	 * 查找
	 * @return
	 */
	public String findAssetCategory() {
		assetCategoryService.findAssetCategory();
		return "findAssetCategory";
	}
	
	/**
	 * 分页查找
	 * @return
	 */
	public String pageAssetCategory(){
		this.getPageInfo().setResult(
				(assetCategoryService.findAll(pageInfo)));
		
		return "pageAssetCategory";
	}
	
}
