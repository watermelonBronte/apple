package com.mars.vo;

import java.util.Date;

/**
 * Checked entity. @author MyEclipse Persistence Tools
 */

public class Checked implements java.io.Serializable {

	// Fields

	private Integer cid;
	private User user;
	private CheckDetail checkDetail;
	private Date cdate;
	private Integer cstate;

	// Constructors

	/** default constructor */
	public Checked() {
	}

	/** full constructor */
	public Checked(User user, CheckDetail checkDetail, Date cdate,
			Integer cstate) {
		this.user = user;
		this.checkDetail = checkDetail;
		this.cdate = cdate;
		this.cstate = cstate;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CheckDetail getCheckDetail() {
		return this.checkDetail;
	}

	public void setCheckDetail(CheckDetail checkDetail) {
		this.checkDetail = checkDetail;
	}

	public Date getCdate() {
		return this.cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Integer getCstate() {
		return this.cstate;
	}

	public void setCstate(Integer cstate) {
		this.cstate = cstate;
	}

}