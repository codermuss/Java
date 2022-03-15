package Manager;

import odev3.Model.User;

public class BaseUserManager implements UserManager {

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		User.userList[User.count] = user;
		User.count++;
		System.out.println(user.getID() + "'ID ile " + user.getEmail() + " kullanicisi eklendi.");
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getID() + "'ID ile " + user.getEmail() + " kullanicisi silindi.");
	}

	@Override
	public void update(User user, String email, String password) {
		System.out.print(user.getID() + "'ID li kullanicinin " + user.getEmail() + " maili ve " + user.getPassword()
				+ " þifresi ");
		// TODO Auto-generated method stub
		user.setEmail(email);
		user.setPassword(password);
		System.out.println(user.getEmail() + " maili  ve " + user.getPassword() + " þifresi ile deðiþtirildi");
	}

}
