package hafta6_odev1;

import hafta6_odev1.SocialMediaAuthServices.concretes.FacebookAuthManager;
import hafta6_odev1.SocialMediaAuthServices.concretes.GoogleAuthManager;
import hafta6_odev1.business.concrete.UserCheckManager;
import hafta6_odev1.business.concrete.UserManager;
import hafta6_odev1.business.concrete.ValidationManager;
import hafta6_odev1.dataAccess.concrete.HibernateUserDao;
import hafta6_odev1.entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Mustafa";
		String lastName = "Yýlmaz";
		String email = "mustafa@gmail.com";
		String password = "mustafa1";
		User user = new User(email, password, firstName, lastName);

		UserCheckManager userCheckManager = new UserCheckManager();
		ValidationManager validationManager = new ValidationManager();
		HibernateUserDao hibernateUserDao = new HibernateUserDao();
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		FacebookAuthManager facebookAuthManager = new FacebookAuthManager();
		UserManager userManager = new UserManager(validationManager, userCheckManager, hibernateUserDao,
				facebookAuthManager);
		userManager.signIn(user);

	}

}
