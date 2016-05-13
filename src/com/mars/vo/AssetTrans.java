package com.mars.vo;

import java.util.Date;

/**
 * AssetTrans entity. @author MyEclipse Persistence Tools
 */

public class AssetTrans implements java.io.Serializable {

	// Fields

	private Integer atid;
	private Asset asset;
	private User userByUid;
	private User userByTid;
	private Date atrdate;
	private Date atfdate;
	private Integer attype;
	private Integer tdresult;
	private Integer atstate;
	private Date tddate;

	// Constructors

	/** default constructor */
	public AssetTrans() {
	}

	/** full constructor */
	public AssetTrans(Asset asset, User userByUid, User userByTid,
			Date atrdate, Date atfdate, Integer attype, Integer tdresult,
			Integer atstate, Date tddate) {
		this.asset = asset;
		this.userByUid = userByUid;
		this.userByTid = userByTid;
		this.atrdate = atrdate;
		this.atfdate = atfdate;
		this.attype = attype;
		this.tdresult = tdresult;
		this.atstate = atstate;
		this.tddate = tddate;
	}

	// Property accessors

	public Integer getAtid() {
		return this.atid;
	}

	public void setAtid(Integer atid) {
		this.atid = atid;
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

	public Integer getTdresult() {
		return this.tdresult;
	}

	public void setTdresult(Integer tdresult) {
		this.tdresult = tdresult;
	}

	public Integer getAtstate() {
		return this.atstate;
	}

	public void setAtstate(Integer atstate) {
		this.atstate = atstate;
	}

	public Date getTddate() {
		return this.tddate;
	}

	public void setTddate(Date tddate) {
		this.tddate = tddate;
	}

}