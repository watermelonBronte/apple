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
	private Set assets = new HashSet(0);

	// Constructors

	/** default constructor */
	public AssetCategory() {
	}

	/** full constructor */
	public AssetCategory(String accode, String acname, Integer supacid,
			String supacname, Set assets) {
		this.accode = accode;
		this.acname = acname;
		this.supacid = supacid;
		this.supacname = supacname;
		this.assets = assets;
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

	public Set getAssets() {
		return this.assets;
	}

	public void setAssets(Set assets) {
		this.assets = assets;
	}

}