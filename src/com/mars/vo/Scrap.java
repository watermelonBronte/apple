package com.mars.vo;

import java.util.Date;

/**
 * Scrap entity. @author MyEclipse Persistence Tools
 */

public class Scrap implements java.io.Serializable {

	// Fields

	private Integer scid;
	private Asset asset;
	private User userByUid;
	private User userByCuid;
	private Date scdate;
	private Date cdate;
	private Integer scstate;

	// Constructors

	/** default constructor */
	public Scrap() {
	}

	/** full constructor */
	public Scrap(Asset asset, User userByUid, User userByCuid, Date scdate,
			Date cdate, Integer scstate) {
		this.asset = asset;
		this.userByUid = userByUid;
		this.userByCuid = userByCuid;
		this.scdate = scdate;
		this.cdate = cdate;
		this.scstate = scstate;
	}

	// Property accessors

	public Integer getScid() {
		return this.scid;
	}

	public void setScid(Integer scid) {
		this.scid = scid;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public User getUserByUid() {
		return this.userByUid;
	}

	public void setUserByUid(User userByUid) {
		this.userByUid = userByUid;
	}

	public User getUserByCuid() {
		return this.userByCuid;
	}

	public void setUserByCuid(User userByCuid) {
		this.userByCuid = userByCuid;
	}

	public Date getScdate() {
		return this.scdate;
	}

	public void setScdate(Date scdate) {
		this.scdate = scdate;
	}

	public Date getCdate() {
		return this.cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Integer getScstate() {
		return this.scstate;
	}

	public void setScstate(Integer scstate) {
		this.scstate = scstate;
	}

}