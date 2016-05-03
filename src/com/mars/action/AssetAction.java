/**
 * 测试资产action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.util.Date;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

import com.mars.service.IAssetCategoryService;
import com.mars.service.IAssetService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.Department;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/4/19
 */
public class AssetAction extends ActionSupport {

	private IAssetService assetService;

	private IAssetCategoryService assetCategoryService;
	protected IPage pageInfo = new PageInfo();

	private String result;

	private Asset asset = new Asset();
	private AssetCategory assetCategory = new AssetCategory();

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public AssetCategory getAssetCategory() {
		return assetCategory;
	}

	public void setAssetCategory(AssetCategory assetCategory) {
		this.assetCategory = assetCategory;
	}

	public IAssetService getAssetService() {
		return assetService;
	}

	public void setAssetService(IAssetService assetService) {
		this.assetService = assetService;
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

	public IAssetCategoryService getAssetCategoryService() {
		return assetCategoryService;
	}

	public void setAssetCategoryService(
			IAssetCategoryService assetCategoryService) {
		this.assetCategoryService = assetCategoryService;
	}

	/**
	 * 返回主界面
	 * 
	 * @return
	 */
	public String home() {
		return "home";
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */
	public String addAsset()
	{
		this.setAssetCategory(assetCategoryService.findAssetCategory());
		return "addAsset";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createAsset() {
		// Asset.setAccode(getAccode());

		assetService.createAsset(asset);
		this.setResult("创建");
		return "successAsset";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteAsset() {
		assetService.deleteAsset(this.getAsset().getAid());
		this.setResult("删除");
		return "successAsset";
	}

	/**
	 * 更新
	 * 
	 * @return
	 */
	public String updateAsset() {

		// System.out.println(this.getAccode()+this.getAcname()+this.getSupacname()+this.getSupacid()+this.getAcid());
		// Asset.setAccode(getAccode());

		assetService.updateAsset(asset);

		this.setResult("更新");
		return "successAsset";
	}

	/**
	 * 查找
	 * 
	 * @return
	 */
	public String findAsset() {
		assetService.findAsset();
		return "findAsset";
	}

	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findAssetById() {

		asset = assetService.findAssetById(this.getAsset().getAid());
		// System.out.println(Asset.getAccode());

		// this.setAccode(Asset.getAccode());
		// this.setAcname(Asset.getAcname());
		// this.setSupacid(Asset.getSupacid());
		// this.setSupacname(Asset.getSupacname());
		return "findAssetById";
	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageAsset() {
		this.getPageInfo().setResult((assetService.findAll(pageInfo)));

		return "pageAsset";
	}

}
