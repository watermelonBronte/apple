package com.mars.vo;

/**
 * Parameter entity. @author MyEclipse Persistence Tools
 */

public class Parameter implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	private String pnum;
	private Integer ptypeid;
	private String ptypename;

	// Constructors

	/** default constructor */
	public Parameter() {
	}

	/** full constructor */
	public Parameter(String pname, String pnum, Integer ptypeid,
			String ptypename) {
		this.pname = pname;
		this.pnum = pnum;
		this.ptypeid = ptypeid;
		this.ptypename = ptypename;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPnum() {
		return this.pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public Integer getPtypeid() {
		return this.ptypeid;
	}

	public void setPtypeid(Integer ptypeid) {
		this.ptypeid = ptypeid;
	}

	public String getPtypename() {
		return this.ptypename;
	}

	public void setPtypename(String ptypename) {
		this.ptypename = ptypename;
	}

}