package com.mars.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * 部门
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer did;             //部门ID
	private String dname;            //部门名称
	private Set users = new HashSet(0);             //用户

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String dname, Set users) {
		this.dname = dname;
		this.users = users;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}