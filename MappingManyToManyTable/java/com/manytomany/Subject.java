package com.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	private int id;
	private String name;
	private String Trainer_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", Trainer_name=" + Trainer_name + "]";
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int id, String name, String trainer_name) {
		super();
		this.id = id;
		this.name = name;
		Trainer_name = trainer_name;
	}

	public String getTrainer_name() {
		return Trainer_name;
	}

	public void setTrainer_name(String trainer_name) {
		Trainer_name = trainer_name;
	}
}
