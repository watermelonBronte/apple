/**
 * 参数信息逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IParameterDao;
import com.mars.service.IParameterService;
import com.mars.tools.IPage;
import com.mars.vo.Parameter;

/**
 * @author ye
 * @date 2016/4/19
 */
public class ParameterService implements IParameterService {

	private IParameterDao parameterDao;

	public IParameterDao getParameterDao() {
		return parameterDao;
	}

	public void setParameterDao(IParameterDao parameterDao) {
		this.parameterDao = parameterDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IParameterService#createParameter()
	 */
	public void createParameter(Parameter parameter) {

		parameterDao.createParameter(parameter);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IParameterService#deleteParameter()
	 */
	public void deleteParameter(Integer pid) {
		parameterDao.deleteParameter(pid);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mars.service.IParameterService#findParameter()
	 */
	public void findParameter() {
		List<Parameter> list = parameterDao.findParameter();
		for (Parameter parameter : list) {
			System.out.println(parameter);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.mars.service.IParameterService#findAll(com.mars.tools.IPage)
	 */
	public List<Parameter> findAll(IPage pageInfo) {
		List<Parameter> list = parameterDao.findAllParameter(pageInfo);
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mars.service.IParameterService#findParameterById(java.lang.Integer)
	 */
	public Parameter findParameterById(Integer pid) {
		Parameter parameter = parameterDao.findParameterById(pid);
		return parameter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mars.service.IParameterService#updateParameter(com.mars.vo.Parameter)
	 */
	public void updateParameter(Parameter parameter) {
		parameterDao.updateParameter(parameter);

	}

}
