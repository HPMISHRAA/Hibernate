package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hari");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Accounts accounts=manager.find(Accounts.class, 8);
		System.out.println(accounts);
		System.out.println(accounts.getNo());
		System.out.println(accounts.getName());
		System.out.println(accounts.getType());
//		Bank b=accounts.getBank();
//		System.out.println(b.getIfsc());
//		System.out.println(b.getName());
//		System.out.println(b.getBranch());
	}

}
