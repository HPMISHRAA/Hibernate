package com.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hari");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Mobile mobile=manager.find(Mobile.class, 1);
		System.out.println(mobile.getName());
		System.out.println(mobile.getPrice());
		
		List<Application> application=mobile.getApplication();
		
		for(Application application1:application) {
			System.out.println(application1.getName());
			System.out.println(application1.getSize());
			System.out.println(application1.getRating());
			
		}
//		System.out.println(mobile);
		
		
	}

}
