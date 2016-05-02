package com.mars.vo;

import java.util.Date;

/**
 * AssetTransDetail entity. @author MyEclipse Persistence Tools
 */

public class AssetTransDetail implements java.io.Serializable {

	// Fields

	private Integer tdid;
	private AssetTrans assetTrans;
	private Asset asset;
	private User user;
	private Integer tdresult;
	private Date tddate;

	// Constructors

	/** default constructor */
	public AssetTransDetail() {
	}

	/** full constructor */
	public AssetTransDetail(AssetTrans assetTrans, Asset asset, User user,
			Integer tdresult, Date tddate) {
		this.assetTrans = assetTrans;
		this.asset = asset;
		this.user = user;
		this.tdresult = tdresult;
		this.tddate = tddate;
	}

	// Property accessors

	public Integer getTdid() {
		return this.tdid;
	}

	public void setTdid(Integer tdid) {
		this.tdid = tdid;
	}

	public AssetTrans getAssetTrans() {
		return this.assetTrans;
	}

	public void setAssetTrans(AssetTrans assetTrans) {
		this.assetTrans = assetTrans;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getTdresult() {
		return this.tdresult;
	}

	public void setTdresult(Integer tdresult) {
		this.tdresult = tdresult;
	}

	public Date getTddate() {
		return this.tddate;
	}

	public void setTddate(Date tddate) {
		this.tddate = tddate;
	}

}