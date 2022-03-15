package hafta6_odev1.SocialMediaAuthServices.concretes;

import hafta6_odev1.SocialMediaAuthServices.abstracts.SocialMediaAuthService;
import hafta6_odev1.entities.concrete.User;

public class GoogleAuthManager implements SocialMediaAuthService {

	@Override
	public void signIn(User user) {
		System.out.println("Google ile giriþ yapýldý");

	}

	@Override
	public void signOut(User user) {
		System.out.println("Google ile çýkýþ yapýldý");

	}

	@Override
	public void register(User user) {
		System.out.println("Google ile kayýt olundu");

	}

}
