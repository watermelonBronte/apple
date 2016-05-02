package com.mars.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * AssetCategory entity. @author MyEclipse Persistence Tools
 */

public class AssetCategory implements java.io.Serializable {

	// Fields

	private Integer acid;
	private String accode;
	private String acname;
	private Integer supacid;
	private String supacname;
	private Set assetsForSupacid = new HashSet(0);
	private Set purchaseDetailsForSupacid = new HashSet(0);
	private Set purchaseDetailsForAcid = new HashSet(0);
	private Set assetsForAcid = new HashSet(0);

	// Constructors

	/** default constructor */
	public AssetCategory() {
	}

	/** full constructor */
	public AssetCategory(String accode, String acname, Integer supacid,
			String supacname, Set assetsForSupacid,
			Set purchaseDetailsForSupacid, Set purchaseDetailsForAcid,
			Set assetsForAcid) {
		this.accode = accode;
		this.acname = acname;
		this.supacid = supacid;
		this.supacname = supacname;
		this.assetsForSupacid = assetsForSupacid;
		this.purchaseDetailsForSupacid = purchaseDetailsForSupacid;
		this.purchaseDetailsForAcid = purchaseDetailsForAcid;
		this.assetsForAcid = assetsForAcid;
	}

	// Property accessors

	public Integer getAcid() {
		return this.acid;
	}

	public void setAcid(Integer acid) {
		this.acid = acid;
	}

	public String getAccode() {
		return this.accode;
	}

	public void setAccode(String accode) {
		this.accode = accode;
	}

	public String getAcname() {
		return this.acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public Integer getSupacid() {
		return this.supacid;
	}

	public void setSupacid(Integer supacid) {
		this.supacid = supacid;
	}

	public String getSupacname() {
		return this.supacname;
	}

	public void setSupacname(String supacname) {
		this.supacname = supacname;
	}

	public Set getAssetsForSupacid() {
		return this.assetsForSupacid;
	}

	public void setAssetsForSupacid(Set assetsForSupacid) {
		this.assetsForSupacid = assetsForSupacid;
	}

	public Set getPurchaseDetailsForSupacid() {
		return this.purchaseDetailsForSupacid;
	}

	public void setPurchaseDetailsForSupacid(Set purchaseDetailsForSupacid) {
		this.purchaseDetailsForSupacid = purchaseDetailsForSupacid;
	}

	public Set getPurchaseDetailsForAcid() {
		return this.purchaseDetailsForAcid;
	}

	public void setPurchaseDetailsForAcid(Set purchaseDetailsForAcid) {
		this.purchaseDetailsForAcid = purchaseDetailsForAcid;
	}

	public Set getAssetsForAcid() {
		return this.assetsForAcid;
	}

	public void setAssetsForAcid(Set assetsForAcid) {
		this.assetsForAcid = assetsForAcid;
	}

}