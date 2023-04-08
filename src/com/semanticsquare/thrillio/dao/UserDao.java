package com.semanticsquare.thrillio.dao;

import java.util.List;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entities.User;

public class UserDao { //would include SQL queries
	public List<User> getUsers() {
		return DataStore.getUsers();
	}
}
