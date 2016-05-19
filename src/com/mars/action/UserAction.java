/**
 * 
 */
package com.mars.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.struts2.ServletActionContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.mars.service.impl.UserService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Department;
import com.mars.vo.Role;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.HibernateException;

/**
 *@author 杨铮
 *@data 2016/4/21
 */
public class UserAction extends ActionSupport {

	
	private UserService userService;// 设置业务逻辑组件
private String sex;
	public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

	protected IPage pageInfo = new PageInfo();

	public IPage getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(IPage pageInfo) {
		this.pageInfo = pageInfo;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private User user = new User();
	private int uid;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	private String uname;
	private int usex;
	private String upwd;
	private int ustate;
	private Role role;
	private Department department;

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUsex() {
		return usex;
	}

	public void setUsex(int usex) {
		this.usex = usex;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public int getUstate() {
		return ustate;
	}

	public void setUstate(int ustate) {
		this.ustate = ustate;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	private int did;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	private int rid;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String queryUser() {// 显示所有用户信息

		/*
		 * List<User> userList=(List<User>) userService.findAllUser();
		 * 
		 * HttpServletRequest request = ServletActionContext.getRequest();
		 * request.setAttribute("userList", userList);
		 */
		// 将所有用户放在request范围内

		this.getPageInfo().setResult((userService.findAll(pageInfo)));// 分页

		
		return SUCCESS;
	}

	public String createUser() {// 增加用户信息
		User u = new User();
		u.setUname(user.getUname().toString());
		u.setUpwd(user.getUpwd().toString());
		// 根据部门id找到部门对象存储
		u.setDepartment(userService.findDepartmentById(user.getDepartment()
				.getDid()));

		u.setRole(userService.findRoleById(user.getRole().getRid()));
		u.setUsex(user.getUsex());
		u.setUstate(user.getUstate());
		userService.createUser(u);// 保存接收到的数据到数据库中
		// System.out.print( u.getUname());
		return SUCCESS;

	}

	public String deleteUser() {// 删除用户
		userService.deletUser(getUid());

		return SUCCESS;
	}

	public String updateUser() {// 更新用户
		user.setUid(this.getUid());
		user.setUname(this.getUname());
		user.setUpwd(this.getUpwd());

		user.setDepartment(userService.findDepartmentById(this.getDepartment()
				.getDid()));

		user.setRole(userService.findRoleById(this.getRole().getRid()));
		user.setUsex(this.getUsex());
		user.setUstate(this.getUstate());

		userService.updateUser(user);

		return SUCCESS;

	}

	public String selectUserById() {// 显示当前用户
		user = userService.findUserById(this.getUid());
		this.setDepartment(user.getDepartment());
		this.setUname(user.getUname());
		this.setRole(user.getRole());

		if (user.getUsex() != null) {
		
			
		this.setUsex(user.getUsex());
		}
		if (user.getUstate() != null) {
			this.setUstate(user.getUstate());
		}

		this.setUid(user.getUid());
		this.setUpwd(user.getUpwd());
	// System.out.print("dfdf");
		return SUCCESS;
	}

	// /**
	// * 分页查找
	// *
	// * @return
	// */
	// public String pageUser() {
	//
	// List<User> userList=(List<User>) userService.findAllUser();
	//
	// HttpServletRequest request = ServletActionContext.getRequest();
	// request.setAttribute("userList", userList);
	// //将所有用户放在request范围内
	// return "success";
	// }
	

	
		
	}
