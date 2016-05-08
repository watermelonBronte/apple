/**
 * 
 */
package com.mars.action;

import java.util.List;

import javassist.compiler.ast.NewExpr;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.mars.service.impl.RoleService;
import com.mars.tools.IPage;
import com.mars.tools.PageInfo;
import com.mars.vo.Role;
import com.mars.vo.User;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author 杨铮
 *
 */
public class RoleAction extends ActionSupport {
private RoleService roleService;
private Role role=new Role();
private int rid;
private String rname;
protected IPage pageInfo = new PageInfo();
public IPage getPageInfo() {
	return pageInfo;
}

public void setPageInfo(IPage pageInfo) {
	this.pageInfo = pageInfo;
}

public int getRid() {
	return rid;
}

public void setRid(int rid) {
	this.rid = rid;
}

public String getRname() {
	return rname;
}

public void setRname(String rname) {
	this.rname = rname;
}

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

public RoleService getRoleService() {
	return roleService;
}

public void setRoleService(RoleService roleService) {
	this.roleService = roleService;
}


public String queryRole(){

	this.getPageInfo().setResult((roleService.findAll(pageInfo)));//分页
	  return SUCCESS;
  }
public String selectRoleById(){//显示当前角色	
	role = roleService.findRoleById(this.getRid());
	 this.setRid(role.getRid());
	  this.setRname(role.getRname());
	

return SUCCESS;
}
public String deleteRole(){//删除角色
	roleService.deletRole(getRid());
		  
		  return SUCCESS;
	  }

public String createRole(){//增加角色
	  Role r=new Role();
	  r.setRname(role.getRname().toString());
	 
	  roleService.createRole(r);//保存接收到的数据到数据库中

	  return SUCCESS;
	  
}


public String updateRole(){//更新
	
		role.setRname(this.getRname());
		role.setRid(this.getRid());
		
		roleService.updateRole(role);
		  
 return "success";
	
	  }
}
