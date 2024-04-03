package com.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("akash");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Student student=new Student(420, "yatish", 22);
	Laptop laptop=new Laptop(101, "dell", 45000);
	student.setLaptop(laptop);   //use to make foreign key into student table
	transaction.begin();
	manager.persist(student);
	manager.persist(laptop);
	transaction.commit();
}
}
