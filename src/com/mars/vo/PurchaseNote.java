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
	private PurchaseDetail purchaseDetail;
	private Department department;
	private Date pndate;
	private String pnuse;
	private Integer pnstate;
//	private Set assets = new HashSet(0);

	// Constructors

	/** default constructor */
	public PurchaseNote() {
	}

	/** full constructor */
	public PurchaseNote(User user, PurchaseDetail purchaseDetail,
			Department department, Date pndate, String pnuse, Integer pnstate
//			,			Set assets
			) {
		this.user = user;
		this.purchaseDetail = purchaseDetail;
		this.department = department;
		this.pndate = pndate;
		this.pnuse = pnuse;
		this.pnstate = pnstate;
//		this.assets = assets;
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

	public PurchaseDetail getPurchaseDetail() {
		return this.purchaseDetail;
	}

	public void setPurchaseDetail(PurchaseDetail purchaseDetail) {
		this.purchaseDetail = purchaseDetail;
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

//	public Set getAssets() {
//		return this.assets;
//	}
//
//	public void setAssets(Set assets) {
//		this.assets = assets;
//	}

}