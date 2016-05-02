package com.mars.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Checked entity. @author MyEclipse Persistence Tools
 */

public class Checked implements java.io.Serializable {

	// Fields

	private Integer cid;
	private User user;
	private Date cdate;
	private Integer cstate;
	private Set checkDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Checked() {
	}

	/** full constructor */
	public Checked(User user, Date cdate, Integer cstate, Set checkDetails) {
		this.user = user;
		this.cdate = cdate;
		this.cstate = cstate;
		this.checkDetails = checkDetails;
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

	public Set getCheckDetails() {
		return this.checkDetails;
	}

	public void setCheckDetails(Set checkDetails) {
		this.checkDetails = checkDetails;
	}

}