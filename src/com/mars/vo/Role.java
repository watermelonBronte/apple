package com.mars.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private Integer rid;
	private String rname;
//	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(String rname
//			, Set users
			) {
		this.rname = rname;
//		this.users = users;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

//	public Set getUsers() {
//		return this.users;
//	}
//
//	public void setUsers(Set users) {
//		this.users = users;
//	}

}