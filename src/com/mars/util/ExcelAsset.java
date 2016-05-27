package com.mars.util;

import java.io.File;
import java.io.IOException;

import java.io.FileInputStream;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.mars.dao.IAssetDao;
import com.mars.vo.Asset;
import com.mysql.fabric.xmlrpc.base.Data;
import com.sun.org.apache.bcel.internal.generic.NEW;

import jxl.Cell;

import jxl.CellType;

import jxl.Sheet;

import jxl.Workbook;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/*
 * @author ye
 * @date 2016/5/26
 */
public class ExcelAsset {
	private Asset asset = new Asset();
	private IAssetDao assetDao;

	public IAssetDao getAssetDao() {
		return assetDao;
	}

	public void setAssetDao(IAssetDao assetDao) {
		this.assetDao = assetDao;
	}

	private String filePath;

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@SuppressWarnings("deprecation")
	public void inExcel(String filePath) {
		{
			jxl.Workbook readwb = null;

			try

			{

				// 构建Workbook对象, 只读Workbook对象
				filePath = "C:/Users/ye/Desktop/test.xls";
				// 直接从本地文件创建Workbook

				InputStream instream = new FileInputStream(filePath);

				readwb = Workbook.getWorkbook(instream);

				// Sheet的下标是从0开始

				// 获取第一张Sheet表

				Sheet readsheet = readwb.getSheet(0);

				// 获取Sheet表中所包含的总列数

				// int rsColumns = readsheet.getColumns();

				// 获取Sheet表中所包含的总行数

				int rsRows = readsheet.getRows();

				// 获取指定单元格的对象引用
				// 从第1行开始
				for (int i = 1; i < rsRows; i++)

				{

					// for (int j = 0; j < rsColumns; j++)
					//
					// {
					//
					// Cell cell = readsheet.getCell(j, i);
					//
					// System.out.print(cell.getContents() + " ");
					//
					// }

					// System.out.println();
					Cell cell = null;

					cell = readsheet.getCell(0, i);
					asset.setCid(cell.getContents());

					// cell= readsheet.getCell(1, i);
					// Integer uid = Integer.parseInt(cell.getContents());
					// System.out.println(assetDao.findUserById(uid));
					// asset.setUser(assetDao.findUserById(uid));

					// cell= readsheet.getCell(2, i);
					// Integer fid = Integer.parseInt(cell.getContents());
					// asset.setFinance(assetDao.findFinanceById(fid));
					//					
					// cell= readsheet.getCell(3, i);
					// Integer pdid = Integer.parseInt(cell.getContents());
					// asset.setPurchaseDetail(assetDao.findPurchaseDetailById(pdid));

					cell = readsheet.getCell(1, i);
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");// 小写的mm表示的是分钟
					Date date = sdf.parse(cell.getContents());
					asset.setAdate(date);

					cell = readsheet.getCell(2, i);

					if (cell.getContents() == "库存")
						asset.setAstate(0);
					else if (cell.getContents() == "在用")
						asset.setAstate(1);
					else if (cell.getContents() == "故障")
						asset.setAstate(2);
					else if (cell.getContents() == "报废")
						asset.setAstate(3);
					else
						asset.setAstate(-1);

					assetDao.createAsset(asset);

				}
			} catch (Exception e) {

				e.printStackTrace();

			} finally {

				readwb.close();

			}
		}
	}

	public void outExcel(List<Asset> arlist, String filePath)
			throws WriteException, IOException {
		WritableWorkbook readwb = null;

		try

		{
			// filePath = "C:/Users/ye/Desktop/testout.xls";
			readwb = Workbook.createWorkbook(new File(filePath));

			// 设置表名
			WritableSheet sheet = readwb.createSheet("资产", 0);
			// 生成表格题头
			Label labe1 = new Label(0, 0, "资产ID");
			Label labe2 = new Label(1, 0, "卡片编号");
			Label labe3 = new Label(2, 0, "使用人名称");
			Label labe4 = new Label(3, 0, "财务入账单ID");
			Label labe5 = new Label(4, 0, "采购单ID");
			Label labe6 = new Label(5, 0, "库存状态");
			Label labe7 = new Label(6, 0, "入库时间");

			// // 将生成的单元格添加到工作表中
			sheet.addCell(labe1);
			sheet.addCell(labe2);
			sheet.addCell(labe3);
			sheet.addCell(labe4);
			sheet.addCell(labe5);
			sheet.addCell(labe6);
			sheet.addCell(labe7);

			int i = 1;
			Label label1 = null, label2 = null, label3 = null, label4 = null, label5 = null, label6 = null, label7 = null;
			for (Asset asset : arlist) {
				// System.out.println(asset);
				// // 取得数据生成单元格
				// System.out.println(asset.getAid().toString());
				label1 = new Label(0, i, asset.getAid().toString());
				label2 = new Label(1, i, asset.getCid());
				if (asset.getUser() != null)
					label3 = new Label(2, i, asset.getUser().getUname());
				label3 = new Label(2, i, "null");
				if (asset.getFinance() != null)
					label4 = new Label(3, i, asset.getFinance().getFid()
							.toString());
				label4 = new Label(3, i, "null");
				if (asset.getPurchaseDetail() != null)
					label5 = new Label(4, i, asset.getPurchaseDetail()
							.getPdid().toString());
				label5 = new Label(4, i, "null");
				// <!--0 库存 1 在用 2 故障 3 报废 -1 删除-->
				if (asset.getAstate() == 0)
					label6 = new Label(5, i, "库存");
				else if (asset.getAstate() == 1)
					label6 = new Label(5, i, "在用");
				else if (asset.getAstate() == 2)
					label6 = new Label(5, i, "故障");
				else if (asset.getAstate() == 3)
					label6 = new Label(5, i, "报废");
				else
					label6 = new Label(5, i, "删除");
				label7 = new Label(6, i, asset.getAdate().toString());

				// 将生成的单元格添加到工作表中
				sheet.addCell(label1);
				sheet.addCell(label2);
				sheet.addCell(label3);
				sheet.addCell(label4);
				sheet.addCell(label5);
				sheet.addCell(label6);
				sheet.addCell(label7);
				//
				// System.out.println("======"+i);
				i++;
			}
			readwb.write();
			readwb.close();
		} catch (RowsExceededException e) {
			e.printStackTrace();
		} catch (WriteException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}

	// public static void main(String[] args)
	//
	// {
	// inExcel();
	//
	// outExcel(null, "C:/Users/ye/Desktop/testout.xls");
	// }
}
