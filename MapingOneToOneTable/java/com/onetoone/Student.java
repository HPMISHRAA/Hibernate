package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int roll_no;
    private String name;
    private int age;
    @OneToOne
    private Laptop laptop;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
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
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll_no, String name, int age) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", age=" + age + ", laptop=" + laptop + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
}
