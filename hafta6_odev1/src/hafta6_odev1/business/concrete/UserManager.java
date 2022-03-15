package hafta6_odev1.business.concrete;

import hafta6_odev1.SocialMediaAuthServices.abstracts.SocialMediaAuthService;
import hafta6_odev1.business.abstracts.UserService;
import hafta6_odev1.dataAccess.abstracts.UserDao;
import hafta6_odev1.entities.concrete.User;

public class UserManager implements UserService {
	ValidationManager validationManager;
	UserCheckManager userCheckManager;
	UserDao userDao;
	SocialMediaAuthService socialMediaAuthService;

	public UserManager(ValidationManager validationManager, UserCheckManager userCheckManager, UserDao userDao,
			SocialMediaAuthService socialMediaAuthService) {
		super();
		this.validationManager = validationManager;
		this.userCheckManager = userCheckManager;
		this.userDao = userDao;
		this.socialMediaAuthService = socialMediaAuthService;
	}

	@Override
	public void signIn(User user) {
		userDao.signIn(user);
		socialMediaAuthService.signIn(user);
		// System.out.println(user.getFirstName() + " kullanicisi giris yapti");

	}

	@Override
	public void signOut(User user) {
		userDao.signOut(user);
		socialMediaAuthService.signOut(user);
		// System.out.println(user.getFirstName() + " kullanicisi çýkýþ yapti");

	}

	@Override
	public void register(User user) {
		if (userCheckManager.checkEmailFormat(user.getEmail())) {

			if (!userCheckManager.checkEmail(user.getEmail())) {
				if (userCheckManager.checkPassword(user.getPassword())) {
					if (userCheckManager.checkFirstName(user.getFirstName())) {
						if (userCheckManager.checkLastName(user.getLastName())) {
							userDao.register(user);
							socialMediaAuthService.register(user);
							// System.out.println("Kullanýcý kaydedildi.");
						} else {
							System.out.println("Girilen soyad kriterlere uygun deðil");
						}
					} else {
						System.out.println("Girilen ad kriterlere uygun deðil");
					}
				} else {
					System.out.println("Girilen parola kriterlere uygun deðil");
				}
			} else {

				System.out.println("Girilen mail zaten kayýtlý");
			}
		} else {
			System.out.println("Girilen mail formata uygun deðil.");
		}
	}

}
