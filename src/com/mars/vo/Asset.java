package com.mars.vo;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Asset entity. @author MyEclipse Persistence Tools
 */

public class Asset implements java.io.Serializable {

	// Fields

	private Integer aid;
	private User userByUserid;
	private PurchaseNote purchaseNote;
	private AssetCategory assetCategoryBySupacid;
	private AssetCategory assetCategoryByAcid;
	private User userByUid;
	private User userByFaccountid;
	private Department department;
	private String cid;
	private Integer astate;
	private Integer fifaccount;
	private String specificat;
	private Integer auserstate;
	private String aname;
	private Integer pdepartment;
	private Timestamp fdate;
	private String fcode;
	private String acode;
	private String amaker;
	private String aprovider;
	private Date adate;
	private String aunit;
	private Integer acount;
	private String anote;
	private Float aprice;
	private Integer tprint;
	private String onepath;
	private String twopath;
	private String barcode;
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
	public Asset(User userByUserid, PurchaseNote purchaseNote,
			AssetCategory assetCategoryBySupacid,
			AssetCategory assetCategoryByAcid, User userByUid,
			User userByFaccountid, Department department, String cid,
			Integer astate, Integer fifaccount, String specificat,
			Integer auserstate, String aname, Integer pdepartment,
			Timestamp fdate, String fcode, String acode, String amaker,
			String aprovider, Date adate, String aunit, Integer acount,
			String anote, Float aprice, Integer tprint, String onepath,
			String twopath, String barcode, Set checkDetails, Set assetReturns,
			Set repairses, Set transBillses, Set scraps, Set assetTransDetails) {
		this.userByUserid = userByUserid;
		this.purchaseNote = purchaseNote;
		this.assetCategoryBySupacid = assetCategoryBySupacid;
		this.assetCategoryByAcid = assetCategoryByAcid;
		this.userByUid = userByUid;
		this.userByFaccountid = userByFaccountid;
		this.department = department;
		this.cid = cid;
		this.astate = astate;
		this.fifaccount = fifaccount;
		this.specificat = specificat;
		this.auserstate = auserstate;
		this.aname = aname;
		this.pdepartment = pdepartment;
		this.fdate = fdate;
		this.fcode = fcode;
		this.acode = acode;
		this.amaker = amaker;
		this.aprovider = aprovider;
		this.adate = adate;
		this.aunit = aunit;
		this.acount = acount;
		this.anote = anote;
		this.aprice = aprice;
		this.tprint = tprint;
		this.onepath = onepath;
		this.twopath = twopath;
		this.barcode = barcode;
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

	public User getUserByUserid() {
		return this.userByUserid;
	}

	public void setUserByUserid(User userByUserid) {
		this.userByUserid = userByUserid;
	}

	public PurchaseNote getPurchaseNote() {
		return this.purchaseNote;
	}

	public void setPurchaseNote(PurchaseNote purchaseNote) {
		this.purchaseNote = purchaseNote;
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

	public User getUserByUid() {
		return this.userByUid;
	}

	public void setUserByUid(User userByUid) {
		this.userByUid = userByUid;
	}

	public User getUserByFaccountid() {
		return this.userByFaccountid;
	}

	public void setUserByFaccountid(User userByFaccountid) {
		this.userByFaccountid = userByFaccountid;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public Integer getAstate() {
		return this.astate;
	}

	public void setAstate(Integer astate) {
		this.astate = astate;
	}

	public Integer getFifaccount() {
		return this.fifaccount;
	}

	public void setFifaccount(Integer fifaccount) {
		this.fifaccount = fifaccount;
	}

	public String getSpecificat() {
		return this.specificat;
	}

	public void setSpecificat(String specificat) {
		this.specificat = specificat;
	}

	public Integer getAuserstate() {
		return this.auserstate;
	}

	public void setAuserstate(Integer auserstate) {
		this.auserstate = auserstate;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Integer getPdepartment() {
		return this.pdepartment;
	}

	public void setPdepartment(Integer pdepartment) {
		this.pdepartment = pdepartment;
	}

	public Timestamp getFdate() {
		return this.fdate;
	}

	public void setFdate(Timestamp fdate) {
		this.fdate = fdate;
	}

	public String getFcode() {
		return this.fcode;
	}

	public void setFcode(String fcode) {
		this.fcode = fcode;
	}

	public String getAcode() {
		return this.acode;
	}

	public void setAcode(String acode) {
		this.acode = acode;
	}

	public String getAmaker() {
		return this.amaker;
	}

	public void setAmaker(String amaker) {
		this.amaker = amaker;
	}

	public String getAprovider() {
		return this.aprovider;
	}

	public void setAprovider(String aprovider) {
		this.aprovider = aprovider;
	}

	public Date getAdate() {
		return this.adate;
	}

	public void setAdate(Date adate) {
		this.adate = adate;
	}

	public String getAunit() {
		return this.aunit;
	}

	public void setAunit(String aunit) {
		this.aunit = aunit;
	}

	public Integer getAcount() {
		return this.acount;
	}

	public void setAcount(Integer acount) {
		this.acount = acount;
	}

	public String getAnote() {
		return this.anote;
	}

	public void setAnote(String anote) {
		this.anote = anote;
	}

	public Float getAprice() {
		return this.aprice;
	}

	public void setAprice(Float aprice) {
		this.aprice = aprice;
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