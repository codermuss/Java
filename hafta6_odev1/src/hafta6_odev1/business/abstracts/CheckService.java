package hafta6_odev1.business.abstracts;

public interface CheckService {
	public boolean checkPassword(String password);

	public boolean checkEmailFormat(String email);

	public boolean checkEmail(String email);

	public boolean checkFirstName(String firstName);

	public boolean checkLastName(String lastName);

}
