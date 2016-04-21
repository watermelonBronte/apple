package com.mars.tools;

import org.hibernate.Criteria;
import org.hibernate.Query;


public interface IExecute {
	//sql server2000专用，解决排序出错问题//	public abstract IPage excute(Criteria cri,OrderClass oc);
	
	public abstract IPage excute(Criteria cri);

	public abstract IPage excute(Query query, int rows);

	public abstract IPage excute(Query query);
}
