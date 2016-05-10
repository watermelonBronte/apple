package com.mars.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	
	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String dname) {
		this.dname = dname;
		
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

	
}