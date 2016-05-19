/**
 * 财务入账逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IFinanceDao;
import com.mars.service.IFinanceService;
import com.mars.tools.IPage;
import com.mars.vo.Finance;
import com.mars.vo.User;

/**
 * @author ye
 * @date 2016/4/21
 */
public class FinanceService implements IFinanceService {

	private IFinanceDao financeDao;

	public IFinanceDao getFinanceDao() {
		return financeDao;
	}

	public void setFinanceDao(IFinanceDao financeDao) {
		this.financeDao = financeDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IFinanceService#createFinance()
	 */
	public void createFinance(Finance finance) {
		financeDao.createFinance(finance);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IFinanceService#findFinance()
	 */
	public void findFinance() {
		List<Finance> list = financeDao.findFinance();
		for (Finance finance : list) {
			System.out.println(finance.getFcode() );
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IFinanceService#updateFinance()
	 */
	public void updateFinance(Finance finance) {
		financeDao.updateFinance(finance);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IFinanceService#findAll(com.mars.tools.IPage)
	 */
	public List<Finance> findAll(IPage pageInfo) {
		List<Finance> list = financeDao.findAllFinance(pageInfo);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.service.IFinanceService#deleteFinance(java.lang.Integer)
	 */
	public void deleteFinance(Integer fid) {
		financeDao.deleteFinance(fid);

	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.service.IFinanceService#findFinanceById(java.lang.Integer)
	 */
	public Finance findFinanceById(Integer fid) {
		Finance finance = financeDao.findFinanceById(fid);
		return finance;
	}

	public User findUserById(Integer uid) {
		User user = financeDao.findUserById(uid);
		return user;
	}

	public List<User> findUser() {
		return financeDao.findUser();
	}

}
