package com.mars.vo;

/**
 * 资产类别
 * AssetCategory entity. @author MyEclipse Persistence Tools
 */

public class AssetCategory implements java.io.Serializable {

	// Fields

	private Integer acid;     //资产类别ID
	private String accode;    //资产类别编号
	private String acname;    //资产类别名称
	private Integer supacid;  //上级资产类别ID
	private String supacname;   //上级资产类别名称

	// Constructors

	/** default constructor */
	public AssetCategory() {
	}

	/** full constructor */
	public AssetCategory(String accode, String acname, Integer supacid,
			String supacname) {
		this.accode = accode;
		this.acname = acname;
		this.supacid = supacid;
		this.supacname = supacname;
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

}