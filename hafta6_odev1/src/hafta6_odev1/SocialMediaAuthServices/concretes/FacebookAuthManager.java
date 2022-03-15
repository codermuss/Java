package hafta6_odev1.SocialMediaAuthServices.concretes;

import hafta6_odev1.SocialMediaAuthServices.abstracts.SocialMediaAuthService;
import hafta6_odev1.entities.concrete.User;

public class FacebookAuthManager implements SocialMediaAuthService {

	@Override
	public void signIn(User user) {
		System.out.println("Facebook ile giri� yap�ld�");

	}

	@Override
	public void signOut(User user) {
		System.out.println("Facebook ile ��k�� yap�ld�");

	}

	@Override
	public void register(User user) {
		System.out.println("Facebook ile kay�t olundu");

	}

}
