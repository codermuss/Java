package Manager;

import odev3.Model.User;

public interface UserManager {
	void addUser(User user);

	void deleteUser(User user);

	void update(User user, String email, String password);
}
