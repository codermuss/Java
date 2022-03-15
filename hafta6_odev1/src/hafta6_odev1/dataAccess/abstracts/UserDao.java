package hafta6_odev1.dataAccess.abstracts;

import hafta6_odev1.entities.concrete.User;

public interface UserDao {
	public void signIn(User user);

	public void signOut(User user);

	public void register(User user);
}
