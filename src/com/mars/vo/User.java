package com.mars.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer uid;
	private Role role;
	private Department department;
	private String uname;
	private String upwd;
	private Integer ustate;
	private Integer usex;
	private Set scrapsForCuid = new HashSet(0);
	private Set repairses = new HashSet(0);
	private Set transBillsesForInuid = new HashSet(0);
	private Set assetTransesForUid = new HashSet(0);
	private Set transBillsesForOutuid = new HashSet(0);
	private Set checkeds = new HashSet(0);
	private Set assetTransDetails = new HashSet(0);
	private Set purchaseDetails = new HashSet(0);
	private Set assetReturnsForRuid = new HashSet(0);
	private Set purchaseNotes = new HashSet(0);
	private Set assetsForUid = new HashSet(0);
	private Set assetsForUserid = new HashSet(0);
	private Set assetTransesForTid = new HashSet(0);
	private Set assetReturnsForGuid = new HashSet(0);
	private Set assetsForFaccountid = new HashSet(0);
	private Set scrapsForUid = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(Role role, Department department, String uname, String upwd,
			Integer ustate, Integer usex, Set scrapsForCuid, Set repairses,
			Set transBillsesForInuid, Set assetTransesForUid,
			Set transBillsesForOutuid, Set checkeds, Set assetTransDetails,
			Set purchaseDetails, Set assetReturnsForRuid, Set purchaseNotes,
			Set assetsForUid, Set assetsForUserid, Set assetTransesForTid,
			Set assetReturnsForGuid, Set assetsForFaccountid, Set scrapsForUid) {
		this.role = role;
		this.department = department;
		this.uname = uname;
		this.upwd = upwd;
		this.ustate = ustate;
		this.usex = usex;
		this.scrapsForCuid = scrapsForCuid;
		this.repairses = repairses;
		this.transBillsesForInuid = transBillsesForInuid;
		this.assetTransesForUid = assetTransesForUid;
		this.transBillsesForOutuid = transBillsesForOutuid;
		this.checkeds = checkeds;
		this.assetTransDetails = assetTransDetails;
		this.purchaseDetails = purchaseDetails;
		this.assetReturnsForRuid = assetReturnsForRuid;
		this.purchaseNotes = purchaseNotes;
		this.assetsForUid = assetsForUid;
		this.assetsForUserid = assetsForUserid;
		this.assetTransesForTid = assetTransesForTid;
		this.assetReturnsForGuid = assetReturnsForGuid;
		this.assetsForFaccountid = assetsForFaccountid;
		this.scrapsForUid = scrapsForUid;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Integer getUstate() {
		return this.ustate;
	}

	public void setUstate(Integer ustate) {
		this.ustate = ustate;
	}

	public Integer getUsex() {
		return this.usex;
	}

	public void setUsex(Integer usex) {
		this.usex = usex;
	}

	public Set getScrapsForCuid() {
		return this.scrapsForCuid;
	}

	public void setScrapsForCuid(Set scrapsForCuid) {
		this.scrapsForCuid = scrapsForCuid;
	}

	public Set getRepairses() {
		return this.repairses;
	}

	public void setRepairses(Set repairses) {
		this.repairses = repairses;
	}

	public Set getTransBillsesForInuid() {
		return this.transBillsesForInuid;
	}

	public void setTransBillsesForInuid(Set transBillsesForInuid) {
		this.transBillsesForInuid = transBillsesForInuid;
	}

	public Set getAssetTransesForUid() {
		return this.assetTransesForUid;
	}

	public void setAssetTransesForUid(Set assetTransesForUid) {
		this.assetTransesForUid = assetTransesForUid;
	}

	public Set getTransBillsesForOutuid() {
		return this.transBillsesForOutuid;
	}

	public void setTransBillsesForOutuid(Set transBillsesForOutuid) {
		this.transBillsesForOutuid = transBillsesForOutuid;
	}

	public Set getCheckeds() {
		return this.checkeds;
	}

	public void setCheckeds(Set checkeds) {
		this.checkeds = checkeds;
	}

	public Set getAssetTransDetails() {
		return this.assetTransDetails;
	}

	public void setAssetTransDetails(Set assetTransDetails) {
		this.assetTransDetails = assetTransDetails;
	}

	public Set getPurchaseDetails() {
		return this.purchaseDetails;
	}

	public void setPurchaseDetails(Set purchaseDetails) {
		this.purchaseDetails = purchaseDetails;
	}

	public Set getAssetReturnsForRuid() {
		return this.assetReturnsForRuid;
	}

	public void setAssetReturnsForRuid(Set assetReturnsForRuid) {
		this.assetReturnsForRuid = assetReturnsForRuid;
	}

	public Set getPurchaseNotes() {
		return this.purchaseNotes;
	}

	public void setPurchaseNotes(Set purchaseNotes) {
		this.purchaseNotes = purchaseNotes;
	}

	public Set getAssetsForUid() {
		return this.assetsForUid;
	}

	public void setAssetsForUid(Set assetsForUid) {
		this.assetsForUid = assetsForUid;
	}

	public Set getAssetsForUserid() {
		return this.assetsForUserid;
	}

	public void setAssetsForUserid(Set assetsForUserid) {
		this.assetsForUserid = assetsForUserid;
	}

	public Set getAssetTransesForTid() {
		return this.assetTransesForTid;
	}

	public void setAssetTransesForTid(Set assetTransesForTid) {
		this.assetTransesForTid = assetTransesForTid;
	}

	public Set getAssetReturnsForGuid() {
		return this.assetReturnsForGuid;
	}

	public void setAssetReturnsForGuid(Set assetReturnsForGuid) {
		this.assetReturnsForGuid = assetReturnsForGuid;
	}

	public Set getAssetsForFaccountid() {
		return this.assetsForFaccountid;
	}

	public void setAssetsForFaccountid(Set assetsForFaccountid) {
		this.assetsForFaccountid = assetsForFaccountid;
	}

	public Set getScrapsForUid() {
		return this.scrapsForUid;
	}

	public void setScrapsForUid(Set scrapsForUid) {
		this.scrapsForUid = scrapsForUid;
	}

}