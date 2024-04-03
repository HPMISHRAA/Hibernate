package com.onetomanybidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Boyfriend {
	@Id
	private String bank_account;
	@Override
	public String toString() {
		return "Boyfriend [bank_account=" + bank_account + ", bike=" + bike + ", name=" + name + ", girl=" + girl + "]";
	}

	private String bike;
	private String name;
	@ManyToOne
	private Girl girl;

	public Boyfriend(String bank_account, String bike, String name) {
		super();
		this.bank_account = bank_account;
		this.bike = bike;
		this.name = name;
	}

	public Boyfriend() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBank_account() {
		return bank_account;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}

	public String getBike() {
		return bike;
	}

	public void setBike(String bike) {
		this.bike = bike;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Girl getGirl() {
		return girl;
	}

	public void setGirl(Girl girl) {
		this.girl = girl;
	}
}
