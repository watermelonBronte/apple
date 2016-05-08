/**
 * 
 */
package com.mars.action;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import com.mars.service.impl.UserService;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 *@author 杨铮
 *@data 2016/4/21
 */
public class UserLoginAction extends ActionSupport {
	private String uname;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	private String upwd;
	private UserService userService;//设置业务逻辑组件
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String execute(){
		List<User> list=(List<User>) userService.findAllUser();
		User user=new User();
		Iterator<User> it=list.iterator();
		while(it.hasNext()){
			user=(User)it.next();
			if(uname.trim().equals(user.getUname())&&upwd.trim().equals(user.getUpwd())){
				return "success";
			}
			
			else 
				return "fail";
		}
		return "fail" ;
		
	}
	
}
