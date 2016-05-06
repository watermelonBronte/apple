/**
 * 测试用户action
 */
package com.mars.action;



import com.mars.service.IUserService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author ye
 * @date 2016/4/19
 */
public class UserAction extends ActionSupport{
	private IUserService userService;

	protected IPage pageInfo = new PageInfo();   
	
	private Integer uid;
	private String dname;
	private User user = new User();
	
	private String result;
	
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setDid(Integer uid) {
		this.uid = uid;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
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

	public Integer getDid() {
		return uid;
	}

	/**
	 * 添加界面
	 * @return
	 */
	public String addUser()
	{
		return "addUser";
	}
	/**
	 * 创建
	 * @return
	 */
	public String createUser() {
//		user.setDname(this.getDname());
		userService.createUser(user);
		this.setResult("创建");
		return "successUser";
	}
	
	/**
	 * 删除
	 * @return
	 */
	public String deleteUser() {
		userService.deleteUser(this.getDid());
		this.setResult("删除");
		return "successUser";
	}
	
	/**
	 * 更新
	 * @return
	 */
	public String updateUser() {
//		user.setDid(this.getDid());
//		user.setDname(this.getDname());
		userService.updateUser(user);
		this.setResult("更新");
		return "successUser";
	}
	
	/**
	 * 查找
	 * @return
	 */
	public String findUser() {
		userService.findUser();
		return "findUser";
	}
	
	/**
	 * 根据ID查找
	 * 
	 * @return
	 */
	public String findUserById() {

		user = userService.findUserById(this
				.getDid());
		
//		this.setDid(user.getDid());
//		this.setDname(user.getDname());
		return "findUserById";
	}

	/**
	 * 分页查找
	 * 
	 * @return
	 */
	public String pageUser() {
		this.getPageInfo().setResult((userService.findAll(pageInfo)));

		return "pageUser";
	}
}
