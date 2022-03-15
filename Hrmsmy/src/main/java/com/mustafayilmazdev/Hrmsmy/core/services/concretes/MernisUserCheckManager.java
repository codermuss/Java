package com.mustafayilmazdev.Hrmsmy.core.services.concretes;

import com.mustafayilmazdev.Hrmsmy.core.services.abstracts.UserCheckService;

public class MernisUserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(long nationalityId, String firstName, String lastName, int yearOfBirth) {

		return true;

	}

}
