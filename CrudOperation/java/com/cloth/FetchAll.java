package com.cloth;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hari");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

//	Query query=manager.createQuery("select s from Dresses s");
//	List<Dresses> d=query.getResultList();
//	for(Dresses x:d) {
//		System.out.println(d);
//	}

		List<Dresses> l = manager.createQuery("select s from Dresses s").getResultList();
		for (Dresses x : l) {
			System.out.println(x);
		}
	}
}
