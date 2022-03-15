package Manager;

import odev3.Model.User;

public class GamerManager extends BaseUserManager {

	UserCheckService userCheckService_;

	public GamerManager(UserCheckService userCheckService_) {
		super();
		this.userCheckService_ = userCheckService_;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(userCheckService_.CheckIfRealPerson(user));
		if (userCheckService_.CheckIfRealPerson(user)) {

			super.addUser(user);

		} else {
			System.out.println("Girilen kimlik bilgileri doðru deðildir.");
		}

	}
}
