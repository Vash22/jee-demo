package com.demo.jee.controller;

import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.inject.Inject;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.demo.jee.entity.User;
import com.demo.jee.model.UserModel;
import com.demo.jee.service.UserService;
import com.demo.jee.stereotype.Controller;

@Controller
public class UserController {

	@Inject
	private UserModel userModel;

	@EJB
	private UserService userService;

	public void init() {
		userModel.setUsers(loadUsers());
	}

	private LazyDataModel<User> loadUsers() {
		return new LazyDataModel<User>() {
			private static final long serialVersionUID = -5566996323249173185L;

			@Override
			public List<User> load(int first, int pageSize, String sortField, SortOrder sortOrder,
					Map<String, Object> filters) {
				setRowCount(userService.countAllUsers());
				return userService.fetchAllUsers(first, pageSize);
			}
		};
	}
}
