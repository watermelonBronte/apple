package com.mars.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Finance entity. @author MyEclipse Persistence Tools
 */

public class Finance implements java.io.Serializable {

	// Fields

	private Integer fid;
	private String fcode;
	private Integer fuid;
	private Integer fenter;
	private Timestamp fdate;
	private Set assets = new HashSet(0);

	// Constructors

	/** default constructor */
	public Finance() {
	}

	/** full constructor */
	public Finance(String fcode, Integer fuid, Integer fenter, Timestamp fdate,
			Set assets) {
		this.fcode = fcode;
		this.fuid = fuid;
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

	public String getFcode() {
		return this.fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public Integer getFuid() {
		return this.fuid;
	}

	public void setFuid(Integer fuid) {
		this.fuid = fuid;
	}

	public Integer getFenter() {
		return this.fenter;
	}

	public void setFenter(Integer fenter) {
		this.fenter = fenter;
	}

	public Timestamp getFdate() {
		return this.fdate;
	}

	public void setFdate(Timestamp fdate) {
		this.fdate = fdate;
	}

	public Set getAssets() {
		return this.assets;
	}

	public void setAssets(Set assets) {
		this.assets = assets;
	}

}