package com.cloth;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hari");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Dresses d = new Dresses(1, "pant", "nike", 500);
		Dresses d1 = new Dresses(2, "shirt", "Duke", 500);
		Dresses d2 = new Dresses(3, "socks", "jockey", 1000);
		Dresses d3 = new Dresses(4, "shoe", "Reebok", 5000);

		transaction.begin();
		manager.persist(d);
		manager.persist(d1);
		manager.persist(d2);
		manager.persist(d3);
		transaction.commit();
	}
}
