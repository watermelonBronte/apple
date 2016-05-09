/**
 * 部门逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;


import com.mars.dao.ICommonDao;
import com.mars.service.ICommonService;
import com.mars.tools.IPage;

/**
 * @author ye
 * @date 2016/4/21
 */
public class CommonServiceImpl implements ICommonService {

	private ICommonDao commonDao;

	public ICommonDao getCommonDao() {
		return commonDao;
	}

	public void setCommonDao(ICommonDao commonDao) {
		this.commonDao = commonDao;
	}

	/**
	 * 创建
	 */
	public <T> Boolean create(T obj) throws Exception {
		Boolean flag = true;
		try {
			commonDao.create(obj);
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
			throw e;
		}
		return flag;

	}

	/**
	 * 删除
	 */
	public <T> Boolean delete(T obj) throws Exception {
		Boolean flag = true;
		try {
			commonDao.delete(obj);
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
			throw e;
		}
		return flag;

	}

	public <T> List<T> findAll(IPage pageInfo) throws Exception {
		List<T> list = null;

		try {
			list = commonDao.findAll(pageInfo);
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		} finally {
			// this.closeSession();
		}
		return list;
	}

	public <T> T findById(Class<T> cls, Integer id) throws Exception {
		T obj = null;
		try {
			obj = commonDao.findById(cls, id);
		} catch (Exception e) {

			e.printStackTrace();
			throw e;
		} finally {
			// this.closeSession();
		}
		return obj;
	}

	public <T> Boolean updateDepartment(T obj) throws Exception {
		Boolean flag = true;
		try {
			commonDao.update(obj);
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
			throw e;
		}
		return flag;
	}

}
