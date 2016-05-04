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
	private Set users = new HashSet(0);
	private Set transBillsesForIndid = new HashSet(0);
	private Set purchaseNotes = new HashSet(0);
	private Set transBillsesForOutdid = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String dname, Set users, Set transBillsesForIndid,
			Set purchaseNotes, Set transBillsesForOutdid) {
		this.dname = dname;
		this.users = users;
		this.transBillsesForIndid = transBillsesForIndid;
		this.purchaseNotes = purchaseNotes;
		this.transBillsesForOutdid = transBillsesForOutdid;
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

	public Set getTransBillsesForIndid() {
		return this.transBillsesForIndid;
	}

	public void setTransBillsesForIndid(Set transBillsesForIndid) {
		this.transBillsesForIndid = transBillsesForIndid;
	}

	public Set getPurchaseNotes() {
		return this.purchaseNotes;
	}

	public void setPurchaseNotes(Set purchaseNotes) {
		this.purchaseNotes = purchaseNotes;
	}

	public Set getTransBillsesForOutdid() {
		return this.transBillsesForOutdid;
	}

	public void setTransBillsesForOutdid(Set transBillsesForOutdid) {
		this.transBillsesForOutdid = transBillsesForOutdid;
	}

}