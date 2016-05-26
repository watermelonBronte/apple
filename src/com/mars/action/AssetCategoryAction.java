/**
 * 测试资产类别action
 */
package com.mars.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mars.service.IAssetCategoryService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.AssetCategory;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/4/19
 */
public class AssetCategoryAction extends ActionSupport {

	private IAssetCategoryService assetCategoryService;

	protected IPage pageInfo = new PageInfo();

	private Integer acid;
	private String accode;
	private String acname;
	private Integer supacid;
	private String supacname;

	private String result;

	private AssetCategory assetCategory = new AssetCategory();

	public AssetCategory getAssetCategory() {
		return assetCategory;
	}

	public void setAssetCategory(AssetCategory assetCategory) {
		this.assetCategory = assetCategory;
	}

	public IAssetCategoryService getAssetCategoryService() {
		return assetCategoryService;
	}

	public void setAssetCategoryService(
			IAssetCategoryService assetCategoryService) {
		this.assetCategoryService = assetCategoryService;
	}

	public IPage getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(IPage pageInfo) {
		this.pageInfo = pageInfo;
	}

	public Integer getAcid() {
		return acid;
	}

	public void setAcid(Integer acid) {
		this.acid = acid;
	}

	public String getAccode() {
		return accode;
	}

	public void setAccode(String accode) {
		this.accode = accode;
	}

	public String getAcname() {
		return acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public Integer getSupacid() {
		return supacid;
	}

	public void setSupacid(Integer supacid) {
		this.supacid = supacid;
	}

	public String getSupacname() {
		return supacname;
	}

	public void setSupacname(String supacname) {
		this.supacname = supacname;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */
	public String addAssetCategory() {
		return "addAssetCategory";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createAssetCategory() {
		try {
			assetCategory.setAccode(getAccode());
			assetCategory.setAcname(getAcname());
			assetCategory.setSupacid(getSupacid());
			assetCategory.setSupacname(getSupacname());

			assetCategoryService.createAssetCategory(assetCategory);
		} catch (Exception e) {
			// TODO: handle exception
		}

		pageAssetCategory();
		return "pageAssetCategory";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteAssetCategory() {
		try {
			assetCategoryService.deleteAssetCategory(this.getAcid());
		} catch (Exception e) {
			// TODO: handle exception
		}

		pageAssetCategory();
		return "pageAssetCategory";
	}

	/**
	 * 更新
	 * 
	 * @return
	 */
	public String updateAssetCategory() {

		try {
			assetCategory.setAccode(getAccode());
			assetCategory.setAcname(getAcname());
			assetCategory.setSupacid(getSupacid());
			assetCategory.setSupacname(getSupacname());
			assetCategory.setAcid(getAcid());
			assetCategoryService.updateAssetCategory(assetCategory);

		} catch (Exception e) {
			// TODO: handle exception
		}
		// System.out.println(this.getAccode()+this.getAcname()+this.getSupacname()+this.getSupacid()+this.getAcid());

		pageAssetCategory();
		return "pageAssetCategory";
	}

	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findAssetCategoryById() {

		try {
			assetCategory = assetCategoryService.findAssetCategoryById(this
					.getAcid());

			this.setAssetCategory(assetCategory);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return "findAssetCategoryById";
	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageAssetCategory() {
		this.getPageInfo().setResult((assetCategoryService.findAll(pageInfo)));

		return "pageAssetCategory";
	}

}
