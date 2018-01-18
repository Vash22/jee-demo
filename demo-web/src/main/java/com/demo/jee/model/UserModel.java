package com.demo.jee.model;

import java.io.Serializable;

import org.primefaces.model.LazyDataModel;

import com.demo.jee.entity.User;
import com.demo.jee.stereotype.Model;

@Model
public class UserModel implements Serializable {
	private static final long serialVersionUID = -827473317545984589L;

	private LazyDataModel<User> users;

	public LazyDataModel<User> getUsers() {
		return users;
	}

	public void setUsers(LazyDataModel<User> users) {
		this.users = users;
	}
}
