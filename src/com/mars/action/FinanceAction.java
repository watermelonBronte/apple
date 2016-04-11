/**
 * 测试财务入账action
 */
package com.mars.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mars.service.IFinanceService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Finance;
import com.mars.vo.Department;
import com.mars.vo.PurchaseNote;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ye
 * @date 2016/4/19
 */
public class FinanceAction extends ActionSupport {

	private IFinanceService financeService;
	protected IPage pageInfo = new PageInfo();

	private String result;
	private Integer fid;
	private Finance finance = new Finance();
	private List<Finance> financeList = new ArrayList<Finance>();

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public Finance getFinance() {
		return finance;
	}

	public void setFinance(Finance finance) {
		this.finance = finance;
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

	public IFinanceService getFinanceService() {
		return financeService;
	}

	public void setFinanceService(IFinanceService financeService) {
		this.financeService = financeService;
	}

	/**
	 * 返回主界面
	 * 
	 * @return
	 */
	public String home() {
		return "home";
	}

	public List<Finance> getFinanceList() {
		return financeList;
	}

	public void setFinanceList(List<Finance> financeList) {
		this.financeList = financeList;
	}

	/**
	 * 添加界面
	 * 
	 * @return
	 */

	public String addFinance() {
		// this.getPageInfo().setResult(financeService.findAll());
		// this.setFinance(financeService.findFinance());
		financeService.findFinance();

		// System.out.println(Finance.getAccode());
		// this.setFinanceList(financeList);
		return "addFinance";
	}

	/**
	 * 创建
	 * 
	 * @return
	 */
	public String createFinance() {
		// Finance.setAccode(getAccode());

		financeService.createFinance(finance);
		this.setResult("创建");
		return "successFinance";
	}

	/**
	 * 删除
	 * 
	 * @return
	 */
	public String deleteFinance() {
		financeService.deleteFinance(this.getFid());
		this.setResult("删除");
		return "successFinance";
	}

	/**
	 * 更新
	 * 
	 * @return
	 */
	public String updateFinance() {

		// System.out.println(this.getAccode()+this.getAcname()+this.getSupacname()+this.getSupacid()+this.getAcid());
		// Finance.setAccode(getAccode());

		financeService.updateFinance(finance);

		this.setResult("更新");
		return "successFinance";
	}

	/**
	 * 查找
	 * 
	 * @return
	 */
	public String findFinance() {
		financeService.findFinance();
		return "findFinance";
	}

	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findFinanceById() {

		finance = financeService.findFinanceById(this.getFid());
		// System.out.println(Finance.getAccode());
		this.setFinance(finance);
		// this.setAccode(Finance.getAccode());
		// this.setAcname(Finance.getAcname());
		// this.setSupacid(Finance.getSupacid());
		// this.setSupacname(Finance.getSupacname());
		return "findFinanceById";
	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageFinance() {
		this.getPageInfo().setResult((financeService.findAll(pageInfo)));
		return "pageFinance";
	}

}
