package com.mars.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * PurchaseDetail entity. @author MyEclipse Persistence Tools
 */

public class PurchaseDetail implements java.io.Serializable {

	// Fields

	private Integer pdid;
	private User user;
	private PurchaseNote purchaseNote;
	private String aname;
	private String atype;
	private Integer pdcount;
	private String pdmarker;
	private String pdprovider;
	private String pdunit;
	private Float pdprice;
	private Set assets = new HashSet(0);

	// Constructors

	/** default constructor */
	public PurchaseDetail() {
	}

	/** full constructor */
	public PurchaseDetail(User user, PurchaseNote purchaseNote, String aname,
			String atype, Integer pdcount, String pdmarker, String pdprovider,
			String pdunit, Float pdprice, Set assets) {
		this.user = user;
		this.purchaseNote = purchaseNote;
		this.aname = aname;
		this.atype = atype;
		this.pdcount = pdcount;
		this.pdmarker = pdmarker;
		this.pdprovider = pdprovider;
		this.pdunit = pdunit;
		this.pdprice = pdprice;
		this.assets = assets;
	}

	// Property accessors

	public Integer getPdid() {
		return this.pdid;
	}

	public void setPdid(Integer pdid) {
		this.pdid = pdid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PurchaseNote getPurchaseNote() {
		return this.purchaseNote;
	}

	public void setPurchaseNote(PurchaseNote purchaseNote) {
		this.purchaseNote = purchaseNote;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAtype() {
		return this.atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public Integer getPdcount() {
		return this.pdcount;
	}

	public void setPdcount(Integer pdcount) {
		this.pdcount = pdcount;
	}

	public String getPdmarker() {
		return this.pdmarker;
	}

	public void setPdmarker(String pdmarker) {
		this.pdmarker = pdmarker;
	}

	public String getPdprovider() {
		return this.pdprovider;
	}

	public void setPdprovider(String pdprovider) {
		this.pdprovider = pdprovider;
	}

	public String getPdunit() {
		return this.pdunit;
	}

	public void setPdunit(String pdunit) {
		this.pdunit = pdunit;
	}

	public Float getPdprice() {
		return this.pdprice;
	}

	public void setPdprice(Float pdprice) {
		this.pdprice = pdprice;
	}

	public Set getAssets() {
		return this.assets;
	}

	public void setAssets(Set assets) {
		this.assets = assets;
	}

}