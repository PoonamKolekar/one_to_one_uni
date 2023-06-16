package com.jsp.person.adhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestControl {
public static void main(String[] args) {
	
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("poonam");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	
	Person person =new Person();
	person.setName("abc");
     person.setEmail("xyz@12");
	
	Adhar adhar= new Adhar();
	
	adhar.setContact_no(44555);
	adhar.setCity("pune");
    adhar.setPerson(person);

	entityTransaction.begin();
	entityManager.persist(person);
	entityManager.persist(adhar);
	entityTransaction.commit();
}
}