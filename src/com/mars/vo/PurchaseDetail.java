package com.mars.vo;

/**
 * PurchaseDetail entity. @author MyEclipse Persistence Tools
 */

public class PurchaseDetail implements java.io.Serializable {

	// Fields

	private Integer pdid;
	private AssetCategory assetCategoryBySupacid;
	private AssetCategory assetCategoryByAcid;
	private User user;
	private PurchaseNote purchaseNote;
	private String pdunit;
	private String atype;
	private String aname;
	private Integer pdcount;
	private String pdmarker;
	private String pdprovider;
	private Float pdprice;

	// Constructors

	/** default constructor */
	public PurchaseDetail() {
	}

	/** full constructor */
	public PurchaseDetail(AssetCategory assetCategoryBySupacid,
			AssetCategory assetCategoryByAcid, User user,
			PurchaseNote purchaseNote, String pdunit, String atype,
			String aname, Integer pdcount, String pdmarker, String pdprovider,
			Float pdprice) {
		this.assetCategoryBySupacid = assetCategoryBySupacid;
		this.assetCategoryByAcid = assetCategoryByAcid;
		this.user = user;
		this.purchaseNote = purchaseNote;
		this.pdunit = pdunit;
		this.atype = atype;
		this.aname = aname;
		this.pdcount = pdcount;
		this.pdmarker = pdmarker;
		this.pdprovider = pdprovider;
		this.pdprice = pdprice;
	}

	// Property accessors

	public Integer getPdid() {
		return this.pdid;
	}

	public void setPdid(Integer pdid) {
		this.pdid = pdid;
	}

	public AssetCategory getAssetCategoryBySupacid() {
		return this.assetCategoryBySupacid;
	}

	public void setAssetCategoryBySupacid(AssetCategory assetCategoryBySupacid) {
		this.assetCategoryBySupacid = assetCategoryBySupacid;
	}

	public AssetCategory getAssetCategoryByAcid() {
		return this.assetCategoryByAcid;
	}

	public void setAssetCategoryByAcid(AssetCategory assetCategoryByAcid) {
		this.assetCategoryByAcid = assetCategoryByAcid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PurchaseNote getPurchaseNote() {
		return this.purchaseNote;
	}

	public void setPurchaseNote(PurchaseNote purchaseNote) {
		this.purchaseNote = purchaseNote;
	}

	public String getPdunit() {
		return this.pdunit;
	}

	public void setPdunit(String pdunit) {
		this.pdunit = pdunit;
	}

	public String getAtype() {
		return this.atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Integer getPdcount() {
		return this.pdcount;
	}

	public void setPdcount(Integer pdcount) {
		this.pdcount = pdcount;
	}

	public String getPdmarker() {
		return this.pdmarker;
	}

	public void setPdmarker(String pdmarker) {
		this.pdmarker = pdmarker;
	}

	public String getPdprovider() {
		return this.pdprovider;
	}

	public void setPdprovider(String pdprovider) {
		this.pdprovider = pdprovider;
	}

	public Float getPdprice() {
		return this.pdprice;
	}

	public void setPdprice(Float pdprice) {
		this.pdprice = pdprice;
	}

}