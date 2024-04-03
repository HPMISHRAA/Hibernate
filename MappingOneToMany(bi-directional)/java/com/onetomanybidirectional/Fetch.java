package com.onetomanybidirectional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hari");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

//	Boyfriend boyfriend=manager.find(Boyfriend.class, "canara");
//	System.out.println(boyfriend);

//		Girl girl = manager.find(Girl.class, "vivo");
//		System.out.println(girl.getMobile());
//		System.out.println(girl.getSim());
//		System.out.println(girl.getAccount_name());
//		List<Boyfriend> b = girl.getBf();
//		for (Boyfriend bf : b) {
//			System.out.println(bf.getBank_account());
//			System.out.println(bf.getBike());
//			System.out.println(bf.getName());
//		}

		Boyfriend boyfriend = manager.find(Boyfriend.class, "Sbi");
		System.out.println(boyfriend.getBank_account());
		System.out.println(boyfriend.getBike());
		System.out.println(boyfriend.getName());
//		System.out.println(boyfriend.getGirl());
		Girl girl = boyfriend.getGirl();
		System.out.println(girl.getMobile());
		System.out.println(girl.getSim());
		System.out.println(girl.getAccount_name());
	}
}
