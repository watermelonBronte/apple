package com.mars.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PurchaseNote entity. @author MyEclipse Persistence Tools
 */

public class PurchaseNote implements java.io.Serializable {

	// Fields

	private Integer pnid;
	private User user;
	private Department department;
	private Date pndate;
	private String pnuse;
	private Integer pnstate;
	private Set assets = new HashSet(0);
	private Set purchaseDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public PurchaseNote() {
	}

	/** full constructor */
	public PurchaseNote(User user, Department department, Date pndate,
			String pnuse, Integer pnstate, Set assets, Set purchaseDetails) {
		this.user = user;
		this.department = department;
		this.pndate = pndate;
		this.pnuse = pnuse;
		this.pnstate = pnstate;
		this.assets = assets;
		this.purchaseDetails = purchaseDetails;
	}

	// Property accessors

	public Integer getPnid() {
		return this.pnid;
	}

	public void setPnid(Integer pnid) {
		this.pnid = pnid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Date getPndate() {
		return this.pndate;
	}

	public void setPndate(Date pndate) {
		this.pndate = pndate;
	}

	public String getPnuse() {
		return this.pnuse;
	}

	public void setPnuse(String pnuse) {
		this.pnuse = pnuse;
	}

	public Integer getPnstate() {
		return this.pnstate;
	}

	public void setPnstate(Integer pnstate) {
		this.pnstate = pnstate;
	}

	public Set getAssets() {
		return this.assets;
	}

	public void setAssets(Set assets) {
		this.assets = assets;
	}

	public Set getPurchaseDetails() {
		return this.purchaseDetails;
	}

	public void setPurchaseDetails(Set purchaseDetails) {
		this.purchaseDetails = purchaseDetails;
	}

}