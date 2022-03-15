package hafta6_odev1.SocialMediaAuthServices.abstracts;

import hafta6_odev1.entities.concrete.User;

public interface SocialMediaAuthService {
	public void signIn(User user);

	public void signOut(User user);

	public void register(User user);

}
