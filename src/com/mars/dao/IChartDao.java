/**
 * 报表资产dao层
 */
package com.mars.dao;

import java.util.List;

import com.mars.tools.IPage;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.Finance;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;



/**
 * @author ye
 * @date 2016/5/27
 */
public interface IChartDao {
	
	public List<PurchaseDetail> findPurchaseDetail();
	public List<AssetCategory> findAssetCategory() ;
	
}
