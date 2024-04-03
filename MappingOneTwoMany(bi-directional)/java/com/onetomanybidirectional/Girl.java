package com.onetomanybidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Girl {
	@Id
	private String mobile;
	private String sim;

	@Override
	public String toString() {
		return "Girl [mobile=" + mobile + ", sim=" + sim + ", account_name=" + account_name + ", bf=" + bf + "]";
	}

	public Girl(String mobile, String sim, String account_name) {
		super();
		this.mobile = mobile;
		this.sim = sim;
		this.account_name = account_name;
	}

	public Girl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public List<Boyfriend> getBf() {
		return bf;
	}

	public void setBf(List<Boyfriend> bf) {
		this.bf = bf;
	}

	private String account_name;
	@OneToMany
	List<Boyfriend> bf;
}
