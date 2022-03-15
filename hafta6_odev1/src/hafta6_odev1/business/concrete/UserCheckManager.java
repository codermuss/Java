package hafta6_odev1.business.concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import hafta6_odev1.business.abstracts.CheckService;

public class UserCheckManager implements CheckService {
	private List<String> emailList = new ArrayList<String>();

	@Override
	public boolean checkPassword(String password) {
		if (password.length() < 6) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean checkEmailFormat(String email) {
		final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();

	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return emailList.contains(email);
	}

	@Override
	public boolean checkFirstName(String firstName) {
		// TODO Auto-generated method stub
		if (firstName.length() < 2) {
			return false;

		} else {
			return true;
		}
	}

	@Override
	public boolean checkLastName(String lastName) {
		if (lastName.length() < 2) {
			return false;

		} else {
			return true;
		}
	}

}
