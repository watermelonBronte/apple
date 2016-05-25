/**
 * 
 */
package com.mars.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.mars.service.impl.UserService;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 *@author 杨铮
 *@data 2016/4/21
 */
public class UserLoginAction extends ActionSupport {
	private Date date;
	private String sdate;
	public Date getDate() {
		return date;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public void setDate(Date date) {
		this.date = date;
	}
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
	private Integer uid;
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public UserService getUserService() {
		return userService;
	}
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
				this.setUname(user.getUname());
				ActionContext ctx = ActionContext.getContext();
				ctx.getSession().put("loginUname", uname);
				//用session保存用户名
				if((userService.findUidByUname(uname))!=null)
				uid = userService.findUidByUname(uname);
				ctx.getSession().put("loginUid", uid);
				
				
//				System.out.println(uid);
				return "success";
			}
			
			else 
				return "fail";
		}
		return "fail" ;
		
	}
	
}
