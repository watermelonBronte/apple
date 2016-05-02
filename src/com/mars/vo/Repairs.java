package com.mars.vo;

/**
 * Repairs entity. @author MyEclipse Persistence Tools
 */

public class Repairs implements java.io.Serializable {

	// Fields

	private Integer reid;
	private Asset asset;
	private User user;
	private String recondition;
	private Float reprice;
	private Integer restate;
	private Integer beforestate;

	// Constructors

	/** default constructor */
	public Repairs() {
	}

	/** full constructor */
	public Repairs(Asset asset, User user, String recondition, Float reprice,
			Integer restate, Integer beforestate) {
		this.asset = asset;
		this.user = user;
		this.recondition = recondition;
		this.reprice = reprice;
		this.restate = restate;
		this.beforestate = beforestate;
	}

	// Property accessors

	public Integer getReid() {
		return this.reid;
	}

	public void setReid(Integer reid) {
		this.reid = reid;
	}

	public Asset getAsset() {
		return this.asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRecondition() {
		return this.recondition;
	}

	public void setRecondition(String recondition) {
		this.recondition = recondition;
	}

	public Float getReprice() {
		return this.reprice;
	}

	public void setReprice(Float reprice) {
		this.reprice = reprice;
	}

	public Integer getRestate() {
		return this.restate;
	}

	public void setRestate(Integer restate) {
		this.restate = restate;
	}

	public Integer getBeforestate() {
		return this.beforestate;
	}

	public void setBeforestate(Integer beforestate) {
		this.beforestate = beforestate;
	}

}