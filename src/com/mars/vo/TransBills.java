package com.mars.vo;

import java.util.Date;

/**
 * TransBills entity. @author MyEclipse Persistence Tools
 */

public class TransBills implements java.io.Serializable {

	// Fields

	private Integer tbid;
	
	private User userByInuid;
	private User userByOutuid;
	private Asset asset;

	private Date outdate;
	private String outname;
	private Integer tbstate;
	private Date indate;

	// Constructors

	/** default constructor */
	public TransBills() {
	}

	/** full constructor */
	public TransBills( User userByInuid,
			User userByOutuid, Asset asset,
			Date outdate, String outname, Integer tbstate, Date indate) {
		
		this.userByInuid = userByInuid;
		this.userByOutuid = userByOutuid;
		this.asset = asset;
	
		this.outdate = outdate;
		this.outname = outname;
		this.tbstate = tbstate;
		this.indate = indate;
	}

	// Property accessors

	public Integer getTbid() {
		return this.tbid;
	}

	public void setTbid(Integer tbid) {
		this.tbid = tbid;
	}



	public User getUserByInuid() {
		return this.userByInuid;
	}

	public void setUserByInuid(User userByInuid) {
		this.userByInuid = userByInuid;
	}

	public User getUserByOutuid() {
		return this.userByOutuid;
	}

	public void setUserByOutuid(User userByOutuid) {
		this.userByOutuid = userByOutuid;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}



	public Date getOutdate() {
		return this.outdate;
	}

	public void setOutdate(Date outdate) {
		this.outdate = outdate;
	}

	public String getOutname() {
		return this.outname;
	}

	public void setOutname(String outname) {
		this.outname = outname;
	}

	public Integer getTbstate() {
		return this.tbstate;
	}

	public void setTbstate(Integer tbstate) {
		this.tbstate = tbstate;
	}

	public Date getIndate() {
		return this.indate;
	}

	public void setIndate(Date indate) {
		this.indate = indate;
	}

}