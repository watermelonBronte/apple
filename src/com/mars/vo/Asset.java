package com.mars.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Asset entity. @author MyEclipse Persistence Tools
 */

public class Asset implements java.io.Serializable {

	// Fields

	private Integer aid;
	private User user;
	private Finance finance;
	private PurchaseDetail purchaseDetail;
	private String cid;
	private Date adate;
	private Integer astate;
	private Integer tprint;
	private String onepath;
	private String twopath;
	private String barcode;
	private String anote;
	private Set checkDetails = new HashSet(0);
	private Set assetReturns = new HashSet(0);
	private Set repairses = new HashSet(0);
	private Set transBillses = new HashSet(0);
	private Set scraps = new HashSet(0);
	private Set assetTransDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Asset() {
	}

	/** full constructor */
	public Asset(User user, Finance finance, PurchaseDetail purchaseDetail,
			String cid, Date adate, Integer astate, Integer tprint,
			String onepath, String twopath, String barcode, String anote,
			Set checkDetails, Set assetReturns, Set repairses,
			Set transBillses, Set scraps, Set assetTransDetails) {
		this.user = user;
		this.finance = finance;
		this.purchaseDetail = purchaseDetail;
		this.cid = cid;
		this.adate = adate;
		this.astate = astate;
		this.tprint = tprint;
		this.onepath = onepath;
		this.twopath = twopath;
		this.barcode = barcode;
		this.anote = anote;
		this.checkDetails = checkDetails;
		this.assetReturns = assetReturns;
		this.repairses = repairses;
		this.transBillses = transBillses;
		this.scraps = scraps;
		this.assetTransDetails = assetTransDetails;
	}

	// Property accessors

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Finance getFinance() {
		return this.finance;
	}

	public void setFinance(Finance finance) {
		this.finance = finance;
	}

	public PurchaseDetail getPurchaseDetail() {
		return this.purchaseDetail;
	}

	public void setPurchaseDetail(PurchaseDetail purchaseDetail) {
		this.purchaseDetail = purchaseDetail;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public Date getAdate() {
		return this.adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}

	public Integer getAstate() {
		return this.astate;
	}

	public void setAstate(Integer astate) {
		this.astate = astate;
	}

	public Integer getTprint() {
		return this.tprint;
	}

	public void setTprint(Integer tprint) {
		this.tprint = tprint;
	}

	public String getOnepath() {
		return this.onepath;
	}

	public void setOnepath(String onepath) {
		this.onepath = onepath;
	}

	public String getTwopath() {
		return this.twopath;
	}

	public void setTwopath(String twopath) {
		this.twopath = twopath;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getAnote() {
		return this.anote;
	}

	public void setAnote(String anote) {
		this.anote = anote;
	}

	public Set getCheckDetails() {
		return this.checkDetails;
	}

	public void setCheckDetails(Set checkDetails) {
		this.checkDetails = checkDetails;
	}

	public Set getAssetReturns() {
		return this.assetReturns;
	}

	public void setAssetReturns(Set assetReturns) {
		this.assetReturns = assetReturns;
	}

	public Set getRepairses() {
		return this.repairses;
	}

	public void setRepairses(Set repairses) {
		this.repairses = repairses;
	}

	public Set getTransBillses() {
		return this.transBillses;
	}

	public void setTransBillses(Set transBillses) {
		this.transBillses = transBillses;
	}

	public Set getScraps() {
		return this.scraps;
	}

	public void setScraps(Set scraps) {
		this.scraps = scraps;
	}

	public Set getAssetTransDetails() {
		return this.assetTransDetails;
	}

	public void setAssetTransDetails(Set assetTransDetails) {
		this.assetTransDetails = assetTransDetails;
	}

}