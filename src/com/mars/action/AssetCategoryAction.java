/**
 * 测试资产类别action
 */
package com.mars.action;



import com.mars.service.IAssetCategoryService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.AssetCategory;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author ye
 * @date 2016/4/19
 */
public class AssetCategoryAction extends ActionSupport{
	
	private IAssetCategoryService assetCategoryService;

	protected IPage pageInfo = new PageInfo();   
	
	private Integer acid;
	private String accode;
	private String acname;
	private Integer supacid;
	private String supacname;
	
    

	
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

	

	/**
	 * 创建
	 * @return
	 */
	public String createAssetCategory() {
		assetCategoryService.createAssetCategory();
		return pageAssetCategory();
	}
	
	/**
	 * 删除
	 * @return
	 */
	public String deleteAssetCategory() {
		assetCategoryService.deleteAssetCategory(this.getAcid());
		return pageAssetCategory();
	}
	
	/**
	 * 更新
	 * @return
	 */
	public String updateAssetCategory() {
		AssetCategory assetCategory=new AssetCategory();
		assetCategory.setAccode(accode);
		assetCategory.setAcid(acid);
		assetCategory.setAcname(acname);
		assetCategory.setSupacid(supacid);
		assetCategory.setSupacname(supacname);
		assetCategoryService.updateAssetCategory(assetCategory);
		
		return pageAssetCategory();
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
	 * 根据ID查找
	 * @return
	 */
	public String findAssetCategoryById() {
		AssetCategory assetCategory = new AssetCategory();
		assetCategory=	assetCategoryService.findAssetCategoryById(this.getAcid());
//		System.out.println(this.getAcid());
		return "findAssetCategoryById";
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
