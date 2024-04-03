package com.onetoonebidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bride {
	@Id
	private int ex_bf;

	public Bride(int ex_bf, String name, int age) {
		super();
		this.ex_bf = ex_bf;
		this.name = name;
		this.age = age;

	}

	public Bride() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEx_bf() {
		return ex_bf;
	}

	public void setEx_bf(int ex_bf) {
		this.ex_bf = ex_bf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Groom getGroom() {
		return groom;
	}

	public void setGroom(Groom groom) {
		this.groom = groom;
	}

	private String name;
	private int age;
	@OneToOne
	private Groom groom;
}
