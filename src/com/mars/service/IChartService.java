/**
 * 资产逻辑层
 */
package com.mars.service;

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
 * @2016/5/27
 */
public interface IChartService {

	

	public List<PurchaseDetail> findPurchaseDetail() ;
	
	public double[][] findAssetCategory() ;
}
