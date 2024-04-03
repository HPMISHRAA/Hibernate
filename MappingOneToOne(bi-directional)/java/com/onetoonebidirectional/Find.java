package com.onetoonebidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hari");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Groom groom = manager.find(Groom.class, 100000);
		System.out.println(groom.getSal());
		System.out.println(groom.getProperty());
		System.out.println(groom.getName());

		Bride bride = groom.getBride();
		System.out.println(bride.getEx_bf());
		System.out.println(bride.getName());
		System.out.println(bride.getAge());

	}
}
