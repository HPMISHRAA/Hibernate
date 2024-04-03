package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int ip;
	private String name;
	private double price;

	public int getIp() {
		return ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int ip, String name, double price) {
		super();
		this.ip = ip;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [ip=" + ip + ", name=" + name + ", price=" + price + "]";
	}

}
