package com.cloth;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteData {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("hari");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	Dresses d=manager.find(Dresses.class, 1);
	transaction.begin();
	manager.remove(d);
	transaction.commit();
	
}
}
