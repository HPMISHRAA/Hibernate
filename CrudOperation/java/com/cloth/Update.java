package com.cloth;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hari");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Dresses d = manager.find(Dresses.class, 2);
		d.setBrand("H&M");
		d.setPrice(1800);
		transaction.begin();
		manager.merge(d); // this is inbuilt to update the data in hibernate;
		transaction.commit();
	}
}
