package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int imei;
private String name;
private int price;
@OneToMany
private List<Application> application;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public List<Application> getApplication() {
	return application;
}
public void setApplication(List<Application> application) {
	this.application = application;
}
public Mobile(String name, int price) {
	super();
	this.name = name;
	this.price = price;
}
public Mobile() {
	super();
	// TODO Auto-generated constructor stub
}
}
