package com.mars.tools;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;




public class Execute implements IExecute {

	private IPage pageInfo = null;

	public static IExecute createExecute(IPage _pageInfo) {
		return new Execute(_pageInfo);
	}

	public Execute(IPage _pageInfo) {
		if (_pageInfo == null) {
			_pageInfo = new PageInfo();
		}
		this.pageInfo = _pageInfo;
	}

	public IPage excute(Criteria cri) {

		List result;
		cri.setFirstResult(this.pageInfo.getOffset());
		if (this.pageInfo.isSingle() == false) {
			cri.setMaxResults(this.pageInfo.getPageSize());
		}
		result = cri.list();
		this.pageInfo.setResult(result);
		if (this.pageInfo.countable() == false) {
			return this.pageInfo;
		}
		cri.setFirstResult(0);
		cri.setMaxResults(1);
		Object totalCount = cri.setProjection(Projections.rowCount())
				.uniqueResult();
		pageInfo.setRows(Integer.parseInt(totalCount.toString()));

		return this.pageInfo;

	}

	public IPage excute(Query query, int rows) {

		List result;
		this.pageInfo.setRows(rows);
		query.setFirstResult(this.pageInfo.getOffset());
		if (this.pageInfo.isSingle() == false) {
			query.setMaxResults(this.pageInfo.getPageSize());
		}
		result = query.list();
		this.pageInfo.setResult(result);
		return this.pageInfo;
	}

	public IPage excute(Query query) {
		int rows = query.list().size();
		return excute(query, rows);
	}

	// sql server2000专用，解决排序出错问题
//	public IPage excute(Criteria cri, OrderClass od) {
//		List result;
//
//		Object totalCount = cri.setProjection(Projections.rowCount())
//				.uniqueResult();
//		String tc = String.valueOf(totalCount).trim();
//		if ("".equals(tc) || null == tc || "null".equals(tc)) {
//			tc = "0";
//		}
//		pageInfo.setRows(Integer.parseInt(tc));
//		cri.setProjection(null);
//		cri.setResultTransformer(Criteria.ROOT_ENTITY);
//		
//		//排序设置
//		if(!CommonUtils.isNull(od)){
//			if(CommonUtils.isNotEmpty(od.getItems())){
//				for(OrderItem item : od.getItems()){
//					if(OrderItemSortRule.DESC.equals(item.getSortRule())){
//						cri.addOrder(Order.desc(item.getColName()));
//					}else if(OrderItemSortRule.ASC.equals(item.getSortRule())){
//						cri.addOrder(Order.asc(item.getColName()));
//					}
//				}
//			}
//		}
//		cri.setFirstResult(this.pageInfo.getOffset());
//		if (this.pageInfo.isSingle() == false) {
//			cri.setMaxResults(this.pageInfo.getPageSize());
//		}
//		result = cri.list();
//
//		this.pageInfo.setResult(result);
//
//		if (this.pageInfo.countable() == false) {
//			return this.pageInfo;
//		}
//		return this.pageInfo;
//	}
}
