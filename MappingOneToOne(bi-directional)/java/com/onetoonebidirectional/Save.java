package com.onetoonebidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hari");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Groom groom = new Groom(100000, 3, "Mohan");
		Bride bride = new Bride(2, "Simran", 18);

		groom.setBride(bride);
		bride.setGroom(groom);

		transaction.begin();
		manager.persist(bride);
		manager.persist(groom);
		transaction.commit();

	}
}
