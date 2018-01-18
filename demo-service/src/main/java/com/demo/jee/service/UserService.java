package com.demo.jee.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.demo.jee.entity.User;
import com.demo.jee.repository.UserRepository;

@Stateless
public class UserService {

	@EJB
	private UserRepository userRepository;

	public List<User> fetchAllUsers() {
		return userRepository.findAll();
	}

	public int countAllUsers() {
		return userRepository.countAll();
	}
}
