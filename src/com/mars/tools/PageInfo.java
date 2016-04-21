package com.mars.tools;

import java.util.List;

public class PageInfo implements IPage {

	protected int rows;   //总行�??
	protected int pages;   //总页�??
	protected int offset;   //当前页在数据库中的第几行，默认为0
	protected int currentPage=1;   //当前页为第一�??
	protected int pageSize = 2;// 每页的行�??,可以传参数进�??
	protected List result;
	
	
	public boolean countable() {
		// true要统计�?�行数，FALSE不要统计
		return true;
	}
	
	
	public boolean isSingle() {
		// 不分页为true;分页为false;
		return false;
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void setCurrentPage(int currentPage) {
		if(currentPage<1)
			currentPage=1;
		this.currentPage = currentPage;
		
	}
	
	
	public int getCurrentPage() {
		return currentPage;
	}
	
	
	public int getOffset() {
		return (this.getCurrentPage() - 1) * this.getPageSize();
	}
	
	public void setRows(int rows) {
		this.rows=rows;
	}
	
	public int getRows() {
		// TODO Auto-generated method stub
		return this.rows;
	}
	
	public int getPages() {
		int pages = getRows() / getPageSize();
		if ((getRows() % getPageSize()) > 0) {
			pages++;
		}
		else if (pages < 1) {
			pages = 1;
		}
		return pages;
	}
	
	
	public int getPageSize() {
		// TODO Auto-generated method stub
		return pageSize;
	}

	
	public void setPageSize(int pageSize) {
		// TODO Auto-generated method stub
		this.pageSize=pageSize;
		
	}
	


	
	public void setResult(List result) {
		// TODO Auto-generated method stub
		this.result = result;
	}
	
	public List getResult() {
		// TODO Auto-generated method stub
		return result;
	}

//////////////////////////////////////////////////////上下�??/////////////////////////////////////////////////
	
	public int getFirstPage() {
		// TODO Auto-generated method stub
		return 1;
	}

	
	public int getLastPage() {
		// TODO Auto-generated method stub
		return getPages();
	}
	
	
	public int getNextPage() {
		// TODO Auto-generated method stub
		int pages = getPages();
		if (this.getCurrentPage() >= pages) return pages;
		return getCurrentPage() + 1;
	}
	
	
	public int getPrevPage() {
		// TODO Auto-generated method stub
		if (getCurrentPage() <= 1) return 1;
		return getCurrentPage() - 1;
	}
	
	
//////////////////////////////////////////////////////上下�??/////////////////////////////////////////////////
	
	public int[] getIndex() {
		// TODO Auto-generated method stub
		return null;
	}











}
