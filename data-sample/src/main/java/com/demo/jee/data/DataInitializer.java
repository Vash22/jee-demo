package com.demo.jee.data;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.demo.jee.entity.User;

@Stateless
public class DataInitializer {

	@PersistenceContext
	private EntityManager em;

	public void persistDataSample() {
		for (int i = 1; i < 21; i++) {
			User user = new User();
			user.setLogin("someLogin" + i);
			user.setName("someName" + i);
			em.persist(user);
		}
	}
}
