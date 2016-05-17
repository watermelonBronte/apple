package com.mars.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Finance entity. @author MyEclipse Persistence Tools
 */

public class Finance implements java.io.Serializable {

	// Fields

	private Integer fid;
	private User user;
	private String fcode;
	private Integer fenter;
	private Date fdate;
	private Set assets = new HashSet(0);

	// Constructors

	/** default constructor */
	public Finance() {
	}

	/** full constructor */
	public Finance(User user, String fcode, Integer fenter, Date fdate,
			Set assets) {
		this.user = user;
		this.fcode = fcode;
		this.fenter = fenter;
		this.fdate = fdate;
		this.assets = assets;
	}

	// Property accessors

	public Integer getFid() {
		return this.fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFcode() {
		return this.fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public Integer getFenter() {
		return this.fenter;
	}

	public void setFenter(Integer fenter) {
		this.fenter = fenter;
	}

	public Date getFdate() {
		return this.fdate;
	}

	public void setFdate(Date fdate) {
		this.fdate = fdate;
	}

	public Set getAssets() {
		return this.assets;
	}

	public void setAssets(Set assets) {
		this.assets = assets;
	}

}