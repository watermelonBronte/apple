/**
 * 资产逻辑实现类
 */
package com.mars.service.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import jxl.write.WriteException;

import com.mars.dao.IAssetDao;
import com.mars.dao.IChartDao;
import com.mars.service.IAssetService;
import com.mars.service.IChartService;
import com.mars.tools.ExcelOperator;
import com.mars.tools.IPage;
import com.mars.util.ExcelAsset;
import com.mars.vo.Asset;
import com.mars.vo.AssetCategory;
import com.mars.vo.Finance;
import com.mars.vo.PurchaseDetail;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/4/19
 */
public class ChartService implements IChartService {

	private IChartDao chartDao;

	public IChartDao getChartDao() {
		return chartDao;
	}

	public void setChartDao(IChartDao chartDao) {
		this.chartDao = chartDao;
	}

	public List<PurchaseDetail> findPurchaseDetail() {
		return chartDao.findPurchaseDetail();
	}

	public double[][] findAssetCategory() {
		List<AssetCategory> list = chartDao.findAssetCategory();
		List<PurchaseDetail> list2 = chartDao.findPurchaseDetail();
		int i = 0;
		double[][] data = { { 0 }, { 0 }, { 0 }, { 0 } };
		for (AssetCategory assetCategory : list) {
			for (PurchaseDetail purchaseDetail : list2)
				if (assetCategory.getAcid().equals(
						purchaseDetail.getAssetCategory().getAcid()))
					data[i][0] += purchaseDetail.getPdcount();

//			System.out.println(i + "======" + data[i][0]);
			i++;
		}
		return data;
	}

}
