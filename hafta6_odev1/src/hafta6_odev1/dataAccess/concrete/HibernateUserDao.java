package hafta6_odev1.dataAccess.concrete;

import hafta6_odev1.dataAccess.abstracts.UserDao;
import hafta6_odev1.entities.concrete.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void signIn(User user) {

		System.out.println(user.getFirstName() + " Kullan�c� HiberNate ile giri� yapt�");
	}

	@Override
	public void signOut(User user) {
		System.out.println(user.getFirstName() + " Kullan�c� HiberNate ile ��k�� yapt�");

	}

	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + " Kullan�c� bilgileri HiberNate ile veritaban�na kaydedildi.");

	}

}
