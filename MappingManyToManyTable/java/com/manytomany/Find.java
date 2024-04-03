package com.manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("hari");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();

		Student student = new Student(1, "Mohan", 30);
		Student student2 = new Student(2, "Ronaldo", 20);
		Student student3 = new Student(3, "Eshwari", 45);
		Student student4 = new Student(4, "Yatish", 60);

		Subject subject = new Subject(101, "Maths", "Nishant");
		Subject subject2 = new Subject(102, "Biology", "Anjan");
		Subject subject3 = new Subject(103, "CS", "Rohith");
		Subject subject4 = new Subject(104, "Sports", "Perry");

		List<Subject> subj = Arrays.asList(subject, subject2, subject3, subject4);
		student.setSubj(subj);
		student2.setSubj(subj);
		student3.setSubj(subj);
		student4.setSubj(subj);

		transaction.begin();
		manager.persist(subject);
		manager.persist(student2);
		manager.persist(student3);
		manager.persist(student4);

		manager.persist(subject);
		manager.persist(subject2);
		manager.persist(subject3);
		manager.persist(subject4);

		transaction.commit();
	}
}
