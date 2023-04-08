package com.semanticsquare.thrillio.managers;

import java.util.List;

import com.semanticsquare.thrillio.dao.UserDao;
import com.semanticsquare.thrillio.entities.User;

/*A singleton should be used when managing access to a resource which is shared by the entire application,
and it would be destructive to potentially have multiple instances of the same class.
Making sure that access to shared resources thread safe is one very good example of where this kind of pattern can be vital.
*/
public class UserManager { // Singleton pattern
	private static UserManager instance = new UserManager();
	private static UserDao dao = new UserDao();

	private UserManager() {
	}

	public static UserManager getInstance() {
		return instance;
	} // Singleton pattern

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);

		return user;

	}

	public List<User> getUsers() {
		return dao.getUsers();
	}

}
