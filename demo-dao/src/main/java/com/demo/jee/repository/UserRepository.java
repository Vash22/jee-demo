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

	public List<User> findAll() {
		return em.createQuery("select u from User u", User.class).getResultList();
	}
}
