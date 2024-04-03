package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hari");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Bank bank = new Bank(31971, "canar", "Ra");

		Accounts accounts = new Accounts(8, "Moha", "savin", bank);
		Accounts accounts2 = new Accounts(10, "Suni", "Curren", bank);
		Accounts accounts3 = new Accounts(11, "Prajwa", "loa", bank);

		transaction.begin();
		manager.persist(bank);
		manager.persist(accounts3);
		manager.persist(accounts2);
		manager.persist(accounts);
		transaction.commit();

	}
}
