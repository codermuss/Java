package hafta6_odev1.business.concrete;

import hafta6_odev1.business.abstracts.ValidationService;

public class ValidationManager implements ValidationService {

	@Override
	public void sendVerificationMail(String email) {
		System.out.println("Doğrulama maili gönderildi");

	}

	@Override
	public boolean checkVerification(String email) {
		System.out.println("Email doğrulandı");
		return true;
	}

}
