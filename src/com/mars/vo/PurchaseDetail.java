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
	private String atype;
	private Integer pdcount;
	private String pdmarker;
	private String pdprovider;
	private String pdunit;
	private Float pdprice;
	

	// Constructors

	/** default constructor */
	public PurchaseDetail() {
	}

	/** full constructor */
	public PurchaseDetail(User user, String atype, Integer pdcount,
			String pdmarker, String pdprovider, String pdunit, Float pdprice) {
		this.user = user;
		this.atype = atype;
		this.pdcount = pdcount;
		this.pdmarker = pdmarker;
		this.pdprovider = pdprovider;
		this.pdunit = pdunit;
		this.pdprice = pdprice;
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



}