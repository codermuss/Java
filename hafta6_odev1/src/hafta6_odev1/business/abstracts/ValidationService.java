package hafta6_odev1.business.abstracts;

public interface ValidationService {
	public void sendVerificationMail(String email);

	public boolean checkVerification(String email);

}
