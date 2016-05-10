package com.mars.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AssetTrans entity. @author MyEclipse Persistence Tools
 */

public class AssetTrans implements java.io.Serializable {

	// Fields

	private Integer atid;
	private User userByUid;
	private User userByTid;
	private Date atrdate;
	private Date atfdate;
	private Integer attype;
	private Integer atstate;
	
	// Constructors

	/** default constructor */
	public AssetTrans() {
	}

	/** full constructor */
	public AssetTrans(User userByUid, User userByTid, Date atrdate,
			Date atfdate, Integer attype, Integer atstate) {
		this.userByUid = userByUid;
		this.userByTid = userByTid;
		this.atrdate = atrdate;
		this.atfdate = atfdate;
		this.attype = attype;
		this.atstate = atstate;
		
	}

	// Property accessors

	public Integer getAtid() {
		return this.atid;
	}

	public void setAtid(Integer atid) {
		this.atid = atid;
	}

	public User getUserByUid() {
		return this.userByUid;
	}

	public void setUserByUid(User userByUid) {
		this.userByUid = userByUid;
	}

	public User getUserByTid() {
		return this.userByTid;
	}

	public void setUserByTid(User userByTid) {
		this.userByTid = userByTid;
	}

	public Date getAtrdate() {
		return this.atrdate;
	}

	public void setAtrdate(Date atrdate) {
		this.atrdate = atrdate;
	}

	public Date getAtfdate() {
		return this.atfdate;
	}

	public void setAtfdate(Date atfdate) {
		this.atfdate = atfdate;
	}

	public Integer getAttype() {
		return this.attype;
	}

	public void setAttype(Integer attype) {
		this.attype = attype;
	}

	public Integer getAtstate() {
		return this.atstate;
	}

	public void setAtstate(Integer atstate) {
		this.atstate = atstate;
	}

	

}