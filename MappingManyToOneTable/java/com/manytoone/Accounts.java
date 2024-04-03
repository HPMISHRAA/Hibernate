package com.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;



@Entity
public class Accounts {
	@Id
private int no;
private String name;
public Accounts() {
	super();
	// TODO Auto-generated constructor stub
}
public Accounts(int no, String name, String type, Bank bank) {
	super();
	this.no = no;
	this.name = name;
	this.type = type;
	this.bank = bank;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
@Override
public String toString() {
	return "Accounts [no=" + no + ", name=" + name + ", type=" + type + ", bank=" + bank + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Bank getBank() {
	return bank;
}
public void setBank(Bank bank) {
	this.bank = bank;
}
private String type;
@ManyToOne
private Bank bank;
}
