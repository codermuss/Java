package hafta6_odev1.dataAccess.concrete;

import hafta6_odev1.dataAccess.abstracts.UserDao;
import hafta6_odev1.entities.concrete.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void signIn(User user) {

		System.out.println(user.getFirstName() + " Kullanýcý HiberNate ile giriþ yaptý");
	}

	@Override
	public void signOut(User user) {
		System.out.println(user.getFirstName() + " Kullanýcý HiberNate ile çýkýþ yaptý");

	}

	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + " Kullanýcý bilgileri HiberNate ile veritabanýna kaydedildi.");

	}

}
