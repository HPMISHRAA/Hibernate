package com.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("akash");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();

//	Student student=manager.find(Student.class, 420);
//	System.out.println(student);
	
	Student student=manager.find(Student.class, 420);
	System.out.println(student.getRoll_no());
	System.out.println(student.getName());
	System.out.println(student.getAge());
//	System.out.println(student.getLaptop());
	Laptop laptop=student.getLaptop();
	System.out.println(laptop.getIp());
	System.out.println(laptop.getName());
	System.out.println(laptop.getPrice());
}
}
