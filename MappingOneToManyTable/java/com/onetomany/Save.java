package com.onetomany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("hari");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Mobile mobile=new Mobile("vivo", 15000);
	
	Application application=new Application("qtalk", 50, 1);
	Application application2=new Application("whatsapp", 48, 3);
	Application application3=new Application("snapchat", 100, 4);
	
//	List<Application> x=new ArrayList<Application>();
//	x.add(application3);
//	x.add(application2);
//	x.add(application);
	
	List<Application> x=Arrays.asList(application,application2,application3);

	mobile.setApplication(x);
	
	transaction.begin();
	manager.persist(mobile);
	manager.persist(application);
	manager.persist(application2);
	manager.persist(application3);
	transaction.commit();
	
	
	
}
}
