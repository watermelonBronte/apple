package com.mars.vo;

import java.util.Date;

/**
 * AssetReturn entity. @author MyEclipse Persistence Tools
 */

public class AssetReturn implements java.io.Serializable {

	// Fields

	private Integer arid;
	private User userByGuid;
	private Asset asset;
	private User userByRuid;
	private Date argdate;
	private Date arrdate;
	private Integer arstate;

	// Constructors

	/** default constructor */
	public AssetReturn() {
	}

	/** full constructor */
	public AssetReturn(User userByGuid, Asset asset, User userByRuid,
			Date argdate, Date arrdate, Integer arstate) {
		this.userByGuid = userByGuid;
		this.asset = asset;
		this.userByRuid = userByRuid;
		this.argdate = argdate;
		this.arrdate = arrdate;
		this.arstate = arstate;
	}

	// Property accessors

	public Integer getArid() {
		return this.arid;
	}

	public void setArid(Integer arid) {
		this.arid = arid;
	}

	public User getUserByGuid() {
		return this.userByGuid;
	}

	public void setUserByGuid(User userByGuid) {
		this.userByGuid = userByGuid;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public User getUserByRuid() {
		return this.userByRuid;
	}

	public void setUserByRuid(User userByRuid) {
		this.userByRuid = userByRuid;
	}

	public Date getArgdate() {
		return this.argdate;
	}

	public void setArgdate(Date argdate) {
		this.argdate = argdate;
	}

	public Date getArrdate() {
		return this.arrdate;
	}

	public void setArrdate(Date arrdate) {
		this.arrdate = arrdate;
	}

	public Integer getArstate() {
		return this.arstate;
	}

	public void setArstate(Integer arstate) {
		this.arstate = arstate;
	}

}