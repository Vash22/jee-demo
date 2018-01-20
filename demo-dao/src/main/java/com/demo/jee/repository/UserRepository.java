package com.demo.jee.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.demo.jee.entity.User;

@Stateless
public class UserRepository {

	@PersistenceContext
	private EntityManager em;

	public List<User> findAll(int first, int pageSize) {
		return em.createQuery("select u from User u", User.class).setFirstResult(first).setMaxResults(pageSize)
				.getResultList();
	}

	public int countAll() {
		return em.createQuery("select count(u) from User u", Long.class).getSingleResult().intValue();
	}
}
