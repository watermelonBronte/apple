package com.mars.tools;

import java.util.List;

public interface IPage{

	///////////////////////////////acto count:use in view////////////////////////////////////

	/*****************************************************************
	 *@return 结果�??

	 ****************************************************************/
	public abstract List getResult();

	/*****************************************************************
	 *@return 是否不分�??

	 ****************************************************************/
	public abstract boolean isSingle();

	/*****************************************************************
	 *@return 是否count
	 ****************************************************************/
	public abstract boolean countable();

	/*****************************************************************
	 *@return 结果�??

	 ****************************************************************/
	public abstract void setResult(List result);

	/*****************************************************************
	 *@return 当前页数
	 ****************************************************************/
	public abstract int getCurrentPage();

	/*****************************************************************
	 *@param 当前页数
	 ****************************************************************/
	public abstract void setCurrentPage(int currentPage);

	/*****************************************************************
	 *@return 每页行数
	 ****************************************************************/
	public abstract int getPageSize();

	/*****************************************************************
	 *@param 每页行数
	 ****************************************************************/
	public abstract void setPageSize(int pageSize);

	/*****************************************************************
	 *@return �??1页数
	 ****************************************************************/
	public abstract int getPrevPage();

	/*****************************************************************
	 *@return �??1页数
	 ****************************************************************/
	public abstract int getNextPage();

	/*****************************************************************
	 *@return �??1页数
	 ****************************************************************/
	public abstract int getFirstPage();

	/*****************************************************************
	 *@return �??�??1页数
	 ****************************************************************/
	public abstract int getLastPage();

	//auto count;
	/*****************************************************************
	 *@return 起始�??

	 ****************************************************************/
	public abstract int getOffset();

	//auto count;
	/*****************************************************************
	 *@return 总页�??

	 ****************************************************************/
	public abstract int getPages();

	//auto count;
	/*****************************************************************
	 *@return 总行�??

	 ****************************************************************/
	public abstract int getRows();

	/*****************************************************************
	 *@param 总行�??

	 ****************************************************************/
	public abstract void setRows(int rows);

	/*****************************************************************
	 *@param 总行�??

	 ****************************************************************/
	public abstract int[] getIndex();
}
