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
	private Date pndate;
	private String pnuse;
	private Integer pnstate;
	private Set purchaseDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public PurchaseNote() {
	}

	/** full constructor */
	public PurchaseNote(User user, Date pndate, String pnuse, Integer pnstate,
			Set purchaseDetails) {
		this.user = user;
		this.pndate = pndate;
		this.pnuse = pnuse;
		this.pnstate = pnstate;
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

	public Set getPurchaseDetails() {
		return this.purchaseDetails;
	}

	public void setPurchaseDetails(Set purchaseDetails) {
		this.purchaseDetails = purchaseDetails;
	}

}