/**
 * 
 */
package com.mars.action;

/**
 * @author ye
 * @2016/5/27
 */
import java.awt.Font;

import javax.annotation.Resource;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetUtilities;

import com.mars.service.IAssetService;
import com.mars.service.IChartService;
import com.opensymphony.xwork2.ActionSupport;

public class ChartAction extends ActionSupport {
	private JFreeChart chart;

	public String jfreeChart() {
		this.chart = createChart();
		return SUCCESS;
	}

	// setter and getter
	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
		this.chart = chart;
	}
	private IChartService chartService;

	public IChartService getChartService() {
		return chartService;
	}

	public void setChartService(IChartService chartService) {
		this.chartService = chartService;
	}

	/**
	 * 说明：该Action类一定要定义一个成员变量，命名为chart，并且生成setter/getter，
	 * 获得chart的Action方法中为chart变量创建引用的JFreeChart实例，来自方法createChart()，如下：
	 * 
	 * @return
	 */

	public JFreeChart createChart() {
		/**
		 * 1
		 */
		// double[][] data = new double[][] { { 1320, 720, 830, 400, 1000, 1500
		// },
		// { 500, 300, 400, 100, 450, 550 } };
		// String[] rowKeys = { "佣金", "奖金" };
		//
		// String[] columnKeys = { "201201", "201202", "201203", "201204",
		// "201205", "201206" };
		// CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
		// rowKeys, columnKeys, data);
		// JFreeChart chart = ChartFactory.createBarChart3D("资产", "类型",
		// "金额", dataset, PlotOrientation.VERTICAL, true, false, false);
		//
		// // 设置标题字体，可以处理乱码问题
		// chart.getTitle().setFont(new Font("宋体", Font.BOLD, 14));
		//
		// CategoryPlot plot = chart.getCategoryPlot();
		//
		// // X轴
		// CategoryAxis domainAxis = plot.getDomainAxis();
		// // 设置设置X轴上的文字
		// domainAxis.setTickLabelFont(new Font("sans-serif", Font.PLAIN, 11));
		// // 设置X轴的标题文字
		// domainAxis.setLabelFont(new Font("宋体", Font.PLAIN, 12));
		//
		// // Y轴
		// ValueAxis numberaxis = plot.getRangeAxis();
		// // 设置设置Y轴上的文字
		// numberaxis.setTickLabelFont(new Font("sans-serif", Font.PLAIN, 12));
		// // 设置Y轴的标题文字
		// numberaxis.setLabelFont(new Font("宋体", Font.BOLD, 14));
		//
		// // 这句代码解决了底部汉字乱码的问题
		// chart.getLegend().setItemFont(new Font("宋体", Font.PLAIN, 12));
		/**
		 * 2
		 */
		// DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		// dataset.addValue(610, "Guangzhou", "Pig");
		// dataset.addValue(220, "Guangzhou", "Beef");
		// dataset.addValue(530, "Guangzhou", "Chicken");
		// dataset.addValue(340, "Guangzhou", "Fish");
		//
		// JFreeChart chart = ChartFactory.createBarChart3D("肉类销量统计图", "type",
		// "amount", dataset, PlotOrientation.VERTICAL, false, false,
		// false);
		/**
		 * 3
		 */
//		double[][] data = new double[][] { {1310}, {720}, {1130}, {440}  };
		double[][] data = chartService.findAssetCategory();
//		System.out.println(data);
		String[] rowKeys = { "设备类", "仪器类", "电器类", "办公类" };
		String[] columnKeys = { "" };
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(
				rowKeys, columnKeys, data);
		JFreeChart chart = ChartFactory
				.createBarChart3D("资产类别统计图", "类别", "数量", dataset,
						PlotOrientation.VERTICAL, true, false, false);
		 // 设置标题字体，可以处理乱码问题
		 chart.getTitle().setFont(new Font("宋体", Font.BOLD, 14));
		
		 CategoryPlot plot = chart.getCategoryPlot();
		
		 // X轴
		 CategoryAxis domainAxis = plot.getDomainAxis();
		 // 设置设置X轴上的文字
		 domainAxis.setTickLabelFont(new Font("sans-serif", Font.PLAIN, 11));
		 // 设置X轴的标题文字
		 domainAxis.setLabelFont(new Font("宋体", Font.PLAIN, 12));
		
		 // Y轴
		 ValueAxis numberaxis = plot.getRangeAxis();
		 // 设置设置Y轴上的文字
		 numberaxis.setTickLabelFont(new Font("sans-serif", Font.PLAIN, 12));
		 // 设置Y轴的标题文字
		 numberaxis.setLabelFont(new Font("宋体", Font.BOLD, 14));
		
		 // 这句代码解决了底部汉字乱码的问题
		 chart.getLegend().setItemFont(new Font("宋体", Font.PLAIN, 12));
		return chart;
	}
}