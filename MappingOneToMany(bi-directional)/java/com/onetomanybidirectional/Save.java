package com.onetomanybidirectional;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hari");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Girl girl = new Girl("vivo", "bsnl", "baby");

		Boyfriend boyfriend = new Boyfriend("canara", "duke", "Anjan");
		Boyfriend boyfriend2 = new Boyfriend("Sbi", "R15", "yatish");
		Boyfriend boyfriend3 = new Boyfriend("BOB", "Hero", "Leo");
		Boyfriend boyfriend4 = new Boyfriend("HDFC", "Active", "Subbu");

		List<Boyfriend> bf = Arrays.asList(boyfriend, boyfriend2, boyfriend3, boyfriend4);

		girl.setBf(bf);
		boyfriend.setGirl(girl);
		boyfriend2.setGirl(girl);
		boyfriend3.setGirl(girl);
		boyfriend4.setGirl(girl);

		transaction.begin();
		manager.persist(boyfriend4);
		manager.persist(boyfriend3);
		manager.persist(boyfriend2);
		manager.persist(boyfriend2);
		manager.persist(boyfriend);
		manager.persist(girl);
		transaction.commit();
	}
}
