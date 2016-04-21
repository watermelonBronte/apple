/**
 * 参数信息逻辑实现类
 */
package com.mars.service.impl;

import java.util.List;

import com.mars.dao.IParameterDao;
import com.mars.service.IParameterService;
import com.mars.vo.AssetCategory;
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

	/* (non-Javadoc)
	 * @see com.mars.service.IParameterService#createParameter()
	 */
	public void createParameter() {
		Parameter parameter = new Parameter();
		parameter.setPname("fsd");
		parameter.setPnum("234");
		parameter.setPtypeid(1);
		parameter.setPtypename("234");
		parameterDao.createParameter(parameter);

	}

	/* (non-Javadoc)
	 * @see com.mars.service.IParameterService#deleteParameter()
	 */
	public void deleteParameter() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.mars.service.IParameterService#findParameter()
	 */
	public void findParameter() {
		List<Parameter> list=parameterDao.findParameter();
		for(Parameter parameter:list){
			System.out.println(parameter);
		}
	}

	/* (non-Javadoc)
	 * @see com.mars.service.IParameterService#updateParameter()
	 */
	public void updateParameter() {
		// TODO Auto-generated method stub

	}

}
