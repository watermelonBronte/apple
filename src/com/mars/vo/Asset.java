package com.mars.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mars.tools.IPage;

/**
 * Asset entity. @author MyEclipse Persistence Tools
 */

public class Asset implements java.io.Serializable {

	// Fields

	private Integer aid;
	private User user;
	private Finance finance;
	private AssetCategory assetCategory;
	private PurchaseNote purchaseNote;
	private String cid;
	private Date adate;
	private Integer astate;
	private Integer tprint;
	private String onepath;
	private String twopath;
	private String barcode;
	private String anote;
	

	// Constructors

	/** default constructor */
	public Asset() {
	}

	/** full constructor */
	public Asset(User user, Finance finance, AssetCategory assetCategory,
			PurchaseNote purchaseNote, String cid, Date adate, Integer astate,
			Integer tprint, String onepath, String twopath, String barcode,
			String anote) {
		this.user = user;
		this.finance = finance;
		this.assetCategory = assetCategory;
		this.purchaseNote = purchaseNote;
		this.cid = cid;
		this.adate = adate;
		this.astate = astate;
		this.tprint = tprint;
		this.onepath = onepath;
		this.twopath = twopath;
		this.barcode = barcode;
		this.anote = anote;
		
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

	public AssetCategory getAssetCategory() {
		return this.assetCategory;
	}

	public void setAssetCategory(AssetCategory assetCategory) {
		this.assetCategory = assetCategory;
	}

	public PurchaseNote getPurchaseNote() {
		return this.purchaseNote;
	}

	public void setPurchaseNote(PurchaseNote purchaseNote) {
		this.purchaseNote = purchaseNote;
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

	
}